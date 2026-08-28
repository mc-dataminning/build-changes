import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cpn extends cpk {
   private static final double b = 0.15;
   @Nullable
   private bui c;
   @Nullable
   private jm d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cpn(bup<? extends cpn> $$0, dff $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public cpn(dff $$0, bve $$1, bui $$2, jm.a $$3) {
      this(bup.aL, $$0);
      this.c($$1);
      ezr $$4 = $$1.cT().f();
      this.b($$4.d, $$4.e, $$4.f, this.dO(), this.dQ());
      this.c = $$2;
      this.d = jm.b;
      this.a($$3);
   }

   @Override
   public awp do() {
      return awp.f;
   }

   @Override
   protected void b(un $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cI());
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
   protected void a(un $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = jm.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void a(aks.a $$0) {
   }

   @Nullable
   private jm m() {
      return this.d;
   }

   private void a(@Nullable jm $$0) {
      this.d = $$0;
   }

   private void a(@Nullable jm.a $$0) {
      double $$1 = 0.5;
      jh $$2;
      if (this.c == null) {
         $$2 = this.dy().e();
      } else {
         $$1 = (double)this.c.du() * 0.5;
         $$2 = jh.a(this.c.dD(), this.c.dF() + $$1, this.c.dJ());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jm $$7 = null;
      if (!$$2.a(this.dw(), 2.0)) {
         jh $$8 = this.dy();
         List<jm> $$9 = Lists.newArrayList();
         if ($$0 != jm.a.a) {
            if ($$8.u() < $$2.u() && this.dY().u($$8.i())) {
               $$9.add(jm.f);
            } else if ($$8.u() > $$2.u() && this.dY().u($$8.h())) {
               $$9.add(jm.e);
            }
         }

         if ($$0 != jm.a.b) {
            if ($$8.v() < $$2.v() && this.dY().u($$8.d())) {
               $$9.add(jm.b);
            } else if ($$8.v() > $$2.v() && this.dY().u($$8.e())) {
               $$9.add(jm.a);
            }
         }

         if ($$0 != jm.a.c) {
            if ($$8.w() < $$2.w() && this.dY().u($$8.g())) {
               $$9.add(jm.d);
            } else if ($$8.w() > $$2.w() && this.dY().u($$8.f())) {
               $$9.add(jm.c);
            }
         }

         $$7 = jm.b(this.af);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dY().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jm.b(this.af);
            }
         } else {
            $$7 = $$9.get(this.af.a($$9.size()));
         }

         $$4 = this.dD() + (double)$$7.j();
         $$5 = this.dF() + (double)$$7.k();
         $$6 = this.dJ() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dD();
      double $$12 = $$5 - this.dF();
      double $$13 = $$6 - this.dJ();
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
   public void dK() {
      if (this.dY().ak() == bse.a) {
         this.av();
      }
   }

   @Override
   protected double bf() {
      return 0.04;
   }

   @Override
   public void l() {
      super.l();
      ezp $$0 = null;
      if (!this.dY().C) {
         if (this.c == null && this.i != null) {
            this.c = ((arq)this.dY()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bN() || this.c instanceof cor && this.c.R_()) {
            this.bh();
         } else {
            this.f = azn.a(this.f * 1.025, -1.0, 1.0);
            this.g = azn.a(this.g * 1.025, -1.0, 1.0);
            this.h = azn.a(this.h * 1.025, -1.0, 1.0);
            ezr $$1 = this.dB();
            this.h($$1.b((this.f - $$1.d) * 0.2, (this.g - $$1.e) * 0.2, (this.h - $$1.f) * 0.2));
         }

         $$0 = cpm.a(this, this::b);
      }

      ezr $$2 = this.dB();
      this.b(this.dw().e($$2));
      this.aM();
      if ($$0 != null && this.bN() && $$0.d() != ezp.a.a) {
         this.b($$0);
      }

      cpm.a(this, 0.5F);
      if (this.dY().C) {
         this.dY().a(ls.t, this.dD() - $$2.d, this.dF() - $$2.e + 0.15, this.dJ() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dT()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            jh $$3 = this.dy();
            jm.a $$4 = this.d.o();
            if (this.dY().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               jh $$5 = this.c.dy();
               if ($$4 == jm.a.a && $$3.u() == $$5.u() || $$4 == jm.a.c && $$3.w() == $$5.w() || $$4 == jm.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(bui $$0) {
      return super.b($$0) && !$$0.ae;
   }

   @Override
   public boolean ca() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bA() {
      return 1.0F;
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      bui $$1 = $$0.a();
      bui $$2 = this.s();
      bve $$3 = $$2 instanceof bve ? (bve)$$2 : null;
      bsy $$4 = this.dZ().a(this, $$3);
      boolean $$5 = $$1.a($$4, 4.0F);
      if ($$5) {
         if (this.dY() instanceof arq $$6) {
            dby.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bve $$7) {
            $$7.b(new btn(btp.y, 200), (bui)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ezn $$0) {
      super.a($$0);
      ((arq)this.dY()).a(ls.w, this.dD(), this.dF(), this.dJ(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(awo.wN, 1.0F, 1.0F);
   }

   private void o() {
      this.av();
      this.dY().a(eak.o, this.dw(), eak.a.a(this));
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);
      this.o();
   }

   @Override
   public boolean bJ() {
      return true;
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (!this.dY().C) {
         this.a(awo.wO, 1.0F, 1.0F);
         ((arq)this.dY()).a(ls.f, this.dD(), this.dF(), this.dJ(), 15, 0.2, 0.2, 0.2, 0.0);
         this.o();
      }

      return true;
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
