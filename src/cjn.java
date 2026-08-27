import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cjn extends cjk {
   private static final double b = 0.15;
   @Nullable
   private bow c;
   @Nullable
   private ih d;
   private int e;
   private double g;
   private double h;
   private double i;
   @Nullable
   private UUID j;

   public cjn(bpc<? extends cjn> $$0, cwz $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public cjn(cwz $$0, bpo $$1, bow $$2, ih.a $$3) {
      this(bpc.aK, $$0);
      this.c($$1);
      ib $$4 = $$1.dm();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dC(), this.dE());
      this.c = $$2;
      this.d = ih.b;
      this.a($$3);
   }

   @Override
   public atz db() {
      return atz.f;
   }

   @Override
   protected void b(ta $$0) {
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
   protected void a(ta $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.g = $$0.k("TXD");
      this.h = $$0.k("TYD");
      this.i = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = ih.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.j = $$0.a("Target");
      }
   }

   @Override
   protected void a(aiq.a $$0) {
   }

   @Nullable
   private ih p() {
      return this.d;
   }

   private void a(@Nullable ih $$0) {
      this.d = $$0;
   }

   private void a(@Nullable ih.a $$0) {
      double $$1 = 0.5;
      ib $$2;
      if (this.c == null) {
         $$2 = this.dm().d();
      } else {
         $$1 = (double)this.c.dh() * 0.5;
         $$2 = ib.a(this.c.dr(), this.c.dt() + $$1, this.c.dx());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ih $$7 = null;
      if (!$$2.a(this.dk(), 2.0)) {
         ib $$8 = this.dm();
         List<ih> $$9 = Lists.newArrayList();
         if ($$0 != ih.a.a) {
            if ($$8.u() < $$2.u() && this.dM().u($$8.h())) {
               $$9.add(ih.f);
            } else if ($$8.u() > $$2.u() && this.dM().u($$8.g())) {
               $$9.add(ih.e);
            }
         }

         if ($$0 != ih.a.b) {
            if ($$8.v() < $$2.v() && this.dM().u($$8.c())) {
               $$9.add(ih.b);
            } else if ($$8.v() > $$2.v() && this.dM().u($$8.d())) {
               $$9.add(ih.a);
            }
         }

         if ($$0 != ih.a.c) {
            if ($$8.w() < $$2.w() && this.dM().u($$8.f())) {
               $$9.add(ih.d);
            } else if ($$8.w() > $$2.w() && this.dM().u($$8.e())) {
               $$9.add(ih.c);
            }
         }

         $$7 = ih.b(this.ag);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dM().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ih.b(this.ag);
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
         this.g = 0.0;
         this.h = 0.0;
         this.i = 0.0;
      } else {
         this.g = $$11 / $$14 * 0.15;
         this.h = $$12 / $$14 * 0.15;
         this.i = $$13 / $$14 * 0.15;
      }

      this.au = true;
      this.e = 10 + this.ag.a(5) * 10;
   }

   @Override
   public void dy() {
      if (this.dM().aj() == bmz.a) {
         this.am();
      }
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B) {
         if (this.c == null && this.j != null) {
            this.c = ((apf)this.dM()).a(this.j);
            if (this.c == null) {
               this.j = null;
            }
         }

         if (this.c == null || !this.c.bA() || this.c instanceof cis && this.c.N_()) {
            this.aY();
         } else {
            this.g = aww.a(this.g * 1.025, -1.0, 1.0);
            this.h = aww.a(this.h * 1.025, -1.0, 1.0);
            this.i = aww.a(this.i * 1.025, -1.0, 1.0);
            epr $$0 = this.dp();
            this.g($$0.b((this.g - $$0.c) * 0.2, (this.h - $$0.d) * 0.2, (this.i - $$0.e) * 0.2));
         }

         epp $$1 = cjm.a(this, this::b);
         if ($$1.c() != epp.a.a) {
            this.a($$1);
         }
      }

      this.aQ();
      epr $$2 = this.dp();
      this.a_(this.dr() + $$2.c, this.dt() + $$2.d, this.dx() + $$2.e);
      cjm.a(this, 0.5F);
      if (this.dM().B) {
         this.dM().a(kc.u, this.dr() - $$2.c, this.dt() - $$2.d + 0.15, this.dx() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dH()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            ib $$3 = this.dm();
            ih.a $$4 = this.d.o();
            if (this.dM().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               ib $$5 = this.c.dm();
               if ($$4 == ih.a.a && $$3.u() == $$5.u() || $$4 == ih.a.c && $$3.w() == $$5.w() || $$4 == ih.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(bow $$0) {
      return super.b($$0) && !$$0.af;
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
   public float br() {
      return 1.0F;
   }

   @Override
   protected void a(epo $$0) {
      super.a($$0);
      bow $$1 = $$0.a();
      bow $$2 = this.af_();
      bpo $$3 = $$2 instanceof bpo ? (bpo)$$2 : null;
      boolean $$4 = $$1.a(this.dN().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bpo $$5) {
            $$5.b(new boj(bol.y, 200), (bow)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(epn $$0) {
      super.a($$0);
      ((apf)this.dM()).a(kc.x, this.dr(), this.dt(), this.dx(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(aty.wk, 1.0F, 1.0F);
   }

   private void r() {
      this.am();
      this.dM().a(drn.o, this.dk(), drn.a.a(this));
   }

   @Override
   protected void a(epp $$0) {
      super.a($$0);
      this.r();
   }

   @Override
   public boolean bw() {
      return true;
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if (!this.dM().B) {
         this.a(aty.wl, 1.0F, 1.0F);
         ((apf)this.dM()).a(kc.g, this.dr(), this.dt(), this.dx(), 15, 0.2, 0.2, 0.2, 0.0);
         this.r();
      }

      return true;
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.o($$1, $$2, $$3);
   }
}
