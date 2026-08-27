import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cjf extends cjk implements cjh {
   private static final aim<cqk> b = aiq.a(cjf.class, aio.h);
   private static final aim<OptionalInt> c = aiq.a(cjf.class, aio.u);
   private static final aim<Boolean> d = aiq.a(cjf.class, aio.k);
   private int e;
   private int g;
   @Nullable
   private bpo h;

   public cjf(bpc<? extends cjf> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public cjf(cwz $$0, double $$1, double $$2, double $$3, cqk $$4) {
      super(bpc.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.an.a(b, $$4.q());
      int $$5 = 1;
      if (!$$4.b() && $$4.v()) {
         $$5 += $$4.b("Fireworks").f("Flight");
      }

      this.o(this.ag.a(0.0, 0.002297), 0.05, this.ag.a(0.0, 0.002297));
      this.g = 10 * $$5 + this.ag.a(6) + this.ag.a(7);
   }

   public cjf(cwz $$0, @Nullable bow $$1, double $$2, double $$3, double $$4, cqk $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cjf(cwz $$0, cqk $$1, bpo $$2) {
      this($$0, $$2, $$2.dr(), $$2.dt(), $$2.dx(), $$1);
      this.an.a(c, OptionalInt.of($$2.aj()));
      this.h = $$2;
   }

   public cjf(cwz $$0, cqk $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.a(d, $$5);
   }

   public cjf(cwz $$0, cqk $$1, bow $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(b, new cqk(cqn.ur));
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
               bow $$1x = this.dM().a($$0x);
               if ($$1x instanceof bpo) {
                  this.h = (bpo)$$1x;
               }
            });
         }

         if (this.h != null) {
            epr $$4;
            if (this.h.fB()) {
               epr $$0 = this.h.bI();
               double $$1 = 1.5;
               double $$2 = 0.1;
               epr $$3 = this.h.dp();
               this.h.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.h.a(cqn.ur);
            } else {
               $$4 = epr.b;
            }

            this.a_(this.h.dr() + $$4.c, this.h.dt() + $$4.d, this.h.dx() + $$4.e);
            this.g(this.h.dp());
         }
      } else {
         if (!this.r()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.g(this.dp().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         epr $$7 = this.dp();
         this.a(bpt.a, $$7);
         this.g($$7);
      }

      epp $$8 = cjm.a(this, this::b);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.I();
      if (this.e == 0 && !this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.iE, atz.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dM().B && this.e % 2 < 2) {
         this.dM().a(kc.D, this.dr(), this.dt(), this.dx(), this.ag.k() * 0.05, -this.dp().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dM().B && this.e > this.g) {
         this.s();
      }
   }

   private void s() {
      this.dM().a(this, (byte)17);
      this.a(drn.w, this.af_());
      this.x();
      this.am();
   }

   @Override
   protected void a(epo $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.s();
      }
   }

   @Override
   protected void a(epn $$0) {
      ib $$1 = new ib($$0.a());
      this.dM().a_($$1).a(this.dM(), $$1, this);
      if (!this.dM().x_() && this.w()) {
         this.s();
      }

      super.a($$0);
   }

   private boolean w() {
      cqk $$0 = this.an.a(b);
      ta $$1 = $$0.b() ? null : $$0.c("Fireworks");
      tg $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      cqk $$1 = this.an.a(b);
      ta $$2 = $$1.b() ? null : $$1.c("Fireworks");
      tg $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.h != null) {
            this.h.a(this.dN().a(this, this.af_()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         epr $$5 = this.dk();

         for (bpo $$7 : this.dM().a(bpo.class, this.cH().g(5.0))) {
            if ($$7 != this.h && !(this.g($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  epr $$10 = new epr($$7.dr(), $$7.e(0.5 * (double)$$9), $$7.dx());
                  epp $$11 = this.dM().a(new cwi($$5, $$10, cwi.a.a, cwi.b.a, this));
                  if ($$11.c() == epp.a.a) {
                     $$8 = true;
                     break;
                  }
               }

               if ($$8) {
                  float $$12 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$7)) / 5.0);
                  $$7.a(this.dN().a(this, this.af_()), $$12);
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
         if (!this.w()) {
            for (int $$1 = 0; $$1 < this.ag.a(3) + 2; $$1++) {
               this.dM().a(kc.Z, this.dr(), this.dt(), this.dx(), this.ag.k() * 0.05, 0.005, this.ag.k() * 0.05);
            }
         } else {
            cqk $$2 = this.an.a(b);
            ta $$3 = $$2.b() ? null : $$2.c("Fireworks");
            epr $$4 = this.dp();
            this.dM().a(this.dr(), this.dt(), this.dx(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.g);
      $$0.a("FireworksItem", this.p().b(new ta()));
      $$0.a("ShotAtAngle", this.an.a(d));
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.g = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         cqk $$1 = cqk.a($$0.p("FireworksItem"));
         if (!$$1.b()) {
            this.an.a(b, $$1);
         }
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.a(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public cqk p() {
      return this.an.a(b);
   }

   @Override
   public boolean cq() {
      return false;
   }
}
