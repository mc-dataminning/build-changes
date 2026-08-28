import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class che extends cfe {
   public static final bsu cc = bsu.b(0.9F, 1.3F).a(0.7F);
   private static final int cj = 2;
   private static final int ck = 1;
   protected static final ImmutableList<cdz<? extends cdy<? super che>>> cd = ImmutableList.of(cdz.c, cdz.d, cdz.b, cdz.o, cdz.f, cdz.r);
   protected static final ImmutableList<ccs<?>> ce = ImmutableList.of(
      ccs.n, ccs.h, ccs.m, ccs.E, ccs.t, ccs.av, ccs.r, ccs.S, ccs.T, ccs.O, ccs.K, ccs.P, new ccs[]{ccs.R, ccs.V, ccs.W, ccs.Z}
   );
   public static final int cg = 10;
   public static final double ch = 0.02;
   public static final double ci = 0.1F;
   private static final ajw<Boolean> cl = aka.a(che.class, ajy.k);
   private static final ajw<Boolean> cm = aka.a(che.class, ajy.k);
   private static final ajw<Boolean> cn = aka.a(che.class, ajy.k);
   private boolean co;
   private int cp;

   public che(bsx<? extends che> $$0, dcw $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(epv.f, -1.0F);
      this.a(epv.g, -1.0F);
   }

   public cuq s() {
      ayw $$0 = ayw.a((long)this.cz().hashCode());
      awu<cui> $$1 = this.gu() ? awm.b : awm.a;
      jq<cui> $$2 = lt.ak.a($$1);
      return cuj.a(cut.wh, $$2.a($$0).get());
   }

   @Override
   protected buq.b<che> dU() {
      return buq.a(ce, cd);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return chf.a(this.dU().a($$0));
   }

   public static buv.a t() {
      return btp.C().a(buw.s, 10.0).a(buw.v, 0.2F).a(buw.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.f(buw.c).a(1.0);
         this.go();
      } else {
         this.f(buw.c).a(2.0);
         this.gn();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected avo v() {
      return this.gu() ? avp.kU : avp.kK;
   }

   @Override
   protected avo d(brk $$0) {
      return this.gu() ? avp.kX : avp.kN;
   }

   @Override
   protected avo n_() {
      return this.gu() ? avp.kV : avp.kL;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.ld, 0.15F, 1.0F);
   }

   protected avo x() {
      return this.gu() ? avp.kZ : avp.kP;
   }

   @Nullable
   public che b(aqu $$0, bsl $$1) {
      che $$2 = bsx.X.a((dcw)$$0);
      if ($$2 != null) {
         chf.a($$2, $$0.E_());
         bsl $$3 = (bsl)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof che $$4 && $$4.gu() || $$0.E_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public buq<che> dT() {
      return (buq<che>)super.dT();
   }

   @Override
   protected void ab() {
      this.dO().ag().a("goatBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().c();
      this.dO().ag().a("goatActivityUpdate");
      chf.a(this);
      this.dO().ag().c();
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
      return this.gu() ? avp.kW : avp.kM;
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
         return bqr.a(this.dO().B);
      } else {
         bqr $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dO().a(null, this, this.d($$2), avq.g, 1.0F, ayo.b(this.dO().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      chf.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.k();
      if (!this.o_() && (double)$$4.i() < 0.1F) {
         ajw<Boolean> $$5 = $$4.h() ? cm : cn;
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
      return $$0 == bua.g ? cc.a(this.ea()) : super.e($$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gu());
      $$0.a("HasLeftHorn", this.gk());
      $$0.a("HasRightHorn", this.gl());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.x($$0.q("IsScreamingGoat"));
      this.ao.a(cm, $$0.q("HasLeftHorn"));
      this.ao.a(cn, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.co = true;
      } else if ($$0 == 59) {
         this.co = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void m_() {
      if (this.co) {
         this.cp++;
      } else {
         this.cp -= 2;
      }

      this.cp = ayo.a(this.cp, 0, 20);
      super.m_();
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cl, false);
      $$0.a(cm, true);
      $$0.a(cn, true);
   }

   public boolean gk() {
      return this.ao.a(cm);
   }

   public boolean gl() {
      return this.ao.a(cn);
   }

   public boolean gm() {
      boolean $$0 = this.gk();
      boolean $$1 = this.gl();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajw<Boolean> $$2;
         if (!$$0) {
            $$2 = cn;
         } else if (!$$1) {
            $$2 = cm;
         } else {
            $$2 = this.ah.h() ? cm : cn;
         }

         this.ao.a($$2, false);
         exc $$5 = this.dm();
         cuq $$6 = this.s();
         double $$7 = (double)ayo.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayo.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayo.b(this.ah, -0.2F, 0.2F);
         cjh $$10 = new cjh(this.dO(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dO().b($$10);
         return true;
      }
   }

   public void gn() {
      this.ao.a(cm, true);
      this.ao.a(cn, true);
   }

   public void go() {
      this.ao.a(cm, false);
      this.ao.a(cn, false);
   }

   public boolean gu() {
      return this.ao.a(cl);
   }

   public void x(boolean $$0) {
      this.ao.a(cl, $$0);
   }

   public float gv() {
      return (float)this.cp / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bsx<? extends cfe> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.ca) && a($$1, $$3);
   }
}
