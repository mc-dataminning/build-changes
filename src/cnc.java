import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cnc extends bsg implements bua {
   @Nullable
   private UUID b;
   @Nullable
   private bsg c;
   private boolean d;
   private boolean e;
   @Nullable
   private bsg f;

   cnc(bsm<? extends cnc> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bsg $$0) {
      if ($$0 != null) {
         this.b = $$0.cA();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bsg s() {
      if (this.c != null && !this.c.dL()) {
         return this.c;
      } else if (this.b != null && this.dQ() instanceof aqm $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bsg I() {
      return (bsg)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(tx $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bsg $$0) {
      return $$0.cA().equals(this.b);
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bsg $$0) {
      super.w($$0);
      if ($$0 instanceof cnc $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dxg.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.u();
      }

      super.l();
   }

   private boolean u() {
      bsg $$0 = this.s();
      if ($$0 != null) {
         for (bsg $$1 : this.dQ().a(this, this.cL().b(this.dt()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bA())) {
            if ($$1.da() == $$0.da()) {
               return false;
            }
         }
      }

      return true;
   }

   public ewf d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new ewf($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ewf $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.av = true;
      double $$6 = $$5.h();
      this.s((float)(ayg.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.t((float)(ayg.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dG();
      this.P = this.dI();
   }

   public void a(bsg $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayg.a($$2 * (float) (Math.PI / 180.0)) * ayg.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayg.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayg.b($$2 * (float) (Math.PI / 180.0)) * ayg.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ewf $$9 = $$0.dt();
      this.i(this.dt().b($$9.c, $$0.aF() ? 0.0 : $$9.d, $$9.e));
   }

   protected cnd b(ewd $$0) {
      if ($$0.c() == ewd.a.c) {
         ewc $$1 = (ewc)$$0;
         bsg $$2 = $$1.a();
         cnd $$3 = $$2.a(this);
         if ($$3 != cnd.a) {
            if ($$2 != this.f) {
               this.f = $$2;
               this.a($$3, $$2, this.s(), false);
            }

            return $$3;
         }
      }

      this.a($$0);
      return cnd.a;
   }

   public void a(cnd $$0, @Nullable bsg $$1, @Nullable bsg $$2, boolean $$3) {
      if (!this.dQ().B) {
         $$0.deflect(this, $$1, this.ah);
         this.c($$2);
         this.b($$1, $$3);
      }
   }

   protected void b(@Nullable bsg $$0, boolean $$1) {
   }

   protected void a(ewd $$0) {
      ewd.a $$1 = $$0.c();
      if ($$1 == ewd.a.c) {
         ewc $$2 = (ewc)$$0;
         bsg $$3 = $$2.a();
         if ($$3.al().a(awa.H) && $$3 instanceof cnc $$4) {
            $$4.a(cnd.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dQ().a(dxg.J, $$0.e(), dxg.a.a(this, null));
      } else if ($$1 == ewd.a.b) {
         ewb $$5 = (ewb)$$0;
         this.a($$5);
         ja $$6 = $$5.a();
         this.dQ().a(dxg.J, $$6, dxg.a.a(this, this.dQ().a_($$6)));
      }
   }

   protected void a(ewc $$0) {
   }

   protected void a(ewb $$0) {
      dsk $$1 = this.dQ().a_($$0.a());
      $$1.a(this.dQ(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.t((float)(ayg.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.s((float)(ayg.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dI();
         this.O = this.dG();
         this.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
      }
   }

   protected boolean b(bsg $$0) {
      if (!$$0.bz()) {
         return false;
      } else {
         bsg $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      ewf $$0 = this.dt();
      double $$1 = $$0.h();
      this.t(d(this.P, (float)(ayg.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.s(d(this.O, (float)(ayg.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayg.i(0.2F, $$0, $$1);
   }

   @Override
   public zb<abn> dm() {
      bsg $$0 = this.s();
      return new abo(this, $$0 == null ? 0 : $$0.am());
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      bsg $$1 = this.dQ().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dcf $$0, ja $$1) {
      bsg $$2 = this.s();
      return $$2 instanceof cmk ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dcb.c);
   }

   public boolean b(dcf $$0) {
      return this.al().a(awa.g) && $$0.ab().b(dcb.g);
   }

   @Override
   public boolean bA() {
      return this.al().a(awa.H);
   }

   @Override
   public float bL() {
      return this.bA() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(btb $$0, bqz $$1) {
      double $$2 = this.dt().c;
      double $$3 = this.dt().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
