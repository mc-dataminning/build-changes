import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cnk extends bsp implements buj {
   @Nullable
   private UUID b;
   @Nullable
   private bsp c;
   private boolean d;
   private boolean e;

   cnk(bsv<? extends cnk> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bsp $$0) {
      if ($$0 != null) {
         this.b = $$0.cz();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bsp s() {
      if (this.c != null && !this.c.dK()) {
         return this.c;
      } else if (this.b != null && this.dP() instanceof arb $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bsp I() {
      return (bsp)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(ur $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean A(bsp $$0) {
      return $$0.cz().equals(this.b);
   }

   @Override
   protected void a(ur $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bsp $$0) {
      super.w($$0);
      if ($$0 instanceof cnk $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dwq.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.u();
      }

      super.l();
   }

   private boolean u() {
      bsp $$0 = this.s();
      if ($$0 != null) {
         for (bsp $$1 : this.dP().a(this, this.cK().b(this.ds()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bz())) {
            if ($$1.cZ() == $$0.cZ()) {
               return false;
            }
         }
      }

      return true;
   }

   public evm d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new evm($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      evm $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      double $$6 = $$5.h();
      this.r((float)(ayu.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(ayu.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   public void a(bsp $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayu.a($$2 * (float) (Math.PI / 180.0)) * ayu.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayu.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayu.b($$2 * (float) (Math.PI / 180.0)) * ayu.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      evm $$9 = $$0.ds();
      this.h(this.ds().b($$9.c, $$0.aE() ? 0.0 : $$9.d, $$9.e));
   }

   protected cnl b(evk $$0) {
      if ($$0.c() == evk.a.c) {
         evj $$1 = (evj)$$0;
         cnl $$2 = $$1.a().a(this);
         if ($$2 != cnl.a) {
            $$2.deflect(this, $$1.a(), this.ah);
            this.bv();
            return $$2;
         }
      }

      this.a($$0);
      return cnl.a;
   }

   protected void a(evk $$0) {
      evk.a $$1 = $$0.c();
      if ($$1 == evk.a.c) {
         evj $$2 = (evj)$$0;
         this.a($$2);
         this.dP().a(dwq.J, $$0.e(), dwq.a.a(this, null));
      } else if ($$1 == evk.a.b) {
         evi $$3 = (evi)$$0;
         this.a($$3);
         iz $$4 = $$3.a();
         this.dP().a(dwq.J, $$4, dwq.a.a(this, this.dP().a_($$4)));
      }
   }

   protected void a(evj $$0) {
   }

   protected void a(evi $$0) {
      drx $$1 = this.dP().a_($$0.a());
      $$1.a(this.dP(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(ayu.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(ayu.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dH();
         this.O = this.dF();
         this.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   protected boolean b(bsp $$0) {
      if (!$$0.by()) {
         return false;
      } else {
         bsp $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      evm $$0 = this.ds();
      double $$1 = $$0.h();
      this.s(d(this.P, (float)(ayu.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.O, (float)(ayu.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayu.i(0.2F, $$0, $$1);
   }

   @Override
   public zs<ace> dl() {
      bsp $$0 = this.s();
      return new acf(this, $$0 == null ? 0 : $$0.al());
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      bsp $$1 = this.dP().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dbt $$0, iz $$1) {
      bsp $$2 = this.s();
      return $$2 instanceof cms ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dbp.c);
   }

   public boolean b(dbt $$0) {
      return this.ak().a(awp.g) && $$0.ab().b(dbp.g);
   }

   public void af_() {
   }

   protected void d(bsp $$0) {
      evm $$1 = $$0.bL();
      this.h($$1.a(this.ds().f()));
   }

   @Override
   public boolean bz() {
      return this.ak().a(awp.H);
   }

   @Override
   public float bK() {
      return this.bz() ? 1.0F : 0.0F;
   }

   public boolean a(bri $$0) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bv();
         bsp $$1 = $$0.d();
         if ($$1 != null) {
            if (!this.dP().B) {
               this.d($$1);
               this.c($$1);
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
