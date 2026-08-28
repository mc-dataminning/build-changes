import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class blr {
   public static final int a = 200;
   public static final int b = 10000;
   private final avc c;
   private final EnumMap<blt, Map<arf, blr.b>> d;
   private final Queue<blr.a> e = new LinkedList<>();

   public blr(avc $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(blt.class);

      for (blt $$1 : blt.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(blt $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(adi $$0) {
      for (arf $$2 : this.d.get($$0.e()).keySet()) {
         $$2.c.b($$0);
      }
   }

   public void a(arf $$0, blt $$1) {
      if (this.c.f($$0.gb())) {
         this.e.add(new blr.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (blr.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new blr.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<arf, blr.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((arf)$$2x.getKey()).gb());
            blr.b $$4 = (blr.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(arf a, blt b) {
   }

   static record b(long a, int b) {
   }
}
