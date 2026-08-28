import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cno extends bst implements bun {
   @Nullable
   private UUID b;
   @Nullable
   private bst c;
   private boolean d;
   private boolean e;

   cno(bsz<? extends cno> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bst $$0) {
      if ($$0 != null) {
         this.b = $$0.cz();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bst s() {
      if (this.c != null && !this.c.dK()) {
         return this.c;
      } else if (this.b != null && this.dP() instanceof are $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bst I() {
      return (bst)MoreObjects.firstNonNull(this.s(), this);
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

   protected boolean e(bst $$0) {
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
   public void w(bst $$0) {
      super.w($$0);
      if ($$0 instanceof cno $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dwu.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.u();
      }

      super.l();
   }

   private boolean u() {
      bst $$0 = this.s();
      if ($$0 != null) {
         for (bst $$1 : this.dP().a(this, this.cK().b(this.ds()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bz())) {
            if ($$1.cZ() == $$0.cZ()) {
               return false;
            }
         }
      }

      return true;
   }

   public evq d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new evq($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      evq $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      double $$6 = $$5.h();
      this.r((float)(ayy.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(ayy.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   public void a(bst $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayy.a($$2 * (float) (Math.PI / 180.0)) * ayy.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayy.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayy.b($$2 * (float) (Math.PI / 180.0)) * ayy.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      evq $$9 = $$0.ds();
      this.h(this.ds().b($$9.c, $$0.aE() ? 0.0 : $$9.d, $$9.e));
   }

   protected cnp b(evo $$0) {
      if ($$0.c() == evo.a.c) {
         evn $$1 = (evn)$$0;
         cnp $$2 = $$1.a().a(this);
         if ($$2 != cnp.a) {
            this.a($$2, $$1.a(), this.s(), false);
            return $$2;
         }
      }

      this.a($$0);
      return cnp.a;
   }

   public void a(cnp $$0, @Nullable bst $$1, @Nullable bst $$2, boolean $$3) {
      if (!this.dP().B) {
         $$0.deflect(this, $$1, this.ah);
         this.c($$2);
         this.b($$1, $$3);
      }
   }

   protected void b(@Nullable bst $$0, boolean $$1) {
   }

   protected void a(evo $$0) {
      evo.a $$1 = $$0.c();
      if ($$1 == evo.a.c) {
         evn $$2 = (evn)$$0;
         bst $$3 = $$2.a();
         if ($$3.ak().a(aws.H) && $$3 instanceof cno $$4) {
            $$4.a(cnp.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dP().a(dwu.J, $$0.e(), dwu.a.a(this, null));
      } else if ($$1 == evo.a.b) {
         evm $$5 = (evm)$$0;
         this.a($$5);
         iz $$6 = $$5.a();
         this.dP().a(dwu.J, $$6, dwu.a.a(this, this.dP().a_($$6)));
      }
   }

   protected void a(evn $$0) {
   }

   protected void a(evm $$0) {
      dsb $$1 = this.dP().a_($$0.a());
      $$1.a(this.dP(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(ayy.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(ayy.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dH();
         this.O = this.dF();
         this.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   protected boolean b(bst $$0) {
      if (!$$0.by()) {
         return false;
      } else {
         bst $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      evq $$0 = this.ds();
      double $$1 = $$0.h();
      this.s(d(this.P, (float)(ayy.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.O, (float)(ayy.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayy.i(0.2F, $$0, $$1);
   }

   @Override
   public zv<ach> dl() {
      bst $$0 = this.s();
      return new aci(this, $$0 == null ? 0 : $$0.al());
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      bst $$1 = this.dP().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dbx $$0, iz $$1) {
      bst $$2 = this.s();
      return $$2 instanceof cmw ? $$2.a($$0, $$1) : $$2 == null || $$0.ab().b(dbt.c);
   }

   public boolean b(dbx $$0) {
      return this.ak().a(aws.g) && $$0.ab().b(dbt.g);
   }

   @Override
   public boolean bz() {
      return this.ak().a(aws.H);
   }

   @Override
   public float bK() {
      return this.bz() ? 1.0F : 0.0F;
   }
}
