import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgb extends cfz {
   private static final double b = 0.15;
   @Nullable
   private blu c;
   @Nullable
   private ic d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cgb(bly<? extends cgb> $$0, cto $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public cgb(cto $$0, bmk $$1, blu $$2, ic.a $$3) {
      this(bly.aI, $$0);
      this.b($$1);
      hx $$4 = $$1.dm();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dC(), this.dE());
      this.c = $$2;
      this.d = ic.b;
      this.a($$3);
   }

   @Override
   public ars db() {
      return ars.f;
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cw());
      }

      if (this.d != null) {
         $$0.a("Dir", this.d.d());
      }

      $$0.a("Steps", this.e);
      $$0.a("TXD", this.f);
      $$0.a("TYD", this.g);
      $$0.a("TZD", this.h);
   }

   @Override
   protected void a(sn $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = ic.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void c_() {
   }

   @Nullable
   private ic q() {
      return this.d;
   }

   private void a(@Nullable ic $$0) {
      this.d = $$0;
   }

   private void a(@Nullable ic.a $$0) {
      double $$1 = 0.5;
      hx $$2;
      if (this.c == null) {
         $$2 = this.dm().d();
      } else {
         $$1 = (double)this.c.dh() * 0.5;
         $$2 = hx.a(this.c.dr(), this.c.dt() + $$1, this.c.dx());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ic $$7 = null;
      if (!$$2.a(this.dk(), 2.0)) {
         hx $$8 = this.dm();
         List<ic> $$9 = Lists.newArrayList();
         if ($$0 != ic.a.a) {
            if ($$8.u() < $$2.u() && this.dM().u($$8.h())) {
               $$9.add(ic.f);
            } else if ($$8.u() > $$2.u() && this.dM().u($$8.g())) {
               $$9.add(ic.e);
            }
         }

         if ($$0 != ic.a.b) {
            if ($$8.v() < $$2.v() && this.dM().u($$8.c())) {
               $$9.add(ic.b);
            } else if ($$8.v() > $$2.v() && this.dM().u($$8.d())) {
               $$9.add(ic.a);
            }
         }

         if ($$0 != ic.a.c) {
            if ($$8.w() < $$2.w() && this.dM().u($$8.f())) {
               $$9.add(ic.d);
            } else if ($$8.w() > $$2.w() && this.dM().u($$8.e())) {
               $$9.add(ic.c);
            }
         }

         $$7 = ic.b(this.ag);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dM().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ic.b(this.ag);
            }
         } else {
            $$7 = $$9.get(this.ag.a($$9.size()));
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
         this.f = 0.0;
         this.g = 0.0;
         this.h = 0.0;
      } else {
         this.f = $$11 / $$14 * 0.15;
         this.g = $$12 / $$14 * 0.15;
         this.h = $$13 / $$14 * 0.15;
      }

      this.au = true;
      this.e = 10 + this.ag.a(5) * 10;
   }

   @Override
   public void dy() {
      if (this.dM().ak() == bjx.a) {
         this.am();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B) {
         if (this.c == null && this.i != null) {
            this.c = ((and)this.dM()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bx() || this.c instanceof cfh && this.c.P_()) {
            if (!this.aV()) {
               this.g(this.dp().b(0.0, -0.04, 0.0));
            }
         } else {
            this.f = aun.a(this.f * 1.025, -1.0, 1.0);
            this.g = aun.a(this.g * 1.025, -1.0, 1.0);
            this.h = aun.a(this.h * 1.025, -1.0, 1.0);
            els $$0 = this.dp();
            this.g($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         elq $$1 = cga.a(this, this::a);
         if ($$1.c() != elq.a.a) {
            this.a($$1);
         }
      }

      this.aQ();
      els $$2 = this.dp();
      this.a_(this.dr() + $$2.c, this.dt() + $$2.d, this.dx() + $$2.e);
      cga.a(this, 0.5F);
      if (this.dM().B) {
         this.dM().a(jx.u, this.dr() - $$2.c, this.dt() - $$2.d + 0.15, this.dx() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dH()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            hx $$3 = this.dm();
            ic.a $$4 = this.d.o();
            if (this.dM().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               hx $$5 = this.c.dm();
               if ($$4 == ic.a.a && $$3.u() == $$5.u() || $$4 == ic.a.c && $$3.w() == $$5.w() || $$4 == ic.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean a(blu $$0) {
      return super.a($$0) && !$$0.af;
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
   protected void a(elp $$0) {
      super.a($$0);
      blu $$1 = $$0.a();
      blu $$2 = this.w();
      bmk $$3 = $$2 instanceof bmk ? (bmk)$$2 : null;
      boolean $$4 = $$1.a(this.dN().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bmk $$5) {
            $$5.b(new blh(blj.y, 200), (blu)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(elo $$0) {
      super.a($$0);
      ((and)this.dM()).a(jx.x, this.dr(), this.dt(), this.dx(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(arr.vR, 1.0F, 1.0F);
   }

   private void s() {
      this.am();
      this.dM().a(dnq.o, this.dk(), dnq.a.a(this));
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      this.s();
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (!this.dM().B) {
         this.a(arr.vS, 1.0F, 1.0F);
         ((and)this.dM()).a(jx.g, this.dr(), this.dt(), this.dx(), 15, 0.2, 0.2, 0.2, 0.0);
         this.s();
      }

      return true;
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();
      this.o($$1, $$2, $$3);
   }
}
