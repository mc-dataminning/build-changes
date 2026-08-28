import java.util.Optional;
import javax.annotation.Nullable;

public class clz extends bwf {
   private static final akj<Optional<iu>> b = akn.a(clz.class, akl.p);
   private static final akj<Boolean> c = akn.a(clz.class, akl.k);
   public int a;

   public clz(bwo<? extends clz> $$0, dja $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public clz(dja $$0, double $$1, double $$2, double $$3) {
      this(bwo.R, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bwf.d bg() {
      return bwf.d.a;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aK();
      this.bW();
      if (this.dV() instanceof arq) {
         iu $$0 = this.dv();
         if (((arq)this.dV()).F() != null && this.dV().a_($$0).l()) {
            this.dV().b($$0, dls.a(this.dV(), $$0));
         }
      }
   }

   @Override
   protected void b(tz $$0) {
      if (this.f() != null) {
         $$0.a("beam_target", uo.a(this.f()));
      }

      $$0.a("ShowBottom", this.g());
   }

   @Override
   protected void a(tz $$0) {
      uo.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public final boolean b(buu $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof cma);
   }

   @Override
   public final boolean a(arq $$0, buu $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof cma) {
         return false;
      } else {
         if (!this.dQ()) {
            this.a(bwf.e.a);
            if (!$$1.a(axd.l)) {
               buu $$3 = $$1.d() != null ? this.dW().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dA(), this.dC(), this.dG(), 6.0F, false, dja.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(arq $$0) {
      this.a($$0, this.dW().p());
      super.c($$0);
   }

   private void a(arq $$0, buu $$1) {
      eeh $$2 = $$0.F();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable iu $$0) {
      this.au().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public iu f() {
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
   public czd dI() {
      return new czd(czh.wq);
   }
}
