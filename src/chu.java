import java.util.OptionalInt;
import javax.annotation.Nullable;

public class chu extends chz implements chw {
   private static final aie<coz> b = aih.a(chu.class, aig.h);
   private static final aie<OptionalInt> c = aih.a(chu.class, aig.u);
   private static final aie<Boolean> d = aih.a(chu.class, aig.k);
   private int e;
   private int f;
   @Nullable
   private bog g;

   public chu(bnu<? extends chu> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public chu(cvn $$0, double $$1, double $$2, double $$3, coz $$4) {
      super(bnu.O, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      int $$5 = 1;
      if (!$$4.b() && $$4.v()) {
         this.am.b(b, $$4.q());
         $$5 += $$4.a("Fireworks").f("Flight");
      }

      this.o(this.af.a(0.0, 0.002297), 0.05, this.af.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.af.a(6) + this.af.a(7);
   }

   public chu(cvn $$0, @Nullable bno $$1, double $$2, double $$3, double $$4, coz $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public chu(cvn $$0, coz $$1, bog $$2) {
      this($$0, $$2, $$2.dr(), $$2.dt(), $$2.dx(), $$1);
      this.am.b(c, OptionalInt.of($$2.aj()));
      this.g = $$2;
   }

   public chu(cvn $$0, coz $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.am.b(d, $$5);
   }

   public chu(cvn $$0, coz $$1, bno $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void c_() {
      this.am.a(b, coz.h);
      this.am.a(c, OptionalInt.empty());
      this.am.a(d, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.z();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.z();
   }

   @Override
   public void l() {
      super.l();
      if (this.z()) {
         if (this.g == null) {
            this.am.b(c).ifPresent($$0x -> {
               bno $$1x = this.dM().a($$0x);
               if ($$1x instanceof bog) {
                  this.g = (bog)$$1x;
               }
            });
         }

         if (this.g != null) {
            ens $$4;
            if (this.g.fw()) {
               ens $$0 = this.g.bF();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ens $$3 = this.g.dp();
               this.g.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cpc.uq);
            } else {
               $$4 = ens.b;
            }

            this.a_(this.g.dr() + $$4.c, this.g.dt() + $$4.d, this.g.dx() + $$4.e);
            this.g(this.g.dp());
         }
      } else {
         if (!this.s()) {
            double $$6 = this.O ? 1.0 : 1.15;
            this.g(this.dp().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         ens $$7 = this.dp();
         this.a(bol.a, $$7);
         this.g($$7);
      }

      enq $$8 = cib.a(this, this::a);
      if (!this.ae) {
         this.a($$8);
         this.at = true;
      }

      this.J();
      if (this.e == 0 && !this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), atk.iA, atl.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dM().B && this.e % 2 < 2) {
         this.dM().a(jz.C, this.dr(), this.dt(), this.dx(), this.af.k() * 0.05, -this.dp().d * 0.5, this.af.k() * 0.05);
      }

      if (!this.dM().B && this.e > this.f) {
         this.u();
      }
   }

   private void u() {
      this.dM().a(this, (byte)17);
      this.a(dpp.w, this.w());
      this.y();
      this.am();
   }

   @Override
   protected void a(enp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.u();
      }
   }

   @Override
   protected void a(eno $$0) {
      hz $$1 = new hz($$0.a());
      this.dM().a_($$1).a(this.dM(), $$1, this);
      if (!this.dM().y_() && this.x()) {
         this.u();
      }

      super.a($$0);
   }

   private boolean x() {
      coz $$0 = this.am.b(b);
      sw $$1 = $$0.b() ? null : $$0.b("Fireworks");
      tc $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void y() {
      float $$0 = 0.0F;
      coz $$1 = this.am.b(b);
      sw $$2 = $$1.b() ? null : $$1.b("Fireworks");
      tc $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dN().a(this, this.w()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         ens $$5 = this.dk();

         for (bog $$7 : this.dM().a(bog.class, this.cH().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  ens $$10 = new ens($$7.dr(), $$7.e(0.5 * (double)$$9), $$7.dx());
                  enq $$11 = this.dM().a(new cuw($$5, $$10, cuw.a.a, cuw.b.a, this));
                  if ($$11.c() == enq.a.a) {
                     $$8 = true;
                     break;
                  }
               }

               if ($$8) {
                  float $$12 = $$0 * (float)Math.sqrt((5.0 - (double)this.e($$7)) / 5.0);
                  $$7.a(this.dN().a(this, this.w()), $$12);
               }
            }
         }
      }
   }

   private boolean z() {
      return this.am.b(c).isPresent();
   }

   @Override
   public boolean s() {
      return this.am.b(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dM().B) {
         if (!this.x()) {
            for (int $$1 = 0; $$1 < this.af.a(3) + 2; $$1++) {
               this.dM().a(jz.Y, this.dr(), this.dt(), this.dx(), this.af.k() * 0.05, 0.005, this.af.k() * 0.05);
            }
         } else {
            coz $$2 = this.am.b(b);
            sw $$3 = $$2.b() ? null : $$2.b("Fireworks");
            ens $$4 = this.dp();
            this.dM().a(this.dr(), this.dt(), this.dx(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      coz $$1 = this.am.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new sw()));
      }

      $$0.a("ShotAtAngle", this.am.b(d));
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      coz $$1 = coz.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.am.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.am.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public coz q() {
      coz $$0 = this.am.b(b);
      return $$0.b() ? new coz(cpc.uq) : $$0;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
