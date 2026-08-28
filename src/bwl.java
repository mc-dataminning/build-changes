import com.google.common.collect.ImmutableMap;

public class bwl extends bvg<cmi> {
   private final float c;

   public bwl(float $$0) {
      super(ImmutableMap.of(ccr.m, ccs.c, ccr.n, ccs.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(are $$0, cmi $$1) {
      cmv $$2 = $$1.gq();
      return $$1.bD() && $$2 != null && !$$1.be() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cb != null;
   }

   protected boolean a(are $$0, cmi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(are $$0, cmi $$1, long $$2) {
      this.a($$1);
   }

   protected void c(are $$0, cmi $$1, long $$2) {
      bup<?> $$3 = $$1.dS();
      $$3.b(ccr.m);
      $$3.b(ccr.n);
   }

   protected void d(are $$0, cmi $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cmi $$0) {
      bup<?> $$1 = $$0.dS();
      $$1.a(ccr.m, new ccu(new bvr($$0.gq(), false), this.c, 2));
      $$1.a(ccr.n, new bvr($$0.gq(), true));
   }
}
