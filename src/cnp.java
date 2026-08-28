import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cnp extends bsr implements bun {
   @Nullable
   private UUID b;
   @Nullable
   private bsr c;
   private boolean d;
   private boolean e;
   @Nullable
   private bsr f;

   cnp(bsx<? extends cnp> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bsr $$0) {
      if ($$0 != null) {
         this.b = $$0.cA();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bsr s() {
      if (this.c != null && !this.c.dK()) {
         return this.c;
      } else if (this.b != null && this.dP() instanceof aqu $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bsr H() {
      return (bsr)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(ub $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bsr $$0) {
      return $$0.cA().equals(this.b);
   }

   @Override
   protected void a(ub $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bsr $$0) {
      super.w($$0);
      if ($$0 instanceof cnp $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dxz.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.t();
      }

      super.l();
   }

   private boolean t() {
      bsr $$0 = this.s();
      if ($$0 != null) {
         for (bsr $$1 : this.dP().a(this, this.cL().b(this.ds()).g(1.0), $$0x -> !$$0x.R_() && $$0x.bA())) {
            if ($$1.da() == $$0.da()) {
               return false;
            }
         }
      }

      return true;
   }

   public exa d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new exa($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      exa $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.av = true;
      double $$6 = $$5.h();
      this.t((float)(ayo.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.u((float)(ayo.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   public void a(bsr $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayo.a($$2 * (float) (Math.PI / 180.0)) * ayo.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayo.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayo.b($$2 * (float) (Math.PI / 180.0)) * ayo.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      exa $$9 = $$0.ag();
      this.i(this.ds().b($$9.c, $$0.aF() ? 0.0 : $$9.d, $$9.e));
   }

   protected cnq b(ewy $$0) {
      if ($$0.c() == ewy.a.c) {
         ewx $$1 = (ewx)$$0;
         bsr $$2 = $$1.a();
         cnq $$3 = $$2.a(this);
         if ($$3 != cnq.a) {
            if ($$2 != this.f && this.a($$3, $$2, this.s(), false)) {
               this.f = $$2;
            }

            return $$3;
         }
      }

      this.a($$0);
      return cnq.a;
   }

   public boolean a(cnq $$0, @Nullable bsr $$1, @Nullable bsr $$2, boolean $$3) {
      if (!this.dP().B) {
         $$0.deflect(this, $$1, this.ah);
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable bsr $$0, boolean $$1) {
   }

   protected void a(ewy $$0) {
      ewy.a $$1 = $$0.c();
      if ($$1 == ewy.a.c) {
         ewx $$2 = (ewx)$$0;
         bsr $$3 = $$2.a();
         if ($$3.am().a(awi.H) && $$3 instanceof cnp $$4) {
            $$4.a(cnq.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dP().a(dxz.J, $$0.e(), dxz.a.a(this, null));
      } else if ($$1 == ewy.a.b) {
         eww $$5 = (eww)$$0;
         this.a($$5);
         jd $$6 = $$5.a();
         this.dP().a(dxz.J, $$6, dxz.a.a(this, this.dP().a_($$6)));
      }
   }

   protected void a(ewx $$0) {
   }

   protected void a(eww $$0) {
      dtc $$1 = this.dP().a_($$0.a());
      $$1.a(this.dP(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.u((float)(ayo.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.t((float)(ayo.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dH();
         this.O = this.dF();
         this.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   protected boolean b(bsr $$0) {
      if (!$$0.bz()) {
         return false;
      } else {
         bsr $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   @Override
   protected void I() {
      exa $$0 = this.ds();
      double $$1 = $$0.h();
      this.u(e(this.P, (float)(ayo.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.t(e(this.O, (float)(ayo.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float e(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayo.i(0.2F, $$0, $$1);
   }

   @Override
   public zg<abu> a(aqt $$0) {
      bsr $$1 = this.s();
      return new abv(this, $$0, $$1 == null ? 0 : $$1.an());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      bsr $$1 = this.dP().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dcw $$0, jd $$1) {
      bsr $$2 = this.s();
      return $$2 instanceof cmx ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dcs.c);
   }

   public boolean b(dcw $$0) {
      return this.am().a(awi.g) && $$0.ab().b(dcs.g);
   }

   @Override
   public boolean bA() {
      return this.am().a(awi.H);
   }

   @Override
   public float bL() {
      return this.bA() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(btn $$0, brk $$1) {
      double $$2 = this.ds().c;
      double $$3 = this.ds().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
