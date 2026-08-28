import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cqc extends cqh implements cqe {
   private static final aks<cxg> a = akw.a(cqc.class, aku.h);
   private static final aks<OptionalInt> b = akw.a(cqc.class, aku.v);
   private static final aks<Boolean> c = akw.a(cqc.class, aku.k);
   private int d;
   private int e;
   @Nullable
   private bvx f;

   public cqc(bvi<? extends cqc> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqc(dgz $$0, double $$1, double $$2, double $$3, cxg $$4) {
      super(bvi.aa, $$0);
      this.d = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      czw $$6 = $$4.a(ku.af);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.e = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public cqc(dgz $$0, @Nullable bvb $$1, double $$2, double $$3, double $$4, cxg $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cqc(dgz $$0, cxg $$1, bvx $$2) {
      this($$0, $$2, $$2.dB(), $$2.dD(), $$2.dH(), $$1);
      this.al.a(b, OptionalInt.of($$2.ar()));
      this.f = $$2;
   }

   public cqc(dgz $$0, cxg $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public cqc(dgz $$0, cxg $$1, bvb $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akw.a $$0) {
      $$0.a(a, v());
      $$0.a(b, OptionalInt.empty());
      $$0.a(c, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.t();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.t();
   }

   @Override
   public void h() {
      super.h();
      fbp $$6;
      if (this.t()) {
         if (this.f == null) {
            this.al.a(b).ifPresent($$0x -> {
               bvb $$1x = this.dW().a($$0x);
               if ($$1x instanceof bvx) {
                  this.f = (bvx)$$1x;
               }
            });
         }

         if (this.f != null) {
            fbr $$4;
            if (this.f.fJ()) {
               fbr $$0 = this.f.bT();
               double $$1 = 1.5;
               double $$2 = 0.1;
               fbr $$3 = this.f.dz();
               this.f.h($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.f.a(cxk.vt);
            } else {
               $$4 = fbr.c;
            }

            this.a_(this.f.dB() + $$4.d, this.f.dD() + $$4.e, this.f.dH() + $$4.f);
            this.h(this.f.dz());
         }

         $$6 = cqj.a(this, this::b);
      } else {
         if (!this.m()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.h(this.dz().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         fbr $$8 = this.dz();
         $$6 = cqj.a(this, this::b);
         this.a(bwb.a, $$8);
         this.aK();
         this.h($$8);
      }

      if (!this.ad && this.bL() && $$6.d() != fbp.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.F();
      if (this.d == 0 && !this.bb()) {
         this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.jp, aww.i, 3.0F, 1.0F);
      }

      this.d++;
      if (this.dW().C && this.d % 2 < 2) {
         this.dW().a(ls.D, this.dB(), this.dD(), this.dH(), this.ae.k() * 0.05, -this.dz().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.d > this.e && this.dW() instanceof arx $$10) {
         this.b($$10);
      }
   }

   private void b(arx $$0) {
      $$0.a(this, (byte)17);
      this.a(eck.w, this.p());
      this.e($$0);
      this.at();
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      if (this.dW() instanceof arx $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(fbn $$0) {
      jh $$1 = new jh($$0.b());
      this.dW().a_($$1).a(this.dW(), $$1, this);
      if (this.dW() instanceof arx $$2 && this.s()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean s() {
      return !this.u().isEmpty();
   }

   private void e(arx $$0) {
      float $$1 = 0.0F;
      List<czv> $$2 = this.u();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.f != null) {
            this.f.a($$0, this.dX().a(this, this.p()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         fbr $$4 = this.du();

         for (bvx $$6 : this.dW().a(bvx.class, this.cR().g(5.0))) {
            if ($$6 != this.f && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  fbr $$9 = new fbr($$6.dB(), $$6.e(0.5 * (double)$$8), $$6.dH());
                  fbp $$10 = this.dW().a(new dgh($$4, $$9, dgh.a.a, dgh.b.a, this));
                  if ($$10.d() == fbp.a.a) {
                     $$7 = true;
                     break;
                  }
               }

               if ($$7) {
                  float $$11 = $$1 * (float)Math.sqrt((5.0 - (double)this.f($$6)) / 5.0);
                  $$6.a($$0, this.dX().a(this, this.p()), $$11);
               }
            }
         }
      }
   }

   private boolean t() {
      return this.al.a(b).isPresent();
   }

   @Override
   public boolean m() {
      return this.al.a(c);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dW().C) {
         fbr $$1 = this.dz();
         this.dW().a(this.dB(), this.dD(), this.dH(), $$1.d, $$1.e, $$1.f, this.u());
      }

      super.b($$0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Life", this.d);
      $$0.a("LifeTime", this.e);
      $$0.a("FireworksItem", this.l().a(this.dY()));
      $$0.a("ShotAtAngle", this.al.a(c));
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.d = $$0.h("Life");
      this.e = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.al.a(a, cxg.a(this.dY(), (vj)$$0.p("FireworksItem")).orElseGet(cqc::v));
      } else {
         this.al.a(a, v());
      }

      if ($$0.e("ShotAtAngle")) {
         this.al.a(c, $$0.q("ShotAtAngle"));
      }
   }

   private List<czv> u() {
      cxg $$0 = this.al.a(a);
      czw $$1 = $$0.a(ku.af);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cxg l() {
      return this.al.a(a);
   }

   @Override
   public boolean cB() {
      return false;
   }

   private static cxg v() {
      return new cxg(cxk.vt);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bvx $$0, btr $$1) {
      double $$2 = $$0.du().d - this.du().d;
      double $$3 = $$0.du().f - this.du().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
