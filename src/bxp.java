import com.google.common.collect.ImmutableMap;

public class bxp extends bwo<bux> {
   public static final int c = 100;
   private final brj d;
   private final awj e;

   public bxp(brj $$0, awj $$1) {
      super(ImmutableMap.of(cdz.n, cea.c, cdz.T, cea.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arm $$0, bux $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(arm $$0, bux $$1, long $$2) {
      $$1.r(true);
      $$1.b(bvh.g);
   }

   protected void c(arm $$0, bux $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.h($$1.dA().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awl.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bvh.a);
      $$1.ed().b(cdz.T);
      $$1.ed().a(cdz.S, this.d.a($$0.A));
   }
}
