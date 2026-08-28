import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cpf extends cpk implements cph {
   private static final ako<cwf> b = aks.a(cpf.class, akq.h);
   private static final ako<OptionalInt> c = aks.a(cpf.class, akq.v);
   private static final ako<Boolean> d = aks.a(cpf.class, akq.k);
   private int e;
   private int f;
   @Nullable
   private bve g;

   public cpf(bup<? extends cpf> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpf(dff $$0, double $$1, double $$2, double $$3, cwf $$4) {
      super(bup.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.am.a(b, $$4.v());
      int $$5 = 1;
      cyv $$6 = $$4.a(ku.af);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.af.a(0.0, 0.002297), 0.05, this.af.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.af.a(6) + this.af.a(7);
   }

   public cpf(dff $$0, @Nullable bui $$1, double $$2, double $$3, double $$4, cwf $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cpf(dff $$0, cwf $$1, bve $$2) {
      this($$0, $$2, $$2.dD(), $$2.dF(), $$2.dJ(), $$1);
      this.am.a(c, OptionalInt.of($$2.as()));
      this.g = $$2;
   }

   public cpf(dff $$0, cwf $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.am.a(d, $$5);
   }

   public cpf(dff $$0, cwf $$1, bui $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(aks.a $$0) {
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
      ezp $$6;
      if (this.w()) {
         if (this.g == null) {
            this.am.a(c).ifPresent($$0x -> {
               bui $$1x = this.dY().a($$0x);
               if ($$1x instanceof bve) {
                  this.g = (bve)$$1x;
               }
            });
         }

         if (this.g != null) {
            ezr $$4;
            if (this.g.fM()) {
               ezr $$0 = this.g.bV();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ezr $$3 = this.g.dB();
               this.g.h($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.g.a(cwj.uM);
            } else {
               $$4 = ezr.c;
            }

            this.a_(this.g.dD() + $$4.d, this.g.dF() + $$4.e, this.g.dJ() + $$4.f);
            this.h(this.g.dB());
         }

         $$6 = cpm.a(this, this::b);
      } else {
         if (!this.o()) {
            double $$7 = this.Q ? 1.0 : 1.15;
            this.h(this.dB().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         ezr $$8 = this.dB();
         $$6 = cpm.a(this, this::b);
         this.a(bvi.a, $$8);
         this.aM();
         this.h($$8);
      }

      if (!this.ae && this.bN() && $$6.d() != ezp.a.a) {
         this.b($$6);
         this.as = true;
      }

      this.F();
      if (this.e == 0 && !this.bd()) {
         this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.iQ, awp.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dY().C && this.e % 2 < 2) {
         this.dY().a(ls.D, this.dD(), this.dF(), this.dJ(), this.af.k() * 0.05, -this.dB().e * 0.5, this.af.k() * 0.05);
      }

      if (!this.dY().C && this.e > this.f) {
         this.q();
      }
   }

   private void q() {
      this.dY().a(this, (byte)17);
      this.a(eak.w, this.s());
      this.v();
      this.av();
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      if (!this.dY().C) {
         this.q();
      }
   }

   @Override
   protected void a(ezn $$0) {
      jh $$1 = new jh($$0.b());
      this.dY().a_($$1).a(this.dY(), $$1, this);
      if (!this.dY().y_() && this.t()) {
         this.q();
      }

      super.a($$0);
   }

   private boolean t() {
      return !this.x().isEmpty();
   }

   private void v() {
      float $$0 = 0.0F;
      List<cyu> $$1 = this.x();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dZ().a(this, this.s()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         ezr $$3 = this.dw();

         for (bve $$5 : this.dY().a(bve.class, this.cT().g(5.0))) {
            if ($$5 != this.g && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  ezr $$8 = new ezr($$5.dD(), $$5.e(0.5 * (double)$$7), $$5.dJ());
                  ezp $$9 = this.dY().a(new den($$3, $$8, den.a.a, den.b.a, this));
                  if ($$9.d() == ezp.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dZ().a(this, this.s()), $$10);
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
      if ($$0 == 17 && this.dY().C) {
         ezr $$1 = this.dB();
         this.dY().a(this.dD(), this.dF(), this.dJ(), $$1.d, $$1.e, $$1.f, this.x());
      }

      super.b($$0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      $$0.a("FireworksItem", this.m().a(this.ea()));
      $$0.a("ShotAtAngle", this.am.a(d));
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.am.a(b, cwf.a(this.ea(), (vk)$$0.p("FireworksItem")).orElseGet(cpf::y));
      } else {
         this.am.a(b, y());
      }

      if ($$0.e("ShotAtAngle")) {
         this.am.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cyu> x() {
      cwf $$0 = this.am.a(b);
      cyv $$1 = $$0.a(ku.af);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cwf m() {
      return this.am.a(b);
   }

   @Override
   public boolean cD() {
      return false;
   }

   private static cwf y() {
      return new cwf(cwj.uM);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bve $$0, bsy $$1) {
      double $$2 = $$0.dw().d - this.dw().d;
      double $$3 = $$0.dw().f - this.dw().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
