import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chg extends cfg {
   public static final bsy bY = bsy.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<ceb<? extends cea<? super chg>>> bZ = ImmutableList.of(ceb.c, ceb.d, ceb.b, ceb.o, ceb.f, ceb.r);
   protected static final ImmutableList<ccu<?>> cb = ImmutableList.of(
      ccu.n, ccu.h, ccu.m, ccu.E, ccu.t, ccu.av, ccu.r, ccu.S, ccu.T, ccu.O, ccu.K, ccu.P, new ccu[]{ccu.R, ccu.V, ccu.W, ccu.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final akk<Boolean> ch = ako.a(chg.class, akm.k);
   private static final akk<Boolean> ci = ako.a(chg.class, akm.k);
   private static final akk<Boolean> cj = ako.a(chg.class, akm.k);
   private boolean ck;
   private int cl;

   public chg(btb<? extends chg> $$0, dbz $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eon.f, -1.0F);
      this.a(eon.g, -1.0F);
   }

   public cuq s() {
      azh $$0 = azh.a((long)this.cz().hashCode());
      axf<cui> $$1 = this.gA() ? awx.b : awx.a;
      jm<cui> $$2 = lp.am.a($$1);
      return cuj.a(cut.we, $$2.a($$0).get());
   }

   @Override
   protected bus.b<chg> dT() {
      return bus.a(cb, bZ);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return chh.a(this.dT().a($$0));
   }

   public static bux.a u() {
      return bts.A().a(buy.q, 10.0).a(buy.r, 0.2F).a(buy.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(buy.c).a(1.0);
         this.gz();
      } else {
         this.f(buy.c).a(2.0);
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
   protected avz d(bro $$0) {
      return this.gA() ? awa.kX : awa.kN;
   }

   @Override
   protected avz o_() {
      return this.gA() ? awa.kV : awa.kL;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.ld, 0.15F, 1.0F);
   }

   protected avz y() {
      return this.gA() ? awa.kZ : awa.kP;
   }

   @Nullable
   public chg b(arf $$0, bsp $$1) {
      chg $$2 = btb.X.a((dbz)$$0);
      if ($$2 != null) {
         chh.a($$2, $$0.E_());
         bsp $$3 = (bsp)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof chg $$4 && $$4.gA() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bus<chg> dS() {
      return (bus<chg>)super.dS();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("goatBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("goatActivityUpdate");
      chh.a(this);
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
   public avz d(cuq $$0) {
      return this.gA() ? awa.kW : awa.kM;
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awy.ab);
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cuq $$3 = cus.a($$2, $$0, cut.qE.w());
         $$0.a($$1, $$3);
         return bqv.a(this.dP().B);
      } else {
         bqv $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dP().a(null, this, this.d($$2), awb.g, 1.0F, ayz.b(this.dP().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      azh $$4 = $$0.E_();
      chh.a(this, $$4);
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
   public bsy e(buc $$0) {
      return $$0 == buc.g ? bY.a(this.ed()) : super.e($$0);
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
         evs $$5 = this.dn();
         cuq $$6 = this.s();
         double $$7 = (double)ayz.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayz.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayz.b(this.ah, -0.2F, 0.2F);
         cji $$10 = new cji(this.dP(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(btb<? extends cfg> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.bZ) && a($$1, $$3);
   }
}
