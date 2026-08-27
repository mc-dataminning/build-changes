import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ccc extends cch implements cce {
   private static final aec<cja> b = aef.a(ccc.class, aee.h);
   private static final aec<OptionalInt> c = aef.a(ccc.class, aee.u);
   private static final aec<Boolean> d = aef.a(ccc.class, aee.k);
   private int e;
   private int f;
   @Nullable
   private bjb g;

   public ccc(bip<? extends ccc> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public ccc(cpq $$0, double $$1, double $$2, double $$3, cja $$4) {
      super(bip.M, $$0);
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

   public ccc(cpq $$0, @Nullable bil $$1, double $$2, double $$3, double $$4, cja $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public ccc(cpq $$0, cja $$1, bjb $$2) {
      this($$0, $$2, $$2.dp(), $$2.dr(), $$2.dv(), $$1);
      this.an.b(c, OptionalInt.of($$2.ah()));
      this.g = $$2;
   }

   public ccc(cpq $$0, cja $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.b(d, $$5);
   }

   public ccc(cpq $$0, cja $$1, bil $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void a_() {
      this.an.a(b, cja.b);
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
               bil $$1x = this.dK().a($$0x);
               if ($$1x instanceof bjb) {
                  this.g = (bjb)$$1x;
               }
            });
         }

         if (this.g != null) {
            ehi $$4;
            if (this.g.fu()) {
               ehi $$0 = this.g.bE();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ehi $$3 = this.g.dn();
               this.g.f($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cjd.tA);
            } else {
               $$4 = ehi.b;
            }

            this.e(this.g.dp() + $$4.c, this.g.dr() + $$4.d, this.g.dv() + $$4.e);
            this.f(this.g.dn());
         }
      } else {
         if (!this.m()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.f(this.dn().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         ehi $$7 = this.dn();
         this.a(bjh.a, $$7);
         this.f($$7);
      }

      ehg $$8 = cci.a(this, this::a);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.B();
      if (this.e == 0 && !this.aS()) {
         this.dK().a(null, this.dp(), this.dr(), this.dv(), aoz.hI, apa.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dK().B && this.e % 2 < 2) {
         this.dK().a(ix.A, this.dp(), this.dr(), this.dv(), this.ag.k() * 0.05, -this.dn().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dK().B && this.e > this.f) {
         this.o();
      }
   }

   private void o() {
      this.dK().a(this, (byte)17);
      this.a(djo.w, this.v());
      this.q();
      this.ak();
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.o();
      }
   }

   @Override
   protected void a(ehe $$0) {
      gw $$1 = new gw($$0.a());
      this.dK().a_($$1).a(this.dK(), $$1, this);
      if (!this.dK().r_() && this.p()) {
         this.o();
      }

      super.a($$0);
   }

   private boolean p() {
      cja $$0 = this.an.b(b);
      qu $$1 = $$0.b() ? null : $$0.b("Fireworks");
      ra $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void q() {
      float $$0 = 0.0F;
      cja $$1 = this.an.b(b);
      qu $$2 = $$1.b() ? null : $$1.b("Fireworks");
      ra $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dL().a(this, this.v()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         ehi $$5 = this.di();

         for (bjb $$7 : this.dK().a(bjb.class, this.cG().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  ehi $$10 = new ehi($$7.dp(), $$7.e(0.5 * (double)$$9), $$7.dv());
                  ehg $$11 = this.dK().a(new coz($$5, $$10, coz.a.a, coz.b.a, this));
                  if ($$11.c() == ehg.a.a) {
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
               this.dK().a(ix.W, this.dp(), this.dr(), this.dv(), this.ag.k() * 0.05, 0.005, this.ag.k() * 0.05);
            }
         } else {
            cja $$2 = this.an.b(b);
            qu $$3 = $$2.b() ? null : $$2.b("Fireworks");
            ehi $$4 = this.dn();
            this.dK().a(this.dp(), this.dr(), this.dv(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      cja $$1 = this.an.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new qu()));
      }

      $$0.a("ShotAtAngle", this.an.b(d));
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      cja $$1 = cja.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.an.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public cja j() {
      cja $$0 = this.an.b(b);
      return $$0.b() ? new cja(cjd.tA) : $$0;
   }

   @Override
   public boolean cp() {
      return false;
   }
}
