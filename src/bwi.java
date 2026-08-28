import com.google.common.collect.ImmutableMap;

public class bwi extends bvd<cmf> {
   private final float c;

   public bwi(float $$0) {
      super(ImmutableMap.of(cco.m, ccp.c, cco.n, ccp.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arb $$0, cmf $$1) {
      cms $$2 = $$1.gq();
      return $$1.bD() && $$2 != null && !$$1.be() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cb != null;
   }

   protected boolean a(arb $$0, cmf $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arb $$0, cmf $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arb $$0, cmf $$1, long $$2) {
      bum<?> $$3 = $$1.dS();
      $$3.b(cco.m);
      $$3.b(cco.n);
   }

   protected void d(arb $$0, cmf $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cmf $$0) {
      bum<?> $$1 = $$0.dS();
      $$1.a(cco.m, new ccr(new bvo($$0.gq(), false), this.c, 2));
      $$1.a(cco.n, new bvo($$0.gq(), true));
   }
}
