import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chf extends cff {
   public static final bsx bY = bsx.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cea<? extends cdz<? super chf>>> bZ = ImmutableList.of(cea.c, cea.d, cea.b, cea.o, cea.f, cea.r);
   protected static final ImmutableList<cct<?>> cb = ImmutableList.of(
      cct.n, cct.h, cct.m, cct.E, cct.t, cct.av, cct.r, cct.S, cct.T, cct.O, cct.K, cct.P, new cct[]{cct.R, cct.V, cct.W, cct.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final akk<Boolean> ch = ako.a(chf.class, akm.k);
   private static final akk<Boolean> ci = ako.a(chf.class, akm.k);
   private static final akk<Boolean> cj = ako.a(chf.class, akm.k);
   private boolean ck;
   private int cl;

   public chf(bta<? extends chf> $$0, dby $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eom.f, -1.0F);
      this.a(eom.g, -1.0F);
   }

   public cup s() {
      azh $$0 = azh.a((long)this.cz().hashCode());
      axf<cuh> $$1 = this.gA() ? awx.b : awx.a;
      jm<cuh> $$2 = lp.am.a($$1);
      return cui.a(cus.we, $$2.a($$0).get());
   }

   @Override
   protected bur.b<chf> dT() {
      return bur.a(cb, bZ);
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return chg.a(this.dT().a($$0));
   }

   public static buw.a u() {
      return btr.A().a(bux.q, 10.0).a(bux.r, 0.2F).a(bux.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(bux.c).a(1.0);
         this.gz();
      } else {
         this.f(bux.c).a(2.0);
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
   protected avz d(brn $$0) {
      return this.gA() ? awa.kX : awa.kN;
   }

   @Override
   protected avz o_() {
      return this.gA() ? awa.kV : awa.kL;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.ld, 0.15F, 1.0F);
   }

   protected avz y() {
      return this.gA() ? awa.kZ : awa.kP;
   }

   @Nullable
   public chf b(arf $$0, bso $$1) {
      chf $$2 = bta.X.a((dby)$$0);
      if ($$2 != null) {
         chg.a($$2, $$0.E_());
         bso $$3 = (bso)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof chf $$4 && $$4.gA() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bur<chf> dS() {
      return (bur<chf>)super.dS();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("goatBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("goatActivityUpdate");
      chg.a(this);
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
   public avz d(cup $$0) {
      return this.gA() ? awa.kW : awa.kM;
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.ab);
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if ($$2.a(cus.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cup $$3 = cur.a($$2, $$0, cus.qE.w());
         $$0.a($$1, $$3);
         return bqu.a(this.dP().B);
      } else {
         bqu $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dP().a(null, this, this.d($$2), awb.g, 1.0F, ayz.b(this.dP().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      azh $$4 = $$0.E_();
      chg.a(this, $$4);
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
   public bsx e(bub $$0) {
      return $$0 == bub.g ? bY.a(this.ed()) : super.e($$0);
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
         evr $$5 = this.dn();
         cup $$6 = this.s();
         double $$7 = (double)ayz.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayz.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayz.b(this.ah, -0.2F, 0.2F);
         cjh $$10 = new cjh(this.dP(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bta<? extends cff> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.bZ) && a($$1, $$3);
   }
}
