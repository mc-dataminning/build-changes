import com.google.common.collect.ImmutableMap;

public class blt extends bkp<caz> {
   private final float c;

   public blt(float $$0) {
      super(ImmutableMap.of(brz.m, bsa.c, brz.n, bsa.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(akk $$0, caz $$1) {
      cbm $$2 = $$1.ga();
      return $$1.bv() && $$2 != null && !$$1.aX() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bQ != null;
   }

   protected boolean a(akk $$0, caz $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akk $$0, caz $$1, long $$2) {
      this.a($$1);
   }

   protected void c(akk $$0, caz $$1, long $$2) {
      bjy<?> $$3 = $$1.dM();
      $$3.b(brz.m);
      $$3.b(brz.n);
   }

   protected void d(akk $$0, caz $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(caz $$0) {
      bjy<?> $$1 = $$0.dM();
      $$1.a(brz.m, new bsc(new bla($$0.ga(), false), this.c, 2));
      $$1.a(brz.n, new bla($$0.ga(), true));
   }
}
