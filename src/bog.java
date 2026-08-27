import com.google.common.collect.ImmutableMap;

public class bog extends bnc<cdm> {
   private final float c;

   public bog(float $$0) {
      super(ImmutableMap.of(bum.m, bun.c, bum.n, bun.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ami $$0, cdm $$1) {
      cdz $$2 = $$1.gf();
      return $$1.bx() && $$2 != null && !$$1.aZ() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(ami $$0, cdm $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ami $$0, cdm $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ami $$0, cdm $$1, long $$2) {
      bml<?> $$3 = $$1.dP();
      $$3.b(bum.m);
      $$3.b(bum.n);
   }

   protected void d(ami $$0, cdm $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cdm $$0) {
      bml<?> $$1 = $$0.dP();
      $$1.a(bum.m, new bup(new bnn($$0.gf(), false), this.c, 2));
      $$1.a(bum.n, new bnn($$0.gf(), true));
   }
}
