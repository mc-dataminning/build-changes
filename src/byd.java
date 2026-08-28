import com.google.common.collect.ImmutableMap;

public class byd extends bwy<cog> {
   private final float c;

   public byd(float $$0) {
      super(ImmutableMap.of(cej.m, cek.c, cej.n, cek.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arc $$0, cog $$1) {
      cov $$2 = $$1.gp();
      return $$1.bL() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g((buj)$$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(arc $$0, cog $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arc $$0, cog $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arc $$0, cog $$1, long $$2) {
      bwh<?> $$3 = $$1.ec();
      $$3.b(cej.m);
      $$3.b(cej.n);
   }

   protected void d(arc $$0, cog $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cog $$0) {
      bwh<?> $$1 = $$0.ec();
      $$1.a(cej.m, new cem(new bxj($$0.gp(), false), this.c, 2));
      $$1.a(cej.n, new bxj($$0.gp(), true));
   }
}
