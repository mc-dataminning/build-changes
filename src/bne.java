import com.google.common.collect.ImmutableMap;

public class bne extends bma<cck> {
   private final float c;

   public bne(float $$0) {
      super(ImmutableMap.of(btk.m, btl.c, btk.n, btl.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(alq $$0, cck $$1) {
      ccx $$2 = $$1.ge();
      return $$1.bv() && $$2 != null && !$$1.aX() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(alq $$0, cck $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(alq $$0, cck $$1, long $$2) {
      this.a($$1);
   }

   protected void c(alq $$0, cck $$1, long $$2) {
      blj<?> $$3 = $$1.dN();
      $$3.b(btk.m);
      $$3.b(btk.n);
   }

   protected void d(alq $$0, cck $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cck $$0) {
      blj<?> $$1 = $$0.dN();
      $$1.a(btk.m, new btn(new bml($$0.ge(), false), this.c, 2));
      $$1.a(btk.n, new bml($$0.ge(), true));
   }
}
