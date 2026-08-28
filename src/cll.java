import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cll extends clh {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   protected static final ImmutableList<cdv<? extends cdu<? super cll>>> e = ImmutableList.of(cdv.c, cdv.d, cdv.b, cdv.f, cdv.m);
   protected static final ImmutableList<cco<?>> bY = ImmutableList.of(
      cco.n, cco.v, cco.g, cco.h, cco.k, cco.l, cco.ao, cco.an, cco.x, cco.y, cco.m, cco.E, new cco[]{cco.o, cco.p, cco.q, cco.t, cco.ab, cco.M, cco.b}
   );

   public cll(bsv<? extends cll> $$0, dbt $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bur.a y() {
      return cjy.gw().a(bus.q, 50.0).a(bus.r, 0.35F).a(bus.c, 7.0);
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      clm.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azc $$0, bqn $$1) {
      this.a(bsw.a, new cuk(cun.oY));
   }

   @Override
   protected bum.b<cll> dT() {
      return bum.a(bY, e);
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return clm.a(this, this.dT().a($$0));
   }

   @Override
   public bum<cll> dS() {
      return (bum<cll>)super.dS();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cuk $$0) {
      return $$0.a(cun.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("piglinBruteBrain");
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().c();
      clm.b(this);
      clm.c(this);
      super.Z();
   }

   @Override
   public clk gs() {
      return this.gi() && this.gt() ? clk.a : clk.f;
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btk) {
            clm.a(this, (btk)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avv v() {
      return avw.tM;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.tP;
   }

   @Override
   protected avv o_() {
      return avw.tO;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.tQ, 0.15F, 1.0F);
   }

   protected void gx() {
      this.b(avw.tN);
   }

   @Override
   protected void gu() {
      this.b(avw.tR);
   }
}
