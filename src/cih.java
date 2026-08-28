import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cih extends chx implements bxg<cih.v> {
   private static final alc<Integer> cd = alg.a(cih.class, ale.b);
   private static final alc<Byte> ce = alg.a(cih.class, ale.a);
   private static final int cf = 1;
   public static final int bZ = 4;
   public static final int ca = 8;
   public static final int cb = 16;
   private static final int cg = 32;
   private static final int ch = 64;
   private static final int ci = 128;
   private static final alc<Optional<UUID>> cj = alg.a(cih.class, ale.r);
   private static final alc<Optional<UUID>> ck = alg.a(cih.class, ale.r);
   static final Predicate<cmb> cl = $$0 -> !$$0.v() && $$0.bL();
   private static final Predicate<bvk> cm = $$0 -> !($$0 instanceof bwg $$1) ? false : $$1.es() != null && $$1.et() < $$1.af + 600;
   static final Predicate<bvk> cn = $$0 -> $$0 instanceof cic || $$0 instanceof cir;
   private static final Predicate<bvk> co = $$0 -> !$$0.cg() && bvp.e.test($$0);
   private static final int cp = 600;
   private static final bvn cq = bvr.ab.n().a(0.5F).b(0.2975F);
   private cde cr;
   private cde cs;
   private cde ct;
   private float cu;
   private float cv;
   float cw;
   float cx;
   private int cy;

   public cih(bvr<? extends cih> $$0, dhi $$1) {
      super($$0, $$1);
      this.bP = new cih.k();
      this.bQ = new cih.m();
      this.a(euo.p, 0.0F);
      this.a(euo.q, 0.0F);
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
      this.cr = new cex<>(this, chx.class, 10, false, false, ($$0, $$1) -> $$0 instanceof cic || $$0 instanceof cir);
      this.cs = new cex<>(this, ciy.class, 10, false, false, ciy.bZ);
      this.ct = new cex<>(this, cht.class, 20, false, false, ($$0, $$1) -> $$0 instanceof chv);
      this.bT.a(0, new cih.g());
      this.bT.a(0, new cct(this, this.dW()));
      this.bT.a(1, new cih.b());
      this.bT.a(2, new cih.n(2.2));
      this.bT.a(3, new cih.e(1.0));
      this.bT.a(4, new ccl<>(this, cpx.class, 16.0F, 1.6, 1.4, $$0 -> co.test($$0) && !this.c($$0.cG()) && !this.gC()));
      this.bT.a(4, new ccl<>(this, cja.class, 8.0F, 1.6, 1.4, $$0 -> !((cja)$$0).p() && !this.gC()));
      this.bT.a(4, new ccl<>(this, cip.class, 8.0F, 1.6, 1.4, $$0 -> !this.gC()));
      this.bT.a(5, new cih.u());
      this.bT.a(6, new cih.o());
      this.bT.a(6, new cih.s(1.25));
      this.bT.a(7, new cih.l(1.2F, true));
      this.bT.a(7, new cih.t());
      this.bT.a(8, new cih.h(this, 1.25));
      this.bT.a(9, new cih.q(32, 200));
      this.bT.a(10, new cih.f(1.2F, 12, 1));
      this.bT.a(10, new cdk(this, 0.4F));
      this.bT.a(11, new cer(this, 1.0));
      this.bT.a(11, new cih.p());
      this.bT.a(12, new cih.j(this, cpx.class, 24.0F));
      this.bT.a(13, new cih.r());
      this.bU.a(3, new cih.a(bwg.class, false, false, ($$0, $$1) -> cm.test($$0) && !this.c($$0.cG())));
   }

   @Override
   public void d_() {
      if (!this.dW().C && this.bL() && this.dk()) {
         this.cy++;
         cxp $$0 = this.a(bvs.a);
         if (this.i($$0)) {
            if (this.cy > 600) {
               cxp $$1 = $$0.a(this.dW(), this);
               if (!$$1.f()) {
                  this.a(bvs.a, $$1);
               }

               this.cy = 0;
            } else if (this.cy > 560 && this.ae.i() < 0.1F) {
               this.gu();
               this.dW().a(this, (byte)45);
            }
         }

         bwg $$2 = this.O_();
         if ($$2 == null || !$$2.bL()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fR() || this.fi()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.d_();
      if (this.gC() && this.ae.i() < 0.05F) {
         this.a(axf.jz, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fi() {
      return this.eF();
   }

   private boolean i(cxp $$0) {
      return $$0.b(ku.w) && this.O_() == null && this.aJ() && !this.fR();
   }

   @Override
   protected void a(bam $$0, bth $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cxp $$3;
         if ($$2 < 0.05F) {
            $$3 = new cxp(cxt.oW);
         } else if ($$2 < 0.2F) {
            $$3 = new cxp(cxt.rp);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cxp(cxt.vt) : new cxp(cxt.vu);
         } else if ($$2 < 0.6F) {
            $$3 = new cxp(cxt.pS);
         } else if ($$2 < 0.8F) {
            $$3 = new cxp(cxt.rb);
         } else {
            $$3 = new cxp(cxt.pP);
         }

         this.a(bvs.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cxp $$1 = this.a(bvs.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fby $$3 = new fby(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dO() * (float) (Math.PI / 180.0))
                  .b(-this.dM() * (float) (Math.PI / 180.0));
               this.dW().a(new lo(ls.S, $$1), this.dB() + this.bT().d / 2.0, this.dD(), this.dH() + this.bT().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static bxn.a p() {
      return chx.gt().a(bxo.v, 0.3F).a(bxo.s, 10.0).a(bxo.c, 2.0).a(bxo.x, 5.0).a(bxo.m, 32.0);
   }

   @Nullable
   public cih b(ash $$0, bvb $$1) {
      cih $$2 = bvr.ab.a($$0, bvq.e);
      if ($$2 != null) {
         $$2.a(this.ae.h() ? this.t() : ((cih)$$1).t());
      }

      return $$2;
   }

   public static boolean c(bvr<cih> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cg) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      jq<dik> $$4 = $$0.t(this.dw());
      cih.v $$5 = cih.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cih.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cih.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof ash) {
         this.gA();
      }

      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gA() {
      if (this.t() == cih.v.a) {
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
   protected void gu() {
      this.a(axf.jD, 1.0F, 1.0F);
   }

   @Override
   public bvn e(bws $$0) {
      return this.e_() ? cq : super.e($$0);
   }

   public cih.v t() {
      return cih.v.a(this.al.a(cd));
   }

   public void a(cih.v $$0) {
      this.al.a(cd, $$0.a());
   }

   List<UUID> gB() {
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
      List<UUID> $$1 = this.gB();
      vd $$2 = new vd();

      for (UUID $$3 : $$1) {
         $$2.add(vm.a($$3));
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fR());
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
      this.a(cih.v.a($$0.l("Type")));
      this.x($$0.q("Sitting"));
      this.z($$0.q("Crouching"));
      if (this.dW() instanceof ash) {
         this.gA();
      }
   }

   public boolean x() {
      return this.s(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean go() {
      return this.s(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gC() {
      return this.s(128);
   }

   void C(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fR() {
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
   protected boolean f(bvs $$0) {
      return $$0 == bvs.a && this.fN();
   }

   @Override
   public boolean g(cxp $$0) {
      cxp $$1 = this.a(bvs.a);
      return $$1.f() || this.cy > 0 && $$0.b(ku.w) && !$$1.b(ku.w);
   }

   private void k(cxp $$0) {
      if (!$$0.f() && !this.dW().C) {
         cmb $$1 = new cmb(this.dW(), this.dB() + this.bT().d, this.dD() + 1.0, this.dH() + this.bT().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(axf.jI, 1.0F, 1.0F);
         this.dW().b($$1);
      }
   }

   private void l(cxp $$0) {
      cmb $$1 = new cmb(this.dW(), this.dB(), this.dD(), this.dH(), $$0);
      this.dW().b($$1);
   }

   @Override
   protected void a(ash $$0, cmb $$1) {
      cxp $$2 = $$1.l();
      if (this.g($$2)) {
         int $$3 = $$2.L();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bvs.a));
         this.a($$1);
         this.a(bvs.a, $$2.a(1));
         this.g(bvs.a);
         this.a($$1, $$2.L());
         $$1.at();
         this.cy = 0;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dk()) {
         boolean $$0 = this.bj();
         if ($$0 || this.O_() != null || this.dW().ae()) {
            this.gD();
         }

         if ($$0 || this.fR()) {
            this.x(false);
         }

         if (this.go() && this.dW().A.i() < 0.2F) {
            jh $$1 = this.dw();
            dxv $$2 = this.dW().a_($$1);
            this.dW().c(2001, $$1, dkm.j($$2));
         }
      }

      this.cv = this.cu;
      if (this.gs()) {
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
   public boolean j(cxp $$0) {
      return $$0.a(ayd.ae);
   }

   @Override
   protected void a(cpx $$0, bwi $$1) {
      ((cih)$$1).b($$0.cG());
   }

   public boolean gp() {
      return this.s(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gq() {
      return this.bn;
   }

   public boolean gr() {
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

   public boolean gs() {
      return this.s(8);
   }

   public float J(float $$0) {
      return bae.h($$0, this.cv, this.cu) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return bae.h($$0, this.cx, this.cw);
   }

   @Override
   public void h(@Nullable bwg $$0) {
      if (this.gC() && $$0 == null) {
         this.C(false);
      }

      super.h($$0);
   }

   void gD() {
      this.D(false);
   }

   void gE() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gF() {
      return !this.fR() && !this.x() && !this.go();
   }

   @Override
   public void R() {
      axe $$0 = this.u();
      if ($$0 == axf.jF) {
         this.a($$0, 2.0F, this.fh());
      } else {
         super.R();
      }
   }

   @Nullable
   @Override
   protected axe u() {
      if (this.fR()) {
         return axf.jG;
      } else {
         if (!this.dW().U() && this.ae.i() < 0.1F) {
            List<cpx> $$0 = this.dW().a(cpx.class, this.cR().c(16.0, 16.0, 16.0), bvp.f);
            if ($$0.isEmpty()) {
               return axf.jF;
            }
         }

         return axf.jA;
      }
   }

   @Nullable
   @Override
   protected axe e(bua $$0) {
      return axf.jE;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.jC;
   }

   boolean c(UUID $$0) {
      return this.gB().contains($$0);
   }

   @Override
   protected void b(ash $$0, bua $$1) {
      cxp $$2 = this.a(bvs.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bvs.a, cxp.j);
      }

      super.b($$0, $$1);
   }

   public static boolean a(cih $$0, bwg $$1) {
      double $$2 = $$1.dH() - $$0.dH();
      double $$3 = $$1.dB() - $$0.dB();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dW().a_(jh.a($$0.dB() + $$8, $$0.dD() + (double)$$9, $$0.dH() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public fby cT() {
      return new fby(0.0, (double)(0.55F * this.cS()), (double)(this.dr() * 0.4F));
   }

   class a extends cex<bwg> {
      @Nullable
      private bwg j;
      @Nullable
      private bwg k;
      private int l;

      public a(final Class<bwg> $$0, final boolean $$1, final boolean $$2, @Nullable final cgx.a $$3) {
         super(cih.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.dZ().a(this.b) != 0) {
            return false;
         } else {
            ash $$0 = a(cih.this.dW());

            for (UUID $$1 : cih.this.gB()) {
               if ($$0.a($$1) instanceof bwg $$3) {
                  this.k = $$3;
                  this.j = $$3.eq();
                  int $$4 = $$3.er();
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
            this.l = this.k.er();
         }

         cih.this.a(axf.jz, 1.0F, 1.0F);
         cih.this.C(true);
         cih.this.gD();
         super.d();
      }
   }

   class b extends cde {
      int a;

      public b() {
         this.a(EnumSet.of(cde.a.b, cde.a.c, cde.a.a));
      }

      @Override
      public boolean b() {
         return cih.this.go();
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
         cih.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements cgx.a {
      @Override
      public boolean test(bwg $$0, ash $$1) {
         if ($$0 instanceof cih) {
            return false;
         } else if ($$0 instanceof cic || $$0 instanceof cir || $$0 instanceof cmx) {
            return true;
         } else if ($$0 instanceof bxd) {
            return !((bxd)$$0).p();
         } else if (!($$0 instanceof cpx) || !$$0.aa_() && !((cpx)$$0).b()) {
            return cih.this.c($$0.cG()) ? false : !$$0.fR() && !$$0.cg();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cde {
      private final cgx b = cgx.a().a(12.0).d().a(cih.this.new c());

      protected boolean h() {
         jh $$0 = jh.a(cih.this.dB(), cih.this.cR().e, cih.this.dH());
         return !cih.this.dW().h($$0) && cih.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(cih.this.dW()).a(bwg.class, this.b, cih.this, cih.this.cR().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends ccq {
      public e(final double $$0) {
         super(cih.this, $$0);
      }

      @Override
      public void d() {
         ((cih)this.a).gE();
         ((cih)this.c).gE();
         super.d();
      }

      @Override
      protected void g() {
         ash $$0 = this.b;
         cih $$1 = (cih)this.a.a($$0, (bvb)this.c);
         if ($$1 != null) {
            asi $$2 = this.a.gx();
            asi $$3 = this.c.gx();
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
            this.a.gz();
            this.c.gz();
            $$1.c_(-24000);
            $$1.b(this.a.dB(), this.a.dD(), this.a.dH(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.N().b(dhe.f)) {
               this.b.b(new bvw(this.b, this.a.dB(), this.a.dD(), this.a.dH(), this.a.dZ().a(7) + 1));
            }
         }
      }
   }

   public class f extends cdr {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cih.this, $$1, $$2, $$3);
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
      protected boolean a(dhl $$0, jh $$1) {
         dxv $$2 = $$0.a_($$1);
         return $$2.a(dko.oD) && $$2.c(dss.c) >= 2 || dlj.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cih.this.ae.i() < 0.05F) {
            cih.this.a(axf.jH, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(cih.this.dW()).N().b(dhe.c)) {
            dxv $$0 = cih.this.dW().a_(this.e);
            if ($$0.a(dko.oD)) {
               this.b($$0);
            } else if (dlj.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dxv $$0) {
         dlj.a(cih.this, $$0, cih.this.dW(), this.e);
      }

      private void b(dxv $$0) {
         int $$1 = $$0.c(dss.c);
         $$0.b(dss.c, Integer.valueOf(1));
         int $$2 = 1 + cih.this.dW().A.a(2) + ($$1 == 3 ? 1 : 0);
         cxp $$3 = cih.this.a(bvs.a);
         if ($$3.f()) {
            cih.this.a(bvs.a, new cxp(cxt.xl));
            $$2--;
         }

         if ($$2 > 0) {
            dkm.a(cih.this.dW(), this.e, new cxp(cxt.xl, $$2));
         }

         cih.this.a(axf.zR, 1.0F, 1.0F);
         cih.this.dW().a(this.e, $$0.b(dss.c, Integer.valueOf(1)), 2);
         cih.this.dW().a(ecr.c, this.e, ecr.a.a(cih.this));
      }

      @Override
      public boolean b() {
         return !cih.this.fR() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cih.this.x(false);
         super.d();
      }
   }

   class g extends ccy {
      public g() {
         super(cih.this);
      }

      @Override
      public void d() {
         super.d();
         cih.this.gE();
      }

      @Override
      public boolean b() {
         return cih.this.bj() && cih.this.b(aya.a) > 0.25 || cih.this.bx();
      }
   }

   class h extends cdd {
      private final cih d;

      public h(final cih $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gC() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gC() && super.c();
      }

      @Override
      public void d() {
         this.d.gE();
         super.d();
      }
   }

   public static class i extends bvb.a {
      public final cih.v a;

      public i(cih.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cdm {
      public j(final bwi $$0, final Class<? extends bwg> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cih.this.go() && !cih.this.gs();
      }

      @Override
      public boolean c() {
         return super.c() && !cih.this.go() && !cih.this.gs();
      }
   }

   public class k extends ccg {
      public k() {
         super(cih.this);
      }

      @Override
      public void a() {
         if (!cih.this.fR()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cih.this.gp() && !cih.this.ci() && !cih.this.gs() && !cih.this.go();
      }
   }

   class l extends cdo {
      public l(final double $$0, final boolean $$1) {
         super(cih.this, $$0, $$1);
      }

      @Override
      protected void a(bwg $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cih.this.a(axf.jB, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cih.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cih.this.x() && !cih.this.fR() && !cih.this.ci() && !cih.this.go() && super.b();
      }
   }

   class m extends cch {
      public m() {
         super(cih.this);
      }

      @Override
      public void a() {
         if (cih.this.gF()) {
            super.a();
         }
      }
   }

   class n extends cdx {
      public n(final double $$0) {
         super(cih.this, $$0);
      }

      @Override
      public boolean h() {
         return !cih.this.gC() && super.h();
      }
   }

   public class o extends cdi {
      @Override
      public boolean b() {
         if (!cih.this.gr()) {
            return false;
         } else {
            bwg $$0 = cih.this.O_();
            if ($$0 != null && $$0.bL()) {
               if ($$0.cP() != $$0.cO()) {
                  return false;
               } else {
                  boolean $$1 = cih.a(cih.this, $$0);
                  if (!$$1) {
                     cih.this.L().a($$0, 0);
                     cih.this.z(false);
                     cih.this.A(false);
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
         bwg $$0 = cih.this.O_();
         if ($$0 != null && $$0.bL()) {
            double $$1 = cih.this.dz().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cih.this.dO()) < 15.0F) || !cih.this.aJ()) && !cih.this.go();
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
         cih.this.t(true);
         cih.this.y(true);
         cih.this.A(false);
         bwg $$0 = cih.this.O_();
         if ($$0 != null) {
            cih.this.H().a($$0, 60.0F, 30.0F);
            fby $$1 = new fby($$0.dB() - cih.this.dB(), $$0.dD() - cih.this.dD(), $$0.dH() - cih.this.dH()).d();
            cih.this.h(cih.this.dz().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cih.this.L().o();
      }

      @Override
      public void e() {
         cih.this.z(false);
         cih.this.cw = 0.0F;
         cih.this.cx = 0.0F;
         cih.this.A(false);
         cih.this.y(false);
      }

      @Override
      public void a() {
         bwg $$0 = cih.this.O_();
         if ($$0 != null) {
            cih.this.H().a($$0, 60.0F, 30.0F);
         }

         if (!cih.this.go()) {
            fby $$1 = cih.this.dz();
            if ($$1.e * $$1.e < 0.03F && cih.this.dO() != 0.0F) {
               cih.this.w(bae.i(0.2F, cih.this.dO(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cih.this.w((float)$$3);
            }
         }

         if ($$0 != null && cih.this.f($$0) <= 2.0F) {
            cih.this.c(a(cih.this.dW()), $$0);
         } else if (cih.this.dO() > 0.0F && cih.this.aJ() && (float)cih.this.dz().e != 0.0F && cih.this.dW().a_(cih.this.dw()).a(dko.ea)) {
            cih.this.w(60.0F);
            cih.this.h(null);
            cih.this.B(true);
         }
      }
   }

   class p extends cde {
      public p() {
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public boolean b() {
         if (!cih.this.a(bvs.a).f()) {
            return false;
         } else if (cih.this.O_() != null || cih.this.eq() != null) {
            return false;
         } else if (!cih.this.gF()) {
            return false;
         } else if (cih.this.dZ().a(b(10)) != 0) {
            return false;
         } else {
            List<cmb> $$0 = cih.this.dW().a(cmb.class, cih.this.cR().c(8.0, 8.0, 8.0), cih.cl);
            return !$$0.isEmpty() && cih.this.a(bvs.a).f();
         }
      }

      @Override
      public void a() {
         List<cmb> $$0 = cih.this.dW().a(cmb.class, cih.this.cR().c(8.0, 8.0, 8.0), cih.cl);
         cxp $$1 = cih.this.a(bvs.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cih.this.L().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cmb> $$0 = cih.this.dW().a(cmb.class, cih.this.cR().c(8.0, 8.0, 8.0), cih.cl);
         if (!$$0.isEmpty()) {
            cih.this.L().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cek {
      public q(final int $$0, final int $$1) {
         super(cih.this, $$1);
      }

      @Override
      public void d() {
         cih.this.gE();
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
         return !cih.this.fR() && !cih.this.x() && !cih.this.gC() && cih.this.O_() == null;
      }
   }

   class r extends cih.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cde.a.a, cde.a.b));
      }

      @Override
      public boolean b() {
         return cih.this.eq() == null
            && cih.this.dZ().i() < 0.02F
            && !cih.this.fR()
            && cih.this.O_() == null
            && cih.this.L().m()
            && !this.i()
            && !cih.this.gp()
            && !cih.this.ci();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cih.this.dZ().a(3);
         cih.this.x(true);
         cih.this.L().o();
      }

      @Override
      public void e() {
         cih.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cih.this.H().a(cih.this.dB() + this.c, cih.this.dF(), cih.this.dH() + this.d, (float)cih.this.aa(), (float)cih.this.Z());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cih.this.dZ().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cih.this.dZ().a(20));
      }
   }

   class s extends ccx {
      private int c = b(100);

      public s(final double $$0) {
         super(cih.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cih.this.fR() && this.a.O_() == null) {
            if (cih.this.dW().ae() && cih.this.dW().h(this.a.dw())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jh $$0 = this.a.dw();
               return cih.this.dW().U() && cih.this.dW().h($$0) && !((ash)cih.this.dW()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cih.this.gE();
         super.d();
      }
   }

   class t extends cih.d {
      private static final int c = b(140);
      private int d = cih.this.ae.a(c);

      public t() {
         this.a(EnumSet.of(cde.a.a, cde.a.b, cde.a.c));
      }

      @Override
      public boolean b() {
         return cih.this.bo == 0.0F && cih.this.bp == 0.0F && cih.this.bq == 0.0F ? this.k() || cih.this.fR() : false;
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
            return cih.this.dW().U() && this.h() && !this.i() && !cih.this.av;
         }
      }

      @Override
      public void e() {
         this.d = cih.this.ae.a(c);
         cih.this.gE();
      }

      @Override
      public void d() {
         cih.this.x(false);
         cih.this.z(false);
         cih.this.A(false);
         cih.this.t(false);
         cih.this.D(true);
         cih.this.L().o();
         cih.this.I().a(cih.this.dB(), cih.this.dD(), cih.this.dH(), 0.0);
      }
   }

   class u extends cde {
      public u() {
         this.a(EnumSet.of(cde.a.a, cde.a.b));
      }

      @Override
      public boolean b() {
         if (cih.this.fR()) {
            return false;
         } else {
            bwg $$0 = cih.this.O_();
            return $$0 != null && $$0.bL() && cih.cn.test($$0) && cih.this.g($$0) > 36.0 && !cih.this.ci() && !cih.this.gs() && !cih.this.bn;
         }
      }

      @Override
      public void d() {
         cih.this.x(false);
         cih.this.B(false);
      }

      @Override
      public void e() {
         bwg $$0 = cih.this.O_();
         if ($$0 != null && cih.a(cih.this, $$0)) {
            cih.this.A(true);
            cih.this.z(true);
            cih.this.L().o();
            cih.this.H().a($$0, (float)cih.this.aa(), (float)cih.this.Z());
         } else {
            cih.this.A(false);
            cih.this.z(false);
         }
      }

      @Override
      public void a() {
         bwg $$0 = cih.this.O_();
         if ($$0 != null) {
            cih.this.H().a($$0, (float)cih.this.aa(), (float)cih.this.Z());
            if (cih.this.g($$0) <= 36.0) {
               cih.this.A(true);
               cih.this.z(true);
               cih.this.L().o();
            } else {
               cih.this.L().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bba {
      a(0, "red"),
      b(1, "snow");

      public static final bba.a<cih.v> c = bba.a(cih.v::values);
      private static final IntFunction<cih.v> d = ayv.a(cih.v::a, values(), ayv.a.a);
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

      public static cih.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cih.v a(int $$0) {
         return d.apply($$0);
      }

      public static cih.v a(jq<dik> $$0) {
         return $$0.a(axt.ar) ? b : a;
      }
   }
}
