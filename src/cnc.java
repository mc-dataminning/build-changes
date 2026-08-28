import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cnc extends cmz {
   private static final double b = 0.15;
   @Nullable
   private bsd c;
   @Nullable
   private jf d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cnc(bsj<? extends cnc> $$0, dcd $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public cnc(dcd $$0, bsy $$1, bsd $$2, jf.a $$3) {
      this(bsj.aL, $$0);
      this.c($$1);
      evz $$4 = $$1.cK().f();
      this.b($$4.c, $$4.d, $$4.e, this.dF(), this.dH());
      this.c = $$2;
      this.d = jf.b;
      this.a($$3);
   }

   @Override
   public avg de() {
      return avg.f;
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cz());
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
         $$2 = this.dp().d();
      } else {
         $$1 = (double)this.c.dk() * 0.5;
         $$2 = ja.a(this.c.du(), this.c.dw() + $$1, this.c.dA());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jf $$7 = null;
      if (!$$2.a(this.dn(), 2.0)) {
         ja $$8 = this.dp();
         List<jf> $$9 = Lists.newArrayList();
         if ($$0 != jf.a.a) {
            if ($$8.u() < $$2.u() && this.dP().u($$8.h())) {
               $$9.add(jf.f);
            } else if ($$8.u() > $$2.u() && this.dP().u($$8.g())) {
               $$9.add(jf.e);
            }
         }

         if ($$0 != jf.a.b) {
            if ($$8.v() < $$2.v() && this.dP().u($$8.c())) {
               $$9.add(jf.b);
            } else if ($$8.v() > $$2.v() && this.dP().u($$8.d())) {
               $$9.add(jf.a);
            }
         }

         if ($$0 != jf.a.c) {
            if ($$8.w() < $$2.w() && this.dP().u($$8.f())) {
               $$9.add(jf.d);
            } else if ($$8.w() > $$2.w() && this.dP().u($$8.e())) {
               $$9.add(jf.c);
            }
         }

         $$7 = jf.b(this.ah);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dP().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jf.b(this.ah);
            }
         } else {
            $$7 = $$9.get(this.ah.a($$9.size()));
         }

         $$4 = this.du() + (double)$$7.j();
         $$5 = this.dw() + (double)$$7.k();
         $$6 = this.dA() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.du();
      double $$12 = $$5 - this.dw();
      double $$13 = $$6 - this.dA();
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
   public void dB() {
      if (this.dP().al() == bqa.a) {
         this.ao();
      }
   }

   @Override
   protected double aY() {
      return 0.04;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().B) {
         if (this.c == null && this.i != null) {
            this.c = ((aqk)this.dP()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bD() || this.c instanceof cmh && this.c.N_()) {
            this.ba();
         } else {
            this.f = aye.a(this.f * 1.025, -1.0, 1.0);
            this.g = aye.a(this.g * 1.025, -1.0, 1.0);
            this.h = aye.a(this.h * 1.025, -1.0, 1.0);
            evz $$0 = this.ds();
            this.h($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         evx $$1 = cnb.a(this, this::b);
         if ($$1.c() != evx.a.a) {
            this.b($$1);
         }
      }

      this.aS();
      evz $$2 = this.ds();
      this.a_(this.du() + $$2.c, this.dw() + $$2.d, this.dA() + $$2.e);
      cnb.a(this, 0.5F);
      if (this.dP().B) {
         this.dP().a(lj.t, this.du() - $$2.c, this.dw() - $$2.d + 0.15, this.dA() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dK()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            ja $$3 = this.dp();
            jf.a $$4 = this.d.o();
            if (this.dP().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               ja $$5 = this.c.dp();
               if ($$4 == jf.a.a && $$3.u() == $$5.u() || $$4 == jf.a.c && $$3.w() == $$5.w() || $$4 == jf.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(bsd $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   public boolean bQ() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Override
   protected void a(evw $$0) {
      super.a($$0);
      bsd $$1 = $$0.a();
      bsd $$2 = this.s();
      bsy $$3 = $$2 instanceof bsy ? (bsy)$$2 : null;
      bqw $$4 = this.dQ().a(this, $$3);
      boolean $$5 = $$1.a($$4, 4.0F);
      if ($$5) {
         if (this.dP() instanceof aqk $$6) {
            czl.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bsy $$7) {
            $$7.b(new brl(brn.y, 200), (bsd)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(evv $$0) {
      super.a($$0);
      ((aqk)this.dP()).a(lj.w, this.du(), this.dw(), this.dA(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(avf.wO, 1.0F, 1.0F);
   }

   private void u() {
      this.ao();
      this.dP().a(dxa.o, this.dn(), dxa.a.a(this));
   }

   @Override
   protected void a(evx $$0) {
      super.a($$0);
      this.u();
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (!this.dP().B) {
         this.a(avf.wP, 1.0F, 1.0F);
         ((aqk)this.dP()).a(lj.f, this.du(), this.dw(), this.dA(), 15, 0.2, 0.2, 0.2, 0.0);
         this.u();
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
