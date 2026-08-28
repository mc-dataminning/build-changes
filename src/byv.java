import com.google.common.collect.ImmutableMap;

public class byv extends bxq<cpa> {
   private final float c;

   public byv(float $$0) {
      super(ImmutableMap.of(cfb.m, cfc.c, cfb.n, cfc.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arx $$0, cpa $$1) {
      cpo $$2 = $$1.go();
      return $$1.bL() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g((bvb)$$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(arx $$0, cpa $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arx $$0, cpa $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arx $$0, cpa $$1, long $$2) {
      bwz<?> $$3 = $$1.ec();
      $$3.b(cfb.m);
      $$3.b(cfb.n);
   }

   protected void d(arx $$0, cpa $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cpa $$0) {
      bwz<?> $$1 = $$0.ec();
      $$1.a(cfb.m, new cfe(new byb($$0.go(), false), this.c, 2));
      $$1.a(cfb.n, new byb($$0.go(), true));
   }
}
