import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cls extends clo {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   protected static final ImmutableList<cec<? extends ceb<? super cls>>> e = ImmutableList.of(cec.c, cec.d, cec.b, cec.f, cec.m);
   protected static final ImmutableList<ccv<?>> bY = ImmutableList.of(
      ccv.n, ccv.v, ccv.g, ccv.h, ccv.k, ccv.l, ccv.ao, ccv.an, ccv.x, ccv.y, ccv.m, ccv.E, new ccv[]{ccv.o, ccv.p, ccv.q, ccv.t, ccv.ab, ccv.M, ccv.b}
   );

   public cls(btc<? extends cls> $$0, dca $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static buy.a y() {
      return ckf.gw().a(buz.q, 50.0).a(buz.r, 0.35F).a(buz.c, 7.0);
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      clt.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bqu $$1) {
      this.a(btd.a, new cur(cuu.oY));
   }

   @Override
   protected but.b<cls> dT() {
      return but.a(bY, e);
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      return clt.a(this, this.dT().a($$0));
   }

   @Override
   public but<cls> dS() {
      return (but<cls>)super.dS();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cur $$0) {
      return $$0.a(cuu.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("piglinBruteBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      clt.b(this);
      clt.c(this);
      super.Z();
   }

   @Override
   public clr gs() {
      return this.gi() && this.gt() ? clr.a : clr.f;
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btr) {
            clt.a(this, (btr)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avz v() {
      return awa.tM;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.tP;
   }

   @Override
   protected avz o_() {
      return awa.tO;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.tQ, 0.15F, 1.0F);
   }

   protected void gx() {
      this.b(awa.tN);
   }

   @Override
   protected void gu() {
      this.b(awa.tR);
   }
}
