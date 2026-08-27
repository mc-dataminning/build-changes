import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cca extends ccf implements ccc {
   private static final adz<ciy> b = aec.a(cca.class, aeb.h);
   private static final adz<OptionalInt> c = aec.a(cca.class, aeb.u);
   private static final adz<Boolean> d = aec.a(cca.class, aeb.k);
   private int e;
   private int f;
   @Nullable
   private biy g;

   public cca(bim<? extends cca> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public cca(cpm $$0, double $$1, double $$2, double $$3, ciy $$4) {
      super(bim.M, $$0);
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

   public cca(cpm $$0, @Nullable bii $$1, double $$2, double $$3, double $$4, ciy $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public cca(cpm $$0, ciy $$1, biy $$2) {
      this($$0, $$2, $$2.dp(), $$2.dr(), $$2.dv(), $$1);
      this.an.b(c, OptionalInt.of($$2.ah()));
      this.g = $$2;
   }

   public cca(cpm $$0, ciy $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.b(d, $$5);
   }

   public cca(cpm $$0, ciy $$1, bii $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void a_() {
      this.an.a(b, ciy.b);
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
               bii $$1x = this.dK().a($$0x);
               if ($$1x instanceof biy) {
                  this.g = (biy)$$1x;
               }
            });
         }

         if (this.g != null) {
            ehe $$4;
            if (this.g.fu()) {
               ehe $$0 = this.g.bE();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ehe $$3 = this.g.dn();
               this.g.f($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cjb.tA);
            } else {
               $$4 = ehe.b;
            }

            this.e(this.g.dp() + $$4.c, this.g.dr() + $$4.d, this.g.dv() + $$4.e);
            this.f(this.g.dn());
         }
      } else {
         if (!this.m()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.f(this.dn().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         ehe $$7 = this.dn();
         this.a(bje.a, $$7);
         this.f($$7);
      }

      ehc $$8 = ccg.a(this, this::a);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.B();
      if (this.e == 0 && !this.aS()) {
         this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.hI, aox.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dK().B && this.e % 2 < 2) {
         this.dK().a(iv.A, this.dp(), this.dr(), this.dv(), this.ag.k() * 0.05, -this.dn().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dK().B && this.e > this.f) {
         this.o();
      }
   }

   private void o() {
      this.dK().a(this, (byte)17);
      this.a(djk.w, this.v());
      this.q();
      this.ak();
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.o();
      }
   }

   @Override
   protected void a(eha $$0) {
      gu $$1 = new gu($$0.a());
      this.dK().a_($$1).a(this.dK(), $$1, this);
      if (!this.dK().r_() && this.p()) {
         this.o();
      }

      super.a($$0);
   }

   private boolean p() {
      ciy $$0 = this.an.b(b);
      qr $$1 = $$0.b() ? null : $$0.b("Fireworks");
      qx $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void q() {
      float $$0 = 0.0F;
      ciy $$1 = this.an.b(b);
      qr $$2 = $$1.b() ? null : $$1.b("Fireworks");
      qx $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dL().a(this, this.v()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         ehe $$5 = this.di();

         for (biy $$7 : this.dK().a(biy.class, this.cG().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  ehe $$10 = new ehe($$7.dp(), $$7.e(0.5 * (double)$$9), $$7.dv());
                  ehc $$11 = this.dK().a(new cov($$5, $$10, cov.a.a, cov.b.a, this));
                  if ($$11.c() == ehc.a.a) {
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
               this.dK().a(iv.W, this.dp(), this.dr(), this.dv(), this.ag.k() * 0.05, 0.005, this.ag.k() * 0.05);
            }
         } else {
            ciy $$2 = this.an.b(b);
            qr $$3 = $$2.b() ? null : $$2.b("Fireworks");
            ehe $$4 = this.dn();
            this.dK().a(this.dp(), this.dr(), this.dv(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      ciy $$1 = this.an.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new qr()));
      }

      $$0.a("ShotAtAngle", this.an.b(d));
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      ciy $$1 = ciy.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.an.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public ciy j() {
      ciy $$0 = this.an.b(b);
      return $$0.b() ? new ciy(cjb.tA) : $$0;
   }

   @Override
   public boolean cp() {
      return false;
   }
}
