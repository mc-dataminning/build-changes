import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chc extends cfc {
   public static final bst ca = bst.b(0.9F, 1.3F).a(0.7F);
   private static final int ch = 2;
   private static final int ci = 1;
   protected static final ImmutableList<cdx<? extends cdw<? super chc>>> cb = ImmutableList.of(cdx.c, cdx.d, cdx.b, cdx.o, cdx.f, cdx.r);
   protected static final ImmutableList<ccq<?>> cc = ImmutableList.of(
      ccq.n, ccq.h, ccq.m, ccq.E, ccq.t, ccq.av, ccq.r, ccq.S, ccq.T, ccq.O, ccq.K, ccq.P, new ccq[]{ccq.R, ccq.V, ccq.W, ccq.Z}
   );
   public static final int ce = 10;
   public static final double cf = 0.02;
   public static final double cg = 0.1F;
   private static final ajv<Boolean> cj = ajz.a(chc.class, ajx.k);
   private static final ajv<Boolean> ck = ajz.a(chc.class, ajx.k);
   private static final ajv<Boolean> cl = ajz.a(chc.class, ajx.k);
   private boolean cm;
   private int cn;

   public chc(bsw<? extends chc> $$0, dcu $$1) {
      super($$0, $$1);
      this.J().a(true);
      this.a(epp.f, -1.0F);
      this.a(epp.g, -1.0F);
   }

   public cuo s() {
      ayv $$0 = ayv.a((long)this.cA().hashCode());
      awt<cug> $$1 = this.gw() ? awl.b : awl.a;
      jq<cug> $$2 = lt.ak.a($$1);
      return cuh.a(cur.wh, $$2.a($$0).get());
   }

   @Override
   protected buo.b<chc> dV() {
      return buo.a(cc, cb);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return chd.a(this.dV().a($$0));
   }

   public static but.a t() {
      return btn.A().a(buu.s, 10.0).a(buu.v, 0.2F).a(buu.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.f(buu.c).a(1.0);
         this.gq();
      } else {
         this.f(buu.c).a(2.0);
         this.gp();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected avn v() {
      return this.gw() ? avo.kU : avo.kK;
   }

   @Override
   protected avn d(brj $$0) {
      return this.gw() ? avo.kX : avo.kN;
   }

   @Override
   protected avn n_() {
      return this.gw() ? avo.kV : avo.kL;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.ld, 0.15F, 1.0F);
   }

   protected avn x() {
      return this.gw() ? avo.kZ : avo.kP;
   }

   @Nullable
   public chc b(aqt $$0, bsk $$1) {
      chc $$2 = bsw.X.a((dcu)$$0);
      if ($$2 != null) {
         chd.a($$2, $$0.E_());
         bsk $$3 = (bsk)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof chc $$4 && $$4.gw() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public buo<chc> dU() {
      return (buo<chc>)super.dU();
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("goatBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("goatActivityUpdate");
      chd.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void o(float $$0) {
      int $$1 = this.ab();
      float $$2 = ayn.c(this.aY, $$0);
      float $$3 = ayn.a($$2, (float)(-$$1), (float)$$1);
      super.o(this.aY + $$3);
   }

   @Override
   public avn d(cuo $$0) {
      return this.gw() ? avo.kW : avo.kM;
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.ab);
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.qy) && !this.o_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cuo $$3 = cuq.a($$2, $$0, cur.qE.w());
         $$0.a($$1, $$3);
         return bqq.a(this.dQ().B);
      } else {
         bqq $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dQ().a(null, this, this.d($$2), avp.g, 1.0F, ayn.b(this.dQ().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      ayv $$4 = $$0.E_();
      chd.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.o_() && (double)$$4.i() < 0.1F) {
         ajv<Boolean> $$5 = $$4.h() ? ck : cl;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   @Override
   public bst e(bty $$0) {
      return $$0 == bty.g ? ca.a(this.eb()) : super.e($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gw());
      $$0.a("HasLeftHorn", this.gm());
      $$0.a("HasRightHorn", this.gn());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.ao.a(ck, $$0.q("HasLeftHorn"));
      this.ao.a(cl, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cm = true;
      } else if ($$0 == 59) {
         this.cm = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void m_() {
      if (this.cm) {
         this.cn++;
      } else {
         this.cn -= 2;
      }

      this.cn = ayn.a(this.cn, 0, 20);
      super.m_();
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cj, false);
      $$0.a(ck, true);
      $$0.a(cl, true);
   }

   public boolean gm() {
      return this.ao.a(ck);
   }

   public boolean gn() {
      return this.ao.a(cl);
   }

   public boolean go() {
      boolean $$0 = this.gm();
      boolean $$1 = this.gn();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajv<Boolean> $$2;
         if (!$$0) {
            $$2 = cl;
         } else if (!$$1) {
            $$2 = ck;
         } else {
            $$2 = this.ah.h() ? ck : cl;
         }

         this.ao.a($$2, false);
         eww $$5 = this.do();
         cuo $$6 = this.s();
         double $$7 = (double)ayn.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayn.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayn.b(this.ah, -0.2F, 0.2F);
         cjf $$10 = new cjf(this.dQ(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dQ().b($$10);
         return true;
      }
   }

   public void gp() {
      this.ao.a(ck, true);
      this.ao.a(cl, true);
   }

   public void gq() {
      this.ao.a(ck, false);
      this.ao.a(cl, false);
   }

   public boolean gw() {
      return this.ao.a(cj);
   }

   public void w(boolean $$0) {
      this.ao.a(cj, $$0);
   }

   public float gx() {
      return (float)this.cn / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bsw<? extends cfc> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.a_($$3.d()).a(awd.bZ) && a($$1, $$3);
   }
}
