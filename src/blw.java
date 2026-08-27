import com.google.common.collect.ImmutableMap;

public class blw extends bks<cbc> {
   private final float c;

   public blw(float $$0) {
      super(ImmutableMap.of(bsc.m, bsd.c, bsc.n, bsd.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(akn $$0, cbc $$1) {
      cbp $$2 = $$1.ga();
      return $$1.bv() && $$2 != null && !$$1.aX() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bQ != null;
   }

   protected boolean a(akn $$0, cbc $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akn $$0, cbc $$1, long $$2) {
      this.a($$1);
   }

   protected void c(akn $$0, cbc $$1, long $$2) {
      bkb<?> $$3 = $$1.dM();
      $$3.b(bsc.m);
      $$3.b(bsc.n);
   }

   protected void d(akn $$0, cbc $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cbc $$0) {
      bkb<?> $$1 = $$0.dM();
      $$1.a(bsc.m, new bsf(new bld($$0.ga(), false), this.c, 2));
      $$1.a(bsc.n, new bld($$0.ga(), true));
   }
}
