import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class che extends cfe {
   public static final bsu ca = bsu.b(0.9F, 1.3F).a(0.7F);
   private static final int ch = 2;
   private static final int ci = 1;
   protected static final ImmutableList<cdz<? extends cdy<? super che>>> cb = ImmutableList.of(cdz.c, cdz.d, cdz.b, cdz.o, cdz.f, cdz.r);
   protected static final ImmutableList<ccs<?>> cc = ImmutableList.of(
      ccs.n, ccs.h, ccs.m, ccs.E, ccs.t, ccs.av, ccs.r, ccs.S, ccs.T, ccs.O, ccs.K, ccs.P, new ccs[]{ccs.R, ccs.V, ccs.W, ccs.Z}
   );
   public static final int ce = 10;
   public static final double cf = 0.02;
   public static final double cg = 0.1F;
   private static final ajw<Boolean> cj = aka.a(che.class, ajy.k);
   private static final ajw<Boolean> ck = aka.a(che.class, ajy.k);
   private static final ajw<Boolean> cl = aka.a(che.class, ajy.k);
   private boolean cm;
   private int cn;

   public che(bsx<? extends che> $$0, dcw $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(ept.f, -1.0F);
      this.a(ept.g, -1.0F);
   }

   public cuq s() {
      ayw $$0 = ayw.a((long)this.cA().hashCode());
      awu<cui> $$1 = this.gv() ? awm.b : awm.a;
      jq<cui> $$2 = lt.ak.a($$1);
      return cuj.a(cut.wh, $$2.a($$0).get());
   }

   @Override
   protected buq.b<che> dV() {
      return buq.a(cc, cb);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return chf.a(this.dV().a($$0));
   }

   public static buv.a t() {
      return btp.C().a(buw.s, 10.0).a(buw.v, 0.2F).a(buw.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.f(buw.c).a(1.0);
         this.gp();
      } else {
         this.f(buw.c).a(2.0);
         this.go();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected avo v() {
      return this.gv() ? avp.kU : avp.kK;
   }

   @Override
   protected avo d(brk $$0) {
      return this.gv() ? avp.kX : avp.kN;
   }

   @Override
   protected avo n_() {
      return this.gv() ? avp.kV : avp.kL;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.ld, 0.15F, 1.0F);
   }

   protected avo x() {
      return this.gv() ? avp.kZ : avp.kP;
   }

   @Nullable
   public che b(aqu $$0, bsl $$1) {
      che $$2 = bsx.X.a((dcw)$$0);
      if ($$2 != null) {
         chf.a($$2, $$0.E_());
         bsl $$3 = (bsl)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof che $$4 && $$4.gv() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public buq<che> dU() {
      return (buq<che>)super.dU();
   }

   @Override
   protected void ab() {
      this.dP().ag().a("goatBrain");
      this.dU().a((aqu)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("goatActivityUpdate");
      chf.a(this);
      this.dP().ag().c();
      super.ab();
   }

   @Override
   public int ae() {
      return 15;
   }

   @Override
   public void o(float $$0) {
      int $$1 = this.ae();
      float $$2 = ayo.c(this.aY, $$0);
      float $$3 = ayo.a($$2, (float)(-$$1), (float)$$1);
      super.o(this.aY + $$3);
   }

   @Override
   public avo d(cuq $$0) {
      return this.gv() ? avp.kW : avp.kM;
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.ab);
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.qy) && !this.o_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cuq $$3 = cus.a($$2, $$0, cut.qE.w());
         $$0.a($$1, $$3);
         return bqr.a(this.dP().B);
      } else {
         bqr $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dP().a(null, this, this.d($$2), avq.g, 1.0F, ayo.b(this.dP().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      chf.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.o_() && (double)$$4.i() < 0.1F) {
         ajw<Boolean> $$5 = $$4.h() ? ck : cl;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   @Override
   public bsu e(bua $$0) {
      return $$0 == bua.g ? ca.a(this.eb()) : super.e($$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gv());
      $$0.a("HasLeftHorn", this.gl());
      $$0.a("HasRightHorn", this.gm());
   }

   @Override
   public void a(ub $$0) {
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

      this.cn = ayo.a(this.cn, 0, 20);
      super.m_();
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cj, false);
      $$0.a(ck, true);
      $$0.a(cl, true);
   }

   public boolean gl() {
      return this.ao.a(ck);
   }

   public boolean gm() {
      return this.ao.a(cl);
   }

   public boolean gn() {
      boolean $$0 = this.gl();
      boolean $$1 = this.gm();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajw<Boolean> $$2;
         if (!$$0) {
            $$2 = cl;
         } else if (!$$1) {
            $$2 = ck;
         } else {
            $$2 = this.ah.h() ? ck : cl;
         }

         this.ao.a($$2, false);
         exa $$5 = this.dn();
         cuq $$6 = this.s();
         double $$7 = (double)ayo.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayo.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayo.b(this.ah, -0.2F, 0.2F);
         cjh $$10 = new cjh(this.dP(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dP().b($$10);
         return true;
      }
   }

   public void go() {
      this.ao.a(ck, true);
      this.ao.a(cl, true);
   }

   public void gp() {
      this.ao.a(ck, false);
      this.ao.a(cl, false);
   }

   public boolean gv() {
      return this.ao.a(cj);
   }

   public void w(boolean $$0) {
      this.ao.a(cj, $$0);
   }

   public float gw() {
      return (float)this.cn / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bsx<? extends cfe> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.bZ) && a($$1, $$3);
   }
}
