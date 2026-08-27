import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cmo extends bru implements btn {
   @Nullable
   private UUID b;
   @Nullable
   private bru c;
   private boolean d;
   private boolean e;
   protected boolean f;

   cmo(bsa<? extends cmo> $$0, dax $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bru $$0) {
      if ($$0 != null) {
         this.b = $$0.cz();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bru s() {
      if (this.c != null && !this.c.dK()) {
         return this.c;
      } else if (this.b != null && this.dP() instanceof aqm $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bru I() {
      return (bru)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(ud $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bru $$0) {
      return $$0.cz().equals(this.b);
   }

   @Override
   protected void a(ud $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bru $$0) {
      super.w($$0);
      if ($$0 instanceof cmo $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dvu.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.u();
      }

      super.l();
   }

   private boolean u() {
      bru $$0 = this.s();
      if ($$0 != null) {
         for (bru $$1 : this.dP().a(this, this.cK().b(this.ds()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bz())) {
            if ($$1.cZ() == $$0.cZ()) {
               return false;
            }
         }
      }

      return true;
   }

   public euk d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new euk($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      euk $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(ayd.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(ayd.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   public void a(bru $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayd.a($$2 * (float) (Math.PI / 180.0)) * ayd.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayd.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayd.b($$2 * (float) (Math.PI / 180.0)) * ayd.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      euk $$9 = $$0.ds();
      this.g(this.ds().b($$9.c, $$0.aE() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(eui $$0) {
      eui.a $$1 = $$0.c();
      if ($$1 == eui.a.c) {
         euh $$2 = (euh)$$0;
         if (!this.f) {
            cmp $$3 = $$2.a().a(this);
            if ($$3 != cmp.a) {
               $$3.deflect(this, $$2.a(), this.ah);
               this.f = true;
               return;
            }
         }

         this.a($$2);
         this.dP().a(dvu.J, $$0.e(), dvu.a.a(this, null));
      } else if ($$1 == eui.a.b) {
         eug $$4 = (eug)$$0;
         this.a($$4);
         io $$5 = $$4.a();
         this.dP().a(dvu.J, $$5, dvu.a.a(this, this.dP().a_($$5)));
      }
   }

   protected void a(euh $$0) {
   }

   protected void a(eug $$0) {
      drb $$1 = this.dP().a_($$0.a());
      $$1.a(this.dP(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(ayd.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(ayd.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dH();
         this.O = this.dF();
         this.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   protected boolean b(bru $$0) {
      if (!$$0.by()) {
         return false;
      } else {
         bru $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      euk $$0 = this.ds();
      double $$1 = $$0.h();
      this.s(d(this.P, (float)(ayd.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.O, (float)(ayd.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayd.i(0.2F, $$0, $$1);
   }

   @Override
   public ze<abq> dl() {
      bru $$0 = this.s();
      return new abr(this, $$0 == null ? 0 : $$0.al());
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      bru $$1 = this.dP().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dax $$0, io $$1) {
      bru $$2 = this.s();
      return $$2 instanceof clw ? $$2.a($$0, $$1) : $$2 == null || $$0.aa().b(dat.c);
   }

   public boolean b(dax $$0) {
      return this.ak().a(avz.g) && $$0.aa().b(dat.g);
   }
}
