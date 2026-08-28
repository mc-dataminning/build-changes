import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cnk extends cnp implements cnm {
   private static final ajw<cuq> b = aka.a(cnk.class, ajy.h);
   private static final ajw<OptionalInt> c = aka.a(cnk.class, ajy.v);
   private static final ajw<Boolean> d = aka.a(cnk.class, ajy.k);
   private int e;
   private int f;
   @Nullable
   private btn g;

   public cnk(bsx<? extends cnk> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cnk(dcw $$0, double $$1, double $$2, double $$3, cuq $$4) {
      super(bsx.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.ao.a(b, $$4.s());
      int $$5 = 1;
      cxm $$6 = $$4.a(kq.V);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ah.a(0.0, 0.002297), 0.05, this.ah.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ah.a(6) + this.ah.a(7);
   }

   public cnk(dcw $$0, @Nullable bsr $$1, double $$2, double $$3, double $$4, cuq $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cnk(dcw $$0, cuq $$1, btn $$2) {
      this($$0, $$2, $$2.dt(), $$2.dv(), $$2.dz(), $$1);
      this.ao.a(c, OptionalInt.of($$2.an()));
      this.g = $$2;
   }

   public cnk(dcw $$0, cuq $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.ao.a(d, $$5);
   }

   public cnk(dcw $$0, cuq $$1, bsr $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(aka.a $$0) {
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
               bsr $$1x = this.dO().a($$0x);
               if ($$1x instanceof btn) {
                  this.g = (btn)$$1x;
               }
            });
         }

         if (this.g != null) {
            exc $$4;
            if (this.g.fA()) {
               exc $$0 = this.g.bM();
               double $$1 = 1.5;
               double $$2 = 0.1;
               exc $$3 = this.g.dr();
               this.g.i($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cut.uu);
            } else {
               $$4 = exc.b;
            }

            this.a_(this.g.dt() + $$4.c, this.g.dv() + $$4.d, this.g.dz() + $$4.e);
            this.i(this.g.dr());
         }
      } else {
         if (!this.t()) {
            double $$6 = this.Q ? 1.0 : 1.15;
            this.i(this.dr().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         exc $$7 = this.dr();
         this.a(bts.a, $$7);
         this.i($$7);
      }

      exa $$8 = cnr.a(this, this::b);
      if (!this.ag) {
         this.b($$8);
         this.av = true;
      }

      this.I();
      if (this.e == 0 && !this.aX()) {
         this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.iP, avq.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dO().B && this.e % 2 < 2) {
         this.dO().a(lm.D, this.dt(), this.dv(), this.dz(), this.ah.k() * 0.05, -this.dr().d * 0.5, this.ah.k() * 0.05);
      }

      if (!this.dO().B && this.e > this.f) {
         this.v();
      }
   }

   private void v() {
      this.dO().a(this, (byte)17);
      this.a(dxz.w, this.s());
      this.x();
      this.aq();
   }

   @Override
   protected void a(ewz $$0) {
      super.a($$0);
      if (!this.dO().B) {
         this.v();
      }
   }

   @Override
   protected void a(ewy $$0) {
      jd $$1 = new jd($$0.a());
      this.dO().a_($$1).a(this.dO(), $$1, this);
      if (!this.dO().x_() && this.w()) {
         this.v();
      }

      super.a($$0);
   }

   private boolean w() {
      return !this.z().isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      List<cxl> $$1 = this.z();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dP().a(this, this.s()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         exc $$3 = this.dm();

         for (btn $$5 : this.dO().a(btn.class, this.cK().g(5.0))) {
            if ($$5 != this.g && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  exc $$8 = new exc($$5.dt(), $$5.e(0.5 * (double)$$7), $$5.dz());
                  exa $$9 = this.dO().a(new dcf($$3, $$8, dcf.a.a, dcf.b.a, this));
                  if ($$9.c() == exa.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dP().a(this, this.s()), $$10);
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
      if ($$0 == 17 && this.dO().B) {
         exc $$1 = this.dr();
         this.dO().a(this.dt(), this.dv(), this.dz(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      $$0.a("FireworksItem", this.p().a(this.dQ()));
      $$0.a("ShotAtAngle", this.ao.a(d));
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.ao.a(b, cuq.a(this.dQ(), (uy)$$0.p("FireworksItem")).orElseGet(cnk::A));
      } else {
         this.ao.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.ao.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cxl> z() {
      cuq $$0 = this.ao.a(b);
      cxm $$1 = $$0.a(kq.V);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cuq p() {
      return this.ao.a(b);
   }

   @Override
   public boolean cu() {
      return false;
   }

   private static cuq A() {
      return new cuq(cut.uu);
   }

   @Override
   public DoubleDoubleImmutablePair a_(btn $$0, brk $$1) {
      double $$2 = $$0.dm().c - this.dm().c;
      double $$3 = $$0.dm().e - this.dm().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
