import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cms extends brv implements btm {
   @Nullable
   private UUID b;
   @Nullable
   private brv c;
   private boolean d;
   private boolean e;
   protected boolean f;

   cms(bsb<? extends cms> $$0, dca $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable brv $$0) {
      if ($$0 != null) {
         this.b = $$0.cE();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public brv t() {
      if (this.c != null && !this.c.dP()) {
         return this.c;
      } else if (this.b != null && this.dU() instanceof aqt $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public brv I() {
      return (brv)MoreObjects.firstNonNull(this.t(), this);
   }

   @Override
   protected void b(uk $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(brv $$0) {
      return $$0.cE().equals(this.b);
   }

   @Override
   protected void a(uk $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(brv $$0) {
      super.w($$0);
      if ($$0 instanceof cms $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dxv.K, this.t());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.r();
      }

      super.l();
   }

   private boolean r() {
      brv $$0 = this.t();
      if ($$0 != null) {
         for (brv $$1 : this.dU().a(this, this.cP().b(this.dx()).g(1.0), $$0x -> !$$0x.O_() && $$0x.bE())) {
            if ($$1.de() == $$0.de()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ewu $$5 = new ewu($$0, $$1, $$2)
         .d()
         .b(this.al.a(0.0, 0.0172275 * (double)$$4), this.al.a(0.0, 0.0172275 * (double)$$4), this.al.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(aym.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(aym.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.P = this.dK();
      this.Q = this.dM();
   }

   public void a(brv $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -aym.a($$2 * (float) (Math.PI / 180.0)) * aym.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -aym.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = aym.b($$2 * (float) (Math.PI / 180.0)) * aym.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ewu $$9 = $$0.dx();
      this.g(this.dx().b($$9.c, $$0.aE() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(ews $$0) {
      ews.a $$1 = $$0.c();
      if ($$1 == ews.a.c) {
         ewr $$2 = (ewr)$$0;
         if (!this.f) {
            cmt $$3 = $$2.a().a(this);
            if ($$3 != cmt.a) {
               $$3.deflect(this, $$2.a(), this.al);
               this.f = true;
               return;
            }
         }

         this.a($$2);
         this.dU().a(dxv.J, $$0.e(), dxv.a.a(this, null));
      } else if ($$1 == ews.a.b) {
         ewq $$4 = (ewq)$$0;
         this.a($$4);
         ir $$5 = $$4.a();
         this.dU().a(dxv.J, $$5, dxv.a.a(this, this.dU().a_($$5)));
      }
   }

   protected void a(ewr $$0) {
   }

   protected void a(ewq $$0) {
      dtc $$1 = this.dU().a_($$0.a());
      $$1.a(this.dU(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.Q == 0.0F && this.P == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(aym.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(aym.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.Q = this.dM();
         this.P = this.dK();
         this.b(this.dz(), this.dB(), this.dF(), this.dK(), this.dM());
      }
   }

   protected boolean b(brv $$0) {
      if (!$$0.bD()) {
         return false;
      } else {
         brv $$1 = this.t();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      ewu $$0 = this.dx();
      double $$1 = $$0.h();
      this.s(d(this.Q, (float)(aym.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.P, (float)(aym.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return aym.i(0.2F, $$0, $$1);
   }

   @Override
   public zl<abw> dq() {
      brv $$0 = this.t();
      return new abx(this, $$0 == null ? 0 : $$0.al());
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      brv $$1 = this.dU().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dca $$0, ir $$1) {
      brv $$2 = this.t();
      return $$2 instanceof cly ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dbw.c);
   }

   public boolean b(dca $$0) {
      return this.ak().a(awh.g) && $$0.ab().b(dbw.g);
   }
}
