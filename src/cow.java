import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cow extends cpb implements coy {
   private static final akk<cvx> b = ako.a(cow.class, akm.h);
   private static final akk<OptionalInt> c = ako.a(cow.class, akm.v);
   private static final akk<Boolean> d = ako.a(cow.class, akm.k);
   private int e;
   private int f;
   @Nullable
   private buv g;

   public cow(bug<? extends cow> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cow(dev $$0, double $$1, double $$2, double $$3, cvx $$4) {
      super(bug.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.am.a(b, $$4.v());
      int $$5 = 1;
      cyl $$6 = $$4.a(kt.ae);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.af.a(0.0, 0.002297), 0.05, this.af.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.af.a(6) + this.af.a(7);
   }

   public cow(dev $$0, @Nullable btz $$1, double $$2, double $$3, double $$4, cvx $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cow(dev $$0, cvx $$1, buv $$2) {
      this($$0, $$2, $$2.dC(), $$2.dE(), $$2.dI(), $$1);
      this.am.a(c, OptionalInt.of($$2.ar()));
      this.g = $$2;
   }

   public cow(dev $$0, cvx $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.am.a(d, $$5);
   }

   public cow(dev $$0, cvx $$1, btz $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(b, y());
      $$0.a(c, OptionalInt.empty());
      $$0.a(d, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.w();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.w();
   }

   @Override
   public void l() {
      super.l();
      ezf $$6;
      if (this.w()) {
         if (this.g == null) {
            this.am.a(c).ifPresent($$0x -> {
               btz $$1x = this.dX().a($$0x);
               if ($$1x instanceof buv) {
                  this.g = (buv)$$1x;
               }
            });
         }

         if (this.g != null) {
            ezh $$4;
            if (this.g.fL()) {
               ezh $$0 = this.g.bU();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ezh $$3 = this.g.dA();
               this.g.h($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.g.a(cwb.uw);
            } else {
               $$4 = ezh.c;
            }

            this.a_(this.g.dC() + $$4.d, this.g.dE() + $$4.e, this.g.dI() + $$4.f);
            this.h(this.g.dA());
         }

         $$6 = cpd.a(this, this::b);
      } else {
         if (!this.o()) {
            double $$7 = this.Q ? 1.0 : 1.15;
            this.h(this.dA().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         ezh $$8 = this.dA();
         $$6 = cpd.a(this, this::b);
         this.a(buz.a, $$8);
         this.aK();
         this.h($$8);
      }

      if (!this.ae && this.bM() && $$6.d() != ezf.a.a) {
         this.b($$6);
         this.as = true;
      }

      this.G();
      if (this.e == 0 && !this.bc()) {
         this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.iQ, awl.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dX().C && this.e % 2 < 2) {
         this.dX().a(lq.D, this.dC(), this.dE(), this.dI(), this.af.k() * 0.05, -this.dA().e * 0.5, this.af.k() * 0.05);
      }

      if (!this.dX().C && this.e > this.f) {
         this.q();
      }
   }

   private void q() {
      this.dX().a(this, (byte)17);
      this.a(eaa.w, this.s());
      this.v();
      this.au();
   }

   @Override
   protected void a(eze $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.q();
      }
   }

   @Override
   protected void a(ezd $$0) {
      jg $$1 = new jg($$0.b());
      this.dX().a_($$1).a(this.dX(), $$1, this);
      if (!this.dX().y_() && this.t()) {
         this.q();
      }

      super.a($$0);
   }

   private boolean t() {
      return !this.x().isEmpty();
   }

   private void v() {
      float $$0 = 0.0F;
      List<cyk> $$1 = this.x();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dY().a(this, this.s()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         ezh $$3 = this.dv();

         for (buv $$5 : this.dX().a(buv.class, this.cS().g(5.0))) {
            if ($$5 != this.g && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  ezh $$8 = new ezh($$5.dC(), $$5.e(0.5 * (double)$$7), $$5.dI());
                  ezf $$9 = this.dX().a(new ded($$3, $$8, ded.a.a, ded.b.a, this));
                  if ($$9.d() == ezf.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dY().a(this, this.s()), $$10);
               }
            }
         }
      }
   }

   private boolean w() {
      return this.am.a(c).isPresent();
   }

   @Override
   public boolean o() {
      return this.am.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dX().C) {
         ezh $$1 = this.dA();
         this.dX().a(this.dC(), this.dE(), this.dI(), $$1.d, $$1.e, $$1.f, this.x());
      }

      super.b($$0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      $$0.a("FireworksItem", this.m().a(this.dZ()));
      $$0.a("ShotAtAngle", this.am.a(d));
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.am.a(b, cvx.a(this.dZ(), (vg)$$0.p("FireworksItem")).orElseGet(cow::y));
      } else {
         this.am.a(b, y());
      }

      if ($$0.e("ShotAtAngle")) {
         this.am.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cyk> x() {
      cvx $$0 = this.am.a(b);
      cyl $$1 = $$0.a(kt.ae);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cvx m() {
      return this.am.a(b);
   }

   @Override
   public boolean cC() {
      return false;
   }

   private static cvx y() {
      return new cvx(cwb.uw);
   }

   @Override
   public DoubleDoubleImmutablePair a_(buv $$0, bsp $$1) {
      double $$2 = $$0.dv().d - this.dv().d;
      double $$3 = $$0.dv().f - this.dv().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
