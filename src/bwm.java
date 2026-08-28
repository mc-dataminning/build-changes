import com.google.common.collect.ImmutableMap;

public class bwm extends bvh<cmj> {
   private final float c;

   public bwm(float $$0) {
      super(ImmutableMap.of(ccs.m, cct.c, ccs.n, cct.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(are $$0, cmj $$1) {
      cmw $$2 = $$1.gq();
      return $$1.bD() && $$2 != null && !$$1.be() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cb != null;
   }

   protected boolean a(are $$0, cmj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(are $$0, cmj $$1, long $$2) {
      this.a($$1);
   }

   protected void c(are $$0, cmj $$1, long $$2) {
      buq<?> $$3 = $$1.dS();
      $$3.b(ccs.m);
      $$3.b(ccs.n);
   }

   protected void d(are $$0, cmj $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cmj $$0) {
      buq<?> $$1 = $$0.dS();
      $$1.a(ccs.m, new ccv(new bvs($$0.gq(), false), this.c, 2));
      $$1.a(ccs.n, new bvs($$0.gq(), true));
   }
}
