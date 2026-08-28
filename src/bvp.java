import com.google.common.collect.ImmutableMap;

public class bvp extends bvi<cgz> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bvp() {
      super(ImmutableMap.of(cct.m, ccu.b), 100);
   }

   protected boolean a(arf $$0, cgz $$1) {
      return $$1.ar() == bub.a;
   }

   protected boolean a(arf $$0, cgz $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arf $$0, cgz $$1, long $$2) {
      if (!$$1.bi()) {
         $$1.b(bub.i);
         this.e = 0;
      }
   }

   protected void c(arf $$0, cgz $$1, long $$2) {
      $$1.b(bub.a);
   }

   protected void d(arf $$0, cgz $$1, long $$2) {
      this.e++;
   }
}
