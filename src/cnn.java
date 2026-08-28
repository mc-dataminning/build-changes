import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cnn extends bss implements bum {
   @Nullable
   private UUID b;
   @Nullable
   private bss c;
   private boolean d;
   private boolean e;

   cnn(bsy<? extends cnn> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bss $$0) {
      if ($$0 != null) {
         this.b = $$0.cz();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bss s() {
      if (this.c != null && !this.c.dK()) {
         return this.c;
      } else if (this.b != null && this.dP() instanceof are $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bss I() {
      return (bss)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(ur $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean A(bss $$0) {
      return $$0.cz().equals(this.b);
   }

   @Override
   protected void a(ur $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(bss $$0) {
      super.w($$0);
      if ($$0 instanceof cnn $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dwt.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.u();
      }

      super.l();
   }

   private boolean u() {
      bss $$0 = this.s();
      if ($$0 != null) {
         for (bss $$1 : this.dP().a(this, this.cK().b(this.ds()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bz())) {
            if ($$1.cZ() == $$0.cZ()) {
               return false;
            }
         }
      }

      return true;
   }

   public evp d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new evp($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      evp $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      double $$6 = $$5.h();
      this.r((float)(ayx.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(ayx.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   public void a(bss $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayx.a($$2 * (float) (Math.PI / 180.0)) * ayx.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayx.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayx.b($$2 * (float) (Math.PI / 180.0)) * ayx.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      evp $$9 = $$0.ds();
      this.h(this.ds().b($$9.c, $$0.aE() ? 0.0 : $$9.d, $$9.e));
   }

   protected cno b(evn $$0) {
      if ($$0.c() == evn.a.c) {
         evm $$1 = (evm)$$0;
         cno $$2 = $$1.a().a(this);
         if ($$2 != cno.a) {
            $$2.deflect(this, $$1.a(), this.ah);
            this.bv();
            return $$2;
         }
      }

      this.a($$0);
      return cno.a;
   }

   protected void a(evn $$0) {
      evn.a $$1 = $$0.c();
      if ($$1 == evn.a.c) {
         evm $$2 = (evm)$$0;
         this.a($$2);
         this.dP().a(dwt.J, $$0.e(), dwt.a.a(this, null));
      } else if ($$1 == evn.a.b) {
         evl $$3 = (evl)$$0;
         this.a($$3);
         iz $$4 = $$3.a();
         this.dP().a(dwt.J, $$4, dwt.a.a(this, this.dP().a_($$4)));
      }
   }

   protected void a(evm $$0) {
   }

   protected void a(evl $$0) {
      dsa $$1 = this.dP().a_($$0.a());
      $$1.a(this.dP(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(ayx.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(ayx.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dH();
         this.O = this.dF();
         this.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   protected boolean b(bss $$0) {
      if (!$$0.by()) {
         return false;
      } else {
         bss $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      evp $$0 = this.ds();
      double $$1 = $$0.h();
      this.s(d(this.P, (float)(ayx.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.O, (float)(ayx.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayx.i(0.2F, $$0, $$1);
   }

   @Override
   public zv<ach> dl() {
      bss $$0 = this.s();
      return new aci(this, $$0 == null ? 0 : $$0.al());
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      bss $$1 = this.dP().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dbw $$0, iz $$1) {
      bss $$2 = this.s();
      return $$2 instanceof cmv ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dbs.c);
   }

   public boolean b(dbw $$0) {
      return this.ak().a(aws.g) && $$0.ab().b(dbs.g);
   }

   public void af_() {
   }

   protected void d(bss $$0) {
      evp $$1 = $$0.bL();
      this.h($$1.a(this.ds().f()));
   }

   @Override
   public boolean bz() {
      return this.ak().a(aws.H);
   }

   @Override
   public float bK() {
      return this.bz() ? 1.0F : 0.0F;
   }

   public boolean a(brl $$0) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bv();
         bss $$1 = $$0.d();
         if ($$1 != null) {
            if (!this.dP().B) {
               this.d($$1);
               this.c($$1);
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
