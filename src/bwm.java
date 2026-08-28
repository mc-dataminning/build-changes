import com.google.common.collect.ImmutableMap;

public class bwm extends bvh<cmk> {
   private final float c;

   public bwm(float $$0) {
      super(ImmutableMap.of(ccs.m, cct.c, ccs.n, cct.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aqu $$0, cmk $$1) {
      cmx $$2 = $$1.gl();
      return $$1.bE() && $$2 != null && !$$1.bf() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(aqu $$0, cmk $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqu $$0, cmk $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aqu $$0, cmk $$1, long $$2) {
      buq<?> $$3 = $$1.dU();
      $$3.b(ccs.m);
      $$3.b(ccs.n);
   }

   protected void d(aqu $$0, cmk $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cmk $$0) {
      buq<?> $$1 = $$0.dU();
      $$1.a(ccs.m, new ccv(new bvs($$0.gl(), false), this.c, 2));
      $$1.a(ccs.n, new bvs($$0.gl(), true));
   }
}
