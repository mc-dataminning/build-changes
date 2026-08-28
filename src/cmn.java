import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.DoubleSupplier;
import javax.annotation.Nullable;

public class cmn extends cmx implements bwl {
   private static final alz c = alz.b("attacking");
   private static final bxm d = new bxm(c, 0.15F, bxm.a.a);
   private static final int bZ = 400;
   private static final int ca = 600;
   private static final alc<Optional<dxv>> cb = alg.a(cmn.class, ale.j);
   private static final alc<Boolean> cc = alg.a(cmn.class, ale.k);
   private static final alc<Boolean> cd = alg.a(cmn.class, ale.k);
   private int ce = Integer.MIN_VALUE;
   private int cf;
   private static final bsu cg = bbg.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cmn(bvr<? extends cmn> $$0, dhi $$1) {
      super($$0, $$1);
      this.a(euo.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new cmn.a(this));
      this.bT.a(2, new cdo(this, 1.0, false));
      this.bT.a(7, new cer(this, 1.0, 0.0F));
      this.bT.a(8, new cdm(this, cpx.class, 8.0F));
      this.bT.a(8, new cdz(this));
      this.bT.a(10, new cmn.b(this));
      this.bT.a(11, new cmn.d(this));
      this.bU.a(1, new cmn.c(this, this::a));
      this.bU.a(2, new cew(this));
      this.bU.a(3, new cex<>(this, cmo.class, true, false));
      this.bU.a(4, new cfd<>(this, false));
   }

   public static bxn.a m() {
      return cmx.gt().a(bxo.s, 40.0).a(bxo.v, 0.3F).a(bxo.c, 7.0).a(bxo.m, 64.0).a(bxo.B, 1.0);
   }

