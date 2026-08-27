import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class clz extends brh implements bsy {
   @Nullable
   private UUID b;
   @Nullable
   private brh c;
   private boolean d;
   private boolean e;
   protected boolean f;

   clz(brn<? extends clz> $$0, dad $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable brh $$0) {
      if ($$0 != null) {
         this.b = $$0.cx();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public brh u() {
      if (this.c != null && !this.c.dI()) {
         return this.c;
      } else if (this.b != null && this.dN() instanceof aqh $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public brh I() {
      return (brh)MoreObjects.firstNonNull(this.u(), this);
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

   protected boolean e(brh $$0) {
      return $$0.cx().equals(this.b);
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
   public void w(brh $$0) {
      super.w($$0);
      if ($$0 instanceof clz $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dva.K, this.u());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.r();
      }

      super.l();
   }

   private boolean r() {
      brh $$0 = this.u();
      if ($$0 != null) {
         for (brh $$1 : this.dN().a(this, this.cI().b(this.dq()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bx())) {
            if ($$1.cX() == $$0.cX()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      etp $$5 = new etp($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(axz.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(axz.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dD();
      this.P = this.dF();
   }

   public void a(brh $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -axz.a($$2 * (float) (Math.PI / 180.0)) * axz.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -axz.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = axz.b($$2 * (float) (Math.PI / 180.0)) * axz.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      etp $$9 = $$0.dq();
      this.g(this.dq().b($$9.c, $$0.aC() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(etn $$0) {
      etn.a $$1 = $$0.c();
      if ($$1 == etn.a.c) {
         etm $$2 = (etm)$$0;
         if (!this.f) {
            cma $$3 = $$2.a().a(this);
            if ($$3 != cma.a) {
               $$3.deflect(this, $$2.a(), this.ah);
               this.f = true;
               return;
            }
         }

         this.a($$2);
         this.dN().a(dva.J, $$0.e(), dva.a.a(this, null));
      } else if ($$1 == etn.a.b) {
         etl $$4 = (etl)$$0;
         this.a($$4);
         in $$5 = $$4.a();
         this.dN().a(dva.J, $$5, dva.a.a(this, this.dN().a_($$5)));
      }
   }

   protected void a(etm $$0) {
   }

   protected void a(etl $$0) {
      dqh $$1 = this.dN().a_($$0.a());
      $$1.a(this.dN(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(axz.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(axz.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dF();
         this.O = this.dD();
         this.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
      }
   }

   protected boolean b(brh $$0) {
      if (!$$0.bw()) {
         return false;
      } else {
         brh $$1 = this.u();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      etp $$0 = this.dq();
      double $$1 = $$0.h();
      this.s(d(this.P, (float)(axz.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.O, (float)(axz.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return axz.i(0.2F, $$0, $$1);
   }

   @Override
   public zb<abm> dj() {
      brh $$0 = this.u();
      return new abn(this, $$0 == null ? 0 : $$0.aj());
   }

   @Override
   public void a(abn $$0) {
      super.a($$0);
      brh $$1 = this.dN().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dad $$0, in $$1) {
      brh $$2 = this.u();
      return $$2 instanceof clh ? $$2.a($$0, $$1) : $$2 == null || $$0.aa().b(czz.c);
   }

   public boolean b(dad $$0) {
      return this.ai().a(avu.g) && $$0.aa().b(czz.g);
   }
}
