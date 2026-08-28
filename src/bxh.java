import com.google.common.collect.ImmutableMap;

public class bxh extends bwc<cnh> {
   private final float c;

   public bxh(float $$0) {
      super(ImmutableMap.of(cdn.m, cdo.c, cdn.n, cdo.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arh $$0, cnh $$1) {
      cnu $$2 = $$1.gp();
      return $$1.bI() && $$2 != null && !$$1.bi() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.bZ != null;
   }

   protected boolean a(arh $$0, cnh $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arh $$0, cnh $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arh $$0, cnh $$1, long $$2) {
      bvl<?> $$3 = $$1.dX();
      $$3.b(cdn.m);
      $$3.b(cdn.n);
   }

   protected void d(arh $$0, cnh $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cnh $$0) {
      bvl<?> $$1 = $$0.dX();
      $$1.a(cdn.m, new cdq(new bwn($$0.gp(), false), this.c, 2));
      $$1.a(cdn.n, new bwn($$0.gp(), true));
   }
}
