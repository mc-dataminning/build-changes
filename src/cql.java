import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cql extends cqq implements cqn {
   private static final alc<cxp> a = alg.a(cql.class, ale.h);
   private static final alc<OptionalInt> b = alg.a(cql.class, ale.v);
   private static final alc<Boolean> c = alg.a(cql.class, ale.k);
   private int d;
   private int e;
   @Nullable
   private bwg f;

   public cql(bvr<? extends cql> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cql(dhi $$0, double $$1, double $$2, double $$3, cxp $$4) {
      super(bvr.aa, $$0);
      this.d = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      daf $$6 = $$4.a(ku.af);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.e = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public cql(dhi $$0, @Nullable bvk $$1, double $$2, double $$3, double $$4, cxp $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cql(dhi $$0, cxp $$1, bwg $$2) {
      this($$0, $$2, $$2.dB(), $$2.dD(), $$2.dH(), $$1);
      this.al.a(b, OptionalInt.of($$2.ar()));
      this.f = $$2;
   }

   public cql(dhi $$0, cxp $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public cql(dhi $$0, cxp $$1, bvk $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(alg.a $$0) {
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
      fbw $$6;
      if (this.t()) {
         if (this.f == null) {
            this.al.a(b).ifPresent($$0x -> {
               bvk $$1x = this.dW().a($$0x);
               if ($$1x instanceof bwg) {
                  this.f = (bwg)$$1x;
               }
            });
         }

         if (this.f != null) {
            fby $$4;
            if (this.f.fJ()) {
               fby $$0 = this.f.bT();
               double $$1 = 1.5;
               double $$2 = 0.1;
               fby $$3 = this.f.dz();
               this.f.h($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.f.a(cxt.vk);
            } else {
               $$4 = fby.c;
            }

            this.a_(this.f.dB() + $$4.d, this.f.dD() + $$4.e, this.f.dH() + $$4.f);
            this.h(this.f.dz());
         }

         $$6 = cqs.a(this, this::b);
      } else {
         if (!this.m()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.h(this.dz().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         fby $$8 = this.dz();
         $$6 = cqs.a(this, this::b);
         this.a(bwk.a, $$8);
         this.aK();
         this.h($$8);
      }

      if (!this.ad && this.bL() && $$6.d() != fbw.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.F();
      if (this.d == 0 && !this.bb()) {
         this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.jj, axg.i, 3.0F, 1.0F);
      }

      this.d++;
      if (this.dW().C && this.d % 2 < 2) {
         this.dW().a(ls.D, this.dB(), this.dD(), this.dH(), this.ae.k() * 0.05, -this.dz().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.d > this.e && this.dW() instanceof ash $$10) {
         this.b($$10);
      }
   }

   private void b(ash $$0) {
      $$0.a(this, (byte)17);
      this.a(ecr.w, this.p());
      this.e($$0);
      this.at();
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (this.dW() instanceof ash $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(fbu $$0) {
      jh $$1 = new jh($$0.b());
      this.dW().a_($$1).a(this.dW(), $$1, this);
      if (this.dW() instanceof ash $$2 && this.s()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean s() {
      return !this.u().isEmpty();
   }

   private void e(ash $$0) {
      float $$1 = 0.0F;
      List<dae> $$2 = this.u();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.f != null) {
            this.f.a($$0, this.dX().a(this, this.p()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         fby $$4 = this.du();

         for (bwg $$6 : this.dW().a(bwg.class, this.cR().g(5.0))) {
            if ($$6 != this.f && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  fby $$9 = new fby($$6.dB(), $$6.e(0.5 * (double)$$8), $$6.dH());
                  fbw $$10 = this.dW().a(new dgq($$4, $$9, dgq.a.a, dgq.b.a, this));
                  if ($$10.d() == fbw.a.a) {
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
         fby $$1 = this.dz();
         this.dW().a(this.dB(), this.dD(), this.dH(), $$1.d, $$1.e, $$1.f, this.u());
      }

      super.b($$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Life", this.d);
      $$0.a("LifeTime", this.e);
      $$0.a("FireworksItem", this.l().a(this.dY()));
      $$0.a("ShotAtAngle", this.al.a(c));
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.d = $$0.h("Life");
      this.e = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.al.a(a, cxp.a(this.dY(), (vu)$$0.p("FireworksItem")).orElseGet(cql::v));
      } else {
         this.al.a(a, v());
      }

      if ($$0.e("ShotAtAngle")) {
         this.al.a(c, $$0.q("ShotAtAngle"));
      }
   }

   private List<dae> u() {
      cxp $$0 = this.al.a(a);
      daf $$1 = $$0.a(ku.af);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cxp l() {
      return this.al.a(a);
   }

   @Override
   public boolean cB() {
      return false;
   }

   private static cxp v() {
      return new cxp(cxt.vk);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bwg $$0, bua $$1) {
      double $$2 = $$0.du().d - this.du().d;
      double $$3 = $$0.du().f - this.du().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
