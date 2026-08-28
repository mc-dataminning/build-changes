import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cll extends clk implements cjo, cmg {
   private static final ajv<Boolean> cb = ajz.a(cll.class, ajx.k);
   private static final ajv<Boolean> cc = ajz.a(cll.class, ajx.k);
   private static final ajv<Boolean> cd = ajz.a(cll.class, ajx.k);
   private static final akq ce = akq.b("baby");
   private static final bus cf = new bus(ce, 0.2F, bus.a.b);
   private static final int cg = 16;
   private static final float ch = 0.35F;
   private static final int ci = 5;
   private static final float cj = 0.1F;
   private static final int ck = 3;
   private static final float cl = 0.2F;
   private static final bst cm = bsw.aA.n().a(0.5F).b(0.97F);
   private static final double cn = 0.5;
   private final bqz co = new bqz(8);
   private boolean cp;
   protected static final ImmutableList<cdx<? extends cdw<? super cll>>> e = ImmutableList.of(cdx.c, cdx.d, cdx.b, cdx.f, cdx.l);
   protected static final ImmutableList<ccq<?>> ca = ImmutableList.of(
      ccq.n,
      ccq.v,
      ccq.g,
      ccq.h,
      ccq.k,
      ccq.l,
      ccq.ao,
      ccq.an,
      ccq.L,
      ccq.aP,
      ccq.x,
      ccq.y,
      new ccq[]{
         ccq.m,
         ccq.E,
         ccq.o,
         ccq.p,
         ccq.q,
         ccq.t,
         ccq.ab,
         ccq.ac,
         ccq.z,
         ccq.ad,
         ccq.ae,
         ccq.ag,
         ccq.af,
         ccq.ai,
         ccq.aj,
         ccq.ah,
         ccq.al,
         ccq.M,
         ccq.ar,
         ccq.s,
         ccq.as,
         ccq.at,
         ccq.ak,
         ccq.am,
         ccq.au,
         ccq.av,
         ccq.aw
      }
   );

   public cll(bsw<? extends clk> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cp) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dS());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dS());
   }

   @azs
   @Override
   public bqz x() {
      return this.co;
   }

   @Override
   protected void a(aqt $$0, brj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjn $$4 && $$4.gn()) {
         cuo $$5 = new cuo(cur.ur);
         $$4.go();
         this.b($$5);
      }

      this.co.f().forEach(this::b);
   }

   protected cuo n(cuo $$0) {
      return this.co.b($$0);
   }

   protected boolean o(cuo $$0) {
      return this.co.c($$0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
      $$0.a(cc, false);
      $$0.a(cd, false);
   }

   @Override
   public void a(ajv<?> $$0) {
      super.a($$0);
      if (cb.equals($$0)) {
         this.i_();
      }
   }

   public static but.a gt() {
      return ckb.gs().a(buu.s, 16.0).a(buu.v, 0.35F).a(buu.c, 5.0);
   }

   public static boolean b(bsw<cll> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return !$$1.a_($$3.d()).a(dfy.kK);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      ayv $$4 = $$0.E_();
      if ($$2 != btp.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gn()) {
            this.a(bsx.a, this.gv());
         }
      }

      clm.a(this, $$0.E_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean X() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fR();
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      if (this.gn()) {
         this.a(bsx.f, new cuo(cur.pO), $$0);
         this.a(bsx.e, new cuo(cur.pP), $$0);
         this.a(bsx.d, new cuo(cur.pQ), $$0);
         this.a(bsx.c, new cuo(cur.pR), $$0);
      }
   }

   private void a(bsx $$0, cuo $$1, ayv $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected buo.b<cll> dV() {
      return buo.a(ca, e);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return clm.a(this, this.dV().a($$0));
   }

   @Override
   public buo<cll> dU() {
      return (buo<cll>)super.dU();
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      bqq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dQ().B) {
         return clm.a(this, $$0, $$1);
      } else {
         boolean $$3 = clm.b(this, $$0.b($$1)) && this.go() != cln.d;
         return $$3 ? bqq.a : bqq.e;
      }
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? cm : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(cb, $$0);
      if (!this.dQ().B) {
         buq $$1 = this.f(buu.v);
         $$1.c(cf.b());
         if ($$0) {
            $$1.b(cf);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.ar().a(cb);
   }

   private void y(boolean $$0) {
      this.cp = $$0;
   }

   @Override
   protected boolean s() {
      return !this.cp;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("piglinBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      clm.a(this);
      super.Z();
   }

   @Override
   protected int eh() {
      return this.bP;
   }

   @Override
   protected void a(aqt $$0) {
      clm.b(this);
      this.co.f().forEach(this::b);
      super.a($$0);
   }

   private cuo gv() {
      return (double)this.ah.i() < 0.5 ? new cuo(cur.vW) : new cuo(cur.oW);
   }

   private boolean gw() {
      return this.ao.a(cc);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public cln go() {
      if (this.gu()) {
         return cln.e;
      } else if (clm.a(this.eV())) {
         return cln.d;
      } else if (this.gd() && this.gp()) {
         return cln.a;
      } else if (this.gw()) {
         return cln.c;
      } else {
         return this.gd() && this.b(cur.vW) ? cln.b : cln.f;
      }
   }

   public boolean gu() {
      return this.ao.a(cd);
   }

   public void x(boolean $$0) {
      this.ao.a(cd, $$0);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dQ().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btl) {
            clm.a(this, (btl)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(btl $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cvl $$0) {
      return $$0 == cur.vW;
   }

   protected void p(cuo $$0) {
      this.b(bsx.a, $$0);
   }

   protected void q(cuo $$0) {
      if ($$0.a(clm.c)) {
         this.a(bsx.b, $$0);
         this.e(bsx.b);
      } else {
         this.b(bsx.b, $$0);
      }
   }

   @Override
   public boolean k(cuo $$0) {
      return this.dQ().ab().b(dcq.c) && this.fQ() && clm.a(this, $$0);
   }

   protected boolean r(cuo $$0) {
      bsx $$1 = this.h($$0);
      cuo $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cuo $$0, cuo $$1) {
      if (dac.a($$1, dab.E)) {
         return false;
      } else {
         boolean $$2 = clm.a($$0) || $$0.a(cur.vW);
         boolean $$3 = clm.a($$1) || $$1.a(cur.vW);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gn() && !$$0.a(cur.vW) && $$1.a(cur.vW) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cjf $$0) {
      this.a($$0);
      clm.a(this, $$0);
   }

   @Override
   public boolean a(bsq $$0, boolean $$1) {
      if (this.o_() && $$0.am() == bsw.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bsq b(bsq $$0, int $$1) {
      List<bsq> $$2 = $$0.cT();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avn v() {
      return this.dQ().B ? null : clm.c(this).orElse(null);
   }

   @Override
   protected avn d(brj $$0) {
      return avo.tL;
   }

   @Override
   protected avn n_() {
      return avo.tJ;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.tN, 0.15F, 1.0F);
   }

   @Override
   protected void gq() {
      this.b(avo.tO);
   }
}
