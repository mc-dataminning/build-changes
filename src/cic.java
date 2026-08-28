import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cic extends chs implements bxb<cic.v> {
   private static final alc<Integer> cd = alg.a(cic.class, ale.b);
   private static final alc<Byte> ce = alg.a(cic.class, ale.a);
   private static final int cf = 1;
   public static final int bZ = 4;
   public static final int ca = 8;
   public static final int cb = 16;
   private static final int cg = 32;
   private static final int ch = 64;
   private static final int ci = 128;
   private static final alc<Optional<UUID>> cj = alg.a(cic.class, ale.r);
   private static final alc<Optional<UUID>> ck = alg.a(cic.class, ale.r);
   static final Predicate<clw> cl = $$0 -> !$$0.v() && $$0.bL();
   private static final Predicate<bvf> cm = $$0 -> !($$0 instanceof bwb $$1) ? false : $$1.er() != null && $$1.es() < $$1.af + 600;
   static final Predicate<bvf> cn = $$0 -> $$0 instanceof chx || $$0 instanceof cim;
   private static final Predicate<bvf> co = $$0 -> !$$0.cg() && bvk.e.test($$0);
   private static final int cp = 600;
   private static final bvi cq = bvm.ab.n().a(0.5F).b(0.2975F);
   private ccz cr;
   private ccz cs;
   private ccz ct;
   private float cu;
   private float cv;
   float cw;
   float cx;
   private int cy;

   public cic(bvm<? extends cic> $$0, dha $$1) {
      super($$0, $$1);
      this.bP = new cic.k();
      this.bQ = new cic.m();
      this.a(eug.p, 0.0F);
      this.a(eug.q, 0.0F);
      this.a_(true);
      this.L().a(32.0F);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cj, Optional.empty());
      $$0.a(ck, Optional.empty());
      $$0.a(cd, 0);
      $$0.a(ce, (byte)0);
   }

   @Override
   protected void B() {
      this.cr = new ces<>(this, chs.class, 10, false, false, ($$0, $$1) -> $$0 instanceof chx || $$0 instanceof cim);
      this.cs = new ces<>(this, cit.class, 10, false, false, cit.bZ);
      this.ct = new ces<>(this, cho.class, 20, false, false, ($$0, $$1) -> $$0 instanceof chq);
      this.bT.a(0, new cic.g());
      this.bT.a(0, new cco(this, this.dV()));
      this.bT.a(1, new cic.b());
      this.bT.a(2, new cic.n(2.2));
      this.bT.a(3, new cic.e(1.0));
      this.bT.a(4, new ccg<>(this, cps.class, 16.0F, 1.6, 1.4, $$0 -> co.test($$0) && !this.c($$0.cG()) && !this.gA()));
      this.bT.a(4, new ccg<>(this, civ.class, 8.0F, 1.6, 1.4, $$0 -> !((civ)$$0).p() && !this.gA()));
      this.bT.a(4, new ccg<>(this, cik.class, 8.0F, 1.6, 1.4, $$0 -> !this.gA()));
      this.bT.a(5, new cic.u());
      this.bT.a(6, new cic.o());
      this.bT.a(6, new cic.s(1.25));
      this.bT.a(7, new cic.l(1.2F, true));
      this.bT.a(7, new cic.t());
      this.bT.a(8, new cic.h(this, 1.25));
      this.bT.a(9, new cic.q(32, 200));
      this.bT.a(10, new cic.f(1.2F, 12, 1));
      this.bT.a(10, new cdf(this, 0.4F));
      this.bT.a(11, new cem(this, 1.0));
      this.bT.a(11, new cic.p());
      this.bT.a(12, new cic.j(this, cps.class, 24.0F));
      this.bT.a(13, new cic.r());
      this.bU.a(3, new cic.a(bwb.class, false, false, ($$0, $$1) -> cm.test($$0) && !this.c($$0.cG())));
   }

   @Override
   public void d_() {
      if (!this.dV().C && this.bL() && this.dj()) {
         this.cy++;
         cxk $$0 = this.a(bvn.a);
         if (this.i($$0)) {
            if (this.cy > 600) {
               cxk $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(bvn.a, $$1);
               }

               this.cy = 0;
            } else if (this.cy > 560 && this.ae.i() < 0.1F) {
               this.gs();
               this.dV().a(this, (byte)45);
            }
         }

         bwb $$2 = this.O_();
         if ($$2 == null || !$$2.bL()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fP() || this.fg()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.d_();
      if (this.gA() && this.ae.i() < 0.05F) {
         this.a(axf.jy, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eE();
   }

   private boolean i(cxk $$0) {
      return $$0.b(ku.w) && this.O_() == null && this.aJ() && !this.fP();
   }

   @Override
   protected void a(bam $$0, btc $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cxk $$3;
         if ($$2 < 0.05F) {
            $$3 = new cxk(cxo.oW);
         } else if ($$2 < 0.2F) {
            $$3 = new cxk(cxo.rp);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cxk(cxo.vt) : new cxk(cxo.vu);
         } else if ($$2 < 0.6F) {
            $$3 = new cxk(cxo.pS);
         } else if ($$2 < 0.8F) {
            $$3 = new cxk(cxo.rb);
         } else {
            $$3 = new cxk(cxo.pP);
         }

         this.a(bvn.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cxk $$1 = this.a(bvn.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fbs $$3 = new fbs(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lo(ls.S, $$1), this.dA() + this.bT().d / 2.0, this.dC(), this.dG() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bxi.a p() {
      return chs.gr().a(bxj.v, 0.3F).a(bxj.s, 10.0).a(bxj.c, 2.0).a(bxj.x, 5.0).a(bxj.m, 32.0);
   }

   @Nullable
   public cic b(ash $$0, buw $$1) {
      cic $$2 = bvm.ab.a($$0, bvl.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((cic)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bvm<cic> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cg) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      jq<dic> $$4 = $$0.t(this.dv());
      cic.v $$5 = cic.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cic.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cic.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof ash) {
         this.gy();
      }

      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gy() {
      if (this.t() == cic.v.a) {
         this.bU.a(4, this.cr);
         this.bU.a(4, this.cs);
         this.bU.a(6, this.ct);
      } else {
         this.bU.a(4, this.ct);
         this.bU.a(6, this.cr);
         this.bU.a(6, this.cs);
      }
   }

   @Override
   protected void gs() {
      this.a(axf.jC, 1.0F, 1.0F);
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? cq : super.e($$0);
   }

   public cic.v t() {
      return cic.v.a(this.al.a(cd));
   }

   public void a(cic.v $$0) {
      this.al.a(cd, $$0.a());
   }

   List<UUID> gz() {
      Optional<UUID> $$0 = this.al.a(cj);
      Optional<UUID> $$1 = this.al.a(ck);
      if ($$0.isPresent() && $$1.isPresent()) {
         return List.of($$0.get(), $$1.get());
      } else if ($$0.isPresent()) {
         return List.of($$0.get());
      } else {
         return $$1.isPresent() ? List.of($$1.get()) : List.of();
      }
   }

   void b(@Nullable UUID $$0) {
      if (this.al.a(cj).isPresent()) {
         this.al.a(ck, Optional.ofNullable($$0));
      } else {
         this.al.a(cj, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gz();
      vd $$2 = new vd();

      for (UUID $$3 : $$1) {
         $$2.add(vm.a($$3));
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fP());
      $$0.a("Type", this.t().c());
      $$0.a("Sitting", this.x());
      $$0.a("Crouching", this.ci());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);

      for (vu $$2 : $$0.c("Trusted", 11)) {
         this.b(vm.a($$2));
      }

      this.D($$0.q("Sleeping"));
      this.a(cic.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dV() instanceof ash) {
         this.gy();
      }
   }

   public boolean x() {
      return this.s(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gm() {
      return this.s(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gA() {
      return this.s(128);
   }

   void C(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fP() {
      return this.s(32);
   }

   void D(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(ce, (byte)(this.al.a(ce) | $$0));
      } else {
         this.al.a(ce, (byte)(this.al.a(ce) & ~$$0));
      }
   }

   private boolean s(int $$0) {
      return (this.al.a(ce) & $$0) != 0;
   }

   @Override
   protected boolean f(bvn $$0) {
      return $$0 == bvn.a && this.fL();
   }

   @Override
   public boolean g(cxk $$0) {
      cxk $$1 = this.a(bvn.a);
      return $$1.f() || this.cy > 0 && $$0.b(ku.w) && !$$1.b(ku.w);
   }

   private void k(cxk $$0) {
      if (!$$0.f() && !this.dV().C) {
         clw $$1 = new clw(this.dV(), this.dA() + this.bT().d, this.dC() + 1.0, this.dG() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(axf.jH, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void l(cxk $$0) {
      clw $$1 = new clw(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(ash $$0, clw $$1) {
      cxk $$2 = $$1.l();
      if (this.g($$2)) {
         int $$3 = $$2.L();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bvn.a));
         this.a($$1);
         this.a(bvn.a, $$2.a(1));
         this.g(bvn.a);
         this.a($$1, $$2.L());
         $$1.at();
         this.cy = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dj()) {
         boolean $$0 = this.bj();
         if ($$0 || this.O_() != null || this.dV().ae()) {
            this.gB();
         }

         if ($$0 || this.fP()) {
            this.x(false);
         }

         if (this.gm() && this.dV().A.i() < 0.2F) {
            jh $$1 = this.dv();
            dxn $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, dke.j($$2));
         }
      }

      this.cv = this.cu;
      if (this.gq()) {
         this.cu = this.cu + (1.0F - this.cu) * 0.4F;
      } else {
         this.cu = this.cu + (0.0F - this.cu) * 0.4F;
      }

      this.cx = this.cw;
      if (this.ci()) {
         this.cw += 0.2F;
         if (this.cw > 3.0F) {
            this.cw = 3.0F;
         }
      } else {
         this.cw = 0.0F;
      }
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.ae);
   }

   @Override
   protected void a(cps $$0, bwd $$1) {
      ((cic)$$1).b($$0.cG());
   }

   public boolean gn() {
      return this.s(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean go() {
      return this.bn;
   }

   public boolean gp() {
      return this.cw == 3.0F;
   }

   public void z(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean ci() {
      return this.s(4);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gq() {
      return this.s(8);
   }

   public float J(float $$0) {
      return bae.h($$0, this.cv, this.cu) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return bae.h($$0, this.cx, this.cw);
   }

   @Override
   public void h(@Nullable bwb $$0) {
      if (this.gA() && $$0 == null) {
         this.C(false);
      }

      super.h($$0);
   }

   void gB() {
      this.D(false);
   }

   void gC() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gD() {
      return !this.fP() && !this.x() && !this.gm();
   }

   @Override
   public void R() {
      axe $$0 = this.u();
      if ($$0 == axf.jE) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected axe u() {
      if (this.fP()) {
         return axf.jF;
      } else {
         if (!this.dV().U() && this.ae.i() < 0.1F) {
            List<cps> $$0 = this.dV().a(cps.class, this.cR().c(16.0, 16.0, 16.0), bvk.f);
            if ($$0.isEmpty()) {
               return axf.jE;
            }
         }

         return axf.jz;
      }
   }

   @Nullable
   @Override
   protected axe e(btv $$0) {
      return axf.jD;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.jB;
   }

   boolean c(UUID $$0) {
      return this.gz().contains($$0);
   }

   @Override
   protected void b(ash $$0, btv $$1) {
      cxk $$2 = this.a(bvn.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bvn.a, cxk.k);
      }

      super.b($$0, $$1);
   }

   public static boolean a(cic $$0, bwb $$1) {
      double $$2 = $$1.dG() - $$0.dG();
      double $$3 = $$1.dA() - $$0.dA();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dV().a_(jh.a($$0.dA() + $$8, $$0.dC() + (double)$$9, $$0.dG() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public fbs cT() {
      return new fbs(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends ces<bwb> {
      @Nullable
      private bwb j;
      @Nullable
      private bwb k;
      private int l;

      public a(final Class<bwb> $$0, final boolean $$1, final boolean $$2, @Nullable final cgs.a $$3) {
         super(cic.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            ash $$0 = a(cic.this.dV());

            for (UUID $$1 : cic.this.gz()) {
               if ($$0.a($$1) instanceof bwb $$3) {
                  this.k = $$3;
                  this.j = $$3.ep();
                  int $$4 = $$3.eq();
                  return $$4 != this.l && this.a(this.j, this.d);
               }
            }

            return false;
         }
      }

      @Override
      public void d() {
         this.a(this.j);
         this.c = this.j;
         if (this.k != null) {
            this.l = this.k.eq();
         }

         cic.this.a(axf.jy, 1.0F, 1.0F);
         cic.this.C(true);
         cic.this.gB();
         super.d();
      }
   }

   class b extends ccz {
      int a;

      public b() {
         this.a(EnumSet.of(ccz.a.b, ccz.a.c, ccz.a.a));
      }

      @Override
      public boolean b() {
         return cic.this.gm();
      }

      @Override
      public boolean c() {
         return this.b() && this.a > 0;
      }

      @Override
      public void d() {
         this.a = this.a(40);
      }

      @Override
      public void e() {
         cic.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cgs.a {
      @Override
      public boolean test(bwb $$0, ash $$1) {
         if ($$0 instanceof cic) {
            return false;
         } else if ($$0 instanceof chx || $$0 instanceof cim || $$0 instanceof cms) {
            return true;
         } else if ($$0 instanceof bwy) {
            return !((bwy)$$0).p();
         } else if (!($$0 instanceof cps) || !$$0.aa_() && !((cps)$$0).b()) {
            return cic.this.c($$0.cG()) ? false : !$$0.fP() && !$$0.cg();
         } else {
            return false;
         }
      }
   }

   abstract class d extends ccz {
      private final cgs b = cgs.a().a(12.0).d().a(cic.this.new c());

      protected boolean h() {
         jh $$0 = jh.a(cic.this.dA(), cic.this.cR().e, cic.this.dG());
         return !cic.this.dV().h($$0) && cic.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(cic.this.dV()).a(bwb.class, this.b, cic.this, cic.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends ccl {
      public e(final double $$0) {
         super(cic.this, $$0);
      }

      @Override
      public void d() {
         ((cic)this.a).gC();
         ((cic)this.c).gC();
         super.d();
      }

      @Override
      protected void g() {
         ash $$0 = this.b;
         cic $$1 = (cic)this.a.a($$0, (buw)this.c);
         if ($$1 != null) {
            asi $$2 = this.a.gv();
            asi $$3 = this.c.gv();
            asi $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cG());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cG());
            }

            if ($$4 != null) {
               $$4.a(axp.P);
               ao.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gx();
            this.c.gx();
            $$1.c_(-24000);
            $$1.b(this.a.dA(), this.a.dC(), this.a.dG(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.N().b(dgw.f)) {
               this.b.b(new bvr(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends cdm {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cic.this, $$1, $$2, $$3);
      }

      @Override
      public double i() {
         return 2.0;
      }

      @Override
      public boolean l() {
         return this.d % 100 == 0;
      }

      @Override
      protected boolean a(dhd $$0, jh $$1) {
         dxn $$2 = $$0.a_($$1);
         return $$2.a(dkg.oD) && $$2.c(dsk.c) >= 2 || dlb.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cic.this.ae.i() < 0.05F) {
            cic.this.a(axf.jG, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(cic.this.dV()).N().b(dgw.c)) {
            dxn $$0 = cic.this.dV().a_(this.e);
            if ($$0.a(dkg.oD)) {
               this.b($$0);
            } else if (dlb.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dxn $$0) {
         dlb.a(cic.this, $$0, cic.this.dV(), this.e);
      }

      private void b(dxn $$0) {
         int $$1 = $$0.c(dsk.c);
         $$0.b(dsk.c, Integer.valueOf(1));
         int $$2 = 1 + cic.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         cxk $$3 = cic.this.a(bvn.a);
         if ($$3.f()) {
            cic.this.a(bvn.a, new cxk(cxo.xl));
            $$2--;
         }

         if ($$2 > 0) {
            dke.a(cic.this.dV(), this.e, new cxk(cxo.xl, $$2));
         }

         cic.this.a(axf.zQ, 1.0F, 1.0F);
         cic.this.dV().a(this.e, $$0.b(dsk.c, Integer.valueOf(1)), 2);
         cic.this.dV().a(ecj.c, this.e, ecj.a.a(cic.this));
      }

      @Override
      public boolean b() {
         return !cic.this.fP() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cic.this.x(false);
         super.d();
      }
   }

   class g extends cct {
      public g() {
         super(cic.this);
      }

      @Override
      public void d() {
         super.d();
         cic.this.gC();
      }

      @Override
      public boolean b() {
         return cic.this.bj() && cic.this.b(aya.a) > 0.25 || cic.this.bx();
      }
   }

   class h extends ccy {
      private final cic d;

      public h(final cic $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gA() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gA() && super.c();
      }

      @Override
      public void d() {
         this.d.gC();
         super.d();
      }
   }

   public static class i extends buw.a {
      public final cic.v a;

      public i(cic.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cdh {
      public j(final bwd $$0, final Class<? extends bwb> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cic.this.gm() && !cic.this.gq();
      }

      @Override
      public boolean c() {
         return super.c() && !cic.this.gm() && !cic.this.gq();
      }
   }

   public class k extends ccb {
      public k() {
         super(cic.this);
      }

      @Override
      public void a() {
         if (!cic.this.fP()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cic.this.gn() && !cic.this.ci() && !cic.this.gq() && !cic.this.gm();
      }
   }

   class l extends cdj {
      public l(final double $$0, final boolean $$1) {
         super(cic.this, $$0, $$1);
      }

      @Override
      protected void a(bwb $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cic.this.a(axf.jA, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cic.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cic.this.x() && !cic.this.fP() && !cic.this.ci() && !cic.this.gm() && super.b();
      }
   }

   class m extends ccc {
      public m() {
         super(cic.this);
      }

      @Override
      public void a() {
         if (cic.this.gD()) {
            super.a();
         }
      }
   }

   class n extends cds {
      public n(final double $$0) {
         super(cic.this, $$0);
      }

      @Override
      public boolean h() {
         return !cic.this.gA() && super.h();
      }
   }

   public class o extends cdd {
      @Override
      public boolean b() {
         if (!cic.this.gp()) {
            return false;
         } else {
            bwb $$0 = cic.this.O_();
            if ($$0 != null && $$0.bL()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = cic.a(cic.this, $$0);
                  if (!$$1) {
                     cic.this.L().a($$0, 0);
                     cic.this.z(false);
                     cic.this.A(false);
                  }

                  return $$1;
               }
            } else {
               return false;
            }
         }
      }

      @Override
      public boolean c() {
         bwb $$0 = cic.this.O_();
         if ($$0 != null && $$0.bL()) {
            double $$1 = cic.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cic.this.dN()) < 15.0F) || !cic.this.aJ()) && !cic.this.gm();
         } else {
            return false;
         }
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public void d() {
         cic.this.t(true);
         cic.this.y(true);
         cic.this.A(false);
         bwb $$0 = cic.this.O_();
         if ($$0 != null) {
            cic.this.H().a($$0, 60.0F, 30.0F);
            fbs $$1 = new fbs($$0.dA() - cic.this.dA(), $$0.dC() - cic.this.dC(), $$0.dG() - cic.this.dG()).d();
            cic.this.h(cic.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cic.this.L().o();
      }

      @Override
      public void e() {
         cic.this.z(false);
         cic.this.cw = 0.0F;
         cic.this.cx = 0.0F;
         cic.this.A(false);
         cic.this.y(false);
      }

      @Override
      public void a() {
         bwb $$0 = cic.this.O_();
         if ($$0 != null) {
            cic.this.H().a($$0, 60.0F, 30.0F);
         }

         if (!cic.this.gm()) {
            fbs $$1 = cic.this.dy();
            if ($$1.e * $$1.e < 0.03F && cic.this.dN() != 0.0F) {
               cic.this.w(bae.i(0.2F, cic.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cic.this.w((float)$$3);
            }
         }

         if ($$0 != null && cic.this.f($$0) <= 2.0F) {
            cic.this.c(a(cic.this.dV()), $$0);
         } else if (cic.this.dN() > 0.0F && cic.this.aJ() && (float)cic.this.dy().e != 0.0F && cic.this.dV().a_(cic.this.dv()).a(dkg.ea)) {
            cic.this.w(60.0F);
            cic.this.h(null);
            cic.this.B(true);
         }
      }
   }

   class p extends ccz {
      public p() {
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         if (!cic.this.a(bvn.a).f()) {
            return false;
         } else if (cic.this.O_() != null || cic.this.ep() != null) {
            return false;
         } else if (!cic.this.gD()) {
            return false;
         } else if (cic.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<clw> $$0 = cic.this.dV().a(clw.class, cic.this.cR().c(8.0, 8.0, 8.0), cic.cl);
            return !$$0.isEmpty() && cic.this.a(bvn.a).f();
         }
      }

      @Override
      public void a() {
         List<clw> $$0 = cic.this.dV().a(clw.class, cic.this.cR().c(8.0, 8.0, 8.0), cic.cl);
         cxk $$1 = cic.this.a(bvn.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cic.this.L().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<clw> $$0 = cic.this.dV().a(clw.class, cic.this.cR().c(8.0, 8.0, 8.0), cic.cl);
         if (!$$0.isEmpty()) {
            cic.this.L().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cef {
      public q(final int $$0, final int $$1) {
         super(cic.this, $$1);
      }

      @Override
      public void d() {
         cic.this.gC();
         super.d();
      }

      @Override
      public boolean b() {
         return super.b() && this.h();
      }

      @Override
      public boolean c() {
         return super.c() && this.h();
      }

      private boolean h() {
         return !cic.this.fP() && !cic.this.x() && !cic.this.gA() && cic.this.O_() == null;
      }
   }

   class r extends cic.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(ccz.a.a, ccz.a.b));
      }

      @Override
      public boolean b() {
         return cic.this.ep() == null
            && cic.this.dY().i() < 0.02F
            && !cic.this.fP()
            && cic.this.O_() == null
            && cic.this.L().m()
            && !this.i()
            && !cic.this.gn()
            && !cic.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cic.this.dY().a(3);
         cic.this.x(true);
         cic.this.L().o();
      }

      @Override
      public void e() {
         cic.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cic.this.H().a(cic.this.dA() + this.c, cic.this.dE(), cic.this.dG() + this.d, (float)cic.this.aa(), (float)cic.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cic.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cic.this.dY().a(20));
      }
   }

   class s extends ccs {
      private int c = b(100);

      public s(final double $$0) {
         super(cic.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cic.this.fP() && this.a.O_() == null) {
            if (cic.this.dV().ae() && cic.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jh $$0 = this.a.dv();
               return cic.this.dV().U() && cic.this.dV().h($$0) && !((ash)cic.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cic.this.gC();
         super.d();
      }
   }

   class t extends cic.d {
      private static final int c = b(140);
      private int d = cic.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(ccz.a.a, ccz.a.b, ccz.a.c));
      }

      @Override
      public boolean b() {
         return cic.this.bo == 0.0F && cic.this.bp == 0.0F && cic.this.bq == 0.0F ? this.k() || cic.this.fP() : false;
      }

      @Override
      public boolean c() {
         return this.k();
      }

      private boolean k() {
         if (this.d > 0) {
            this.d--;
            return false;
         } else {
            return cic.this.dV().U() && this.h() && !this.i() && !cic.this.av;
         }
      }

      @Override
      public void e() {
         this.d = cic.this.ae.a(c);
         cic.this.gC();
      }

      @Override
      public void d() {
         cic.this.x(false);
         cic.this.z(false);
         cic.this.A(false);
         cic.this.t(false);
         cic.this.D(true);
         cic.this.L().o();
         cic.this.I().a(cic.this.dA(), cic.this.dC(), cic.this.dG(), 0.0);
      }
   }

   class u extends ccz {
      public u() {
         this.a(EnumSet.of(ccz.a.a, ccz.a.b));
      }

      @Override
      public boolean b() {
         if (cic.this.fP()) {
            return false;
         } else {
            bwb $$0 = cic.this.O_();
            return $$0 != null && $$0.bL() && cic.cn.test($$0) && cic.this.g($$0) > 36.0 && !cic.this.ci() && !cic.this.gq() && !cic.this.bn;
         }
      }

      @Override
      public void d() {
         cic.this.x(false);
         cic.this.B(false);
      }

      @Override
      public void e() {
         bwb $$0 = cic.this.O_();
         if ($$0 != null && cic.a(cic.this, $$0)) {
            cic.this.A(true);
            cic.this.z(true);
            cic.this.L().o();
            cic.this.H().a($$0, (float)cic.this.aa(), (float)cic.this.Z());
         } else {
            cic.this.A(false);
            cic.this.z(false);
         }
      }

      @Override
      public void a() {
         bwb $$0 = cic.this.O_();
         if ($$0 != null) {
            cic.this.H().a($$0, (float)cic.this.aa(), (float)cic.this.Z());
            if (cic.this.g($$0) <= 36.0) {
               cic.this.A(true);
               cic.this.z(true);
               cic.this.L().o();
            } else {
               cic.this.L().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bba {
      a(0, "red"),
      b(1, "snow");

      public static final bba.a<cic.v> c = bba.a(cic.v::values);
      private static final IntFunction<cic.v> d = ayv.a(cic.v::a, values(), ayv.a.a);
      private final int e;
      private final String f;

      private v(final int $$0, final String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }

      public int a() {
         return this.e;
      }

      public static cic.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cic.v a(int $$0) {
         return d.apply($$0);
      }

      public static cic.v a(jq<dic> $$0) {
         return $$0.a(axt.ar) ? b : a;
      }
   }
}
