import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class blg {
   public static final int a = 200;
   public static final int b = 10000;
   private final auj c;
   private final EnumMap<bli, Map<aqn, blg.b>> d;
   private final Queue<blg.a> e = new LinkedList<>();

   public blg(auj $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bli.class);

      for (bli $$1 : bli.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bli $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(aco $$0) {
      for (aqn $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(aqn $$0, bli $$1) {
      if (this.c.f($$0.fZ())) {
         this.e.add(new blg.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (blg.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new blg.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<aqn, blg.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((aqn)$$2x.getKey()).fZ());
            blg.b $$4 = (blg.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(aqn a, bli b) {
   }

   static record b(long a, int b) {
   }
}
