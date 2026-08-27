import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cin extends cis implements cip {
   private static final aii<cpq> b = ail.a(cin.class, aik.h);
   private static final aii<OptionalInt> c = ail.a(cin.class, aik.u);
   private static final aii<Boolean> d = ail.a(cin.class, aik.k);
   private int e;
   private int g;
   @Nullable
   private box h;

   public cin(bol<? extends cin> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cin(cwe $$0, double $$1, double $$2, double $$3, cpq $$4) {
      super(bol.O, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.am.b(b, $$4.q());
      int $$5 = 1;
      if (!$$4.b() && $$4.v()) {
         $$5 += $$4.b("Fireworks").f("Flight");
      }

      this.o(this.af.a(0.0, 0.002297), 0.05, this.af.a(0.0, 0.002297));
      this.g = 10 * $$5 + this.af.a(6) + this.af.a(7);
   }

   public cin(cwe $$0, @Nullable bof $$1, double $$2, double $$3, double $$4, cpq $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public cin(cwe $$0, cpq $$1, box $$2) {
      this($$0, $$2, $$2.do(), $$2.dq(), $$2.du(), $$1);
      this.am.b(c, OptionalInt.of($$2.aj()));
      this.h = $$2;
   }

   public cin(cwe $$0, cpq $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.am.b(d, $$5);
   }

   public cin(cwe $$0, cpq $$1, bof $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void c_() {
      this.am.a(b, new cpq(cpt.uq));
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
               bof $$1x = this.dJ().a($$0x);
               if ($$1x instanceof box) {
                  this.h = (box)$$1x;
               }
            });
         }

         if (this.h != null) {
            eov $$4;
            if (this.h.fy()) {
               eov $$0 = this.h.bF();
               double $$1 = 1.5;
               double $$2 = 0.1;
               eov $$3 = this.h.dm();
               this.h.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.h.a(cpt.uq);
            } else {
               $$4 = eov.b;
            }

            this.a_(this.h.do() + $$4.c, this.h.dq() + $$4.d, this.h.du() + $$4.e);
            this.g(this.h.dm());
         }
      } else {
         if (!this.s()) {
            double $$6 = this.O ? 1.0 : 1.15;
            this.g(this.dm().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         eov $$7 = this.dm();
         this.a(bpc.a, $$7);
         this.g($$7);
      }

      eot $$8 = ciu.a(this, this::a);
      if (!this.ae) {
         this.a($$8);
         this.at = true;
      }

      this.J();
      if (this.e == 0 && !this.aU()) {
         this.dJ().a(null, this.do(), this.dq(), this.du(), atp.iB, atq.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dJ().B && this.e % 2 < 2) {
         this.dJ().a(kb.C, this.do(), this.dq(), this.du(), this.af.k() * 0.05, -this.dm().d * 0.5, this.af.k() * 0.05);
      }

      if (!this.dJ().B && this.e > this.g) {
         this.u();
      }
   }

   private void u() {
      this.dJ().a(this, (byte)17);
      this.a(dqr.w, this.w());
      this.y();
      this.am();
   }

   @Override
   protected void a(eos $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         this.u();
      }
   }

   @Override
   protected void a(eor $$0) {
      ib $$1 = new ib($$0.a());
      this.dJ().a_($$1).a(this.dJ(), $$1, this);
      if (!this.dJ().y_() && this.x()) {
         this.u();
      }

      super.a($$0);
   }

   private boolean x() {
      cpq $$0 = this.am.b(b);
      sy $$1 = $$0.b() ? null : $$0.c("Fireworks");
      te $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void y() {
      float $$0 = 0.0F;
      cpq $$1 = this.am.b(b);
      sy $$2 = $$1.b() ? null : $$1.c("Fireworks");
      te $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.h != null) {
            this.h.a(this.dK().a(this, this.w()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         eov $$5 = this.dh();

         for (box $$7 : this.dJ().a(box.class, this.cE().g(5.0))) {
            if ($$7 != this.h && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  eov $$10 = new eov($$7.do(), $$7.e(0.5 * (double)$$9), $$7.du());
                  eot $$11 = this.dJ().a(new cvn($$5, $$10, cvn.a.a, cvn.b.a, this));
                  if ($$11.c() == eot.a.a) {
                     $$8 = true;
                     break;
                  }
               }

               if ($$8) {
                  float $$12 = $$0 * (float)Math.sqrt((5.0 - (double)this.e($$7)) / 5.0);
                  $$7.a(this.dK().a(this, this.w()), $$12);
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
      if ($$0 == 17 && this.dJ().B) {
         if (!this.x()) {
            for (int $$1 = 0; $$1 < this.af.a(3) + 2; $$1++) {
               this.dJ().a(kb.Y, this.do(), this.dq(), this.du(), this.af.k() * 0.05, 0.005, this.af.k() * 0.05);
            }
         } else {
            cpq $$2 = this.am.b(b);
            sy $$3 = $$2.b() ? null : $$2.c("Fireworks");
            eov $$4 = this.dm();
            this.dJ().a(this.do(), this.dq(), this.du(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.g);
      $$0.a("FireworksItem", this.q().b(new sy()));
      $$0.a("ShotAtAngle", this.am.b(d));
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.g = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         cpq $$1 = cpq.a($$0.p("FireworksItem"));
         if (!$$1.b()) {
            this.am.b(b, $$1);
         }
      }

      if ($$0.e("ShotAtAngle")) {
         this.am.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public cpq q() {
      return this.am.b(b);
   }

   @Override
   public boolean cn() {
      return false;
   }
}
