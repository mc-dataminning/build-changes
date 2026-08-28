import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cme extends cmo implements bwc {
   private static final alp c = alp.b("attacking");
   private static final bxd d = new bxd(c, 0.15F, bxd.a.a);
   private static final int bZ = 400;
   private static final int ca = 600;
   private static final aks<Optional<dxo>> cb = akw.a(cme.class, aku.j);
   private static final aks<Boolean> cc = akw.a(cme.class, aku.k);
   private static final aks<Boolean> cd = akw.a(cme.class, aku.k);
   private int ce = Integer.MIN_VALUE;
   private int cf;
   private static final bsl cg = baw.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cme(bvi<? extends cme> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new cme.a(this));
      this.bT.a(2, new cdf(this, 1.0, false));
      this.bT.a(7, new cei(this, 1.0, 0.0F));
      this.bT.a(8, new cdd(this, cpo.class, 8.0F));
      this.bT.a(8, new cdq(this));
      this.bT.a(10, new cme.b(this));
      this.bT.a(11, new cme.d(this));
      this.bU.a(1, new cme.c(this, this::a));
      this.bU.a(2, new cen(this));
      this.bU.a(3, new ceo<>(this, cmf.class, true, false));
      this.bU.a(4, new ceu<>(this, false));
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.s, 40.0).a(bxf.v, 0.3F).a(bxf.c, 7.0).a(bxf.m, 64.0).a(bxf.B, 1.0);
   }

   @Override
   public void h(@Nullable bvx $$0) {
      super.h($$0);
      bxb $$1 = this.g(bxf.v);
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
   protected void a(akw.a $$0) {
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
            this.dW().a(this.dB(), this.dF(), this.dH(), awv.iI, this.dn(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(aks<?> $$0) {
      if (cc.equals($$0) && this.gp() && this.dW().C) {
         this.p();
      }

      super.a($$0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      dxo $$1 = this.x();
      if ($$1 != null) {
         $$0.a("carriedBlockState", vb.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      dxo $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = vb.a(this.dW().a(mb.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dW(), $$0);
   }

   boolean a(cpo $$0) {
      return !bvx.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dF()});
   }

   @Override
   public void d_() {
      if (this.dW().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dW().a(ls.ae, this.d(0.5), this.dE() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dW().C) {
         this.a((arx)this.dW(), true);
      }

      super.d_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(arx $$0) {
      if ($$0.V() && this.af >= this.cf + 600) {
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

   boolean b(bvb $$0) {
      fbr $$1 = new fbr(this.dB() - $$0.dB(), this.e(0.5) - $$0.dF(), this.dH() - $$0.dH());
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

      dxo $$4 = this.dW().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axq.a);
      if ($$5 && !$$6) {
         fbr $$7 = this.du();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dW().a(eck.R, $$7, eck.a.a(this));
            if (!this.bb()) {
               this.dW().a(null, this.K, this.L, this.M, awv.iJ, this.dn(), 1.0F, 1.0F);
               this.a(awv.iJ, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awu u() {
      return this.go() ? awv.iH : awv.iE;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.iG;
   }

   @Override
   protected awu o_() {
      return awv.iF;
   }

   @Override
   protected void a(arx $$0, btr $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dxo $$3 = this.x();
      if ($$3 != null) {
         cxg $$4 = new cxg(cxk.pO);
         dds.a($$4, $$0.K_(), dfe.g, $$0.d_(this.dw()), this.dZ());
         ewl.a $$5 = new ewl.a((arx)this.dW()).a(ezc.f, this.du()).a(ezc.i, $$4).b(ezc.a, this);

         for (cxg $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dxo $$0) {
      this.al.a(cb, Optional.ofNullable($$0));
   }

   @Nullable
   public dxo x() {
      return this.al.a(cb).orElse(null);
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = $$1.c() instanceof cqt;
         if (!$$1.a(axm.j) && !$$3) {
            boolean $$6 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bvx) && this.ae.a(10) != 0) {
               this.t();
            }

            return $$6;
         } else {
            boolean $$4 = $$3 && this.a($$0, $$1, (cqt)$$1.c(), $$2);

            for (int $$5 = 0; $$5 < 64; $$5++) {
               if (this.t()) {
                  return true;
               }
            }

            return $$4;
         }
      }
   }

   private boolean a(arx $$0, btr $$1, cqt $$2, float $$3) {
      cxg $$4 = $$2.l();
      czf $$5 = $$4.a(ku.Q, czf.a);
      return $$5.a(czg.a) ? super.a($$0, $$1, $$3) : false;
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

   static class a extends ccv {
      private final cme a;
      @Nullable
      private bvx b;

      public a(cme $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccv.a.c, ccv.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.O_();
         if (!(this.b instanceof cpo)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.a((cpo)this.b);
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

   static class b extends ccv {
      private final cme a;

      public b(cme $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() == null) {
            return false;
         } else {
            return !a(this.a).O().b(dgv.c) ? false : this.a.dZ().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         bac $$0 = this.a.dZ();
         dgz $$1 = this.a.dW();
         int $$2 = azu.a(this.a.dB() - 1.0 + $$0.j() * 2.0);
         int $$3 = azu.a(this.a.dD() + $$0.j() * 2.0);
         int $$4 = azu.a(this.a.dH() - 1.0 + $$0.j() * 2.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dxo $$6 = $$1.a_($$5);
         jh $$7 = $$5.e();
         dxo $$8 = $$1.a_($$7);
         dxo $$9 = this.a.x();
         if ($$9 != null) {
            $$9 = dkd.b($$9, this.a.dW(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(eck.i, $$5, eck.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dgz $$0, jh $$1, dxo $$2, dxo $$3, dxo $$4, jh $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dkf.I) && $$4.m($$0, $$5) && $$2.a((dhc)$$0, $$1) && $$0.a_(this.a, fbm.a(fbr.a($$1))).isEmpty();
      }
   }

   static class c extends ceo<cpo> {
      private final cme i;
      @Nullable
      private cpo j;
      private int k;
      private int l;
      private final cgo m;
      private final cgo n = cgo.a().d();
      private final cgo.a o;

      public c(cme $$0, @Nullable cgo.a $$1) {
         super($$0, cpo.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cpo)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cgo.a().a(this.l()).a(this.o);
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
               if (this.i.a((cpo)this.c)) {
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

   static class d extends ccv {
      private final cme a;

      public d(cme $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() != null) {
            return false;
         } else {
            return !a(this.a).O().b(dgv.c) ? false : this.a.dZ().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         bac $$0 = this.a.dZ();
         dgz $$1 = this.a.dW();
         int $$2 = azu.a(this.a.dB() - 2.0 + $$0.j() * 4.0);
         int $$3 = azu.a(this.a.dD() + $$0.j() * 3.0);
         int $$4 = azu.a(this.a.dH() - 2.0 + $$0.j() * 4.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dxo $$6 = $$1.a_($$5);
         fbr $$7 = new fbr((double)this.a.dA() + 0.5, (double)$$3 + 0.5, (double)this.a.dG() + 0.5);
         fbr $$8 = new fbr((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fbn $$9 = $$1.a(new dgh($$7, $$8, dgh.a.b, dgh.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axk.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(eck.f, $$5, eck.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
