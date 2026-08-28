import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class blf {
   public static final int a = 200;
   public static final int b = 10000;
   private final auj c;
   private final EnumMap<blh, Map<aqn, blf.b>> d;
   private final Queue<blf.a> e = new LinkedList<>();

   public blf(auj $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(blh.class);

      for (blh $$1 : blh.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(blh $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(aco $$0) {
      for (aqn $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(aqn $$0, blh $$1) {
      if (this.c.f($$0.fY())) {
         this.e.add(new blf.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (blf.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new blf.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<aqn, blf.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((aqn)$$2x.getKey()).fY());
            blf.b $$4 = (blf.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(aqn a, blh b) {
   }

   static record b(long a, int b) {
   }
}
