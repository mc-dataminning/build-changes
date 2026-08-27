import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cld extends bql implements bsc {
   @Nullable
   private UUID b;
   @Nullable
   private bql c;
   private boolean d;
   private boolean e;
   protected boolean f;

   cld(bqr<? extends cld> $$0, czu $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bql $$0) {
      if ($$0 != null) {
         this.b = $$0.cx();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bql u() {
      if (this.c != null && !this.c.dI()) {
         return this.c;
      } else if (this.b != null && this.dN() instanceof aqe $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bql I() {
      return (bql)MoreObjects.firstNonNull(this.u(), this);
   }

   @Override
   protected void b(ty $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bql $$0) {
      return $$0.cx().equals(this.b);
   }

   @Override
   protected void a(ty $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bql $$0) {
      super.w($$0);
      if ($$0 instanceof cld $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dur.K, this.u());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.r();
      }

      super.l();
   }

   private boolean r() {
      bql $$0 = this.u();
      if ($$0 != null) {
         for (bql $$1 : this.dN().a(this, this.cI().b(this.dq()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bx())) {
            if ($$1.cX() == $$0.cX()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      etf $$5 = new etf($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(axw.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(axw.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dD();
      this.P = this.dF();
   }

   public void a(bql $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -axw.a($$2 * (float) (Math.PI / 180.0)) * axw.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -axw.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = axw.b($$2 * (float) (Math.PI / 180.0)) * axw.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      etf $$9 = $$0.dq();
      this.g(this.dq().b($$9.c, $$0.aC() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(etd $$0) {
      etd.a $$1 = $$0.c();
      if ($$1 == etd.a.c) {
         etc $$2 = (etc)$$0;
         if (!this.f) {
            cle $$3 = $$2.a().a(this);
            if ($$3 != cle.a) {
               $$3.deflect(this, $$2.a(), this.ah);
               this.f = true;
               return;
            }
         }

         this.a($$2);
         this.dN().a(dur.J, $$0.e(), dur.a.a(this, null));
      } else if ($$1 == etd.a.b) {
         etb $$4 = (etb)$$0;
         this.a($$4);
         im $$5 = $$4.a();
         this.dN().a(dur.J, $$5, dur.a.a(this, this.dN().a_($$5)));
      }
   }

   protected void a(etc $$0) {
   }

   protected void a(etb $$0) {
      dpy $$1 = this.dN().a_($$0.a());
      $$1.a(this.dN(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(axw.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(axw.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dF();
         this.O = this.dD();
         this.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
      }
   }

   protected boolean b(bql $$0) {
      if (!$$0.bw()) {
         return false;
      } else {
         bql $$1 = this.u();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      etf $$0 = this.dq();
      double $$1 = $$0.h();
      this.s(d(this.P, (float)(axw.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.O, (float)(axw.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return axw.i(0.2F, $$0, $$1);
   }

   @Override
   public yz<abk> dj() {
      bql $$0 = this.u();
      return new abl(this, $$0 == null ? 0 : $$0.aj());
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      bql $$1 = this.dN().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(czu $$0, im $$1) {
      bql $$2 = this.u();
      return $$2 instanceof ckl ? $$2.a($$0, $$1) : $$2 == null || $$0.aa().b(czq.c);
   }

   public boolean b(czu $$0) {
      return this.ai().a(avr.g) && $$0.aa().b(czq.g);
   }
}
