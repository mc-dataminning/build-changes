import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cod extends coi implements cof {
   private static final akg<cvl> b = akk.a(cod.class, aki.h);
   private static final akg<OptionalInt> c = akk.a(cod.class, aki.v);
   private static final akg<Boolean> d = akk.a(cod.class, aki.k);
   private int e;
   private int f;
   @Nullable
   private buf g;

   public cod(btq<? extends cod> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cod(dds $$0, double $$1, double $$2, double $$3, cvl $$4) {
      super(btq.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.am.a(b, $$4.u());
      int $$5 = 1;
      cyf $$6 = $$4.a(kr.X);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.af.a(0.0, 0.002297), 0.05, this.af.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.af.a(6) + this.af.a(7);
   }

   public cod(dds $$0, @Nullable btj $$1, double $$2, double $$3, double $$4, cvl $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cod(dds $$0, cvl $$1, buf $$2) {
      this($$0, $$2, $$2.dx(), $$2.dz(), $$2.dD(), $$1);
      this.am.a(c, OptionalInt.of($$2.ap()));
      this.g = $$2;
   }

   public cod(dds $$0, cvl $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.am.a(d, $$5);
   }

   public cod(dds $$0, cvl $$1, btj $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akk.a $$0) {
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
      if (this.w()) {
         if (this.g == null) {
            this.am.a(c).ifPresent($$0x -> {
               btj $$1x = this.dS().a($$0x);
               if ($$1x instanceof buf) {
                  this.g = (buf)$$1x;
               }
            });
         }

         if (this.g != null) {
            eye $$4;
            if (this.g.fE()) {
               eye $$0 = this.g.bQ();
               double $$1 = 1.5;
               double $$2 = 0.1;
               eye $$3 = this.g.dv();
               this.g.h($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.g.a(cvo.uw);
            } else {
               $$4 = eye.c;
            }

            this.a_(this.g.dx() + $$4.d, this.g.dz() + $$4.e, this.g.dD() + $$4.f);
            this.h(this.g.dv());
         }
      } else {
         if (!this.o()) {
            double $$6 = this.Q ? 1.0 : 1.15;
            this.h(this.dv().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         eye $$7 = this.dv();
         this.a(buj.a, $$7);
         if (!this.dS().w_()) {
            this.aI();
         }

         this.h($$7);
      }

      eyc $$8 = cok.a(this, this::b);
      if (!this.ae) {
         this.b($$8);
         this.as = true;
      }

      this.F();
      if (this.e == 0 && !this.ba()) {
         this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.iQ, awe.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dS().B && this.e % 2 < 2) {
         this.dS().a(ln.D, this.dx(), this.dz(), this.dD(), this.af.k() * 0.05, -this.dv().e * 0.5, this.af.k() * 0.05);
      }

      if (!this.dS().B && this.e > this.f) {
         this.q();
      }
   }

   private void q() {
      this.dS().a(this, (byte)17);
      this.a(dyx.w, this.s());
      this.v();
      this.as();
   }

   @Override
   protected void a(eyb $$0) {
      super.a($$0);
      if (!this.dS().B) {
         this.q();
      }
   }

   @Override
   protected void a(eya $$0) {
      je $$1 = new je($$0.a());
      this.dS().a_($$1).a(this.dS(), $$1, this);
      if (!this.dS().w_() && this.t()) {
         this.q();
      }

      super.a($$0);
   }

   private boolean t() {
      return !this.x().isEmpty();
   }

   private void v() {
      float $$0 = 0.0F;
      List<cye> $$1 = this.x();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dT().a(this, this.s()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         eye $$3 = this.dq();

         for (buf $$5 : this.dS().a(buf.class, this.cO().g(5.0))) {
            if ($$5 != this.g && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  eye $$8 = new eye($$5.dx(), $$5.e(0.5 * (double)$$7), $$5.dD());
                  eyc $$9 = this.dS().a(new dda($$3, $$8, dda.a.a, dda.b.a, this));
                  if ($$9.c() == eyc.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dT().a(this, this.s()), $$10);
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
      if ($$0 == 17 && this.dS().B) {
         eye $$1 = this.dv();
         this.dS().a(this.dx(), this.dz(), this.dD(), $$1.d, $$1.e, $$1.f, this.x());
      }

      super.b($$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      $$0.a("FireworksItem", this.m().a(this.dU()));
      $$0.a("ShotAtAngle", this.am.a(d));
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.am.a(b, cvl.a(this.dU(), (vc)$$0.p("FireworksItem")).orElseGet(cod::y));
      } else {
         this.am.a(b, y());
      }

      if ($$0.e("ShotAtAngle")) {
         this.am.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cye> x() {
      cvl $$0 = this.am.a(b);
      cyf $$1 = $$0.a(kr.X);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cvl m() {
      return this.am.a(b);
   }

   @Override
   public boolean cy() {
      return false;
   }

   private static cvl y() {
      return new cvl(cvo.uw);
   }

   @Override
   public DoubleDoubleImmutablePair a_(buf $$0, bsb $$1) {
      double $$2 = $$0.dq().d - this.dq().d;
      double $$3 = $$0.dq().f - this.dq().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
