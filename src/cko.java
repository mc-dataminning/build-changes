import java.util.Optional;
import javax.annotation.Nullable;

public class cko extends bva {
   private static final ajx<Optional<ji>> b = akb.a(cko.class, ajz.p);
   private static final ajx<Boolean> c = akb.a(cko.class, ajz.k);
   public int a;

   public cko(bvi<? extends cko> $$0, dgz $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public cko(dgz $$0, double $$1, double $$2, double $$3) {
      this(bvi.R, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bva.c bg() {
      return bva.c.a;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aK();
      this.bV();
      if (this.dU() instanceof ard) {
         ji $$0 = this.du();
         if (((ard)this.dU()).F() != null && this.dU().a_($$0).l()) {
            this.dU().b($$0, djr.a(this.dU(), $$0));
         }
      }
   }

   @Override
   protected void b(tq $$0) {
      if (this.f() != null) {
         $$0.a("beam_target", uf.a(this.f()));
      }

      $$0.a("ShowBottom", this.g());
   }

   @Override
   protected void a(tq $$0) {
      uf.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public final boolean b(btp $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof ckp);
   }

   @Override
   public final boolean a(ard $$0, btp $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof ckp) {
         return false;
      } else {
         if (!this.dP()) {
            this.a(bva.d.a);
            if (!$$1.a(awr.l)) {
               btp $$3 = $$1.d() != null ? this.dV().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dz(), this.dB(), this.dF(), 6.0F, false, dgz.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(ard $$0) {
      this.a($$0, this.dV().p());
      super.c($$0);
   }

   private void a(ard $$0, btp $$1) {
      ebp $$2 = $$0.F();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable ji $$0) {
      this.au().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public ji f() {
      return this.au().a(b).orElse(null);
   }

   public void a(boolean $$0) {
      this.au().a(c, $$0);
   }

   public boolean g() {
      return this.au().a(c);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.f() != null;
   }

   @Override
   public cxh dH() {
      return new cxh(cxl.wh);
   }
}
