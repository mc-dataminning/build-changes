import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cmz extends cmv {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<cfg<? extends cff<? super cmz>>> e = ImmutableList.of(cfg.c, cfg.d, cfg.b, cfg.f, cfg.m);
   protected static final ImmutableList<cdz<?>> bY = ImmutableList.of(
      cdz.n, cdz.v, cdz.g, cdz.h, cdz.k, cdz.l, cdz.ao, cdz.an, cdz.x, cdz.y, cdz.m, cdz.E, new cdz[]{cdz.o, cdz.p, cdz.q, cdz.t, cdz.ab, cdz.M, cdz.b}
   );

   public cmz(bug<? extends cmz> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bwc.a y() {
      return clm.gB().a(bwd.s, 50.0).a(bwd.v, 0.35F).a(bwd.c, 7.0).a(bwd.m, 12.0);
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      cna.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      this.a(buh.a, new cvx(cwb.pa));
   }

   @Override
   protected bvx.b<cmz> ee() {
      return bvx.a(bY, e);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cna.a(this, this.ee().a($$0));
   }

   @Override
   public bvx<cmz> ed() {
      return (bvx<cmz>)super.ed();
   }

   @Override
   public boolean q() {
      return false;
   }

   @Override
   public boolean i(cvx $$0) {
      return $$0.a(cwb.pa) ? super.i($$0) : false;
   }

   @Override
   protected void ac() {
      this.dX().ah().a("piglinBruteBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().c();
      cna.b(this);
      cna.c(this);
      super.ac();
   }

   @Override
   public cmy gx() {
      return this.gk() && this.gy() ? cmy.a : cmy.f;
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dX().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof buv) {
            cna.a(this, (buv)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected awj w() {
      return awk.tO;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.tR;
   }

   @Override
   protected awj o_() {
      return awk.tQ;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.tS, 0.15F, 1.0F);
   }

   protected void gC() {
      this.b(awk.tP);
   }

   @Override
   protected void gz() {
      this.b(awk.tT);
   }
}