   @Override
   public void h(@Nullable bwg $$0) {
      super.h($$0);
      bxk $$1 = this.g(bxo.v);
      if ($$0 == null) {
         this.cf = 0;
         this.al.a(cc, false);
         this.al.a(cd, false);
         $$1.c(c);
      } else {
         this.cf = this.af;
         this.al.a(cc, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cb, Optional.empty());
      $$0.a(cc, false);
      $$0.a(cd, false);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   public void p() {
      if (this.af >= this.ce + 400) {
         this.ce = this.af;
         if (!this.bb()) {
            this.dW().a(this.dB(), this.dF(), this.dH(), axf.iH, this.dn(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(alc<?> $$0) {
      if (cc.equals($$0) && this.gp() && this.dW().C) {
         this.p();
      }

      super.a($$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      dxv $$1 = this.x();
      if ($$1 != null) {
         $$0.a("carriedBlockState", vm.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      dxv $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = vm.a(this.dW().a(mb.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dW(), $$0);
   }

   boolean a(cpx $$0) {
      return this.a($$0, 0.025, true, false, bwg.aH, new DoubleSupplier[]{this::dF});
   }

   @Override
   public void d_() {
      if (this.dW().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dW().a(ls.ad, this.d(0.5), this.dE() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dW().C) {
         this.a((ash)this.dW(), true);
      }

      super.d_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(ash $$0) {
      if ($$0.U() && this.af >= this.cf + 600) {
         float $$1 = this.by();
         if ($$1 > 0.5F && $$0.h(this.dw()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.h(null);
            this.t();
         }
      }

      super.a($$0);
   }

   protected boolean t() {
      if (!this.dW().B_() && this.bL()) {
         double $$0 = this.dB() + (this.ae.j() - 0.5) * 64.0;
         double $$1 = this.dD() + (double)(this.ae.a(64) - 32);
         double $$2 = this.dH() + (this.ae.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bvk $$0) {
      fby $$1 = new fby(this.dB() - $$0.dB(), this.e(0.5) - $$0.dF(), this.dH() - $$0.dH());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dB() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dD() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dH() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jh.a $$3 = new jh.a($$0, $$1, $$2);

      while ($$3.v() > this.dW().L_() && !this.dW().a_($$3).d()) {
         $$3.c(jm.a);
      }

      dxv $$4 = this.dW().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(aya.a);
      if ($$5 && !$$6) {
         fby $$7 = this.du();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dW().a(ecr.R, $$7, ecr.a.a(this));
            if (!this.bb()) {
               this.dW().a(null, this.K, this.L, this.M, axf.iI, this.dn(), 1.0F, 1.0F);
               this.a(axf.iI, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected axe u() {
      return this.go() ? axf.iG : axf.iD;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.iF;
   }

   @Override
   protected axe o_() {
      return axf.iE;
   }

   @Override
   protected void a(ash $$0, bua $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dxv $$3 = this.x();
      if ($$3 != null) {
         cxp $$4 = new cxp(cxt.pF);
         deb.a($$4, $$0.K_(), dfn.g, $$0.d_(this.dw()), this.dZ());
         ews.a $$5 = new ews.a((ash)this.dW()).a(ezj.f, this.du()).a(ezj.i, $$4).b(ezj.a, this);

         for (cxp $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dxv $$0) {
      this.al.a(cb, Optional.ofNullable($$0));
   }

   @Nullable
   public dxv x() {
      return this.al.a(cb).orElse(null);
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = $$1.c() instanceof crc;
         if (!$$1.a(axw.j) && !$$3) {
            boolean $$6 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bwg) && this.ae.a(10) != 0) {
               this.t();
            }

            return $$6;
         } else {
            boolean $$4 = $$3 && this.a($$0, $$1, (crc)$$1.c(), $$2);

            for (int $$5 = 0; $$5 < 64; $$5++) {
               if (this.t()) {
                  return true;
               }
            }

            return $$4;
         }
      }
   }

   private boolean a(ash $$0, bua $$1, crc $$2, float $$3) {
      cxp $$4 = $$2.l();
      czo $$5 = $$4.a(ku.Q, czo.a);
      return $$5.a(czp.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean go() {
      return this.al.a(cc);
   }

   public boolean gp() {
      return this.al.a(cd);
   }

   public void gq() {
      this.al.a(cd, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.x() != null;
   }

   static class a extends cde {
      private final cmn a;
      @Nullable
      private bwg b;

      public a(cmn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cde.a.c, cde.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.O_();
         if (!(this.b instanceof cpx)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.a((cpx)this.b);
         }
      }

      @Override
      public void d() {
         this.a.L().o();
      }

      @Override
      public void a() {
         this.a.H().a(this.b.dB(), this.b.dF(), this.b.dH());
      }
   }

   static class b extends cde {
      private final cmn a;

      public b(cmn $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() == null) {
            return false;
         } else {
            return !a(this.a).N().b(dhe.c) ? false : this.a.dZ().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         bam $$0 = this.a.dZ();
         dhi $$1 = this.a.dW();
         int $$2 = bae.a(this.a.dB() - 1.0 + $$0.j() * 2.0);
         int $$3 = bae.a(this.a.dD() + $$0.j() * 2.0);
         int $$4 = bae.a(this.a.dH() - 1.0 + $$0.j() * 2.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dxv $$6 = $$1.a_($$5);
         jh $$7 = $$5.e();
         dxv $$8 = $$1.a_($$7);
         dxv $$9 = this.a.x();
         if ($$9 != null) {
            $$9 = dkm.b($$9, this.a.dW(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(ecr.i, $$5, ecr.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dhi $$0, jh $$1, dxv $$2, dxv $$3, dxv $$4, jh $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dko.I) && $$4.m($$0, $$5) && $$2.a((dhl)$$0, $$1) && $$0.a_(this.a, fbt.a(fby.a($$1))).isEmpty();
      }
   }

   static class c extends cex<cpx> {
      private final cmn i;
      @Nullable
      private cpx j;
      private int k;
      private int l;
      private final cgx m;
      private final cgx n = cgx.a().d();
      private final cgx.a o;

      public c(cmn $$0, @Nullable cgx.a $$1) {
         super($$0, cpx.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cpx)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cgx.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = a(this.i).a(this.m.a(this.l()), this.i);
         return this.j != null;
      }

      @Override
      public void d() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gq();
      }

      @Override
      public void e() {
         this.j = null;
         super.e();
      }

      @Override
      public boolean c() {
         if (this.j != null) {
            if (!this.o.test(this.j, a(this.i))) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.A(this.c)) {
                  return false;
               }

               if (this.n.a(a(this.i), this.i, this.c)) {
                  return true;
               }
            }

            return super.c();
         }
      }

      @Override
      public void a() {
         if (this.i.O_() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.d();
            }
         } else {
            if (this.c != null && !this.i.bZ()) {
               if (this.i.a((cpx)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.t();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.b(this.c)) {
                  this.l = 0;
               }
            }

            super.a();
         }
      }
   }

   static class d extends cde {
      private final cmn a;

      public d(cmn $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() != null) {
            return false;
         } else {
            return !a(this.a).N().b(dhe.c) ? false : this.a.dZ().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         bam $$0 = this.a.dZ();
         dhi $$1 = this.a.dW();
         int $$2 = bae.a(this.a.dB() - 2.0 + $$0.j() * 4.0);
         int $$3 = bae.a(this.a.dD() + $$0.j() * 3.0);
         int $$4 = bae.a(this.a.dH() - 2.0 + $$0.j() * 4.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dxv $$6 = $$1.a_($$5);
         fby $$7 = new fby((double)this.a.dA() + 0.5, (double)$$3 + 0.5, (double)this.a.dG() + 0.5);
         fby $$8 = new fby((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fbu $$9 = $$1.a(new dgq($$7, $$8, dgq.a.b, dgq.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axu.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(ecr.f, $$5, ecr.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
