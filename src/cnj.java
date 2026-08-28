import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cnj extends cni implements clj, coe {
   private static final ajx<Boolean> bZ = akb.a(cnj.class, ajz.k);
   private static final ajx<Boolean> ca = akb.a(cnj.class, ajz.k);
   private static final ajx<Boolean> cb = akb.a(cnj.class, ajz.k);
   private static final aku cc = aku.b("baby");
   private static final bwl cd = new bwl(cc, 0.2F, bwl.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bum ck = buq.aR.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bsp cm = new bsp(8);
   private boolean cn;
   protected static final ImmutableList<cfq<? extends cfp<? super cnj>>> d = ImmutableList.of(cfq.c, cfq.d, cfq.b, cfq.f, cfq.l);
   protected static final ImmutableList<cej<?>> bY = ImmutableList.of(
      cej.n,
      cej.v,
      cej.g,
      cej.h,
      cej.k,
      cej.l,
      cej.ao,
      cej.an,
      cej.L,
      cej.aP,
      cej.x,
      cej.y,
      new cej[]{
         cej.m,
         cej.E,
         cej.o,
         cej.p,
         cej.q,
         cej.t,
         cej.ab,
         cej.ac,
         cej.z,
         cej.ad,
         cej.ae,
         cej.ag,
         cej.af,
         cej.ai,
         cej.aj,
         cej.ah,
         cej.al,
         cej.M,
         cej.ar,
         cej.s,
         cej.as,
         cej.at,
         cej.ak,
         cej.am,
         cej.au,
         cej.av,
         cej.aw
      }
   );

   public cnj(buq<? extends cni> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.e_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dY());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dY());
   }

   @baf
   @Override
   public bsp t() {
      return this.cm;
   }

   @Override
   protected void a(arc $$0, bsz $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cli $$4 && $$4.gq()) {
         cwn $$5 = new cwn(cwr.vq);
         $$4.gr();
         this.a($$0, $$5);
      }

      this.cm.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cwn i(cwn $$0) {
      return this.cm.b($$0);
   }

   protected boolean j(cwn $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.m_();
      }
   }

   public static bwm.a gv() {
      return clw.gu().a(bwn.s, 16.0).a(bwn.v, 0.35F).a(bwn.c, 5.0);
   }

   public static boolean b(buq<cnj> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return !$$1.a_($$3.e()).a(djm.lm);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      azg $$4 = $$0.H_();
      if ($$2 != bup.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gp()) {
            this.a(bur.a, this.gx());
         }
      }

      cnk.a(this, $$0.H_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean Y() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.ak();
   }

   @Override
   protected void a(azg $$0, bsg $$1) {
      if (this.gp()) {
         this.a(bur.f, new cwn(cwr.qt), $$0);
         this.a(bur.e, new cwn(cwr.qu), $$0);
         this.a(bur.d, new cwn(cwr.qv), $$0);
         this.a(bur.c, new cwn(cwr.qw), $$0);
      }
   }

   private void a(bur $$0, cwn $$1, azg $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bwh.b<cnj> ed() {
      return bwh.a(bY, d);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cnk.a(this, this.ed().a($$0));
   }

   @Override
   public bwh<cnj> ec() {
      return (bwh<cnj>)super.ec();
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      bsi $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dW() instanceof arc $$3) {
         return cnk.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cnk.b(this, $$0.b($$1)) && this.gq() != cnl.d;
         return (bsi)($$4 ? bsi.a : bsi.e);
      }
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bZ, $$0);
      if (!this.dW().C) {
         bwj $$1 = this.g(bwn.v);
         $$1.c(cd.b());
         if ($$0) {
            $$1.b(cd);
         }
      }
   }

   @Override
   public boolean e_() {
      return this.au().a(bZ);
   }

   private void z(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean m() {
      return !this.cn;
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("piglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cnk.a(this);
      super.a($$0);
   }

   @Override
   protected int e(arc $$0) {
      return this.bN;
   }

   @Override
   protected void g(arc $$0) {
      cnk.a($$0, this);
      this.cm.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cwn gx() {
      return (double)this.ae.i() < 0.5 ? new cwn(cwr.wV) : new cwn(cwr.pB);
   }

   @Override
   public axe<cwj> W() {
      return awx.bT;
   }

   private boolean gy() {
      return this.al.a(ca);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(ca, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public cnl gq() {
      if (this.gw()) {
         return cnl.e;
      } else if (cnk.a(this.fa())) {
         return cnl.d;
      } else if (this.ge() && this.gr()) {
         return cnl.a;
      } else if (this.gy()) {
         return cnl.c;
      } else {
         return this.b(cwr.wV) && cve.g(this.ea()) ? cnl.b : cnl.f;
      }
   }

   public boolean gw() {
      return this.al.a(cb);
   }

   public void y(boolean $$0) {
      this.al.a(cb, $$0);
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvf $$4) {
         cnk.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bvf $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cxj $$0) {
      return $$0 == cwr.wV;
   }

   protected void k(cwn $$0) {
      this.b(bur.a, $$0);
   }

   protected void l(cwn $$0) {
      if ($$0.a(cnk.c)) {
         this.a(bur.b, $$0);
         this.g(bur.b);
      } else {
         this.b(bur.b, $$0);
      }
   }

   @Override
   public boolean c(arc $$0, cwn $$1) {
      return $$0.O().b(dgc.c) && this.fN() && cnk.a(this, $$1);
   }

   protected boolean m(cwn $$0) {
      bur $$1 = this.f($$0);
      cwn $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cwn $$0, cwn $$1, bur $$2) {
      if (dcz.a($$1, dcy.E)) {
         return false;
      } else {
         boolean $$3 = cnk.a($$0) || $$0.a(cwr.wV);
         boolean $$4 = cnk.a($$1) || $$1.a(cwr.wV);
         if ($$3 && !$$4) {
            return true;
         } else if (!$$3 && $$4) {
            return false;
         } else {
            return this.gp() && !$$0.a(cwr.wV) && $$1.a(cwr.wV) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arc $$0, cla $$1) {
      this.a($$1);
      cnk.a($$0, this, $$1);
   }

   @Override
   public boolean a(buj $$0, boolean $$1) {
      if (this.e_() && $$0.aq() == buq.aj) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private buj b(buj $$0, int $$1) {
      List<buj> $$2 = $$0.cZ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avy u() {
      return this.dW().C ? null : cnk.b(this).orElse(null);
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.ul;
   }

   @Override
   protected avy o_() {
      return avz.uj;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.un, 0.15F, 1.0F);
   }

   @Override
   protected void gs() {
      this.b(avz.uo);
   }
}
