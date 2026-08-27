import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgd extends cgi implements cgf {
   private static final agn<cng> b = agq.a(cgd.class, agp.h);
   private static final agn<OptionalInt> c = agq.a(cgd.class, agp.u);
   private static final agn<Boolean> d = agq.a(cgd.class, agp.k);
   private int e;
   private int f;
   @Nullable
   private bmo g;

   public cgd(bmc<? extends cgd> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgd(ctx $$0, double $$1, double $$2, double $$3, cng $$4) {
      super(bmc.O, $$0);
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

   public cgd(ctx $$0, @Nullable blw $$1, double $$2, double $$3, double $$4, cng $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cgd(ctx $$0, cng $$1, bmo $$2) {
      this($$0, $$2, $$2.dq(), $$2.ds(), $$2.dw(), $$1);
      this.an.b(c, OptionalInt.of($$2.aj()));
      this.g = $$2;
   }

   public cgd(ctx $$0, cng $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.b(d, $$5);
   }

   public cgd(ctx $$0, cng $$1, blw $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void c_() {
      this.an.a(b, cng.f);
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
               blw $$1x = this.dL().a($$0x);
               if ($$1x instanceof bmo) {
                  this.g = (bmo)$$1x;
               }
            });
         }

         if (this.g != null) {
            emc $$4;
            if (this.g.fw()) {
               emc $$0 = this.g.bF();
               double $$1 = 1.5;
               double $$2 = 0.1;
               emc $$3 = this.g.do();
               this.g.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cnj.uq);
            } else {
               $$4 = emc.b;
            }

            this.a_(this.g.dq() + $$4.c, this.g.ds() + $$4.d, this.g.dw() + $$4.e);
            this.g(this.g.do());
         }
      } else {
         if (!this.s()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.g(this.do().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         emc $$7 = this.do();
         this.a(bmu.a, $$7);
         this.g($$7);
      }

      ema $$8 = cgj.a(this, this::b);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.J();
      if (this.e == 0 && !this.aU()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), art.iA, aru.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dL().B && this.e % 2 < 2) {
         this.dL().a(jx.C, this.dq(), this.ds(), this.dw(), this.ag.k() * 0.05, -this.do().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dL().B && this.e > this.f) {
         this.u();
      }
   }

   private void u() {
      this.dL().a(this, (byte)17);
      this.a(dnz.w, this.w());
      this.y();
      this.am();
   }

   @Override
   protected void a(elz $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.u();
      }
   }

   @Override
   protected void a(ely $$0) {
      hx $$1 = new hx($$0.a());
      this.dL().a_($$1).a(this.dL(), $$1, this);
      if (!this.dL().y_() && this.x()) {
         this.u();
      }

      super.a($$0);
   }

   private boolean x() {
      cng $$0 = this.an.b(b);
      so $$1 = $$0.b() ? null : $$0.b("Fireworks");
      su $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void y() {
      float $$0 = 0.0F;
      cng $$1 = this.an.b(b);
      so $$2 = $$1.b() ? null : $$1.b("Fireworks");
      su $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dM().a(this, this.w()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         emc $$5 = this.dj();

         for (bmo $$7 : this.dL().a(bmo.class, this.cH().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  emc $$10 = new emc($$7.dq(), $$7.e(0.5 * (double)$$9), $$7.dw());
                  ema $$11 = this.dL().a(new ctg($$5, $$10, ctg.a.a, ctg.b.a, this));
                  if ($$11.c() == ema.a.a) {
                     $$8 = true;
                     break;
                  }
               }

               if ($$8) {
                  float $$12 = $$0 * (float)Math.sqrt((5.0 - (double)this.e($$7)) / 5.0);
                  $$7.a(this.dM().a(this, this.w()), $$12);
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
      if ($$0 == 17 && this.dL().B) {
         if (!this.x()) {
            for (int $$1 = 0; $$1 < this.ag.a(3) + 2; $$1++) {
               this.dL().a(jx.Y, this.dq(), this.ds(), this.dw(), this.ag.k() * 0.05, 0.005, this.ag.k() * 0.05);
            }
         } else {
            cng $$2 = this.an.b(b);
            so $$3 = $$2.b() ? null : $$2.b("Fireworks");
            emc $$4 = this.do();
            this.dL().a(this.dq(), this.ds(), this.dw(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      cng $$1 = this.an.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new so()));
      }

      $$0.a("ShotAtAngle", this.an.b(d));
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      cng $$1 = cng.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.an.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public cng q() {
      cng $$0 = this.an.b(b);
      return $$0.b() ? new cng(cnj.uq) : $$0;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
