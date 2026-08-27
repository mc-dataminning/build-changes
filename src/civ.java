import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class civ extends cis {
   private static final double b = 0.15;
   @Nullable
   private bof c;
   @Nullable
   private ih d;
   private int e;
   private double g;
   private double h;
   private double i;
   @Nullable
   private UUID j;

   public civ(bol<? extends civ> $$0, cwe $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public civ(cwe $$0, box $$1, bof $$2, ih.a $$3) {
      this(bol.aJ, $$0);
      this.b($$1);
      ib $$4 = $$1.dj();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dz(), this.dB());
      this.c = $$2;
      this.d = ih.b;
      this.a($$3);
   }

   @Override
   public atq cY() {
      return atq.f;
   }

   @Override
   protected void b(sy $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.ct());
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
   protected void a(sy $$0) {
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
   protected void c_() {
   }

   @Nullable
   private ih q() {
      return this.d;
   }

   private void a(@Nullable ih $$0) {
      this.d = $$0;
   }

   private void a(@Nullable ih.a $$0) {
      double $$1 = 0.5;
      ib $$2;
      if (this.c == null) {
         $$2 = this.dj().d();
      } else {
         $$1 = (double)this.c.de() * 0.5;
         $$2 = ib.a(this.c.do(), this.c.dq() + $$1, this.c.du());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ih $$7 = null;
      if (!$$2.a(this.dh(), 2.0)) {
         ib $$8 = this.dj();
         List<ih> $$9 = Lists.newArrayList();
         if ($$0 != ih.a.a) {
            if ($$8.u() < $$2.u() && this.dJ().u($$8.h())) {
               $$9.add(ih.f);
            } else if ($$8.u() > $$2.u() && this.dJ().u($$8.g())) {
               $$9.add(ih.e);
            }
         }

         if ($$0 != ih.a.b) {
            if ($$8.v() < $$2.v() && this.dJ().u($$8.c())) {
               $$9.add(ih.b);
            } else if ($$8.v() > $$2.v() && this.dJ().u($$8.d())) {
               $$9.add(ih.a);
            }
         }

         if ($$0 != ih.a.c) {
            if ($$8.w() < $$2.w() && this.dJ().u($$8.f())) {
               $$9.add(ih.d);
            } else if ($$8.w() > $$2.w() && this.dJ().u($$8.e())) {
               $$9.add(ih.c);
            }
         }

         $$7 = ih.b(this.af);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dJ().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ih.b(this.af);
            }
         } else {
            $$7 = $$9.get(this.af.a($$9.size()));
         }

         $$4 = this.do() + (double)$$7.j();
         $$5 = this.dq() + (double)$$7.k();
         $$6 = this.du() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.do();
      double $$12 = $$5 - this.dq();
      double $$13 = $$6 - this.du();
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
   public void dv() {
      if (this.dJ().aj() == bmi.a) {
         this.am();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dJ().B) {
         if (this.c == null && this.j != null) {
            this.c = ((apa)this.dJ()).a(this.j);
            if (this.c == null) {
               this.j = null;
            }
         }

         if (this.c == null || !this.c.bx() || this.c instanceof cia && this.c.P_()) {
            if (!this.aV()) {
               this.g(this.dm().b(0.0, -0.04, 0.0));
            }
         } else {
            this.g = awm.a(this.g * 1.025, -1.0, 1.0);
            this.h = awm.a(this.h * 1.025, -1.0, 1.0);
            this.i = awm.a(this.i * 1.025, -1.0, 1.0);
            eov $$0 = this.dm();
            this.g($$0.b((this.g - $$0.c) * 0.2, (this.h - $$0.d) * 0.2, (this.i - $$0.e) * 0.2));
         }

         eot $$1 = ciu.a(this, this::a);
         if ($$1.c() != eot.a.a) {
            this.a($$1);
         }
      }

      this.aQ();
      eov $$2 = this.dm();
      this.a_(this.do() + $$2.c, this.dq() + $$2.d, this.du() + $$2.e);
      ciu.a(this, 0.5F);
      if (this.dJ().B) {
         this.dJ().a(kb.u, this.do() - $$2.c, this.dq() - $$2.d + 0.15, this.du() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dE()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            ib $$3 = this.dj();
            ih.a $$4 = this.d.o();
            if (this.dJ().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               ib $$5 = this.c.dj();
               if ($$4 == ih.a.a && $$3.u() == $$5.u() || $$4 == ih.a.c && $$3.w() == $$5.w() || $$4 == ih.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean a(bof $$0) {
      return super.a($$0) && !$$0.ae;
   }

   @Override
   public boolean bK() {
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
   protected void a(eos $$0) {
      super.a($$0);
      bof $$1 = $$0.a();
      bof $$2 = this.w();
      box $$3 = $$2 instanceof box ? (box)$$2 : null;
      boolean $$4 = $$1.a(this.dK().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof box $$5) {
            $$5.b(new bns(bnu.y, 200), (bof)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(eor $$0) {
      super.a($$0);
      ((apa)this.dJ()).a(kb.x, this.do(), this.dq(), this.du(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(atp.wh, 1.0F, 1.0F);
   }

   private void s() {
      this.am();
      this.dJ().a(dqr.o, this.dh(), dqr.a.a(this));
   }

   @Override
   protected void a(eot $$0) {
      super.a($$0);
      this.s();
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (!this.dJ().B) {
         this.a(atp.wi, 1.0F, 1.0F);
         ((apa)this.dJ()).a(kb.g, this.do(), this.dq(), this.du(), 15, 0.2, 0.2, 0.2, 0.0);
         this.s();
      }

      return true;
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.o($$1, $$2, $$3);
   }
}
