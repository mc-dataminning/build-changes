import com.google.common.collect.ImmutableMap;

public class bwo extends bvj<cml> {
   private final float c;

   public bwo(float $$0) {
      super(ImmutableMap.of(ccu.m, ccv.c, ccu.n, ccv.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arf $$0, cml $$1) {
      cmy $$2 = $$1.gq();
      return $$1.bD() && $$2 != null && !$$1.be() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cb != null;
   }

   protected boolean a(arf $$0, cml $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arf $$0, cml $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arf $$0, cml $$1, long $$2) {
      bus<?> $$3 = $$1.dS();
      $$3.b(ccu.m);
      $$3.b(ccu.n);
   }

   protected void d(arf $$0, cml $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cml $$0) {
      bus<?> $$1 = $$0.dS();
      $$1.a(ccu.m, new ccx(new bvu($$0.gq(), false), this.c, 2));
      $$1.a(ccu.n, new bvu($$0.gq(), true));
   }
}
