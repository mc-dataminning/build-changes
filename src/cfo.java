import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cfo extends cft implements cfq {
   private static final agj<cmr> b = agm.a(cfo.class, agl.h);
   private static final agj<OptionalInt> c = agm.a(cfo.class, agl.u);
   private static final agj<Boolean> d = agm.a(cfo.class, agl.k);
   private int e;
   private int f;
   @Nullable
   private bmf g;

   public cfo(blt<? extends cfo> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cfo(cti $$0, double $$1, double $$2, double $$3, cmr $$4) {
      super(blt.N, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      int $$5 = 1;
      if (!$$4.b() && $$4.u()) {
         this.an.b(b, $$4.p());
         $$5 += $$4.a("Fireworks").f("Flight");
      }

      this.o(this.ag.a(0.0, 0.002297), 0.05, this.ag.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ag.a(6) + this.ag.a(7);
   }

   public cfo(cti $$0, @Nullable blp $$1, double $$2, double $$3, double $$4, cmr $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public cfo(cti $$0, cmr $$1, bmf $$2) {
      this($$0, $$2, $$2.dr(), $$2.dt(), $$2.dx(), $$1);
      this.an.b(c, OptionalInt.of($$2.aj()));
      this.g = $$2;
   }

   public cfo(cti $$0, cmr $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.b(d, $$5);
   }

   public cfo(cti $$0, cmr $$1, blp $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void c_() {
      this.an.a(b, cmr.f);
      this.an.a(c, OptionalInt.empty());
      this.an.a(d, false);
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
            this.an.b(c).ifPresent($$0x -> {
               blp $$1x = this.dM().a($$0x);
               if ($$1x instanceof bmf) {
                  this.g = (bmf)$$1x;
               }
            });
         }

         if (this.g != null) {
            elm $$4;
            if (this.g.fw()) {
               elm $$0 = this.g.bF();
               double $$1 = 1.5;
               double $$2 = 0.1;
               elm $$3 = this.g.dp();
               this.g.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cmu.un);
            } else {
               $$4 = elm.b;
            }

            this.a_(this.g.dr() + $$4.c, this.g.dt() + $$4.d, this.g.dx() + $$4.e);
            this.g(this.g.dp());
         }
      } else {
         if (!this.s()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.g(this.dp().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         elm $$7 = this.dp();
         this.a(bml.a, $$7);
         this.g($$7);
      }

      elk $$8 = cfu.a(this, this::a);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.K();
      if (this.e == 0 && !this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.il, arn.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dM().B && this.e % 2 < 2) {
         this.dM().a(jx.C, this.dr(), this.dt(), this.dx(), this.ag.k() * 0.05, -this.dp().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dM().B && this.e > this.f) {
         this.u();
      }
   }

   private void u() {
      this.dM().a(this, (byte)17);
      this.a(dnk.w, this.w());
      this.y();
      this.am();
   }

   @Override
   protected void a(elj $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.u();
      }
   }

   @Override
   protected void a(eli $$0) {
      hx $$1 = new hx($$0.a());
      this.dM().a_($$1).a(this.dM(), $$1, this);
      if (!this.dM().y_() && this.x()) {
         this.u();
      }

      super.a($$0);
   }

   private boolean x() {
      cmr $$0 = this.an.b(b);
      sl $$1 = $$0.b() ? null : $$0.b("Fireworks");
      sr $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void y() {
      float $$0 = 0.0F;
      cmr $$1 = this.an.b(b);
      sl $$2 = $$1.b() ? null : $$1.b("Fireworks");
      sr $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dN().a(this, this.w()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         elm $$5 = this.dk();

         for (bmf $$7 : this.dM().a(bmf.class, this.cH().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  elm $$10 = new elm($$7.dr(), $$7.e(0.5 * (double)$$9), $$7.dx());
                  elk $$11 = this.dM().a(new csr($$5, $$10, csr.a.a, csr.b.a, this));
                  if ($$11.c() == elk.a.a) {
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
      return this.an.b(c).isPresent();
   }

   @Override
   public boolean s() {
      return this.an.b(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dM().B) {
         if (!this.x()) {
            for (int $$1 = 0; $$1 < this.ag.a(3) + 2; $$1++) {
               this.dM().a(jx.Y, this.dr(), this.dt(), this.dx(), this.ag.k() * 0.05, 0.005, this.ag.k() * 0.05);
            }
         } else {
            cmr $$2 = this.an.b(b);
            sl $$3 = $$2.b() ? null : $$2.b("Fireworks");
            elm $$4 = this.dp();
            this.dM().a(this.dr(), this.dt(), this.dx(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      cmr $$1 = this.an.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new sl()));
      }

      $$0.a("ShotAtAngle", this.an.b(d));
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      cmr $$1 = cmr.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.an.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public cmr q() {
      cmr $$0 = this.an.b(b);
      return $$0.b() ? new cmr(cmu.un) : $$0;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
