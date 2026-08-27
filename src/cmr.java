import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cmr extends cmo {
   private static final double b = 0.15;
   @Nullable
   private bru c;
   @Nullable
   private it d;
   private int e;
   private double g;
   private double h;
   private double i;
   @Nullable
   private UUID j;

   public cmr(bsa<? extends cmr> $$0, dax $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public cmr(dax $$0, bso $$1, bru $$2, it.a $$3) {
      this(bsa.aL, $$0);
      this.c($$1);
      io $$4 = $$1.dp();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dF(), this.dH());
      this.c = $$2;
      this.d = it.b;
      this.a($$3);
   }

   @Override
   public avi de() {
      return avi.f;
   }

   @Override
   protected void b(ud $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cz());
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
   protected void a(ud $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.g = $$0.k("TXD");
      this.h = $$0.k("TYD");
      this.i = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = it.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.j = $$0.a("Target");
      }
   }

   @Override
   protected void a(ajv.a $$0) {
   }

   @Nullable
   private it p() {
      return this.d;
   }

   private void a(@Nullable it $$0) {
      this.d = $$0;
   }

   private void a(@Nullable it.a $$0) {
      double $$1 = 0.5;
      io $$2;
      if (this.c == null) {
         $$2 = this.dp().d();
      } else {
         $$1 = (double)this.c.dk() * 0.5;
         $$2 = io.a(this.c.du(), this.c.dw() + $$1, this.c.dA());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      it $$7 = null;
      if (!$$2.a(this.dn(), 2.0)) {
         io $$8 = this.dp();
         List<it> $$9 = Lists.newArrayList();
         if ($$0 != it.a.a) {
            if ($$8.u() < $$2.u() && this.dP().u($$8.h())) {
               $$9.add(it.f);
            } else if ($$8.u() > $$2.u() && this.dP().u($$8.g())) {
               $$9.add(it.e);
            }
         }

         if ($$0 != it.a.b) {
            if ($$8.v() < $$2.v() && this.dP().u($$8.c())) {
               $$9.add(it.b);
            } else if ($$8.v() > $$2.v() && this.dP().u($$8.d())) {
               $$9.add(it.a);
            }
         }

         if ($$0 != it.a.c) {
            if ($$8.w() < $$2.w() && this.dP().u($$8.f())) {
               $$9.add(it.d);
            } else if ($$8.w() > $$2.w() && this.dP().u($$8.e())) {
               $$9.add(it.c);
            }
         }

         $$7 = it.b(this.ah);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dP().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = it.b(this.ah);
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
         this.g = 0.0;
         this.h = 0.0;
         this.i = 0.0;
      } else {
         this.g = $$11 / $$14 * 0.15;
         this.h = $$12 / $$14 * 0.15;
         this.i = $$13 / $$14 * 0.15;
      }

      this.av = true;
      this.e = 10 + this.ah.a(5) * 10;
   }

   @Override
   public void dB() {
      if (this.dP().ak() == bpr.a) {
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
         if (this.c == null && this.j != null) {
            this.c = ((aqm)this.dP()).a(this.j);
            if (this.c == null) {
               this.j = null;
            }
         }

         if (this.c == null || !this.c.bD() || this.c instanceof clw && this.c.N_()) {
            this.ba();
         } else {
            this.g = ayd.a(this.g * 1.025, -1.0, 1.0);
            this.h = ayd.a(this.h * 1.025, -1.0, 1.0);
            this.i = ayd.a(this.i * 1.025, -1.0, 1.0);
            euk $$0 = this.ds();
            this.g($$0.b((this.g - $$0.c) * 0.2, (this.h - $$0.d) * 0.2, (this.i - $$0.e) * 0.2));
         }

         eui $$1 = cmq.a(this, this::b);
         if ($$1.c() != eui.a.a) {
            this.a($$1);
         }
      }

      this.aS();
      euk $$2 = this.ds();
      this.a_(this.du() + $$2.c, this.dw() + $$2.d, this.dA() + $$2.e);
      cmq.a(this, 0.5F);
      if (this.dP().B) {
         this.dP().a(ky.t, this.du() - $$2.c, this.dw() - $$2.d + 0.15, this.dA() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dK()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            io $$3 = this.dp();
            it.a $$4 = this.d.o();
            if (this.dP().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               io $$5 = this.c.dp();
               if ($$4 == it.a.a && $$3.u() == $$5.u() || $$4 == it.a.c && $$3.w() == $$5.w() || $$4 == it.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(bru $$0) {
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
   protected void a(euh $$0) {
      super.a($$0);
      bru $$1 = $$0.a();
      bru $$2 = this.s();
      bso $$3 = $$2 instanceof bso ? (bso)$$2 : null;
      boolean $$4 = $$1.a(this.dQ().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bso $$5) {
            $$5.b(new brc(bre.y, 200), (bru)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(eug $$0) {
      super.a($$0);
      ((aqm)this.dP()).a(ky.w, this.du(), this.dw(), this.dA(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(avh.wL, 1.0F, 1.0F);
   }

   private void u() {
      this.ao();
      this.dP().a(dvu.o, this.dn(), dvu.a.a(this));
   }

   @Override
   protected void a(eui $$0) {
      super.a($$0);
      this.u();
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (!this.dP().B) {
         this.a(avh.wM, 1.0F, 1.0F);
         ((aqm)this.dP()).a(ky.f, this.du(), this.dw(), this.dA(), 15, 0.2, 0.2, 0.2, 0.0);
         this.u();
      }

      return true;
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.o($$1, $$2, $$3);
   }
}
