import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cnr extends bsw implements buq {
   @Nullable
   private UUID b;
   @Nullable
   private bsw c;
   private boolean d;
   private boolean e;

   cnr(btc<? extends cnr> $$0, dca $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bsw $$0) {
      if ($$0 != null) {
         this.b = $$0.cz();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bsw s() {
      if (this.c != null && !this.c.dK()) {
         return this.c;
      } else if (this.b != null && this.dP() instanceof arf $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bsw I() {
      return (bsw)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(us $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bsw $$0) {
      return $$0.cz().equals(this.b);
   }

   @Override
   protected void a(us $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bsw $$0) {
      super.w($$0);
      if ($$0 instanceof cnr $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dwx.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.u();
      }

      super.l();
   }

   private boolean u() {
      bsw $$0 = this.s();
      if ($$0 != null) {
         for (bsw $$1 : this.dP().a(this, this.cK().b(this.ds()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bz())) {
            if ($$1.cZ() == $$0.cZ()) {
               return false;
            }
         }
      }

      return true;
   }

   public evt d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new evt($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      evt $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      double $$6 = $$5.h();
      this.r((float)(ayz.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(ayz.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   public void a(bsw $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayz.a($$2 * (float) (Math.PI / 180.0)) * ayz.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayz.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayz.b($$2 * (float) (Math.PI / 180.0)) * ayz.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      evt $$9 = $$0.ds();
      this.h(this.ds().b($$9.c, $$0.aE() ? 0.0 : $$9.d, $$9.e));
   }

   protected cns b(evr $$0) {
      if ($$0.c() == evr.a.c) {
         evq $$1 = (evq)$$0;
         cns $$2 = $$1.a().a(this);
         if ($$2 != cns.a) {
            this.a($$2, $$1.a(), this.s(), false);
            return $$2;
         }
      }

      this.a($$0);
      return cns.a;
   }

   public void a(cns $$0, @Nullable bsw $$1, @Nullable bsw $$2, boolean $$3) {
      if (!this.dP().B) {
         $$0.deflect(this, $$1, this.ah);
         this.c($$2);
         this.b($$1, $$3);
      }
   }

   protected void b(@Nullable bsw $$0, boolean $$1) {
   }

   protected void a(evr $$0) {
      evr.a $$1 = $$0.c();
      if ($$1 == evr.a.c) {
         evq $$2 = (evq)$$0;
         bsw $$3 = $$2.a();
         if ($$3.ak().a(awt.H) && $$3 instanceof cnr $$4) {
            $$4.a(cns.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dP().a(dwx.J, $$0.e(), dwx.a.a(this, null));
      } else if ($$1 == evr.a.b) {
         evp $$5 = (evp)$$0;
         this.a($$5);
         iz $$6 = $$5.a();
         this.dP().a(dwx.J, $$6, dwx.a.a(this, this.dP().a_($$6)));
      }
   }

   protected void a(evq $$0) {
   }

   protected void a(evp $$0) {
      dse $$1 = this.dP().a_($$0.a());
      $$1.a(this.dP(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(ayz.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(ayz.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dH();
         this.O = this.dF();
         this.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   protected boolean b(bsw $$0) {
      if (!$$0.by()) {
         return false;
      } else {
         bsw $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      evt $$0 = this.ds();
      double $$1 = $$0.h();
      this.s(d(this.P, (float)(ayz.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.O, (float)(ayz.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayz.i(0.2F, $$0, $$1);
   }

   @Override
   public zw<aci> dl() {
      bsw $$0 = this.s();
      return new acj(this, $$0 == null ? 0 : $$0.al());
   }

   @Override
   public void a(acj $$0) {
      super.a($$0);
      bsw $$1 = this.dP().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dca $$0, iz $$1) {
      bsw $$2 = this.s();
      return $$2 instanceof cmz ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dbw.c);
   }

   public boolean b(dca $$0) {
      return this.ak().a(awt.g) && $$0.ab().b(dbw.g);
   }

   @Override
   public boolean bz() {
      return this.ak().a(awt.H);
   }

   @Override
   public float bK() {
      return this.bz() ? 1.0F : 0.0F;
   }
}
