import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cnp extends bsu implements buo {
   @Nullable
   private UUID b;
   @Nullable
   private bsu c;
   private boolean d;
   private boolean e;

   cnp(bta<? extends cnp> $$0, dby $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bsu $$0) {
      if ($$0 != null) {
         this.b = $$0.cz();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bsu s() {
      if (this.c != null && !this.c.dK()) {
         return this.c;
      } else if (this.b != null && this.dP() instanceof arf $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bsu I() {
      return (bsu)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(us $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bsu $$0) {
      return $$0.cz().equals(this.b);
   }

   @Override
   protected void a(us $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bsu $$0) {
      super.w($$0);
      if ($$0 instanceof cnp $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dwv.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.u();
      }

      super.l();
   }

   private boolean u() {
      bsu $$0 = this.s();
      if ($$0 != null) {
         for (bsu $$1 : this.dP().a(this, this.cK().b(this.ds()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bz())) {
            if ($$1.cZ() == $$0.cZ()) {
               return false;
            }
         }
      }

      return true;
   }

   public evr d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new evr($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      evr $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      double $$6 = $$5.h();
      this.r((float)(ayz.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(ayz.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   public void a(bsu $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayz.a($$2 * (float) (Math.PI / 180.0)) * ayz.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayz.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayz.b($$2 * (float) (Math.PI / 180.0)) * ayz.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      evr $$9 = $$0.ds();
      this.h(this.ds().b($$9.c, $$0.aE() ? 0.0 : $$9.d, $$9.e));
   }

   protected cnq b(evp $$0) {
      if ($$0.c() == evp.a.c) {
         evo $$1 = (evo)$$0;
         cnq $$2 = $$1.a().a(this);
         if ($$2 != cnq.a) {
            this.a($$2, $$1.a(), this.s(), false);
            return $$2;
         }
      }

      this.a($$0);
      return cnq.a;
   }

   public void a(cnq $$0, @Nullable bsu $$1, @Nullable bsu $$2, boolean $$3) {
      if (!this.dP().B) {
         $$0.deflect(this, $$1, this.ah);
         this.c($$2);
         this.b($$1, $$3);
      }
   }

   protected void b(@Nullable bsu $$0, boolean $$1) {
   }

   protected void a(evp $$0) {
      evp.a $$1 = $$0.c();
      if ($$1 == evp.a.c) {
         evo $$2 = (evo)$$0;
         bsu $$3 = $$2.a();
         if ($$3.ak().a(awt.H) && $$3 instanceof cnp $$4) {
            $$4.a(cnq.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dP().a(dwv.J, $$0.e(), dwv.a.a(this, null));
      } else if ($$1 == evp.a.b) {
         evn $$5 = (evn)$$0;
         this.a($$5);
         iz $$6 = $$5.a();
         this.dP().a(dwv.J, $$6, dwv.a.a(this, this.dP().a_($$6)));
      }
   }

   protected void a(evo $$0) {
   }

   protected void a(evn $$0) {
      dsc $$1 = this.dP().a_($$0.a());
      $$1.a(this.dP(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(ayz.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(ayz.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dH();
         this.O = this.dF();
         this.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   protected boolean b(bsu $$0) {
      if (!$$0.by()) {
         return false;
      } else {
         bsu $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      evr $$0 = this.ds();
      double $$1 = $$0.h();
      this.s(d(this.P, (float)(ayz.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.O, (float)(ayz.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayz.i(0.2F, $$0, $$1);
   }

   @Override
   public zw<aci> dl() {
      bsu $$0 = this.s();
      return new acj(this, $$0 == null ? 0 : $$0.al());
   }

   @Override
   public void a(acj $$0) {
      super.a($$0);
      bsu $$1 = this.dP().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dby $$0, iz $$1) {
      bsu $$2 = this.s();
      return $$2 instanceof cmx ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dbu.c);
   }

   public boolean b(dby $$0) {
      return this.ak().a(awt.g) && $$0.ab().b(dbu.g);
   }

   @Override
   public boolean bz() {
      return this.ak().a(awt.H);
   }

   @Override
   public float bK() {
      return this.bz() ? 1.0F : 0.0F;
   }
}
