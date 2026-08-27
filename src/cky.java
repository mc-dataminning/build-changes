import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cky extends cld implements cla {
   private static final ajk<csd> b = ajo.a(cky.class, ajm.h);
   private static final ajk<OptionalInt> c = ajo.a(cky.class, ajm.v);
   private static final ajk<Boolean> d = ajo.a(cky.class, ajm.k);
   private int e;
   private int g;
   @Nullable
   private bre h;

   public cky(bqr<? extends cky> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cky(czu $$0, double $$1, double $$2, double $$3, csd $$4) {
      super(bqr.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.ao.a(b, $$4.r());
      int $$5 = 1;
      cuv $$6 = $$4.a(jz.K);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.o(this.ah.a(0.0, 0.002297), 0.05, this.ah.a(0.0, 0.002297));
      this.g = 10 * $$5 + this.ah.a(6) + this.ah.a(7);
   }

   public cky(czu $$0, @Nullable bql $$1, double $$2, double $$3, double $$4, csd $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cky(czu $$0, csd $$1, bre $$2) {
      this($$0, $$2, $$2.ds(), $$2.du(), $$2.dy(), $$1);
      this.ao.a(c, OptionalInt.of($$2.aj()));
      this.h = $$2;
   }

   public cky(czu $$0, csd $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.ao.a(d, $$5);
   }

   public cky(czu $$0, csd $$1, bql $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(ajo.a $$0) {
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
         if (this.h == null) {
            this.ao.a(c).ifPresent($$0x -> {
               bql $$1x = this.dN().a($$0x);
               if ($$1x instanceof bre) {
                  this.h = (bre)$$1x;
               }
            });
         }

         if (this.h != null) {
            etf $$4;
            if (this.h.fC()) {
               etf $$0 = this.h.bJ();
               double $$1 = 1.5;
               double $$2 = 0.1;
               etf $$3 = this.h.dq();
               this.h.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.h.a(csg.uu);
            } else {
               $$4 = etf.b;
            }

            this.a_(this.h.ds() + $$4.c, this.h.du() + $$4.d, this.h.dy() + $$4.e);
            this.g(this.h.dq());
         }
      } else {
         if (!this.r()) {
            double $$6 = this.Q ? 1.0 : 1.15;
            this.g(this.dq().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         etf $$7 = this.dq();
         this.a(brj.a, $$7);
         this.g($$7);
      }

      etd $$8 = clf.a(this, this::b);
      if (!this.ag) {
         this.a($$8);
         this.av = true;
      }

      this.J();
      if (this.e == 0 && !this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), auz.iK, ava.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dN().B && this.e % 2 < 2) {
         this.dN().a(kw.C, this.ds(), this.du(), this.dy(), this.ah.k() * 0.05, -this.dq().d * 0.5, this.ah.k() * 0.05);
      }

      if (!this.dN().B && this.e > this.g) {
         this.v();
      }
   }

   private void v() {
      this.dN().a(this, (byte)17);
      this.a(dur.w, this.u());
      this.x();
      this.am();
   }

   @Override
   protected void a(etc $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.v();
      }
   }

   @Override
   protected void a(etb $$0) {
      im $$1 = new im($$0.a());
      this.dN().a_($$1).a(this.dN(), $$1, this);
      if (!this.dN().x_() && this.w()) {
         this.v();
      }

      super.a($$0);
   }

   private boolean w() {
      return !this.z().isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      List<cuu> $$1 = this.z();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.h != null) {
            this.h.a(this.dO().a(this, this.u()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         etf $$3 = this.dl();

         for (bre $$5 : this.dN().a(bre.class, this.cI().g(5.0))) {
            if ($$5 != this.h && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  etf $$8 = new etf($$5.ds(), $$5.e(0.5 * (double)$$7), $$5.dy());
                  etd $$9 = this.dN().a(new czd($$3, $$8, czd.a.a, czd.b.a, this));
                  if ($$9.c() == etd.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dO().a(this, this.u()), $$10);
               }
            }
         }
      }
   }

   private boolean y() {
      return this.ao.a(c).isPresent();
   }

   @Override
   public boolean r() {
      return this.ao.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dN().B) {
         etf $$1 = this.dq();
         this.dN().a(this.ds(), this.du(), this.dy(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.g);
      $$0.a("FireworksItem", this.p().a(this.dP()));
      $$0.a("ShotAtAngle", this.ao.a(d));
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.g = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.ao.a(b, csd.a(this.dP(), (uv)$$0.p("FireworksItem")).orElseGet(cky::A));
      } else {
         this.ao.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.ao.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cuu> z() {
      csd $$0 = this.ao.a(b);
      cuv $$1 = $$0.a(jz.K);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public csd p() {
      return this.ao.a(b);
   }

   @Override
   public boolean cr() {
      return false;
   }

   private static csd A() {
      return new csd(csg.uu);
   }
}
