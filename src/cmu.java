import java.util.Optional;
import javax.annotation.Nullable;

public class cmu extends bwt {
   private static final akl<Optional<iv>> b = akp.a(cmu.class, akn.p);
   private static final akl<Boolean> c = akp.a(cmu.class, akn.k);
   private static final boolean d = true;
   public int a;

   public cmu(bxc<? extends cmu> $$0, djx $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public cmu(djx $$0, double $$1, double $$2, double $$3) {
      this(bxc.S, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bwt.c bf() {
      return bwt.c.a;
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aI();
      this.bV();
      if (this.dV() instanceof ars) {
         iv $$0 = this.dv();
         if (((ars)this.dV()).F() != null && this.dV().a_($$0).l()) {
            this.dV().b($$0, dmp.a(this.dV(), $$0));
         }
      }
   }

   @Override
   protected void b(tz $$0) {
      $$0.b("beam_target", iv.a, this.f());
      $$0.a("ShowBottom", this.g());
   }

   @Override
   protected void a(tz $$0) {
      this.a($$0.<iv>a("beam_target", iv.a).orElse(null));
      this.a($$0.b("ShowBottom", true));
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public final boolean b(bvi $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof cmv);
   }

   @Override
   public final boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof cmv) {
         return false;
      } else {
         if (!this.dQ()) {
            this.a(bwt.d.a);
            if (!$$1.a(axf.l)) {
               bvi $$3 = $$1.d() != null ? this.dW().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dA(), this.dC(), this.dG(), 6.0F, false, djx.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(ars $$0) {
      this.a($$0, this.dW().p());
      super.c($$0);
   }

   private void a(ars $$0, bvi $$1) {
      efe $$2 = $$0.F();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable iv $$0) {
      this.ar().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public iv f() {
      return this.ar().a(b).orElse(null);
   }

   public void a(boolean $$0) {
      this.ar().a(c, $$0);
   }

   public boolean g() {
      return this.ar().a(c);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.f() != null;
   }

   @Override
   public czy dI() {
      return new czy(dac.wq);
   }
}
