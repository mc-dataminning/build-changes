import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cig extends chw implements bxf<cig.v> {
   private static final alc<Integer> cd = alg.a(cig.class, ale.b);
   private static final alc<Byte> ce = alg.a(cig.class, ale.a);
   private static final int cf = 1;
   public static final int bZ = 4;
   public static final int ca = 8;
   public static final int cb = 16;
   private static final int cg = 32;
   private static final int ch = 64;
   private static final int ci = 128;
   private static final alc<Optional<UUID>> cj = alg.a(cig.class, ale.r);
   private static final alc<Optional<UUID>> ck = alg.a(cig.class, ale.r);
   static final Predicate<cma> cl = $$0 -> !$$0.v() && $$0.bL();
   private static final Predicate<bvj> cm = $$0 -> !($$0 instanceof bwf $$1) ? false : $$1.er() != null && $$1.es() < $$1.af + 600;
   static final Predicate<bvj> cn = $$0 -> $$0 instanceof cib || $$0 instanceof ciq;
   private static final Predicate<bvj> co = $$0 -> !$$0.cg() && bvo.e.test($$0);
   private static final int cp = 600;
   private static final bvm cq = bvq.ab.n().a(0.5F).b(0.2975F);
   private cdd cr;
   private cdd cs;
   private cdd ct;
   private float cu;
   private float cv;
   float cw;
   float cx;
   private int cy;

   public cig(bvq<? extends cig> $$0, dhh $$1) {
      super($$0, $$1);
      this.bP = new cig.k();
      this.bQ = new cig.m();
      this.a(eun.p, 0.0F);
      this.a(eun.q, 0.0F);
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
      this.cr = new cew<>(this, chw.class, 10, false, false, ($$0, $$1) -> $$0 instanceof cib || $$0 instanceof ciq);
      this.cs = new cew<>(this, cix.class, 10, false, false, cix.bZ);
      this.ct = new cew<>(this, chs.class, 20, false, false, ($$0, $$1) -> $$0 instanceof chu);
      this.bT.a(0, new cig.g());
      this.bT.a(0, new ccs(this, this.dV()));
      this.bT.a(1, new cig.b());
      this.bT.a(2, new cig.n(2.2));
      this.bT.a(3, new cig.e(1.0));
      this.bT.a(4, new cck<>(this, cpw.class, 16.0F, 1.6, 1.4, $$0 -> co.test($$0) && !this.c($$0.cG()) && !this.gA()));
      this.bT.a(4, new cck<>(this, ciz.class, 8.0F, 1.6, 1.4, $$0 -> !((ciz)$$0).p() && !this.gA()));
      this.bT.a(4, new cck<>(this, cio.class, 8.0F, 1.6, 1.4, $$0 -> !this.gA()));
      this.bT.a(5, new cig.u());
      this.bT.a(6, new cig.o());
      this.bT.a(6, new cig.s(1.25));
      this.bT.a(7, new cig.l(1.2F, true));
      this.bT.a(7, new cig.t());
      this.bT.a(8, new cig.h(this, 1.25));
      this.bT.a(9, new cig.q(32, 200));
      this.bT.a(10, new cig.f(1.2F, 12, 1));
      this.bT.a(10, new cdj(this, 0.4F));
      this.bT.a(11, new ceq(this, 1.0));
      this.bT.a(11, new cig.p());
      this.bT.a(12, new cig.j(this, cpw.class, 24.0F));
      this.bT.a(13, new cig.r());
      this.bU.a(3, new cig.a(bwf.class, false, false, ($$0, $$1) -> cm.test($$0) && !this.c($$0.cG())));
   }

   @Override
   public void d_() {
      if (!this.dV().C && this.bL() && this.dj()) {
         this.cy++;
         cxo $$0 = this.a(bvr.a);
         if (this.i($$0)) {
            if (this.cy > 600) {
               cxo $$1 = $$0.a(this.dV(), this);
               if (!$$1.f()) {
                  this.a(bvr.a, $$1);
               }

               this.cy = 0;
            } else if (this.cy > 560 && this.ae.i() < 0.1F) {
               this.gs();
               this.dV().a(this, (byte)45);
            }
         }

         bwf $$2 = this.O_();
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
         this.a(axf.jz, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eE();
   }

   private boolean i(cxo $$0) {
      return $$0.b(ku.w) && this.O_() == null && this.aJ() && !this.fP();
   }

   @Override
   protected void a(bam $$0, btg $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cxo $$3;
         if ($$2 < 0.05F) {
            $$3 = new cxo(cxs.oW);
         } else if ($$2 < 0.2F) {
            $$3 = new cxo(cxs.rp);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cxo(cxs.vt) : new cxo(cxs.vu);
         } else if ($$2 < 0.6F) {
            $$3 = new cxo(cxs.pS);
         } else if ($$2 < 0.8F) {
            $$3 = new cxo(cxs.rb);
         } else {
            $$3 = new cxo(cxs.pP);
         }

         this.a(bvr.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cxo $$1 = this.a(bvr.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fbx $$3 = new fbx(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dN() * (float) (Math.PI / 180.0))
                  .b(-this.dL() * (float) (Math.PI / 180.0));
               this.dV().a(new lo(ls.S, $$1), this.dA() + this.bT().d / 2.0, this.dC(), this.dG() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bxm.a p() {
      return chw.gr().a(bxn.v, 0.3F).a(bxn.s, 10.0).a(bxn.c, 2.0).a(bxn.x, 5.0).a(bxn.m, 32.0);
   }

   @Nullable
   public cig b(ash $$0, bva $$1) {
      cig $$2 = bvq.ab.a($$0, bvp.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((cig)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bvq<cig> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cg) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      jq<dij> $$4 = $$0.t(this.dv());
      cig.v $$5 = cig.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cig.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cig.i($$5);
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
      if (this.t() == cig.v.a) {
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
      this.a(axf.jD, 1.0F, 1.0F);
   }

   @Override
   public bvm e(bwr $$0) {
      return this.e_() ? cq : super.e($$0);
   }

   public cig.v t() {
      return cig.v.a(this.al.a(cd));
   }

   public void a(cig.v $$0) {
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
      this.a(cig.v.a($$0.l("Type")));
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
   protected boolean f(bvr $$0) {
      return $$0 == bvr.a && this.fL();
   }

   @Override
   public boolean g(cxo $$0) {
      cxo $$1 = this.a(bvr.a);
      return $$1.f() || this.cy > 0 && $$0.b(ku.w) && !$$1.b(ku.w);
   }

   private void k(cxo $$0) {
      if (!$$0.f() && !this.dV().C) {
         cma $$1 = new cma(this.dV(), this.dA() + this.bT().d, this.dC() + 1.0, this.dG() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(axf.jI, 1.0F, 1.0F);
         this.dV().b($$1);
      }
   }

   private void l(cxo $$0) {
      cma $$1 = new cma(this.dV(), this.dA(), this.dC(), this.dG(), $$0);
      this.dV().b($$1);
   }

   @Override
   protected void a(ash $$0, cma $$1) {
      cxo $$2 = $$1.l();
      if (this.g($$2)) {
         int $$3 = $$2.L();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bvr.a));
         this.a($$1);
         this.a(bvr.a, $$2.a(1));
         this.g(bvr.a);
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
            dxu $$2 = this.dV().a_($$1);
            this.dV().c(2001, $$1, dkl.j($$2));
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
   public boolean j(cxo $$0) {
      return $$0.a(ayd.ae);
   }

   @Override
   protected void a(cpw $$0, bwh $$1) {
      ((cig)$$1).b($$0.cG());
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
   public void h(@Nullable bwf $$0) {
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
      if ($$0 == axf.jF) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected axe u() {
      if (this.fP()) {
         return axf.jG;
      } else {
         if (!this.dV().U() && this.ae.i() < 0.1F) {
            List<cpw> $$0 = this.dV().a(cpw.class, this.cR().c(16.0, 16.0, 16.0), bvo.f);
            if ($$0.isEmpty()) {
               return axf.jF;
            }
         }

         return axf.jA;
      }
   }

   @Nullable
   @Override
   protected axe e(btz $$0) {
      return axf.jE;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.jC;
   }

   boolean c(UUID $$0) {
      return this.gz().contains($$0);
   }

   @Override
   protected void b(ash $$0, btz $$1) {
      cxo $$2 = this.a(bvr.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bvr.a, cxo.k);
      }

      super.b($$0, $$1);
   }

   public static boolean a(cig $$0, bwf $$1) {
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
   public fbx cT() {
      return new fbx(0.0, (double)(0.55F * this.cS()), (double)(this.dq() * 0.4F));
   }

   class a extends cew<bwf> {
      @Nullable
      private bwf j;
      @Nullable
      private bwf k;
      private int l;

      public a(final Class<bwf> $$0, final boolean $$1, final boolean $$2, @Nullable final cgw.a $$3) {
         super(cig.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dY().a(this.b) != 0) {
            return false;
         } else {
            ash $$0 = a(cig.this.dV());

            for (UUID $$1 : cig.this.gz()) {
               if ($$0.a($$1) instanceof bwf $$3) {
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

         cig.this.a(axf.jz, 1.0F, 1.0F);
         cig.this.C(true);
         cig.this.gB();
         super.d();
      }
   }

   class b extends cdd {
      int a;

      public b() {
         this.a(EnumSet.of(cdd.a.b, cdd.a.c, cdd.a.a));
      }

      @Override
      public boolean b() {
         return cig.this.gm();
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
         cig.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cgw.a {
      @Override
      public boolean test(bwf $$0, ash $$1) {
         if ($$0 instanceof cig) {
            return false;
         } else if ($$0 instanceof cib || $$0 instanceof ciq || $$0 instanceof cmw) {
            return true;
         } else if ($$0 instanceof bxc) {
            return !((bxc)$$0).p();
         } else if (!($$0 instanceof cpw) || !$$0.aa_() && !((cpw)$$0).b()) {
            return cig.this.c($$0.cG()) ? false : !$$0.fP() && !$$0.cg();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cdd {
      private final cgw b = cgw.a().a(12.0).d().a(cig.this.new c());

      protected boolean h() {
         jh $$0 = jh.a(cig.this.dA(), cig.this.cR().e, cig.this.dG());
         return !cig.this.dV().h($$0) && cig.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(cig.this.dV()).a(bwf.class, this.b, cig.this, cig.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends ccp {
      public e(final double $$0) {
         super(cig.this, $$0);
      }

      @Override
      public void d() {
         ((cig)this.a).gC();
         ((cig)this.c).gC();
         super.d();
      }

      @Override
      protected void g() {
         ash $$0 = this.b;
         cig $$1 = (cig)this.a.a($$0, (bva)this.c);
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
            if ($$0.N().b(dhd.f)) {
               this.b.b(new bvv(this.b, this.a.dA(), this.a.dC(), this.a.dG(), this.a.dY().a(7) + 1));
            }
         }
      }
   }

   public class f extends cdq {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cig.this, $$1, $$2, $$3);
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
      protected boolean a(dhk $$0, jh $$1) {
         dxu $$2 = $$0.a_($$1);
         return $$2.a(dkn.oD) && $$2.c(dsr.c) >= 2 || dli.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cig.this.ae.i() < 0.05F) {
            cig.this.a(axf.jH, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(cig.this.dV()).N().b(dhd.c)) {
            dxu $$0 = cig.this.dV().a_(this.e);
            if ($$0.a(dkn.oD)) {
               this.b($$0);
            } else if (dli.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dxu $$0) {
         dli.a(cig.this, $$0, cig.this.dV(), this.e);
      }

      private void b(dxu $$0) {
         int $$1 = $$0.c(dsr.c);
         $$0.b(dsr.c, Integer.valueOf(1));
         int $$2 = 1 + cig.this.dV().A.a(2) + ($$1 == 3 ? 1 : 0);
         cxo $$3 = cig.this.a(bvr.a);
         if ($$3.f()) {
            cig.this.a(bvr.a, new cxo(cxs.xl));
            $$2--;
         }

         if ($$2 > 0) {
            dkl.a(cig.this.dV(), this.e, new cxo(cxs.xl, $$2));
         }

         cig.this.a(axf.zR, 1.0F, 1.0F);
         cig.this.dV().a(this.e, $$0.b(dsr.c, Integer.valueOf(1)), 2);
         cig.this.dV().a(ecq.c, this.e, ecq.a.a(cig.this));
      }

      @Override
      public boolean b() {
         return !cig.this.fP() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cig.this.x(false);
         super.d();
      }
   }

   class g extends ccx {
      public g() {
         super(cig.this);
      }

      @Override
      public void d() {
         super.d();
         cig.this.gC();
      }

      @Override
      public boolean b() {
         return cig.this.bj() && cig.this.b(aya.a) > 0.25 || cig.this.bx();
      }
   }

   class h extends cdc {
      private final cig d;

      public h(final cig $$0, final double $$1) {
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

   public static class i extends bva.a {
      public final cig.v a;

      public i(cig.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cdl {
      public j(final bwh $$0, final Class<? extends bwf> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cig.this.gm() && !cig.this.gq();
      }

      @Override
      public boolean c() {
         return super.c() && !cig.this.gm() && !cig.this.gq();
      }
   }

   public class k extends ccf {
      public k() {
         super(cig.this);
      }

      @Override
      public void a() {
         if (!cig.this.fP()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cig.this.gn() && !cig.this.ci() && !cig.this.gq() && !cig.this.gm();
      }
   }

   class l extends cdn {
      public l(final double $$0, final boolean $$1) {
         super(cig.this, $$0, $$1);
      }

      @Override
      protected void a(bwf $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cig.this.a(axf.jB, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cig.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cig.this.x() && !cig.this.fP() && !cig.this.ci() && !cig.this.gm() && super.b();
      }
   }

   class m extends ccg {
      public m() {
         super(cig.this);
      }

      @Override
      public void a() {
         if (cig.this.gD()) {
            super.a();
         }
      }
   }

   class n extends cdw {
      public n(final double $$0) {
         super(cig.this, $$0);
      }

      @Override
      public boolean h() {
         return !cig.this.gA() && super.h();
      }
   }

   public class o extends cdh {
      @Override
      public boolean b() {
         if (!cig.this.gp()) {
            return false;
         } else {
            bwf $$0 = cig.this.O_();
            if ($$0 != null && $$0.bL()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = cig.a(cig.this, $$0);
                  if (!$$1) {
                     cig.this.L().a($$0, 0);
                     cig.this.z(false);
                     cig.this.A(false);
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
         bwf $$0 = cig.this.O_();
         if ($$0 != null && $$0.bL()) {
            double $$1 = cig.this.dy().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cig.this.dN()) < 15.0F) || !cig.this.aJ()) && !cig.this.gm();
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
         cig.this.t(true);
         cig.this.y(true);
         cig.this.A(false);
         bwf $$0 = cig.this.O_();
         if ($$0 != null) {
            cig.this.H().a($$0, 60.0F, 30.0F);
            fbx $$1 = new fbx($$0.dA() - cig.this.dA(), $$0.dC() - cig.this.dC(), $$0.dG() - cig.this.dG()).d();
            cig.this.h(cig.this.dy().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cig.this.L().o();
      }

      @Override
      public void e() {
         cig.this.z(false);
         cig.this.cw = 0.0F;
         cig.this.cx = 0.0F;
         cig.this.A(false);
         cig.this.y(false);
      }

      @Override
      public void a() {
         bwf $$0 = cig.this.O_();
         if ($$0 != null) {
            cig.this.H().a($$0, 60.0F, 30.0F);
         }

         if (!cig.this.gm()) {
            fbx $$1 = cig.this.dy();
            if ($$1.e * $$1.e < 0.03F && cig.this.dN() != 0.0F) {
               cig.this.w(bae.i(0.2F, cig.this.dN(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cig.this.w((float)$$3);
            }
         }

         if ($$0 != null && cig.this.f($$0) <= 2.0F) {
            cig.this.c(a(cig.this.dV()), $$0);
         } else if (cig.this.dN() > 0.0F && cig.this.aJ() && (float)cig.this.dy().e != 0.0F && cig.this.dV().a_(cig.this.dv()).a(dkn.ea)) {
            cig.this.w(60.0F);
            cig.this.h(null);
            cig.this.B(true);
         }
      }
   }

   class p extends cdd {
      public p() {
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean b() {
         if (!cig.this.a(bvr.a).f()) {
            return false;
         } else if (cig.this.O_() != null || cig.this.ep() != null) {
            return false;
         } else if (!cig.this.gD()) {
            return false;
         } else if (cig.this.dY().a(b(10)) != 0) {
            return false;
         } else {
            List<cma> $$0 = cig.this.dV().a(cma.class, cig.this.cR().c(8.0, 8.0, 8.0), cig.cl);
            return !$$0.isEmpty() && cig.this.a(bvr.a).f();
         }
      }

      @Override
      public void a() {
         List<cma> $$0 = cig.this.dV().a(cma.class, cig.this.cR().c(8.0, 8.0, 8.0), cig.cl);
         cxo $$1 = cig.this.a(bvr.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cig.this.L().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cma> $$0 = cig.this.dV().a(cma.class, cig.this.cR().c(8.0, 8.0, 8.0), cig.cl);
         if (!$$0.isEmpty()) {
            cig.this.L().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cej {
      public q(final int $$0, final int $$1) {
         super(cig.this, $$1);
      }

      @Override
      public void d() {
         cig.this.gC();
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
         return !cig.this.fP() && !cig.this.x() && !cig.this.gA() && cig.this.O_() == null;
      }
   }

   class r extends cig.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cdd.a.a, cdd.a.b));
      }

      @Override
      public boolean b() {
         return cig.this.ep() == null
            && cig.this.dY().i() < 0.02F
            && !cig.this.fP()
            && cig.this.O_() == null
            && cig.this.L().m()
            && !this.i()
            && !cig.this.gn()
            && !cig.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cig.this.dY().a(3);
         cig.this.x(true);
         cig.this.L().o();
      }

      @Override
      public void e() {
         cig.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cig.this.H().a(cig.this.dA() + this.c, cig.this.dE(), cig.this.dG() + this.d, (float)cig.this.aa(), (float)cig.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cig.this.dY().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cig.this.dY().a(20));
      }
   }

   class s extends ccw {
      private int c = b(100);

      public s(final double $$0) {
         super(cig.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cig.this.fP() && this.a.O_() == null) {
            if (cig.this.dV().ae() && cig.this.dV().h(this.a.dv())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jh $$0 = this.a.dv();
               return cig.this.dV().U() && cig.this.dV().h($$0) && !((ash)cig.this.dV()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cig.this.gC();
         super.d();
      }
   }

   class t extends cig.d {
      private static final int c = b(140);
      private int d = cig.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(cdd.a.a, cdd.a.b, cdd.a.c));
      }

      @Override
      public boolean b() {
         return cig.this.bo == 0.0F && cig.this.bp == 0.0F && cig.this.bq == 0.0F ? this.k() || cig.this.fP() : false;
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
            return cig.this.dV().U() && this.h() && !this.i() && !cig.this.av;
         }
      }

      @Override
      public void e() {
         this.d = cig.this.ae.a(c);
         cig.this.gC();
      }

      @Override
      public void d() {
         cig.this.x(false);
         cig.this.z(false);
         cig.this.A(false);
         cig.this.t(false);
         cig.this.D(true);
         cig.this.L().o();
         cig.this.I().a(cig.this.dA(), cig.this.dC(), cig.this.dG(), 0.0);
      }
   }

   class u extends cdd {
      public u() {
         this.a(EnumSet.of(cdd.a.a, cdd.a.b));
      }

      @Override
      public boolean b() {
         if (cig.this.fP()) {
            return false;
         } else {
            bwf $$0 = cig.this.O_();
            return $$0 != null && $$0.bL() && cig.cn.test($$0) && cig.this.g($$0) > 36.0 && !cig.this.ci() && !cig.this.gq() && !cig.this.bn;
         }
      }

      @Override
      public void d() {
         cig.this.x(false);
         cig.this.B(false);
      }

      @Override
      public void e() {
         bwf $$0 = cig.this.O_();
         if ($$0 != null && cig.a(cig.this, $$0)) {
            cig.this.A(true);
            cig.this.z(true);
            cig.this.L().o();
            cig.this.H().a($$0, (float)cig.this.aa(), (float)cig.this.Z());
         } else {
            cig.this.A(false);
            cig.this.z(false);
         }
      }

      @Override
      public void a() {
         bwf $$0 = cig.this.O_();
         if ($$0 != null) {
            cig.this.H().a($$0, (float)cig.this.aa(), (float)cig.this.Z());
            if (cig.this.g($$0) <= 36.0) {
               cig.this.A(true);
               cig.this.z(true);
               cig.this.L().o();
            } else {
               cig.this.L().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bba {
      a(0, "red"),
      b(1, "snow");

      public static final bba.a<cig.v> c = bba.a(cig.v::values);
      private static final IntFunction<cig.v> d = ayv.a(cig.v::a, values(), ayv.a.a);
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

      public static cig.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cig.v a(int $$0) {
         return d.apply($$0);
      }

      public static cig.v a(jq<dij> $$0) {
         return $$0.a(axt.ar) ? b : a;
      }
   }
}
