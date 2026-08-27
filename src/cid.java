import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cid extends bnq implements bpg {
   @Nullable
   private UUID b;
   @Nullable
   private bnq c;
   private boolean d;
   private boolean e;
   protected boolean f;

   cid(bnw<? extends cid> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable bnq $$0) {
      if ($$0 != null) {
         this.b = $$0.cw();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bnq w() {
      if (this.c != null && !this.c.dH()) {
         return this.c;
      } else if (this.b != null && this.dM() instanceof aow $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bnq I() {
      return (bnq)MoreObjects.firstNonNull(this.w(), this);
   }

   @Override
   protected void b(sw $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean d(bnq $$0) {
      return $$0.cw().equals(this.b);
   }

   @Override
   protected void a(sw $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void v(bnq $$0) {
      super.v($$0);
      if ($$0 instanceof cid $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dpw.K, this.w());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.s();
      }

      super.l();
   }

   private boolean s() {
      bnq $$0 = this.w();
      if ($$0 != null) {
         for (bnq $$1 : this.dM().a(this, this.cH().b(this.dp()).g(1.0), $$0x -> !$$0x.P_() && $$0x.bt())) {
            if ($$1.cW() == $$0.cW()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      enz $$5 = new enz($$0, $$1, $$2)
         .d()
         .b(this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(awi.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(awi.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.M = this.dC();
      this.N = this.dE();
   }

   public void a(bnq $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -awi.a($$2 * (float) (Math.PI / 180.0)) * awi.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -awi.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = awi.b($$2 * (float) (Math.PI / 180.0)) * awi.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      enz $$9 = $$0.dp();
      this.g(this.dp().b($$9.c, $$0.aC() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(enx $$0) {
      enx.a $$1 = $$0.c();
      if ($$1 == enx.a.c) {
         enw $$2 = (enw)$$0;
         if (!this.f) {
            cie $$3 = $$2.a().a(this);
            if ($$3 != cie.a) {
               $$3.deflect(this, $$2.a(), this.af);
               this.f = true;
               return;
            }
         }

         this.a($$2);
         this.dM().a(dpw.J, $$0.e(), dpw.a.a(this, null));
      } else if ($$1 == enx.a.b) {
         env $$4 = (env)$$0;
         this.a($$4);
         hz $$5 = $$4.a();
         this.dM().a(dpw.J, $$5, dpw.a.a(this, this.dM().a_($$5)));
      }
   }

   protected void a(enw $$0) {
   }

   protected void a(env $$0) {
      dlj $$1 = this.dM().a_($$0.a());
      $$1.a(this.dM(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.N == 0.0F && this.M == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(awi.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(awi.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dE();
         this.M = this.dC();
         this.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
      }
   }

   protected boolean a(bnq $$0) {
      if (!$$0.bs()) {
         return false;
      } else {
         bnq $$1 = this.w();
         return $$1 == null || this.d || !$$1.x($$0);
      }
   }

   protected void J() {
      enz $$0 = this.dp();
      double $$1 = $$0.h();
      this.s(d(this.N, (float)(awi.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.M, (float)(awi.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return awi.i(0.2F, $$0, $$1);
   }

   @Override
   public xx<aag> di() {
      bnq $$0 = this.w();
      return new aah(this, $$0 == null ? 0 : $$0.aj());
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      bnq $$1 = this.dM().a($$0.p());
      if ($$1 != null) {
         this.b($$1);
      }
   }

   @Override
   public boolean a(cvr $$0, hz $$1) {
      bnq $$2 = this.w();
      return $$2 instanceof chl ? $$2.a($$0, $$1) : $$2 == null || $$0.Z().b(cvn.c);
   }

   public boolean b(cvr $$0) {
      return this.ai().a(aud.g) && $$0.Z().b(cvn.g);
   }
}
