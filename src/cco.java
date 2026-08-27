import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cco extends bis implements bkf {
   @Nullable
   private UUID b;
   @Nullable
   private bis c;
   private boolean d;
   private boolean e;

   cco(biw<? extends cco> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable bis $$0) {
      if ($$0 != null) {
         this.b = $$0.cv();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bis v() {
      if (this.c != null && !this.c.dG()) {
         return this.c;
      } else if (this.b != null && this.dL() instanceof aks) {
         this.c = ((aks)this.dL()).a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bis G() {
      return (bis)MoreObjects.firstNonNull(this.v(), this);
   }

   @Override
   protected void b(qy $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean d(bis $$0) {
      return $$0.cv().equals(this.b);
   }

   @Override
   protected void a(qy $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(djv.K, this.v());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.s();
      }

      super.l();
   }

   private boolean s() {
      bis $$0 = this.v();
      if ($$0 != null) {
         for (bis $$1 : this.dL().a(this, this.cG().b(this.do()).g(1.0), $$0x -> !$$0x.M_() && $$0x.br())) {
            if ($$1.cV() == $$0.cV()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ehp $$5 = new ehp($$0, $$1, $$2)
         .d()
         .b(this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.f($$5);
      double $$6 = $$5.h();
      this.r((float)(ary.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(ary.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dB();
      this.O = this.dD();
   }

   public void a(bis $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ary.a($$2 * (float) (Math.PI / 180.0)) * ary.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ary.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ary.b($$2 * (float) (Math.PI / 180.0)) * ary.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ehp $$9 = $$0.do();
      this.f(this.do().b($$9.c, $$0.aA() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(ehn $$0) {
      ehn.a $$1 = $$0.c();
      if ($$1 == ehn.a.c) {
         this.a((ehm)$$0);
         this.dL().a(djv.J, $$0.e(), djv.a.a(this, null));
      } else if ($$1 == ehn.a.b) {
         ehl $$2 = (ehl)$$0;
         this.a($$2);
         gw $$3 = $$2.a();
         this.dL().a(djv.J, $$3, djv.a.a(this, this.dL().a_($$3)));
      }
   }

   protected void a(ehm $$0) {
   }

   protected void a(ehl $$0) {
      dfl $$1 = this.dL().a_($$0.a());
      $$1.a(this.dL(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(ary.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(ary.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dD();
         this.N = this.dB();
         this.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
      }
   }

   protected boolean a(bis $$0) {
      if (!$$0.bq()) {
         return false;
      } else {
         bis $$1 = this.v();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void H() {
      ehp $$0 = this.do();
      double $$1 = $$0.h();
      this.s(d(this.O, (float)(ary.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.N, (float)(ary.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ary.i(0.2F, $$0, $$1);
   }

   @Override
   public vf<wy> di() {
      bis $$0 = this.v();
      return new wz(this, $$0 == null ? 0 : $$0.ah());
   }

   @Override
   public void a(wz $$0) {
      super.a($$0);
      bis $$1 = this.dL().a($$0.o());
      if ($$1 != null) {
         this.b($$1);
      }
   }

   @Override
   public boolean a(cpx $$0, gw $$1) {
      bis $$2 = this.v();
      return $$2 instanceof cbw ? $$2.a($$0, $$1) : $$2 == null || $$0.X().b(cpt.c);
   }
}
