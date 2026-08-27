import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cfu extends cfz implements cfw {
   private static final agm<cmx> b = agp.a(cfu.class, ago.h);
   private static final agm<OptionalInt> c = agp.a(cfu.class, ago.u);
   private static final agm<Boolean> d = agp.a(cfu.class, ago.k);
   private int e;
   private int f;
   @Nullable
   private bmk g;

   public cfu(bly<? extends cfu> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cfu(cto $$0, double $$1, double $$2, double $$3, cmx $$4) {
      super(bly.N, $$0);
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

   public cfu(cto $$0, @Nullable blu $$1, double $$2, double $$3, double $$4, cmx $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public cfu(cto $$0, cmx $$1, bmk $$2) {
      this($$0, $$2, $$2.dr(), $$2.dt(), $$2.dx(), $$1);
      this.an.b(c, OptionalInt.of($$2.aj()));
      this.g = $$2;
   }

   public cfu(cto $$0, cmx $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.b(d, $$5);
   }

   public cfu(cto $$0, cmx $$1, blu $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void c_() {
      this.an.a(b, cmx.f);
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
               blu $$1x = this.dM().a($$0x);
               if ($$1x instanceof bmk) {
                  this.g = (bmk)$$1x;
               }
            });
         }

         if (this.g != null) {
            els $$4;
            if (this.g.fw()) {
               els $$0 = this.g.bF();
               double $$1 = 1.5;
               double $$2 = 0.1;
               els $$3 = this.g.dp();
               this.g.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cna.un);
            } else {
               $$4 = els.b;
            }

            this.a_(this.g.dr() + $$4.c, this.g.dt() + $$4.d, this.g.dx() + $$4.e);
            this.g(this.g.dp());
         }
      } else {
         if (!this.s()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.g(this.dp().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         els $$7 = this.dp();
         this.a(bmq.a, $$7);
         this.g($$7);
      }

      elq $$8 = cga.a(this, this::a);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.K();
      if (this.e == 0 && !this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), arr.il, ars.i, 3.0F, 1.0F);
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
      this.a(dnq.w, this.w());
      this.y();
      this.am();
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.u();
      }
   }

   @Override
   protected void a(elo $$0) {
      hx $$1 = new hx($$0.a());
      this.dM().a_($$1).a(this.dM(), $$1, this);
      if (!this.dM().y_() && this.x()) {
         this.u();
      }

      super.a($$0);
   }

   private boolean x() {
      cmx $$0 = this.an.b(b);
      sn $$1 = $$0.b() ? null : $$0.b("Fireworks");
      st $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void y() {
      float $$0 = 0.0F;
      cmx $$1 = this.an.b(b);
      sn $$2 = $$1.b() ? null : $$1.b("Fireworks");
      st $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dN().a(this, this.w()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         els $$5 = this.dk();

         for (bmk $$7 : this.dM().a(bmk.class, this.cH().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  els $$10 = new els($$7.dr(), $$7.e(0.5 * (double)$$9), $$7.dx());
                  elq $$11 = this.dM().a(new csx($$5, $$10, csx.a.a, csx.b.a, this));
                  if ($$11.c() == elq.a.a) {
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
            cmx $$2 = this.an.b(b);
            sn $$3 = $$2.b() ? null : $$2.b("Fireworks");
            els $$4 = this.dp();
            this.dM().a(this.dr(), this.dt(), this.dx(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      cmx $$1 = this.an.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new sn()));
      }

      $$0.a("ShotAtAngle", this.an.b(d));
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      cmx $$1 = cmx.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.an.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public cmx q() {
      cmx $$0 = this.an.b(b);
      return $$0.b() ? new cmx(cna.un) : $$0;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
