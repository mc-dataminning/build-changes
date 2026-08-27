import com.google.common.collect.ImmutableMap;

public class bor extends bnm<cee> {
   private final float c;

   public bor(float $$0) {
      super(ImmutableMap.of(bux.m, buy.c, bux.n, buy.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(amp $$0, cee $$1) {
      cer $$2 = $$1.ge();
      return $$1.bx() && $$2 != null && !$$1.aZ() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(amp $$0, cee $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(amp $$0, cee $$1, long $$2) {
      this.a($$1);
   }

   protected void c(amp $$0, cee $$1, long $$2) {
      bmv<?> $$3 = $$1.dO();
      $$3.b(bux.m);
      $$3.b(bux.n);
   }

   protected void d(amp $$0, cee $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cee $$0) {
      bmv<?> $$1 = $$0.dO();
      $$1.a(bux.m, new bva(new bnx($$0.ge(), false), this.c, 2));
      $$1.a(bux.n, new bnx($$0.ge(), true));
   }
}
