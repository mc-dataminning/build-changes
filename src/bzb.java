import java.util.OptionalInt;
import javax.annotation.Nullable;

public class bzb extends bzg implements bzd {
   private static final aby<cfz> b = acb.a(bzb.class, aca.h);
   private static final aby<OptionalInt> c = acb.a(bzb.class, aca.u);
   private static final aby<Boolean> d = acb.a(bzb.class, aca.k);
   private int e;
   private int f;
   @Nullable
   private bfz g;

   public bzb(bfn<? extends bzb> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bzb(cmm $$0, double $$1, double $$2, double $$3, cfz $$4) {
      super(bfn.M, $$0);
      this.e = 0;
      this.e($$1, $$2, $$3);
      int $$5 = 1;
      if (!$$4.b() && $$4.u()) {
         this.am.b(b, $$4.p());
         $$5 += $$4.a("Fireworks").f("Flight");
      }

      this.o(this.af.a(0.0, 0.002297), 0.05, this.af.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.af.a(6) + this.af.a(7);
   }

   public bzb(cmm $$0, @Nullable bfj $$1, double $$2, double $$3, double $$4, cfz $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public bzb(cmm $$0, cfz $$1, bfz $$2) {
      this($$0, $$2, $$2.dn(), $$2.dp(), $$2.dt(), $$1);
      this.am.b(c, OptionalInt.of($$2.af()));
      this.g = $$2;
   }

   public bzb(cmm $$0, cfz $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.am.b(d, $$5);
   }

   public bzb(cmm $$0, cfz $$1, bfj $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void a_() {
      this.am.a(b, cfz.b);
      this.am.a(c, OptionalInt.empty());
      this.am.a(d, false);
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
            this.am.b(c).ifPresent($$0x -> {
               bfj $$1x = this.dI().a($$0x);
               if ($$1x instanceof bfz) {
                  this.g = (bfz)$$1x;
               }
            });
         }

         if (this.g != null) {
            eei $$4;
            if (this.g.fr()) {
               eei $$0 = this.g.bD();
               double $$1 = 1.5;
               double $$2 = 0.1;
               eei $$3 = this.g.dl();
               this.g.f($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cgc.tA);
            } else {
               $$4 = eei.b;
            }

            this.e(this.g.dn() + $$4.c, this.g.dp() + $$4.d, this.g.dt() + $$4.e);
            this.f(this.g.dl());
         }
      } else {
         if (!this.k()) {
            double $$6 = this.O ? 1.0 : 1.15;
            this.f(this.dl().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         eei $$7 = this.dl();
         this.a(bgf.a, $$7);
         this.f($$7);
      }

      eeg $$8 = bzh.a(this, this::a);
      if (!this.ae) {
         this.a($$8);
         this.at = true;
      }

      this.C();
      if (this.e == 0 && !this.aQ()) {
         this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.hI, ami.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dI().B && this.e % 2 < 2) {
         this.dI().a(iv.A, this.dn(), this.dp(), this.dt(), this.af.k() * 0.05, -this.dl().d * 0.5, this.af.k() * 0.05);
      }

      if (!this.dI().B && this.e > this.f) {
         this.o();
      }
   }

   private void o() {
      this.dI().a(this, (byte)17);
      this.a(dgl.x, this.v());
      this.q();
      this.ai();
   }

   @Override
   protected void a(eef $$0) {
      super.a($$0);
      if (!this.dI().B) {
         this.o();
      }
   }

   @Override
   protected void a(eee $$0) {
      gu $$1 = new gu($$0.a());
      this.dI().a_($$1).a(this.dI(), $$1, this);
      if (!this.dI().r_() && this.p()) {
         this.o();
      }

      super.a($$0);
   }

   private boolean p() {
      cfz $$0 = this.am.b(b);
      qr $$1 = $$0.b() ? null : $$0.b("Fireworks");
      qx $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void q() {
      float $$0 = 0.0F;
      cfz $$1 = this.am.b(b);
      qr $$2 = $$1.b() ? null : $$1.b("Fireworks");
      qx $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dJ().a(this, this.v()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         eei $$5 = this.dg();

         for (bfz $$7 : this.dI().a(bfz.class, this.cE().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  eei $$10 = new eei($$7.dn(), $$7.e(0.5 * (double)$$9), $$7.dt());
                  eeg $$11 = this.dI().a(new clv($$5, $$10, clv.a.a, clv.b.a, this));
                  if ($$11.c() == eeg.a.a) {
                     $$8 = true;
                     break;
                  }
               }

               if ($$8) {
                  float $$12 = $$0 * (float)Math.sqrt((5.0 - (double)this.e($$7)) / 5.0);
                  $$7.a(this.dJ().a(this, this.v()), $$12);
               }
            }
         }
      }
   }

   private boolean r() {
      return this.am.b(c).isPresent();
   }

   @Override
   public boolean k() {
      return this.am.b(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dI().B) {
         if (!this.p()) {
            for (int $$1 = 0; $$1 < this.af.a(3) + 2; $$1++) {
               this.dI().a(iv.W, this.dn(), this.dp(), this.dt(), this.af.k() * 0.05, 0.005, this.af.k() * 0.05);
            }
         } else {
            cfz $$2 = this.am.b(b);
            qr $$3 = $$2.b() ? null : $$2.b("Fireworks");
            eei $$4 = this.dl();
            this.dI().a(this.dn(), this.dp(), this.dt(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      cfz $$1 = this.am.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new qr()));
      }

      $$0.a("ShotAtAngle", this.am.b(d));
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      cfz $$1 = cfz.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.am.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.am.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public cfz j() {
      cfz $$0 = this.am.b(b);
      return $$0.b() ? new cfz(cgc.tA) : $$0;
   }

   @Override
   public boolean cn() {
      return false;
   }
}
