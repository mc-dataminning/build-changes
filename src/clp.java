import java.util.Optional;
import javax.annotation.Nullable;

public class clp extends bwa {
   private static final akh<Optional<iu>> b = akl.a(clp.class, akj.p);
   private static final akh<Boolean> c = akl.a(clp.class, akj.k);
   public int a;

   public clp(bwj<? extends clp> $$0, dip $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public clp(dip $$0, double $$1, double $$2, double $$3) {
      this(bwj.R, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.a;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aK();
      this.bW();
      if (this.dV() instanceof aro) {
         iu $$0 = this.dv();
         if (((aro)this.dV()).F() != null && this.dV().a_($$0).l()) {
            this.dV().b($$0, dlh.a(this.dV(), $$0));
         }
      }
   }

   @Override
   protected void b(tx $$0) {
      if (this.f() != null) {
         $$0.a("beam_target", um.a(this.f()));
      }

      $$0.a("ShowBottom", this.g());
   }

   @Override
   protected void a(tx $$0) {
      um.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public final boolean b(bup $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof clq);
   }

   @Override
   public final boolean a(aro $$0, bup $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof clq) {
         return false;
      } else {
         if (!this.dQ()) {
            this.a(bwa.e.a);
            if (!$$1.a(axb.l)) {
               bup $$3 = $$1.d() != null ? this.dW().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dA(), this.dC(), this.dG(), 6.0F, false, dip.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(aro $$0) {
      this.a($$0, this.dW().p());
      super.c($$0);
   }

   private void a(aro $$0, bup $$1) {
      edo $$2 = $$0.F();
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
   public cys dI() {
      return new cys(cyw.wj);
   }
}
