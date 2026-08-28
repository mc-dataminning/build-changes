import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cng extends cnd {
   private static final double b = 0.15;
   @Nullable
   private bsh c;
   @Nullable
   private jf d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cng(bsn<? extends cng> $$0, dcg $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public cng(dcg $$0, btc $$1, bsh $$2, jf.a $$3) {
      this(bsn.aL, $$0);
      this.c($$1);
      ewh $$4 = $$1.cM().f();
      this.b($$4.c, $$4.d, $$4.e, this.dH(), this.dJ());
      this.c = $$2;
      this.d = jf.b;
      this.a($$3);
   }

   @Override
   public avi dg() {
      return avi.f;
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cB());
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
   protected void a(tx $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = jf.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Nullable
   private jf p() {
      return this.d;
   }

   private void a(@Nullable jf $$0) {
      this.d = $$0;
   }

   private void a(@Nullable jf.a $$0) {
      double $$1 = 0.5;
      ja $$2;
      if (this.c == null) {
         $$2 = this.dr().d();
      } else {
         $$1 = (double)this.c.dm() * 0.5;
         $$2 = ja.a(this.c.dw(), this.c.dy() + $$1, this.c.dC());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jf $$7 = null;
      if (!$$2.a(this.dp(), 2.0)) {
         ja $$8 = this.dr();
         List<jf> $$9 = Lists.newArrayList();
         if ($$0 != jf.a.a) {
            if ($$8.u() < $$2.u() && this.dR().u($$8.h())) {
               $$9.add(jf.f);
            } else if ($$8.u() > $$2.u() && this.dR().u($$8.g())) {
               $$9.add(jf.e);
            }
         }

         if ($$0 != jf.a.b) {
            if ($$8.v() < $$2.v() && this.dR().u($$8.c())) {
               $$9.add(jf.b);
            } else if ($$8.v() > $$2.v() && this.dR().u($$8.d())) {
               $$9.add(jf.a);
            }
         }

         if ($$0 != jf.a.c) {
            if ($$8.w() < $$2.w() && this.dR().u($$8.f())) {
               $$9.add(jf.d);
            } else if ($$8.w() > $$2.w() && this.dR().u($$8.e())) {
               $$9.add(jf.c);
            }
         }

         $$7 = jf.b(this.ah);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dR().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jf.b(this.ah);
            }
         } else {
            $$7 = $$9.get(this.ah.a($$9.size()));
         }

         $$4 = this.dw() + (double)$$7.j();
         $$5 = this.dy() + (double)$$7.k();
         $$6 = this.dC() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dw();
      double $$12 = $$5 - this.dy();
      double $$13 = $$6 - this.dC();
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

      this.av = true;
      this.e = 10 + this.ah.a(5) * 10;
   }

   @Override
   public void dD() {
      if (this.dR().al() == bqe.a) {
         this.aq();
      }
   }

   @Override
   protected double ba() {
      return 0.04;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dR().B) {
         if (this.c == null && this.i != null) {
            this.c = ((aqm)this.dR()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bF() || this.c instanceof cml && this.c.N_()) {
            this.bc();
         } else {
            this.f = ayg.a(this.f * 1.025, -1.0, 1.0);
            this.g = ayg.a(this.g * 1.025, -1.0, 1.0);
            this.h = ayg.a(this.h * 1.025, -1.0, 1.0);
            ewh $$0 = this.du();
            this.j($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         ewf $$1 = cnf.a(this, this::b);
         if ($$1.c() != ewf.a.a) {
            this.b($$1);
         }
      }

      this.aU();
      ewh $$2 = this.du();
      this.a_(this.dw() + $$2.c, this.dy() + $$2.d, this.dC() + $$2.e);
      cnf.a(this, 0.5F);
      if (this.dR().B) {
         this.dR().a(lj.t, this.dw() - $$2.c, this.dy() - $$2.d + 0.15, this.dC() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dM()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            ja $$3 = this.dr();
            jf.a $$4 = this.d.o();
            if (this.dR().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               ja $$5 = this.c.dr();
               if ($$4 == jf.a.a && $$3.u() == $$5.u() || $$4 == jf.a.c && $$3.w() == $$5.w() || $$4 == jf.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(bsh $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   public boolean bS() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      bsh $$1 = $$0.a();
      bsh $$2 = this.s();
      btc $$3 = $$2 instanceof btc ? (btc)$$2 : null;
      bra $$4 = this.dS().a(this, $$3);
      boolean $$5 = $$1.a($$4, 4.0F);
      if ($$5) {
         if (this.dR() instanceof aqm $$6) {
            czo.a($$6, $$1, $$4);
         }

         if ($$1 instanceof btc $$7) {
            $$7.b(new brp(brr.y, 200), (bsh)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      ((aqm)this.dR()).a(lj.w, this.dw(), this.dy(), this.dC(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(avh.wO, 1.0F, 1.0F);
   }

   private void t() {
      this.aq();
      this.dR().a(dxh.o, this.dp(), dxh.a.a(this));
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (!this.dR().B) {
         this.a(avh.wP, 1.0F, 1.0F);
         ((aqm)this.dR()).a(lj.f, this.dw(), this.dy(), this.dC(), 15, 0.2, 0.2, 0.2, 0.0);
         this.t();
      }

      return true;
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.o($$1, $$2, $$3);
   }
}
