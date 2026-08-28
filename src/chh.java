import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chh extends cfh {
   public static final bsz bY = bsz.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cec<? extends ceb<? super chh>>> bZ = ImmutableList.of(cec.c, cec.d, cec.b, cec.o, cec.f, cec.r);
   protected static final ImmutableList<ccv<?>> cb = ImmutableList.of(
      ccv.n, ccv.h, ccv.m, ccv.E, ccv.t, ccv.av, ccv.r, ccv.S, ccv.T, ccv.O, ccv.K, ccv.P, new ccv[]{ccv.R, ccv.V, ccv.W, ccv.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final akk<Boolean> ch = ako.a(chh.class, akm.k);
   private static final akk<Boolean> ci = ako.a(chh.class, akm.k);
   private static final akk<Boolean> cj = ako.a(chh.class, akm.k);
   private boolean ck;
   private int cl;

   public chh(btc<? extends chh> $$0, dca $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eoo.f, -1.0F);
      this.a(eoo.g, -1.0F);
   }

   public cur s() {
      azh $$0 = azh.a((long)this.cz().hashCode());
      axf<cuj> $$1 = this.gA() ? awx.b : awx.a;
      jm<cuj> $$2 = lp.am.a($$1);
      return cuk.a(cuu.we, $$2.a($$0).get());
   }

   @Override
   protected but.b<chh> dT() {
      return but.a(cb, bZ);
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      return chi.a(this.dT().a($$0));
   }

   public static buy.a u() {
      return btt.A().a(buz.q, 10.0).a(buz.r, 0.2F).a(buz.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(buz.c).a(1.0);
         this.gz();
      } else {
         this.f(buz.c).a(2.0);
         this.gy();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected avz v() {
      return this.gA() ? awa.kU : awa.kK;
   }

   @Override
   protected avz d(brp $$0) {
      return this.gA() ? awa.kX : awa.kN;
   }

   @Override
   protected avz o_() {
      return this.gA() ? awa.kV : awa.kL;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.ld, 0.15F, 1.0F);
   }

   protected avz y() {
      return this.gA() ? awa.kZ : awa.kP;
   }

   @Nullable
   public chh b(arf $$0, bsq $$1) {
      chh $$2 = btc.X.a((dca)$$0);
      if ($$2 != null) {
         chi.a($$2, $$0.E_());
         bsq $$3 = (bsq)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof chh $$4 && $$4.gA() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public but<chh> dS() {
      return (but<chh>)super.dS();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("goatBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("goatActivityUpdate");
      chi.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.ab();
      float $$2 = ayz.c(this.aY, $$0);
      float $$3 = ayz.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aY + $$3);
   }

   @Override
   public avz d(cur $$0) {
      return this.gA() ? awa.kW : awa.kM;
   }

   @Override
   public boolean o(cur $$0) {
      return $$0.a(awy.ab);
   }

   @Override
   public bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      if ($$2.a(cuu.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cur $$3 = cut.a($$2, $$0, cuu.qE.w());
         $$0.a($$1, $$3);
         return bqw.a(this.dP().B);
      } else {
         bqw $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dP().a(null, this, this.d($$2), awb.g, 1.0F, ayz.b(this.dP().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      azh $$4 = $$0.E_();
      chi.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         akk<Boolean> $$5 = $$4.h() ? ci : cj;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public bsz e(bud $$0) {
      return $$0 == bud.g ? bY.a(this.ed()) : super.e($$0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gA());
      $$0.a("HasLeftHorn", this.gq());
      $$0.a("HasRightHorn", this.gw());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.ao.a(ci, $$0.q("HasLeftHorn"));
      this.ao.a(cj, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.ck = true;
      } else if ($$0 == 59) {
         this.ck = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void n_() {
      if (this.ck) {
         this.cl++;
      } else {
         this.cl -= 2;
      }

      this.cl = ayz.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean gq() {
      return this.ao.a(ci);
   }

   public boolean gw() {
      return this.ao.a(cj);
   }

   public boolean gx() {
      boolean $$0 = this.gq();
      boolean $$1 = this.gw();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akk<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.ah.h() ? ci : cj;
         }

         this.ao.a($$2, false);
         evt $$5 = this.dn();
         cur $$6 = this.s();
         double $$7 = (double)ayz.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayz.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayz.b(this.ah, -0.2F, 0.2F);
         cjj $$10 = new cjj(this.dP(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dP().b($$10);
         return true;
      }
   }

   public void gy() {
      this.ao.a(ci, true);
      this.ao.a(cj, true);
   }

   public void gz() {
      this.ao.a(ci, false);
      this.ao.a(cj, false);
   }

   public boolean gA() {
      return this.ao.a(ch);
   }

   public void w(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   public float gB() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(btc<? extends cfh> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.bZ) && a($$1, $$3);
   }
}
