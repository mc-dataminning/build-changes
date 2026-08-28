import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bmu {
   public static final int a = 200;
   public static final int b = 10000;
   private final avn c;
   private final EnumMap<bmw, Map<arn, bmu.b>> d;
   private final Queue<bmu.a> e = new LinkedList<>();

   public bmu(avn $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bmw.class);

      for (bmw $$1 : bmw.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bmw $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(ade $$0) {
      for (arn $$2 : this.d.get($$0.e()).keySet()) {
         $$2.d.b($$0);
      }
   }

   public void a(arn $$0, bmw $$1) {
      if (this.c.f($$0.gj())) {
         this.e.add(new bmu.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ad.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bmu.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bmu.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<arn, bmu.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((arn)$$2x.getKey()).gj());
            bmu.b $$4 = (bmu.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(arn a, bmw b) {
   }

   static record b(long a, int b) {
   }
}
