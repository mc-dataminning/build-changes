import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class chz extends bno implements bpc {
   @Nullable
   private UUID b;
   @Nullable
   private bno c;
   private boolean d;
   private boolean e;

   chz(bnu<? extends chz> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable bno $$0) {
      if ($$0 != null) {
         this.b = $$0.cw();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bno w() {
      if (this.c != null && !this.c.dH()) {
         return this.c;
      } else if (this.b != null && this.dM() instanceof aov $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bno I() {
      return (bno)MoreObjects.firstNonNull(this.w(), this);
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

   protected boolean d(bno $$0) {
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
   public void v(bno $$0) {
      super.v($$0);
      if ($$0 instanceof chz $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dpp.K, this.w());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.s();
      }

      super.l();
   }

   private boolean s() {
      bno $$0 = this.w();
      if ($$0 != null) {
         for (bno $$1 : this.dM().a(this, this.cH().b(this.dp()).g(1.0), $$0x -> !$$0x.P_() && $$0x.bt())) {
            if ($$1.cW() == $$0.cW()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ens $$5 = new ens($$0, $$1, $$2)
         .d()
         .b(this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(awh.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(awh.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.M = this.dC();
      this.N = this.dE();
   }

   public void a(bno $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -awh.a($$2 * (float) (Math.PI / 180.0)) * awh.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -awh.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = awh.b($$2 * (float) (Math.PI / 180.0)) * awh.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ens $$9 = $$0.dp();
      this.g(this.dp().b($$9.c, $$0.aC() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(enq $$0) {
      enq.a $$1 = $$0.c();
      if ($$1 == enq.a.c) {
         enp $$2 = (enp)$$0;
         cia $$3 = $$2.a().a(this);
         if ($$3 != cia.a) {
            $$3.deflect(this, $$2.a(), this.af);
            return;
         }

         this.a($$2);
         this.dM().a(dpp.J, $$0.e(), dpp.a.a(this, null));
      } else if ($$1 == enq.a.b) {
         eno $$4 = (eno)$$0;
         this.a($$4);
         hz $$5 = $$4.a();
         this.dM().a(dpp.J, $$5, dpp.a.a(this, this.dM().a_($$5)));
      }
   }

   protected void a(enp $$0) {
   }

   protected void a(eno $$0) {
      dlf $$1 = this.dM().a_($$0.a());
      $$1.a(this.dM(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.N == 0.0F && this.M == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(awh.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(awh.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dE();
         this.M = this.dC();
         this.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
      }
   }

   protected boolean a(bno $$0) {
      if (!$$0.bs()) {
         return false;
      } else {
         bno $$1 = this.w();
         return $$1 == null || this.d || !$$1.x($$0);
      }
   }

   protected void J() {
      ens $$0 = this.dp();
      double $$1 = $$0.h();
      this.s(d(this.N, (float)(awh.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.M, (float)(awh.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return awh.i(0.2F, $$0, $$1);
   }

   @Override
   public xx<aag> di() {
      bno $$0 = this.w();
      return new aah(this, $$0 == null ? 0 : $$0.aj());
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      bno $$1 = this.dM().a($$0.p());
      if ($$1 != null) {
         this.b($$1);
      }
   }

   @Override
   public boolean a(cvn $$0, hz $$1) {
      bno $$2 = this.w();
      return $$2 instanceof chh ? $$2.a($$0, $$1) : $$2 == null || $$0.Z().b(cvj.c);
   }

   public boolean b(cvn $$0) {
      return this.ai().a(auc.g) && $$0.Z().b(cvj.g);
   }
}
