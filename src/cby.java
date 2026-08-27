import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cby extends ccd implements cca {
   private static final adx<ciw> b = aea.a(cby.class, adz.h);
   private static final adx<OptionalInt> c = aea.a(cby.class, adz.u);
   private static final adx<Boolean> d = aea.a(cby.class, adz.k);
   private int e;
   private int f;
   @Nullable
   private biw g;

   public cby(bik<? extends cby> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cby(cpk $$0, double $$1, double $$2, double $$3, ciw $$4) {
      super(bik.M, $$0);
      this.e = 0;
      this.e($$1, $$2, $$3);
      int $$5 = 1;
      if (!$$4.b() && $$4.u()) {
         this.an.b(b, $$4.p());
         $$5 += $$4.a("Fireworks").f("Flight");
      }

      this.o(this.ag.a(0.0, 0.002297), 0.05, this.ag.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ag.a(6) + this.ag.a(7);
   }

   public cby(cpk $$0, @Nullable big $$1, double $$2, double $$3, double $$4, ciw $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public cby(cpk $$0, ciw $$1, biw $$2) {
      this($$0, $$2, $$2.dp(), $$2.dr(), $$2.dv(), $$1);
      this.an.b(c, OptionalInt.of($$2.ah()));
      this.g = $$2;
   }

   public cby(cpk $$0, ciw $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.b(d, $$5);
   }

   public cby(cpk $$0, ciw $$1, big $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void a_() {
      this.an.a(b, ciw.b);
      this.an.a(c, OptionalInt.empty());
      this.an.a(d, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.r();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.r();
   }

   @Override
   public void l() {
      super.l();
      if (this.r()) {
         if (this.g == null) {
            this.an.b(c).ifPresent($$0x -> {
               big $$1x = this.dK().a($$0x);
               if ($$1x instanceof biw) {
                  this.g = (biw)$$1x;
               }
            });
         }

         if (this.g != null) {
            ehf $$4;
            if (this.g.fu()) {
               ehf $$0 = this.g.bE();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ehf $$3 = this.g.dn();
               this.g.f($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(ciz.tA);
            } else {
               $$4 = ehf.b;
            }

            this.e(this.g.dp() + $$4.c, this.g.dr() + $$4.d, this.g.dv() + $$4.e);
            this.f(this.g.dn());
         }
      } else {
         if (!this.m()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.f(this.dn().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         ehf $$7 = this.dn();
         this.a(bjc.a, $$7);
         this.f($$7);
      }

      ehd $$8 = cce.a(this, this::a);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.B();
      if (this.e == 0 && !this.aS()) {
         this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.hI, aov.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dK().B && this.e % 2 < 2) {
         this.dK().a(iw.A, this.dp(), this.dr(), this.dv(), this.ag.k() * 0.05, -this.dn().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dK().B && this.e > this.f) {
         this.o();
      }
   }

   private void o() {
      this.dK().a(this, (byte)17);
      this.a(dji.w, this.v());
      this.q();
      this.ak();
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.o();
      }
   }

   @Override
   protected void a(ehb $$0) {
      gv $$1 = new gv($$0.a());
      this.dK().a_($$1).a(this.dK(), $$1, this);
      if (!this.dK().r_() && this.p()) {
         this.o();
      }

      super.a($$0);
   }

   private boolean p() {
      ciw $$0 = this.an.b(b);
      qs $$1 = $$0.b() ? null : $$0.b("Fireworks");
      qy $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void q() {
      float $$0 = 0.0F;
      ciw $$1 = this.an.b(b);
      qs $$2 = $$1.b() ? null : $$1.b("Fireworks");
      qy $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dL().a(this, this.v()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         ehf $$5 = this.di();

         for (biw $$7 : this.dK().a(biw.class, this.cG().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  ehf $$10 = new ehf($$7.dp(), $$7.e(0.5 * (double)$$9), $$7.dv());
                  ehd $$11 = this.dK().a(new cot($$5, $$10, cot.a.a, cot.b.a, this));
                  if ($$11.c() == ehd.a.a) {
                     $$8 = true;
                     break;
                  }
               }

               if ($$8) {
                  float $$12 = $$0 * (float)Math.sqrt((5.0 - (double)this.e($$7)) / 5.0);
                  $$7.a(this.dL().a(this, this.v()), $$12);
               }
            }
         }
      }
   }

   private boolean r() {
      return this.an.b(c).isPresent();
   }

   @Override
   public boolean m() {
      return this.an.b(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dK().B) {
         if (!this.p()) {
            for (int $$1 = 0; $$1 < this.ag.a(3) + 2; $$1++) {
               this.dK().a(iw.W, this.dp(), this.dr(), this.dv(), this.ag.k() * 0.05, 0.005, this.ag.k() * 0.05);
            }
         } else {
            ciw $$2 = this.an.b(b);
            qs $$3 = $$2.b() ? null : $$2.b("Fireworks");
            ehf $$4 = this.dn();
            this.dK().a(this.dp(), this.dr(), this.dv(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      ciw $$1 = this.an.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new qs()));
      }

      $$0.a("ShotAtAngle", this.an.b(d));
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      ciw $$1 = ciw.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.an.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public ciw j() {
      ciw $$0 = this.an.b(b);
      return $$0.b() ? new ciw(ciz.tA) : $$0;
   }

   @Override
   public boolean cp() {
      return false;
   }
}
