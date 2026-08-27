import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cig extends cid {
   private static final double b = 0.15;
   @Nullable
   private bnq c;
   @Nullable
   private ie d;
   private int e;
   private double g;
   private double h;
   private double i;
   @Nullable
   private UUID j;

   public cig(bnw<? extends cig> $$0, cvr $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public cig(cvr $$0, boi $$1, bnq $$2, ie.a $$3) {
      this(bnw.aJ, $$0);
      this.b($$1);
      hz $$4 = $$1.dm();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dC(), this.dE());
      this.c = $$2;
      this.d = ie.b;
      this.a($$3);
   }

   @Override
   public atm db() {
      return atm.f;
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cw());
      }

      if (this.d != null) {
         $$0.a("Dir", this.d.d());
      }

      $$0.a("Steps", this.e);
      $$0.a("TXD", this.g);
      $$0.a("TYD", this.h);
      $$0.a("TZD", this.i);
   }

   @Override
   protected void a(sw $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.g = $$0.k("TXD");
      this.h = $$0.k("TYD");
      this.i = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = ie.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.j = $$0.a("Target");
      }
   }

   @Override
   protected void c_() {
   }

   @Nullable
   private ie q() {
      return this.d;
   }

   private void a(@Nullable ie $$0) {
      this.d = $$0;
   }

   private void a(@Nullable ie.a $$0) {
      double $$1 = 0.5;
      hz $$2;
      if (this.c == null) {
         $$2 = this.dm().d();
      } else {
         $$1 = (double)this.c.dh() * 0.5;
         $$2 = hz.a(this.c.dr(), this.c.dt() + $$1, this.c.dx());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ie $$7 = null;
      if (!$$2.a(this.dk(), 2.0)) {
         hz $$8 = this.dm();
         List<ie> $$9 = Lists.newArrayList();
         if ($$0 != ie.a.a) {
            if ($$8.u() < $$2.u() && this.dM().u($$8.h())) {
               $$9.add(ie.f);
            } else if ($$8.u() > $$2.u() && this.dM().u($$8.g())) {
               $$9.add(ie.e);
            }
         }

         if ($$0 != ie.a.b) {
            if ($$8.v() < $$2.v() && this.dM().u($$8.c())) {
               $$9.add(ie.b);
            } else if ($$8.v() > $$2.v() && this.dM().u($$8.d())) {
               $$9.add(ie.a);
            }
         }

         if ($$0 != ie.a.c) {
            if ($$8.w() < $$2.w() && this.dM().u($$8.f())) {
               $$9.add(ie.d);
            } else if ($$8.w() > $$2.w() && this.dM().u($$8.e())) {
               $$9.add(ie.c);
            }
         }

         $$7 = ie.b(this.af);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dM().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ie.b(this.af);
            }
         } else {
            $$7 = $$9.get(this.af.a($$9.size()));
         }

         $$4 = this.dr() + (double)$$7.j();
         $$5 = this.dt() + (double)$$7.k();
         $$6 = this.dx() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dr();
      double $$12 = $$5 - this.dt();
      double $$13 = $$6 - this.dx();
      double $$14 = Math.sqrt($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
      if ($$14 == 0.0) {
         this.g = 0.0;
         this.h = 0.0;
         this.i = 0.0;
      } else {
         this.g = $$11 / $$14 * 0.15;
         this.h = $$12 / $$14 * 0.15;
         this.i = $$13 / $$14 * 0.15;
      }

      this.at = true;
      this.e = 10 + this.af.a(5) * 10;
   }

   @Override
   public void dy() {
      if (this.dM().aj() == blt.a) {
         this.am();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B) {
         if (this.c == null && this.j != null) {
            this.c = ((aow)this.dM()).a(this.j);
            if (this.c == null) {
               this.j = null;
            }
         }

         if (this.c == null || !this.c.bx() || this.c instanceof chl && this.c.P_()) {
            if (!this.aV()) {
               this.g(this.dp().b(0.0, -0.04, 0.0));
            }
         } else {
            this.g = awi.a(this.g * 1.025, -1.0, 1.0);
            this.h = awi.a(this.h * 1.025, -1.0, 1.0);
            this.i = awi.a(this.i * 1.025, -1.0, 1.0);
            enz $$0 = this.dp();
            this.g($$0.b((this.g - $$0.c) * 0.2, (this.h - $$0.d) * 0.2, (this.i - $$0.e) * 0.2));
         }

         enx $$1 = cif.a(this, this::a);
         if ($$1.c() != enx.a.a) {
            this.a($$1);
         }
      }

      this.aQ();
      enz $$2 = this.dp();
      this.a_(this.dr() + $$2.c, this.dt() + $$2.d, this.dx() + $$2.e);
      cif.a(this, 0.5F);
      if (this.dM().B) {
         this.dM().a(jz.u, this.dr() - $$2.c, this.dt() - $$2.d + 0.15, this.dx() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dH()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            hz $$3 = this.dm();
            ie.a $$4 = this.d.o();
            if (this.dM().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               hz $$5 = this.c.dm();
               if ($$4 == ie.a.a && $$3.u() == $$5.u() || $$4 == ie.a.c && $$3.w() == $$5.w() || $$4 == ie.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean a(bnq $$0) {
      return super.a($$0) && !$$0.ae;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   protected void a(enw $$0) {
      super.a($$0);
      bnq $$1 = $$0.a();
      bnq $$2 = this.w();
      boi $$3 = $$2 instanceof boi ? (boi)$$2 : null;
      boolean $$4 = $$1.a(this.dN().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof boi $$5) {
            $$5.b(new bnd(bnf.y, 200), (bnq)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(env $$0) {
      super.a($$0);
      ((aow)this.dM()).a(jz.x, this.dr(), this.dt(), this.dx(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(atl.wh, 1.0F, 1.0F);
   }

   private void s() {
      this.am();
      this.dM().a(dpw.o, this.dk(), dpw.a.a(this));
   }

   @Override
   protected void a(enx $$0) {
      super.a($$0);
      this.s();
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (!this.dM().B) {
         this.a(atl.wi, 1.0F, 1.0F);
         ((aow)this.dM()).a(jz.g, this.dr(), this.dt(), this.dx(), 15, 0.2, 0.2, 0.2, 0.0);
         this.s();
      }

      return true;
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.o($$1, $$2, $$3);
   }
}
