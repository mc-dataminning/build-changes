import java.util.OptionalInt;
import javax.annotation.Nullable;

public class chy extends cid implements cia {
   private static final aie<cpd> b = aih.a(chy.class, aig.h);
   private static final aie<OptionalInt> c = aih.a(chy.class, aig.u);
   private static final aie<Boolean> d = aih.a(chy.class, aig.k);
   private int e;
   private int g;
   @Nullable
   private boi h;

   public chy(bnw<? extends chy> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public chy(cvr $$0, double $$1, double $$2, double $$3, cpd $$4) {
      super(bnw.O, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      int $$5 = 1;
      if (!$$4.b() && $$4.v()) {
         this.am.b(b, $$4.q());
         $$5 += $$4.a("Fireworks").f("Flight");
      }

      this.o(this.af.a(0.0, 0.002297), 0.05, this.af.a(0.0, 0.002297));
      this.g = 10 * $$5 + this.af.a(6) + this.af.a(7);
   }

   public chy(cvr $$0, @Nullable bnq $$1, double $$2, double $$3, double $$4, cpd $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public chy(cvr $$0, cpd $$1, boi $$2) {
      this($$0, $$2, $$2.dr(), $$2.dt(), $$2.dx(), $$1);
      this.am.b(c, OptionalInt.of($$2.aj()));
      this.h = $$2;
   }

   public chy(cvr $$0, cpd $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.am.b(d, $$5);
   }

   public chy(cvr $$0, cpd $$1, bnq $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void c_() {
      this.am.a(b, cpd.h);
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
         if (this.h == null) {
            this.am.b(c).ifPresent($$0x -> {
               bnq $$1x = this.dM().a($$0x);
               if ($$1x instanceof boi) {
                  this.h = (boi)$$1x;
               }
            });
         }

         if (this.h != null) {
            enz $$4;
            if (this.h.fw()) {
               enz $$0 = this.h.bF();
               double $$1 = 1.5;
               double $$2 = 0.1;
               enz $$3 = this.h.dp();
               this.h.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.h.a(cpg.uq);
            } else {
               $$4 = enz.b;
            }

            this.a_(this.h.dr() + $$4.c, this.h.dt() + $$4.d, this.h.dx() + $$4.e);
            this.g(this.h.dp());
         }
      } else {
         if (!this.s()) {
            double $$6 = this.O ? 1.0 : 1.15;
            this.g(this.dp().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         enz $$7 = this.dp();
         this.a(bon.a, $$7);
         this.g($$7);
      }

      enx $$8 = cif.a(this, this::a);
      if (!this.ae) {
         this.a($$8);
         this.at = true;
      }

      this.J();
      if (this.e == 0 && !this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.iB, atm.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dM().B && this.e % 2 < 2) {
         this.dM().a(jz.C, this.dr(), this.dt(), this.dx(), this.af.k() * 0.05, -this.dp().d * 0.5, this.af.k() * 0.05);
      }

      if (!this.dM().B && this.e > this.g) {
         this.u();
      }
   }

   private void u() {
      this.dM().a(this, (byte)17);
      this.a(dpw.w, this.w());
      this.y();
      this.am();
   }

   @Override
   protected void a(enw $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.u();
      }
   }

   @Override
   protected void a(env $$0) {
      hz $$1 = new hz($$0.a());
      this.dM().a_($$1).a(this.dM(), $$1, this);
      if (!this.dM().y_() && this.x()) {
         this.u();
      }

      super.a($$0);
   }

   private boolean x() {
      cpd $$0 = this.am.b(b);
      sw $$1 = $$0.b() ? null : $$0.b("Fireworks");
      tc $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void y() {
      float $$0 = 0.0F;
      cpd $$1 = this.am.b(b);
      sw $$2 = $$1.b() ? null : $$1.b("Fireworks");
      tc $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.h != null) {
            this.h.a(this.dN().a(this, this.w()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         enz $$5 = this.dk();

         for (boi $$7 : this.dM().a(boi.class, this.cH().g(5.0))) {
            if ($$7 != this.h && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  enz $$10 = new enz($$7.dr(), $$7.e(0.5 * (double)$$9), $$7.dx());
                  enx $$11 = this.dM().a(new cva($$5, $$10, cva.a.a, cva.b.a, this));
                  if ($$11.c() == enx.a.a) {
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
            cpd $$2 = this.am.b(b);
            sw $$3 = $$2.b() ? null : $$2.b("Fireworks");
            enz $$4 = this.dp();
            this.dM().a(this.dr(), this.dt(), this.dx(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.g);
      cpd $$1 = this.am.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new sw()));
      }

      $$0.a("ShotAtAngle", this.am.b(d));
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.g = $$0.h("LifeTime");
      cpd $$1 = cpd.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.am.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.am.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public cpd q() {
      cpd $$0 = this.am.b(b);
      return $$0.b() ? new cpd(cpg.uq) : $$0;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
