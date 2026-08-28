import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cnf extends cnc {
   private static final double b = 0.15;
   @Nullable
   private bsg c;
   @Nullable
   private jf d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cnf(bsm<? extends cnf> $$0, dcf $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public cnf(dcf $$0, btb $$1, bsg $$2, jf.a $$3) {
      this(bsm.aL, $$0);
      this.c($$1);
      ewf $$4 = $$1.cL().f();
      this.b($$4.c, $$4.d, $$4.e, this.dG(), this.dI());
      this.c = $$2;
      this.d = jf.b;
      this.a($$3);
   }

   @Override
   public avi df() {
      return avi.f;
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cA());
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
         $$2 = this.dq().d();
      } else {
         $$1 = (double)this.c.dl() * 0.5;
         $$2 = ja.a(this.c.dv(), this.c.dx() + $$1, this.c.dB());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jf $$7 = null;
      if (!$$2.a(this.do(), 2.0)) {
         ja $$8 = this.dq();
         List<jf> $$9 = Lists.newArrayList();
         if ($$0 != jf.a.a) {
            if ($$8.u() < $$2.u() && this.dQ().u($$8.h())) {
               $$9.add(jf.f);
            } else if ($$8.u() > $$2.u() && this.dQ().u($$8.g())) {
               $$9.add(jf.e);
            }
         }

         if ($$0 != jf.a.b) {
            if ($$8.v() < $$2.v() && this.dQ().u($$8.c())) {
               $$9.add(jf.b);
            } else if ($$8.v() > $$2.v() && this.dQ().u($$8.d())) {
               $$9.add(jf.a);
            }
         }

         if ($$0 != jf.a.c) {
            if ($$8.w() < $$2.w() && this.dQ().u($$8.f())) {
               $$9.add(jf.d);
            } else if ($$8.w() > $$2.w() && this.dQ().u($$8.e())) {
               $$9.add(jf.c);
            }
         }

         $$7 = jf.b(this.ah);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dQ().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jf.b(this.ah);
            }
         } else {
            $$7 = $$9.get(this.ah.a($$9.size()));
         }

         $$4 = this.dv() + (double)$$7.j();
         $$5 = this.dx() + (double)$$7.k();
         $$6 = this.dB() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dv();
      double $$12 = $$5 - this.dx();
      double $$13 = $$6 - this.dB();
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
   public void dC() {
      if (this.dQ().al() == bqd.a) {
         this.ap();
      }
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dQ().B) {
         if (this.c == null && this.i != null) {
            this.c = ((aqm)this.dQ()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bE() || this.c instanceof cmk && this.c.N_()) {
            this.bb();
         } else {
            this.f = ayg.a(this.f * 1.025, -1.0, 1.0);
            this.g = ayg.a(this.g * 1.025, -1.0, 1.0);
            this.h = ayg.a(this.h * 1.025, -1.0, 1.0);
            ewf $$0 = this.dt();
            this.i($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         ewd $$1 = cne.a(this, this::b);
         if ($$1.c() != ewd.a.a) {
            this.b($$1);
         }
      }

      this.aT();
      ewf $$2 = this.dt();
      this.a_(this.dv() + $$2.c, this.dx() + $$2.d, this.dB() + $$2.e);
      cne.a(this, 0.5F);
      if (this.dQ().B) {
         this.dQ().a(lj.t, this.dv() - $$2.c, this.dx() - $$2.d + 0.15, this.dB() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dL()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            ja $$3 = this.dq();
            jf.a $$4 = this.d.o();
            if (this.dQ().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               ja $$5 = this.c.dq();
               if ($$4 == jf.a.a && $$3.u() == $$5.u() || $$4 == jf.a.c && $$3.w() == $$5.w() || $$4 == jf.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(bsg $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      bsg $$1 = $$0.a();
      bsg $$2 = this.s();
      btb $$3 = $$2 instanceof btb ? (btb)$$2 : null;
      bqz $$4 = this.dR().a(this, $$3);
      boolean $$5 = $$1.a($$4, 4.0F);
      if ($$5) {
         if (this.dQ() instanceof aqm $$6) {
            czn.a($$6, $$1, $$4);
         }

         if ($$1 instanceof btb $$7) {
            $$7.b(new bro(brq.y, 200), (bsg)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ewb $$0) {
      super.a($$0);
      ((aqm)this.dQ()).a(lj.w, this.dv(), this.dx(), this.dB(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(avh.wO, 1.0F, 1.0F);
   }

   private void u() {
      this.ap();
      this.dQ().a(dxg.o, this.do(), dxg.a.a(this));
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      this.u();
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (!this.dQ().B) {
         this.a(avh.wP, 1.0F, 1.0F);
         ((aqm)this.dQ()).a(lj.f, this.dv(), this.dx(), this.dB(), 15, 0.2, 0.2, 0.2, 0.0);
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
