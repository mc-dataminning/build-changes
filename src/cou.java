import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cou extends cor {
   private static final double b = 0.15;
   @Nullable
   private btr c;
   @Nullable
   private jk d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cou(bty<? extends cou> $$0, dej $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public cou(dej $$0, bun $$1, btr $$2, jk.a $$3) {
      this(bty.aL, $$0);
      this.c($$1);
      eyw $$4 = $$1.cO().f();
      this.b($$4.d, $$4.e, $$4.f, this.dI(), this.dK());
      this.c = $$2;
      this.d = jk.b;
      this.a($$3);
   }

   @Override
   public awh di() {
      return awh.f;
   }

   @Override
   protected void b(ug $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cD());
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
   protected void a(ug $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = jk.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void a(akl.a $$0) {
   }

   @Nullable
   private jk m() {
      return this.d;
   }

   private void a(@Nullable jk $$0) {
      this.d = $$0;
   }

   private void a(@Nullable jk.a $$0) {
      double $$1 = 0.5;
      jf $$2;
      if (this.c == null) {
         $$2 = this.ds().e();
      } else {
         $$1 = (double)this.c.do() * 0.5;
         $$2 = jf.a(this.c.dx(), this.c.dz() + $$1, this.c.dD());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jk $$7 = null;
      if (!$$2.a(this.dq(), 2.0)) {
         jf $$8 = this.ds();
         List<jk> $$9 = Lists.newArrayList();
         if ($$0 != jk.a.a) {
            if ($$8.u() < $$2.u() && this.dS().u($$8.i())) {
               $$9.add(jk.f);
            } else if ($$8.u() > $$2.u() && this.dS().u($$8.h())) {
               $$9.add(jk.e);
            }
         }

         if ($$0 != jk.a.b) {
            if ($$8.v() < $$2.v() && this.dS().u($$8.d())) {
               $$9.add(jk.b);
            } else if ($$8.v() > $$2.v() && this.dS().u($$8.e())) {
               $$9.add(jk.a);
            }
         }

         if ($$0 != jk.a.c) {
            if ($$8.w() < $$2.w() && this.dS().u($$8.g())) {
               $$9.add(jk.d);
            } else if ($$8.w() > $$2.w() && this.dS().u($$8.f())) {
               $$9.add(jk.c);
            }
         }

         $$7 = jk.b(this.af);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dS().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jk.b(this.af);
            }
         } else {
            $$7 = $$9.get(this.af.a($$9.size()));
         }

         $$4 = this.dx() + (double)$$7.j();
         $$5 = this.dz() + (double)$$7.k();
         $$6 = this.dD() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dx();
      double $$12 = $$5 - this.dz();
      double $$13 = $$6 - this.dD();
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
   public void dE() {
      if (this.dS().am() == brp.a) {
         this.as();
      }
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dS().B) {
         if (this.c == null && this.i != null) {
            this.c = ((arj)this.dS()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bI() || this.c instanceof cnx && this.c.Q_()) {
            this.be();
         } else {
            this.f = azf.a(this.f * 1.025, -1.0, 1.0);
            this.g = azf.a(this.g * 1.025, -1.0, 1.0);
            this.h = azf.a(this.h * 1.025, -1.0, 1.0);
            eyw $$0 = this.dv();
            this.h($$0.b((this.f - $$0.d) * 0.2, (this.g - $$0.e) * 0.2, (this.h - $$0.f) * 0.2));
         }

         eyu $$1 = cot.a(this, this::b);
         if ($$1.d() != eyu.a.a) {
            this.b($$1);
         }

         this.aI();
      }

      eyw $$2 = this.dv();
      this.a_(this.dx() + $$2.d, this.dz() + $$2.e, this.dD() + $$2.f);
      cot.a(this, 0.5F);
      if (this.dS().B) {
         this.dS().a(lo.t, this.dx() - $$2.d, this.dz() - $$2.e + 0.15, this.dD() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dN()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            jf $$3 = this.ds();
            jk.a $$4 = this.d.o();
            if (this.dS().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               jf $$5 = this.c.ds();
               if ($$4 == jk.a.a && $$3.u() == $$5.u() || $$4 == jk.a.c && $$3.w() == $$5.w() || $$4 == jk.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(btr $$0) {
      return super.b($$0) && !$$0.ae;
   }

   @Override
   public boolean bV() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   protected void a(eyt $$0) {
      super.a($$0);
      btr $$1 = $$0.a();
      btr $$2 = this.s();
      bun $$3 = $$2 instanceof bun ? (bun)$$2 : null;
      bsj $$4 = this.dT().a(this, $$3);
      boolean $$5 = $$1.a($$4, 4.0F);
      if ($$5) {
         if (this.dS() instanceof arj $$6) {
            dbp.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bun $$7) {
            $$7.b(new bsy(bta.y, 200), (btr)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(eys $$0) {
      super.a($$0);
      ((arj)this.dS()).a(lo.w, this.dx(), this.dz(), this.dD(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(awg.wP, 1.0F, 1.0F);
   }

   private void o() {
      this.as();
      this.dS().a(dzp.o, this.dq(), dzp.a.a(this));
   }

   @Override
   protected void a(eyu $$0) {
      super.a($$0);
      this.o();
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (!this.dS().B) {
         this.a(awg.wQ, 1.0F, 1.0F);
         ((arj)this.dS()).a(lo.f, this.dx(), this.dz(), this.dD(), 15, 0.2, 0.2, 0.2, 0.0);
         this.o();
      }

      return true;
   }

   @Override
   public void a(acb $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
