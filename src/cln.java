import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cln extends clm implements cjq, cmi {
   private static final ajw<Boolean> cd = aka.a(cln.class, ajy.k);
   private static final ajw<Boolean> ce = aka.a(cln.class, ajy.k);
   private static final ajw<Boolean> cf = aka.a(cln.class, ajy.k);
   private static final akr cg = akr.b("baby");
   private static final buu ch = new buu(cg, 0.2F, buu.a.b);
   private static final int ci = 16;
   private static final float cj = 0.35F;
   private static final int ck = 5;
   private static final float cl = 0.1F;
   private static final int cm = 3;
   private static final float cn = 0.2F;
   private static final bsu co = bsx.aA.n().a(0.5F).b(0.97F);
   private static final double cp = 0.5;
   private final bra cq = new bra(8);
   private boolean cr;
   protected static final ImmutableList<cdz<? extends cdy<? super cln>>> e = ImmutableList.of(cdz.c, cdz.d, cdz.b, cdz.f, cdz.l);
   protected static final ImmutableList<ccs<?>> cc = ImmutableList.of(
      ccs.n,
      ccs.v,
      ccs.g,
      ccs.h,
      ccs.k,
      ccs.l,
      ccs.ao,
      ccs.an,
      ccs.L,
      ccs.aP,
      ccs.x,
      ccs.y,
      new ccs[]{
         ccs.m,
         ccs.E,
         ccs.o,
         ccs.p,
         ccs.q,
         ccs.t,
         ccs.ab,
         ccs.ac,
         ccs.z,
         ccs.ad,
         ccs.ae,
         ccs.ag,
         ccs.af,
         ccs.ai,
         ccs.aj,
         ccs.ah,
         ccs.al,
         ccs.M,
         ccs.ar,
         ccs.s,
         ccs.as,
         ccs.at,
         ccs.ak,
         ccs.am,
         ccs.au,
         ccs.av,
         ccs.aw
      }
   );

   public cln(bsx<? extends clm> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = 5;
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cr) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dQ());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dQ());
   }

   @azt
   @Override
   public bra x() {
      return this.cq;
   }

   @Override
   protected void a(aqu $$0, brk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjp $$4 && $$4.gl()) {
         cuq $$5 = new cuq(cut.ur);
         $$4.gm();
         this.b($$5);
      }

      this.cq.f().forEach(this::b);
   }

   protected cuq n(cuq $$0) {
      return this.cq.b($$0);
   }

   protected boolean o(cuq $$0) {
      return this.cq.c($$0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void a(ajw<?> $$0) {
      super.a($$0);
      if (cd.equals($$0)) {
         this.i_();
      }
   }

   public static buv.a gr() {
      return ckd.gq().a(buw.s, 16.0).a(buw.v, 0.35F).a(buw.c, 5.0);
   }

   public static boolean b(bsx<cln> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return !$$1.a_($$3.e()).a(dga.kK);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      if ($$2 != btr.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gl()) {
            this.a(bsy.a, this.gt());
         }
      }

      clo.a(this, $$0.E_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean Z() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fT();
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      if (this.gl()) {
         this.a(bsy.f, new cuq(cut.pO), $$0);
         this.a(bsy.e, new cuq(cut.pP), $$0);
         this.a(bsy.d, new cuq(cut.pQ), $$0);
         this.a(bsy.c, new cuq(cut.pR), $$0);
      }
   }

   private void a(bsy $$0, cuq $$1, ayw $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected buq.b<cln> dU() {
      return buq.a(cc, e);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return clo.a(this, this.dU().a($$0));
   }

   @Override
   public buq<cln> dT() {
      return (buq<cln>)super.dT();
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      bqr $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dO().B) {
         return clo.a(this, $$0, $$1);
      } else {
         boolean $$3 = clo.b(this, $$0.b($$1)) && this.gm() != clp.d;
         return $$3 ? bqr.a : bqr.e;
      }
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? co : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(cd, $$0);
      if (!this.dO().B) {
         bus $$1 = this.f(buw.v);
         $$1.c(ch.b());
         if ($$0) {
            $$1.b(ch);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.ar().a(cd);
   }

   private void z(boolean $$0) {
      this.cr = $$0;
   }

   @Override
   protected boolean s() {
      return !this.cr;
   }

   @Override
   protected void ab() {
      this.dO().ag().a("piglinBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().c();
      clo.a(this);
      super.ab();
   }

   @Override
   protected int eg() {
      return this.bR;
   }

   @Override
   protected void a(aqu $$0) {
      clo.b(this);
      this.cq.f().forEach(this::b);
      super.a($$0);
   }

   private cuq gt() {
      return (double)this.ah.i() < 0.5 ? new cuq(cut.vW) : new cuq(cut.oW);
   }

   private boolean gu() {
      return this.ao.a(ce);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(ce, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public clp gm() {
      if (this.gs()) {
         return clp.e;
      } else if (clo.a(this.eU())) {
         return clp.d;
      } else if (this.gb() && this.gn()) {
         return clp.a;
      } else if (this.gu()) {
         return clp.c;
      } else {
         return this.gb() && this.b(cut.vW) ? clp.b : clp.f;
      }
   }

   public boolean gs() {
      return this.ao.a(cf);
   }

   public void y(boolean $$0) {
      this.ao.a(cf, $$0);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dO().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btn) {
            clo.a(this, (btn)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(btn $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cvn $$0) {
      return $$0 == cut.vW;
   }

   protected void p(cuq $$0) {
      this.b(bsy.a, $$0);
   }

   protected void q(cuq $$0) {
      if ($$0.a(clo.c)) {
         this.a(bsy.b, $$0);
         this.e(bsy.b);
      } else {
         this.b(bsy.b, $$0);
      }
   }

   @Override
   public boolean k(cuq $$0) {
      return this.dO().ab().b(dcs.c) && this.fS() && clo.a(this, $$0);
   }

   protected boolean r(cuq $$0) {
      bsy $$1 = this.h($$0);
      cuq $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cuq $$0, cuq $$1) {
      if (dae.a($$1, dad.E)) {
         return false;
      } else {
         boolean $$2 = clo.a($$0) || $$0.a(cut.vW);
         boolean $$3 = clo.a($$1) || $$1.a(cut.vW);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gl() && !$$0.a(cut.vW) && $$1.a(cut.vW) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cjh $$0) {
      this.a($$0);
      clo.a(this, $$0);
   }

   @Override
   public boolean a(bsr $$0, boolean $$1) {
      if (this.o_() && $$0.am() == bsx.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bsr b(bsr $$0, int $$1) {
      List<bsr> $$2 = $$0.cS();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avo v() {
      return this.dO().B ? null : clo.c(this).orElse(null);
   }

   @Override
   protected avo d(brk $$0) {
      return avp.tL;
   }

   @Override
   protected avo n_() {
      return avp.tJ;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.tN, 0.15F, 1.0F);
   }

   @Override
   protected void go() {
      this.b(avp.tO);
   }
}
