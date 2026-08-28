import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cne extends cna {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<cfl<? extends cfk<? super cne>>> e = ImmutableList.of(cfl.c, cfl.d, cfl.b, cfl.f, cfl.m);
   protected static final ImmutableList<cee<?>> bY = ImmutableList.of(
      cee.n, cee.v, cee.g, cee.h, cee.k, cee.l, cee.ao, cee.an, cee.x, cee.y, cee.m, cee.E, new cee[]{cee.o, cee.p, cee.q, cee.t, cee.ab, cee.M, cee.b}
   );

   public cne(bul<? extends cne> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bwh.a y() {
      return clr.gA().a(bwi.s, 50.0).a(bwi.v, 0.35F).a(bwi.c, 7.0).a(bwi.m, 12.0);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      cnf.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      this.a(bum.a, new cwb(cwf.pa));
   }

   @Override
   protected bwc.b<cne> ee() {
      return bwc.a(bY, e);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cnf.a(this, this.ee().a($$0));
   }

   @Override
   public bwc<cne> ed() {
      return (bwc<cne>)super.ed();
   }

   @Override
   public boolean q() {
      return false;
   }

   @Override
   public boolean i(cwb $$0) {
      return $$0.a(cwf.pa) ? super.i($$0) : false;
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("piglinBruteBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.c();
      cnf.b(this);
      cnf.c(this);
      super.ac();
   }

   @Override
   public cnd gw() {
      return this.gj() && this.gx() ? cnd.a : cnd.f;
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dX().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bva) {
            cnf.a(this, (bva)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected awk w() {
      return awl.tO;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.tR;
   }

   @Override
   protected awk o_() {
      return awl.tQ;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.tS, 0.15F, 1.0F);
   }

   protected void gB() {
      this.b(awl.tP);
   }

   @Override
   protected void gy() {
      this.b(awl.tT);
   }
}
