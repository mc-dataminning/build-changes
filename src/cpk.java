import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cpk extends cpp implements cpm {
   private static final ajy<cwo> a = akc.a(cpk.class, aka.h);
   private static final ajy<OptionalInt> b = akc.a(cpk.class, aka.v);
   private static final ajy<Boolean> c = akc.a(cpk.class, aka.k);
   private int d;
   private int e;
   @Nullable
   private bvg f;

   public cpk(bur<? extends cpk> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpk(dgh $$0, double $$1, double $$2, double $$3, cwo $$4) {
      super(bur.Z, $$0);
      this.d = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      cze $$6 = $$4.a(kv.af);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.e = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public cpk(dgh $$0, @Nullable buk $$1, double $$2, double $$3, double $$4, cwo $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cpk(dgh $$0, cwo $$1, bvg $$2) {
      this($$0, $$2, $$2.dA(), $$2.dC(), $$2.dG(), $$1);
      this.al.a(b, OptionalInt.of($$2.ar()));
      this.f = $$2;
   }

   public cpk(dgh $$0, cwo $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public cpk(dgh $$0, cwo $$1, buk $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akc.a $$0) {
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
      fax $$6;
      if (this.t()) {
         if (this.f == null) {
            this.al.a(b).ifPresent($$0x -> {
               buk $$1x = this.dV().a($$0x);
               if ($$1x instanceof bvg) {
                  this.f = (bvg)$$1x;
               }
            });
         }

         if (this.f != null) {
            faz $$4;
            if (this.f.fJ()) {
               faz $$0 = this.f.bT();
               double $$1 = 1.5;
               double $$2 = 0.1;
               faz $$3 = this.f.dy();
               this.f.i($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.f.a(cws.vt);
            } else {
               $$4 = faz.c;
            }

            this.a_(this.f.dA() + $$4.d, this.f.dC() + $$4.e, this.f.dG() + $$4.f);
            this.i(this.f.dy());
         }

         $$6 = cpr.a(this, this::b);
      } else {
         if (!this.m()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.i(this.dy().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         faz $$8 = this.dy();
         $$6 = cpr.a(this, this::b);
         this.a(bvk.a, $$8);
         this.aK();
         this.i($$8);
      }

      if (!this.ad && this.bL() && $$6.d() != fax.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.F();
      if (this.d == 0 && !this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.jp, awb.i, 3.0F, 1.0F);
      }

      this.d++;
      if (this.dV().C && this.d % 2 < 2) {
         this.dV().a(lt.D, this.dA(), this.dC(), this.dG(), this.ae.k() * 0.05, -this.dy().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.d > this.e && this.dV() instanceof ard $$10) {
         this.b($$10);
      }
   }

   private void b(ard $$0) {
      $$0.a(this, (byte)17);
      this.a(ebs.w, this.p());
      this.e($$0);
      this.at();
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (this.dV() instanceof ard $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(fav $$0) {
      ji $$1 = new ji($$0.b());
      this.dV().a_($$1).a(this.dV(), $$1, this);
      if (this.dV() instanceof ard $$2 && this.s()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean s() {
      return !this.u().isEmpty();
   }

   private void e(ard $$0) {
      float $$1 = 0.0F;
      List<czd> $$2 = this.u();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.f != null) {
            this.f.a($$0, this.dW().a(this, this.p()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         faz $$4 = this.dt();

         for (bvg $$6 : this.dV().a(bvg.class, this.cR().g(5.0))) {
            if ($$6 != this.f && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  faz $$9 = new faz($$6.dA(), $$6.e(0.5 * (double)$$8), $$6.dG());
                  fax $$10 = this.dV().a(new dfp($$4, $$9, dfp.a.a, dfp.b.a, this));
                  if ($$10.d() == fax.a.a) {
                     $$7 = true;
                     break;
                  }
               }

               if ($$7) {
                  float $$11 = $$1 * (float)Math.sqrt((5.0 - (double)this.f($$6)) / 5.0);
                  $$6.a($$0, this.dW().a(this, this.p()), $$11);
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
      if ($$0 == 17 && this.dV().C) {
         faz $$1 = this.dy();
         this.dV().a(this.dA(), this.dC(), this.dG(), $$1.d, $$1.e, $$1.f, this.u());
      }

      super.b($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Life", this.d);
      $$0.a("LifeTime", this.e);
      $$0.a("FireworksItem", this.l().a(this.dX()));
      $$0.a("ShotAtAngle", this.al.a(c));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.d = $$0.h("Life");
      this.e = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.al.a(a, cwo.a(this.dX(), (un)$$0.p("FireworksItem")).orElseGet(cpk::v));
      } else {
         this.al.a(a, v());
      }

      if ($$0.e("ShotAtAngle")) {
         this.al.a(c, $$0.q("ShotAtAngle"));
      }
   }

   private List<czd> u() {
      cwo $$0 = this.al.a(a);
      cze $$1 = $$0.a(kv.af);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cwo l() {
      return this.al.a(a);
   }

   @Override
   public boolean cB() {
      return false;
   }

   private static cwo v() {
      return new cwo(cws.vt);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bvg $$0, bta $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
