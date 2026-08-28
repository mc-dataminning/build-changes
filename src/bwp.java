import com.google.common.collect.ImmutableMap;

public class bwp extends bvk<cmm> {
   private final float c;

   public bwp(float $$0) {
      super(ImmutableMap.of(ccv.m, ccw.c, ccv.n, ccw.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arf $$0, cmm $$1) {
      cmz $$2 = $$1.gq();
      return $$1.bD() && $$2 != null && !$$1.be() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cb != null;
   }

   protected boolean a(arf $$0, cmm $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arf $$0, cmm $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arf $$0, cmm $$1, long $$2) {
      but<?> $$3 = $$1.dS();
      $$3.b(ccv.m);
      $$3.b(ccv.n);
   }

   protected void d(arf $$0, cmm $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cmm $$0) {
      but<?> $$1 = $$0.dS();
      $$1.a(ccv.m, new ccy(new bvv($$0.gq(), false), this.c, 2));
      $$1.a(ccv.n, new bvv($$0.gq(), true));
   }
}
