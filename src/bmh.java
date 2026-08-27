import com.google.common.collect.ImmutableMap;

public class bmh extends bld<cbn> {
   private final float c;

   public bmh(float $$0) {
      super(ImmutableMap.of(bsn.m, bso.c, bsn.n, bso.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(akt $$0, cbn $$1) {
      cca $$2 = $$1.ge();
      return $$1.bv() && $$2 != null && !$$1.aX() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(akt $$0, cbn $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akt $$0, cbn $$1, long $$2) {
      this.a($$1);
   }

   protected void c(akt $$0, cbn $$1, long $$2) {
      bkm<?> $$3 = $$1.dN();
      $$3.b(bsn.m);
      $$3.b(bsn.n);
   }

   protected void d(akt $$0, cbn $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cbn $$0) {
      bkm<?> $$1 = $$0.dN();
      $$1.a(bsn.m, new bsq(new blo($$0.ge(), false), this.c, 2));
      $$1.a(bsn.n, new blo($$0.ge(), true));
   }
}
