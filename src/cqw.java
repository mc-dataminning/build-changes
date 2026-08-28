import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cqw extends crb implements cqy {
   private static final akg<cxy> a = akk.a(cqw.class, aki.h);
   private static final akg<OptionalInt> b = akk.a(cqw.class, aki.v);
   private static final akg<Boolean> c = akk.a(cqw.class, aki.k);
   private int d;
   private int e;
   @Nullable
   private bwr f;

   public cqw(bwb<? extends cqw> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public cqw(dhp $$0, double $$1, double $$2, double $$3, cxy $$4) {
      super(bwb.Z, $$0);
      this.d = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      dal $$6 = $$4.a(kx.ah);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.e = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public cqw(dhp $$0, @Nullable bvs $$1, double $$2, double $$3, double $$4, cxy $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cqw(dhp $$0, cxy $$1, bwr $$2) {
      this($$0, $$2, $$2.dA(), $$2.dC(), $$2.dG(), $$1);
      this.al.a(b, OptionalInt.of($$2.ar()));
      this.f = $$2;
   }

   public cqw(dhp $$0, cxy $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public cqw(dhp $$0, cxy $$1, bvs $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(a, o());
      $$0.a(b, OptionalInt.empty());
      $$0.a(c, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.m();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.m();
   }

   @Override
   public void h() {
      super.h();
      fcs $$6;
      if (this.m()) {
         if (this.f == null) {
            this.al.a(b).ifPresent($$0x -> {
               bvs $$1x = this.dV().a($$0x);
               if ($$1x instanceof bwr) {
                  this.f = (bwr)$$1x;
               }
            });
         }

         if (this.f != null) {
            fcu $$4;
            if (this.f.fI()) {
               fcu $$0 = this.f.bT();
               double $$1 = 1.5;
               double $$2 = 0.1;
               fcu $$3 = this.f.dy();
               this.f.i($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.f.a(cyc.vx);
            } else {
               $$4 = fcu.c;
            }

            this.a_(this.f.dA() + $$4.d, this.f.dC() + $$4.e, this.f.dG() + $$4.f);
            this.i(this.f.dy());
         }

         $$6 = crd.a(this, this::b);
      } else {
         if (!this.g()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.i(this.dy().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         fcu $$8 = this.dy();
         $$6 = crd.a(this, this::b);
         this.a(bwv.a, $$8);
         this.aK();
         this.i($$8);
      }

      if (!this.ad && this.bK() && $$6.d() != fcs.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.A();
      if (this.d == 0 && !this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.jp, awl.i, 3.0F, 1.0F);
      }

      this.d++;
      if (this.dV().C && this.d % 2 < 2) {
         this.dV().a(lv.D, this.dA(), this.dC(), this.dG(), this.ae.k() * 0.05, -this.dy().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.d > this.e && this.dV() instanceof arn $$10) {
         this.b($$10);
      }
   }

   private void b(arn $$0) {
      $$0.a(this, (byte)17);
      this.a(edm.w, this.q());
      this.e($$0);
      this.at();
   }

   @Override
   protected void a(fcr $$0) {
      super.a($$0);
      if (this.dV() instanceof arn $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(fcq $$0) {
      jj $$1 = new jj($$0.b());
      this.dV().a_($$1).a(this.dV(), $$1, this);
      if (this.dV() instanceof arn $$2 && this.j()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean j() {
      return !this.n().isEmpty();
   }

   private void e(arn $$0) {
      float $$1 = 0.0F;
      List<dak> $$2 = this.n();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.f != null) {
            this.f.a($$0, this.dW().a(this, this.q()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         fcu $$4 = this.dt();

         for (bwr $$6 : this.dV().a(bwr.class, this.cR().g(5.0))) {
            if ($$6 != this.f && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  fcu $$9 = new fcu($$6.dA(), $$6.e(0.5 * (double)$$8), $$6.dG());
                  fcs $$10 = this.dV().a(new dgy($$4, $$9, dgy.a.a, dgy.b.a, this));
                  if ($$10.d() == fcs.a.a) {
                     $$7 = true;
                     break;
                  }
               }

               if ($$7) {
                  float $$11 = $$1 * (float)Math.sqrt((5.0 - (double)this.f($$6)) / 5.0);
                  $$6.a($$0, this.dW().a(this, this.q()), $$11);
               }
            }
         }
      }
   }

   private boolean m() {
      return this.al.a(b).isPresent();
   }

   @Override
   public boolean g() {
      return this.al.a(c);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dV().C) {
         fcu $$1 = this.dy();
         this.dV().a(this.dA(), this.dC(), this.dG(), $$1.d, $$1.e, $$1.f, this.n());
      }

      super.b($$0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Life", this.d);
      $$0.a("LifeTime", this.e);
      $$0.a("FireworksItem", this.f().a(this.dX()));
      $$0.a("ShotAtAngle", this.al.a(c));
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.d = $$0.h("Life");
      this.e = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.al.a(a, cxy.a(this.dX(), (ut)$$0.p("FireworksItem")).orElseGet(cqw::o));
      } else {
         this.al.a(a, o());
      }

      if ($$0.e("ShotAtAngle")) {
         this.al.a(c, $$0.q("ShotAtAngle"));
      }
   }

   private List<dak> n() {
      cxy $$0 = this.al.a(a);
      dal $$1 = $$0.a(kx.ah);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cxy f() {
      return this.al.a(a);
   }

   @Override
   public boolean cB() {
      return false;
   }

   private static cxy o() {
      return new cxy(cyc.vx);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bwr $$0, buh $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
