import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ckn extends cks implements ckp {
   private static final aja<crs> b = aje.a(ckn.class, ajc.h);
   private static final aja<OptionalInt> c = aje.a(ckn.class, ajc.u);
   private static final aja<Boolean> d = aje.a(ckn.class, ajc.k);
   private int e;
   private int g;
   @Nullable
   private bqt h;

   public ckn(bqg<? extends ckn> $$0, czg $$1) {
      super($$0, $$1);
   }

   public ckn(czg $$0, double $$1, double $$2, double $$3, crs $$4) {
      super(bqg.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.an.a(b, $$4.r());
      int $$5 = 1;
      cuh $$6 = $$4.a(jr.K);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.o(this.ag.a(0.0, 0.002297), 0.05, this.ag.a(0.0, 0.002297));
      this.g = 10 * $$5 + this.ag.a(6) + this.ag.a(7);
   }

   public ckn(czg $$0, @Nullable bqa $$1, double $$2, double $$3, double $$4, crs $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public ckn(czg $$0, crs $$1, bqt $$2) {
      this($$0, $$2, $$2.dr(), $$2.dt(), $$2.dx(), $$1);
      this.an.a(c, OptionalInt.of($$2.aj()));
      this.h = $$2;
   }

   public ckn(czg $$0, crs $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.a(d, $$5);
   }

   public ckn(czg $$0, crs $$1, bqa $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(aje.a $$0) {
      $$0.a(b, A());
      $$0.a(c, OptionalInt.empty());
      $$0.a(d, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.y();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.y();
   }

   @Override
   public void l() {
      super.l();
      if (this.y()) {
         if (this.h == null) {
            this.an.a(c).ifPresent($$0x -> {
               bqa $$1x = this.dM().a($$0x);
               if ($$1x instanceof bqt) {
                  this.h = (bqt)$$1x;
               }
            });
         }

         if (this.h != null) {
            esj $$4;
            if (this.h.fB()) {
               esj $$0 = this.h.bI();
               double $$1 = 1.5;
               double $$2 = 0.1;
               esj $$3 = this.h.dp();
               this.h.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.h.a(crv.us);
            } else {
               $$4 = esj.b;
            }

            this.a_(this.h.dr() + $$4.c, this.h.dt() + $$4.d, this.h.dx() + $$4.e);
            this.g(this.h.dp());
         }
      } else {
         if (!this.r()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.g(this.dp().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         esj $$7 = this.dp();
         this.a(bqy.a, $$7);
         this.g($$7);
      }

      esh $$8 = cku.a(this, this::b);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.J();
      if (this.e == 0 && !this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.iK, aup.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dM().B && this.e % 2 < 2) {
         this.dM().a(kn.D, this.dr(), this.dt(), this.dx(), this.ag.k() * 0.05, -this.dp().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dM().B && this.e > this.g) {
         this.v();
      }
   }

   private void v() {
      this.dM().a(this, (byte)17);
      this.a(dub.w, this.u());
      this.x();
      this.am();
   }

   @Override
   protected void a(esg $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.v();
      }
   }

   @Override
   protected void a(esf $$0) {
      id $$1 = new id($$0.a());
      this.dM().a_($$1).a(this.dM(), $$1, this);
      if (!this.dM().x_() && this.w()) {
         this.v();
      }

      super.a($$0);
   }

   private boolean w() {
      return !this.z().isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      List<cug> $$1 = this.z();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.h != null) {
            this.h.a(this.dN().a(this, this.u()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         esj $$3 = this.dk();

         for (bqt $$5 : this.dM().a(bqt.class, this.cH().g(5.0))) {
            if ($$5 != this.h && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  esj $$8 = new esj($$5.dr(), $$5.e(0.5 * (double)$$7), $$5.dx());
                  esh $$9 = this.dM().a(new cyp($$3, $$8, cyp.a.a, cyp.b.a, this));
                  if ($$9.c() == esh.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dN().a(this, this.u()), $$10);
               }
            }
         }
      }
   }

   private boolean y() {
      return this.an.a(c).isPresent();
   }

   @Override
   public boolean r() {
      return this.an.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dM().B) {
         esj $$1 = this.dp();
         this.dM().a(this.dr(), this.dt(), this.dx(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.g);
      $$0.a("FireworksItem", this.p().a(this.dO()));
      $$0.a("ShotAtAngle", this.an.a(d));
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.g = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.an.a(b, crs.a(this.dO(), (ul)$$0.p("FireworksItem")).orElseGet(ckn::A));
      } else {
         this.an.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cug> z() {
      crs $$0 = this.an.a(b);
      cuh $$1 = $$0.a(jr.K);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public crs p() {
      return this.an.a(b);
   }

   @Override
   public boolean cq() {
      return false;
   }

   private static crs A() {
      return new crs(crv.us);
   }
}
