import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cem extends bkq implements bmd {
   @Nullable
   private UUID b;
   @Nullable
   private bkq c;
   private boolean d;
   private boolean e;

   cem(bku<? extends cem> $$0, csa $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable bkq $$0) {
      if ($$0 != null) {
         this.b = $$0.cw();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bkq w() {
      if (this.c != null && !this.c.dI()) {
         return this.c;
      } else if (this.b != null && this.dN() instanceof ame $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bkq I() {
      return (bkq)MoreObjects.firstNonNull(this.w(), this);
   }

   @Override
   protected void b(rz $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean d(bkq $$0) {
      return $$0.cw().equals(this.b);
   }

   @Override
   protected void a(rz $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bkq $$0) {
      super.w($$0);
      if ($$0 instanceof cem $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dls.K, this.w());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.s();
      }

      super.l();
   }

   private boolean s() {
      bkq $$0 = this.w();
      if ($$0 != null) {
         for (bkq $$1 : this.dN().a(this, this.cH().b(this.dq()).g(1.0), $$0x -> !$$0x.O_() && $$0x.bt())) {
            if ($$1.cX() == $$0.cX()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      eju $$5 = new eju($$0, $$1, $$2)
         .d()
         .b(this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(atm.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(atm.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dD();
      this.O = this.dF();
   }

   public void a(bkq $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -atm.a($$2 * (float) (Math.PI / 180.0)) * atm.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -atm.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = atm.b($$2 * (float) (Math.PI / 180.0)) * atm.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      eju $$9 = $$0.dq();
      this.g(this.dq().b($$9.c, $$0.aC() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(ejs $$0) {
      ejs.a $$1 = $$0.c();
      if ($$1 == ejs.a.c) {
         this.a((ejr)$$0);
         this.dN().a(dls.J, $$0.e(), dls.a.a(this, null));
      } else if ($$1 == ejs.a.b) {
         ejq $$2 = (ejq)$$0;
         this.a($$2);
         ht $$3 = $$2.a();
         this.dN().a(dls.J, $$3, dls.a.a(this, this.dN().a_($$3)));
      }
   }

   protected void a(ejr $$0) {
   }

   protected void a(ejq $$0) {
      dhi $$1 = this.dN().a_($$0.a());
      $$1.a(this.dN(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(atm.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(atm.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dF();
         this.N = this.dD();
         this.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
      }
   }

   protected boolean a(bkq $$0) {
      if (!$$0.bs()) {
         return false;
      } else {
         bkq $$1 = this.w();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      eju $$0 = this.dq();
      double $$1 = $$0.h();
      this.s(d(this.O, (float)(atm.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.N, (float)(atm.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return atm.i(0.2F, $$0, $$1);
   }

   @Override
   public wk<yd> dk() {
      bkq $$0 = this.w();
      return new ye(this, $$0 == null ? 0 : $$0.aj());
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      bkq $$1 = this.dN().a($$0.o());
      if ($$1 != null) {
         this.b($$1);
      }
   }

   @Override
   public boolean a(csa $$0, ht $$1) {
      bkq $$2 = this.w();
      return $$2 instanceof cdu ? $$2.a($$0, $$1) : $$2 == null || $$0.Y().b(crw.c);
   }

   public boolean b(csa $$0) {
      return this.ai().a(arj.g) && $$0.Y().b(crw.g);
   }
}
