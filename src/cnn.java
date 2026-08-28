import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cnn extends bsq implements bul {
   @Nullable
   private UUID b;
   @Nullable
   private bsq c;
   private boolean d;
   private boolean e;
   @Nullable
   private bsq f;

   cnn(bsw<? extends cnn> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bsq $$0) {
      if ($$0 != null) {
         this.b = $$0.cA();
         this.c = $$0;
      }
   }

   protected void I() {
      this.b = null;
      this.c = null;
   }

   @Nullable
   @Override
   public bsq s() {
      if (this.c != null && !this.c.dL()) {
         return this.c;
      } else if (this.b != null && this.dQ() instanceof aqt $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bsq J() {
      return (bsq)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(ua $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bsq $$0) {
      return $$0.cA().equals(this.b);
   }

   @Override
   protected void a(ua $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bsq $$0) {
      super.w($$0);
      if ($$0 instanceof cnn $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dxw.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.t();
      }

      super.l();
   }

   private boolean t() {
      bsq $$0 = this.s();
      if ($$0 != null) {
         for (bsq $$1 : this.dQ().a(this, this.cL().b(this.dt()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bA())) {
            if ($$1.da() == $$0.da()) {
               return false;
            }
         }
      }

      return true;
   }

   public eww d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new eww($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      eww $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.av = true;
      double $$6 = $$5.h();
      this.s((float)(ayn.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.t((float)(ayn.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dG();
      this.P = this.dI();
   }

   public void a(bsq $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayn.a($$2 * (float) (Math.PI / 180.0)) * ayn.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayn.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayn.b($$2 * (float) (Math.PI / 180.0)) * ayn.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      eww $$9 = $$0.ag();
      this.i(this.dt().b($$9.c, $$0.aF() ? 0.0 : $$9.d, $$9.e));
   }

   protected cno b(ewu $$0) {
      if ($$0.c() == ewu.a.c) {
         ewt $$1 = (ewt)$$0;
         bsq $$2 = $$1.a();
         cno $$3 = $$2.a(this);
         if ($$3 != cno.a) {
            if ($$2 != this.f && this.a($$3, $$2, this.s(), false)) {
               this.f = $$2;
            }

            return $$3;
         }
      }

      this.a($$0);
      return cno.a;
   }

   public boolean a(cno $$0, @Nullable bsq $$1, @Nullable bsq $$2, boolean $$3) {
      if (!this.dQ().B) {
         $$0.deflect(this, $$1, this.ah);
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable bsq $$0, boolean $$1) {
   }

   protected void a(ewu $$0) {
      ewu.a $$1 = $$0.c();
      if ($$1 == ewu.a.c) {
         ewt $$2 = (ewt)$$0;
         bsq $$3 = $$2.a();
         if ($$3.am().a(awh.H) && $$3 instanceof cnn $$4) {
            $$4.a(cno.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dQ().a(dxw.J, $$0.e(), dxw.a.a(this, null));
      } else if ($$1 == ewu.a.b) {
         ews $$5 = (ews)$$0;
         this.a($$5);
         jd $$6 = $$5.a();
         this.dQ().a(dxw.J, $$6, dxw.a.a(this, this.dQ().a_($$6)));
      }
   }

   protected void a(ewt $$0) {
   }

   protected void a(ews $$0) {
      dta $$1 = this.dQ().a_($$0.a());
      $$1.a(this.dQ(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.t((float)(ayn.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.s((float)(ayn.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dI();
         this.O = this.dG();
         this.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
      }
   }

   protected boolean b(bsq $$0) {
      if (!$$0.bz()) {
         return false;
      } else {
         bsq $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void K() {
      eww $$0 = this.dt();
      double $$1 = $$0.h();
      this.t(e(this.P, (float)(ayn.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.s(e(this.O, (float)(ayn.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float e(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayn.i(0.2F, $$0, $$1);
   }

   @Override
   public zf<abt> dm() {
      bsq $$0 = this.s();
      return new abu(this, $$0 == null ? 0 : $$0.an());
   }

   @Override
   public void a(abu $$0) {
      super.a($$0);
      bsq $$1 = this.dQ().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dcu $$0, jd $$1) {
      bsq $$2 = this.s();
      return $$2 instanceof cmv ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dcq.c);
   }

   public boolean b(dcu $$0) {
      return this.am().a(awh.g) && $$0.ab().b(dcq.g);
   }

   @Override
   public boolean bA() {
      return this.am().a(awh.H);
   }

   @Override
   public float bL() {
      return this.bA() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(btl $$0, brj $$1) {
      double $$2 = this.dt().c;
      double $$3 = this.dt().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
