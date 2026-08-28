import com.google.common.collect.ImmutableMap;

public class bvz extends buu<clx> {
   private final float c;

   public bvz(float $$0) {
      super(ImmutableMap.of(ccf.m, ccg.c, ccf.n, ccg.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aqm $$0, clx $$1) {
      cmk $$2 = $$1.go();
      return $$1.bE() && $$2 != null && !$$1.bf() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(aqm $$0, clx $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqm $$0, clx $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aqm $$0, clx $$1, long $$2) {
      bud<?> $$3 = $$1.dU();
      $$3.b(ccf.m);
      $$3.b(ccf.n);
   }

   protected void d(aqm $$0, clx $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(clx $$0) {
      bud<?> $$1 = $$0.dU();
      $$1.a(ccf.m, new cci(new bvf($$0.go(), false), this.c, 2));
      $$1.a(ccf.n, new bvf($$0.go(), true));
   }
}
