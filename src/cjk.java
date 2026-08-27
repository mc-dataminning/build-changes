import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cjk extends bow implements bqm {
   @Nullable
   private UUID b;
   @Nullable
   private bow c;
   private boolean d;
   private boolean e;
   protected boolean f;

   cjk(bpc<? extends cjk> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bow $$0) {
      if ($$0 != null) {
         this.b = $$0.cw();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bow af_() {
      if (this.c != null && !this.c.dH()) {
         return this.c;
      } else if (this.b != null && this.dM() instanceof apf $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bow H() {
      return (bow)MoreObjects.firstNonNull(this.af_(), this);
   }

   @Override
   protected void b(ta $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bow $$0) {
      return $$0.cw().equals(this.b);
   }

   @Override
   protected void a(ta $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bow $$0) {
      super.w($$0);
      if ($$0 instanceof cjk $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(drn.K, this.af_());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.r();
      }

      super.l();
   }

   private boolean r() {
      bow $$0 = this.af_();
      if ($$0 != null) {
         for (bow $$1 : this.dM().a(this, this.cH().b(this.dp()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bw())) {
            if ($$1.cW() == $$0.cW()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      epr $$5 = new epr($$0, $$1, $$2)
         .d()
         .b(this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(aww.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(aww.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dC();
      this.O = this.dE();
   }

   public void a(bow $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -aww.a($$2 * (float) (Math.PI / 180.0)) * aww.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -aww.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = aww.b($$2 * (float) (Math.PI / 180.0)) * aww.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      epr $$9 = $$0.dp();
      this.g(this.dp().b($$9.c, $$0.aC() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(epp $$0) {
      epp.a $$1 = $$0.c();
      if ($$1 == epp.a.c) {
         epo $$2 = (epo)$$0;
         if (!this.f) {
            cjl $$3 = $$2.a().a(this);
            if ($$3 != cjl.a) {
               $$3.deflect(this, $$2.a(), this.ag);
               this.f = true;
               return;
            }
         }

         this.a($$2);
         this.dM().a(drn.J, $$0.e(), drn.a.a(this, null));
      } else if ($$1 == epp.a.b) {
         epn $$4 = (epn)$$0;
         this.a($$4);
         ib $$5 = $$4.a();
         this.dM().a(drn.J, $$5, drn.a.a(this, this.dM().a_($$5)));
      }
   }

   protected void a(epo $$0) {
   }

   protected void a(epn $$0) {
      dmz $$1 = this.dM().a_($$0.a());
      $$1.a(this.dM(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(aww.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(aww.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dE();
         this.N = this.dC();
         this.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
      }
   }

   protected boolean b(bow $$0) {
      if (!$$0.bv()) {
         return false;
      } else {
         bow $$1 = this.af_();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void I() {
      epr $$0 = this.dp();
      double $$1 = $$0.h();
      this.s(d(this.O, (float)(aww.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.N, (float)(aww.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return aww.i(0.2F, $$0, $$1);
   }

   @Override
   public yb<aam> di() {
      bow $$0 = this.af_();
      return new aan(this, $$0 == null ? 0 : $$0.aj());
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      bow $$1 = this.dM().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(cwz $$0, ib $$1) {
      bow $$2 = this.af_();
      return $$2 instanceof cis ? $$2.a($$0, $$1) : $$2 == null || $$0.Z().b(cwv.c);
   }

   public boolean b(cwz $$0) {
      return this.ai().a(auq.g) && $$0.Z().b(cwv.g);
   }
}
