import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cmy extends cnd implements cna {
   private static final ajp<cud> b = ajt.a(cmy.class, ajr.h);
   private static final ajp<OptionalInt> c = ajt.a(cmy.class, ajr.v);
   private static final ajp<Boolean> d = ajt.a(cmy.class, ajr.k);
   private int e;
   private int f;
   @Nullable
   private btc g;

   public cmy(bsn<? extends cmy> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cmy(dcg $$0, double $$1, double $$2, double $$3, cud $$4) {
      super(bsn.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.ao.a(b, $$4.s());
      int $$5 = 1;
      cww $$6 = $$4.a(kn.U);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.o(this.ah.a(0.0, 0.002297), 0.05, this.ah.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ah.a(6) + this.ah.a(7);
   }

   public cmy(dcg $$0, @Nullable bsh $$1, double $$2, double $$3, double $$4, cud $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cmy(dcg $$0, cud $$1, btc $$2) {
      this($$0, $$2, $$2.dw(), $$2.dy(), $$2.dC(), $$1);
      this.ao.a(c, OptionalInt.of($$2.an()));
      this.g = $$2;
   }

   public cmy(dcg $$0, cud $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.ao.a(d, $$5);
   }

   public cmy(dcg $$0, cud $$1, bsh $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(b, A());
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
         if (this.g == null) {
            this.ao.a(c).ifPresent($$0x -> {
               bsh $$1x = this.dR().a($$0x);
               if ($$1x instanceof btc) {
                  this.g = (btc)$$1x;
               }
            });
         }

         if (this.g != null) {
            ewh $$4;
            if (this.g.fC()) {
               ewh $$0 = this.g.bN();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ewh $$3 = this.g.du();
               this.g.j($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cug.uu);
            } else {
               $$4 = ewh.b;
            }

            this.a_(this.g.dw() + $$4.c, this.g.dy() + $$4.d, this.g.dC() + $$4.e);
            this.j(this.g.du());
         }
      } else {
         if (!this.t()) {
            double $$6 = this.Q ? 1.0 : 1.15;
            this.j(this.du().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         ewh $$7 = this.du();
         this.a(bth.a, $$7);
         this.j($$7);
      }

      ewf $$8 = cnf.a(this, this::b);
      if (!this.ag) {
         this.b($$8);
         this.av = true;
      }

      this.J();
      if (this.e == 0 && !this.aY()) {
         this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.iP, avi.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dR().B && this.e % 2 < 2) {
         this.dR().a(lj.D, this.dw(), this.dy(), this.dC(), this.ah.k() * 0.05, -this.du().d * 0.5, this.ah.k() * 0.05);
      }

      if (!this.dR().B && this.e > this.f) {
         this.v();
      }
   }

   private void v() {
      this.dR().a(this, (byte)17);
      this.a(dxh.w, this.s());
      this.x();
      this.aq();
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      if (!this.dR().B) {
         this.v();
      }
   }

   @Override
   protected void a(ewd $$0) {
      ja $$1 = new ja($$0.a());
      this.dR().a_($$1).a(this.dR(), $$1, this);
      if (!this.dR().x_() && this.w()) {
         this.v();
      }

      super.a($$0);
   }

   private boolean w() {
      return !this.z().isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      List<cwv> $$1 = this.z();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dS().a(this, this.s()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         ewh $$3 = this.dp();

         for (btc $$5 : this.dR().a(btc.class, this.cM().g(5.0))) {
            if ($$5 != this.g && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  ewh $$8 = new ewh($$5.dw(), $$5.e(0.5 * (double)$$7), $$5.dC());
                  ewf $$9 = this.dR().a(new dbp($$3, $$8, dbp.a.a, dbp.b.a, this));
                  if ($$9.c() == ewf.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dS().a(this, this.s()), $$10);
               }
            }
         }
      }
   }

   private boolean y() {
      return this.ao.a(c).isPresent();
   }

   @Override
   public boolean t() {
      return this.ao.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dR().B) {
         ewh $$1 = this.du();
         this.dR().a(this.dw(), this.dy(), this.dC(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      $$0.a("FireworksItem", this.p().a(this.dT()));
      $$0.a("ShotAtAngle", this.ao.a(d));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.ao.a(b, cud.a(this.dT(), (uu)$$0.p("FireworksItem")).orElseGet(cmy::A));
      } else {
         this.ao.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.ao.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cwv> z() {
      cud $$0 = this.ao.a(b);
      cww $$1 = $$0.a(kn.U);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cud p() {
      return this.ao.a(b);
   }

   @Override
   public boolean cv() {
      return false;
   }

   private static cud A() {
      return new cud(cug.uu);
   }

   @Override
   public DoubleDoubleImmutablePair a_(btc $$0, bra $$1) {
      double $$2 = $$0.dp().c - this.dp().c;
      double $$3 = $$0.dp().e - this.dp().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
