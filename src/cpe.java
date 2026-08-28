import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cpe extends cpb {
   private static final double b = 0.15;
   @Nullable
   private btz c;
   @Nullable
   private jl d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cpe(bug<? extends cpe> $$0, dev $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public cpe(dev $$0, buv $$1, btz $$2, jl.a $$3) {
      this(bug.aL, $$0);
      this.c($$1);
      ezh $$4 = $$1.cS().f();
      this.b($$4.d, $$4.e, $$4.f, this.dN(), this.dP());
      this.c = $$2;
      this.d = jl.b;
      this.a($$3);
   }

   @Override
   public awl dn() {
      return awl.f;
   }

   @Override
   protected void b(uj $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cH());
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
   protected void a(uj $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = jl.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Nullable
   private jl m() {
      return this.d;
   }

   private void a(@Nullable jl $$0) {
      this.d = $$0;
   }

   private void a(@Nullable jl.a $$0) {
      double $$1 = 0.5;
      jg $$2;
      if (this.c == null) {
         $$2 = this.dx().e();
      } else {
         $$1 = (double)this.c.dt() * 0.5;
         $$2 = jg.a(this.c.dC(), this.c.dE() + $$1, this.c.dI());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jl $$7 = null;
      if (!$$2.a(this.dv(), 2.0)) {
         jg $$8 = this.dx();
         List<jl> $$9 = Lists.newArrayList();
         if ($$0 != jl.a.a) {
            if ($$8.u() < $$2.u() && this.dX().u($$8.i())) {
               $$9.add(jl.f);
            } else if ($$8.u() > $$2.u() && this.dX().u($$8.h())) {
               $$9.add(jl.e);
            }
         }

         if ($$0 != jl.a.b) {
            if ($$8.v() < $$2.v() && this.dX().u($$8.d())) {
               $$9.add(jl.b);
            } else if ($$8.v() > $$2.v() && this.dX().u($$8.e())) {
               $$9.add(jl.a);
            }
         }

         if ($$0 != jl.a.c) {
            if ($$8.w() < $$2.w() && this.dX().u($$8.g())) {
               $$9.add(jl.d);
            } else if ($$8.w() > $$2.w() && this.dX().u($$8.f())) {
               $$9.add(jl.c);
            }
         }

         $$7 = jl.b(this.af);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dX().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jl.b(this.af);
            }
         } else {
            $$7 = $$9.get(this.af.a($$9.size()));
         }

         $$4 = this.dC() + (double)$$7.j();
         $$5 = this.dE() + (double)$$7.k();
         $$6 = this.dI() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dC();
      double $$12 = $$5 - this.dE();
      double $$13 = $$6 - this.dI();
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

      this.as = true;
      this.e = 10 + this.af.a(5) * 10;
   }

   @Override
   public void dJ() {
      if (this.dX().am() == brv.a) {
         this.au();
      }
   }

   @Override
   protected double be() {
      return 0.04;
   }

   @Override
   public void l() {
      super.l();
      ezf $$0 = null;
      if (!this.dX().C) {
         if (this.c == null && this.i != null) {
            this.c = ((arm)this.dX()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bM() || this.c instanceof coh && this.c.R_()) {
            this.bg();
         } else {
            this.f = azj.a(this.f * 1.025, -1.0, 1.0);
            this.g = azj.a(this.g * 1.025, -1.0, 1.0);
            this.h = azj.a(this.h * 1.025, -1.0, 1.0);
            ezh $$1 = this.dA();
            this.h($$1.b((this.f - $$1.d) * 0.2, (this.g - $$1.e) * 0.2, (this.h - $$1.f) * 0.2));
         }

         $$0 = cpd.a(this, this::b);
      }

      ezh $$2 = this.dA();
      this.b(this.dv().e($$2));
      this.aK();
      if ($$0 != null && this.bM() && $$0.d() != ezf.a.a) {
         this.b($$0);
      }

      cpd.a(this, 0.5F);
      if (this.dX().C) {
         this.dX().a(lq.t, this.dC() - $$2.d, this.dE() - $$2.e + 0.15, this.dI() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dS()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            jg $$3 = this.dx();
            jl.a $$4 = this.d.o();
            if (this.dX().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               jg $$5 = this.c.dx();
               if ($$4 == jl.a.a && $$3.u() == $$5.u() || $$4 == jl.a.c && $$3.w() == $$5.w() || $$4 == jl.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(btz $$0) {
      return super.b($$0) && !$$0.ae;
   }

   @Override
   public boolean bZ() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bz() {
      return 1.0F;
   }

   @Override
   protected void a(eze $$0) {
      super.a($$0);
      btz $$1 = $$0.a();
      btz $$2 = this.s();
      buv $$3 = $$2 instanceof buv ? (buv)$$2 : null;
      bsp $$4 = this.dY().a(this, $$3);
      boolean $$5 = $$1.a($$4, 4.0F);
      if ($$5) {
         if (this.dX() instanceof arm $$6) {
            dbo.a($$6, $$1, $$4);
         }

         if ($$1 instanceof buv $$7) {
            $$7.b(new bte(btg.y, 200), (btz)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ezd $$0) {
      super.a($$0);
      ((arm)this.dX()).a(lq.w, this.dC(), this.dE(), this.dI(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(awk.wN, 1.0F, 1.0F);
   }

   private void o() {
      this.au();
      this.dX().a(eaa.o, this.dv(), eaa.a.a(this));
   }

   @Override
   protected void a(ezf $$0) {
      super.a($$0);
      this.o();
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (!this.dX().C) {
         this.a(awk.wO, 1.0F, 1.0F);
         ((arm)this.dX()).a(lq.f, this.dC(), this.dE(), this.dI(), 15, 0.2, 0.2, 0.2, 0.0);
         this.o();
      }

      return true;
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
