import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cdp extends bjt implements blg {
   @Nullable
   private UUID b;
   @Nullable
   private bjt c;
   private boolean d;
   private boolean e;

   cdp(bjx<? extends cdp> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable bjt $$0) {
      if ($$0 != null) {
         this.b = $$0.cv();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bjt v() {
      if (this.c != null && !this.c.dG()) {
         return this.c;
      } else if (this.b != null && this.dL() instanceof alq $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bjt G() {
      return (bjt)MoreObjects.firstNonNull(this.v(), this);
   }

   @Override
   protected void b(rt $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean d(bjt $$0) {
      return $$0.cv().equals(this.b);
   }

   @Override
   protected void a(rt $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bjt $$0) {
      super.w($$0);
      if ($$0 instanceof cdp $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dkl.K, this.v());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.s();
      }

      super.l();
   }

   private boolean s() {
      bjt $$0 = this.v();
      if ($$0 != null) {
         for (bjt $$1 : this.dL().a(this, this.cG().b(this.do()).g(1.0), $$0x -> !$$0x.N_() && $$0x.br())) {
            if ($$1.cV() == $$0.cV()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      eif $$5 = new eif($$0, $$1, $$2)
         .d()
         .b(this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.f($$5);
      double $$6 = $$5.h();
      this.r((float)(asy.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(asy.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dB();
      this.O = this.dD();
   }

   public void a(bjt $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -asy.a($$2 * (float) (Math.PI / 180.0)) * asy.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -asy.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = asy.b($$2 * (float) (Math.PI / 180.0)) * asy.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      eif $$9 = $$0.do();
      this.f(this.do().b($$9.c, $$0.aA() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(eid $$0) {
      eid.a $$1 = $$0.c();
      if ($$1 == eid.a.c) {
         this.a((eic)$$0);
         this.dL().a(dkl.J, $$0.e(), dkl.a.a(this, null));
      } else if ($$1 == eid.a.b) {
         eib $$2 = (eib)$$0;
         this.a($$2);
         ht $$3 = $$2.a();
         this.dL().a(dkl.J, $$3, dkl.a.a(this, this.dL().a_($$3)));
      }
   }

   protected void a(eic $$0) {
   }

   protected void a(eib $$0) {
      dgb $$1 = this.dL().a_($$0.a());
      $$1.a(this.dL(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(asy.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(asy.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dD();
         this.N = this.dB();
         this.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
      }
   }

   protected boolean a(bjt $$0) {
      if (!$$0.bq()) {
         return false;
      } else {
         bjt $$1 = this.v();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void H() {
      eif $$0 = this.do();
      double $$1 = $$0.h();
      this.s(d(this.O, (float)(asy.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.N, (float)(asy.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return asy.i(0.2F, $$0, $$1);
   }

   @Override
   public wb<xu> di() {
      bjt $$0 = this.v();
      return new xv(this, $$0 == null ? 0 : $$0.ah());
   }

   @Override
   public void a(xv $$0) {
      super.a($$0);
      bjt $$1 = this.dL().a($$0.o());
      if ($$1 != null) {
         this.b($$1);
      }
   }

   @Override
   public boolean a(cqz $$0, ht $$1) {
      bjt $$2 = this.v();
      return $$2 instanceof ccx ? $$2.a($$0, $$1) : $$2 == null || $$0.X().b(cqv.c);
   }
}
