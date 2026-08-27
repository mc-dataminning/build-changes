import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cmq extends brw implements btp {
   @Nullable
   private UUID b;
   @Nullable
   private brw c;
   private boolean d;
   private boolean e;

   cmq(bsc<? extends cmq> $$0, daz $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable brw $$0) {
      if ($$0 != null) {
         this.b = $$0.cz();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public brw s() {
      if (this.c != null && !this.c.dK()) {
         return this.c;
      } else if (this.b != null && this.dP() instanceof aqn $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public brw I() {
      return (brw)MoreObjects.firstNonNull(this.s(), this);
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

   protected boolean e(brw $$0) {
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
   public void w(brw $$0) {
      super.w($$0);
      if ($$0 instanceof cmq $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dvw.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.u();
      }

      super.l();
   }

   private boolean u() {
      brw $$0 = this.s();
      if ($$0 != null) {
         for (brw $$1 : this.dP().a(this, this.cK().b(this.ds()).g(1.0), $$0x -> !$$0x.N_() && $$0x.bz())) {
            if ($$1.cZ() == $$0.cZ()) {
               return false;
            }
         }
      }

      return true;
   }

   public eum d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new eum($$0, $$1, $$2)
         .d()
         .b(this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4), this.ah.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      eum $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(ayf.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(ayf.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   public void a(brw $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayf.a($$2 * (float) (Math.PI / 180.0)) * ayf.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayf.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayf.b($$2 * (float) (Math.PI / 180.0)) * ayf.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      eum $$9 = $$0.ds();
      this.g(this.ds().b($$9.c, $$0.aE() ? 0.0 : $$9.d, $$9.e));
   }

   protected cmr b(euk $$0) {
      if ($$0.c() == euk.a.c) {
         euj $$1 = (euj)$$0;
         cmr $$2 = $$1.a().a(this);
         if ($$2 != cmr.a) {
            $$2.deflect(this, $$1.a(), this.ah);
            this.bv();
            return $$2;
         }
      }

      this.a($$0);
      return cmr.a;
   }

   protected void a(euk $$0) {
      euk.a $$1 = $$0.c();
      if ($$1 == euk.a.c) {
         euj $$2 = (euj)$$0;
         this.a($$2);
         this.dP().a(dvw.J, $$0.e(), dvw.a.a(this, null));
      } else if ($$1 == euk.a.b) {
         eui $$3 = (eui)$$0;
         this.a($$3);
         io $$4 = $$3.a();
         this.dP().a(dvw.J, $$4, dvw.a.a(this, this.dP().a_($$4)));
      }
   }

   protected void a(euj $$0) {
   }

   protected void a(eui $$0) {
      drd $$1 = this.dP().a_($$0.a());
      $$1.a(this.dP(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(ayf.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(ayf.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dH();
         this.O = this.dF();
         this.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   protected boolean b(brw $$0) {
      if (!$$0.by()) {
         return false;
      } else {
         brw $$1 = this.s();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void J() {
      eum $$0 = this.ds();
      double $$1 = $$0.h();
      this.s(d(this.P, (float)(ayf.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.O, (float)(ayf.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayf.i(0.2F, $$0, $$1);
   }

   @Override
   public ze<abq> dl() {
      brw $$0 = this.s();
      return new abr(this, $$0 == null ? 0 : $$0.al());
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      brw $$1 = this.dP().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(daz $$0, io $$1) {
      brw $$2 = this.s();
      return $$2 instanceof cly ? $$2.a($$0, $$1) : $$2 == null || $$0.aa().b(dav.c);
   }

   public boolean b(daz $$0) {
      return this.ak().a(awa.g) && $$0.aa().b(dav.g);
   }

   public void af_() {
   }
}
