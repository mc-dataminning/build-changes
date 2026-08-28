import java.util.Optional;
import javax.annotation.Nullable;

public class cmw extends bwv {
   private static final akn<Optional<iw>> b = akr.a(cmw.class, akp.p);
   private static final akn<Boolean> c = akr.a(cmw.class, akp.k);
   private static final boolean d = true;
   public int a;

   public cmw(bxe<? extends cmw> $$0, djz $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public cmw(djz $$0, double $$1, double $$2, double $$3) {
      this(bxe.S, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bwv.c bf() {
      return bwv.c.a;
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aI();
      this.bV();
      if (this.dV() instanceof aru) {
         iw $$0 = this.dv();
         if (((aru)this.dV()).F() != null && this.dV().a_($$0).l()) {
            this.dV().b($$0, dmr.a(this.dV(), $$0));
         }
      }
   }

   @Override
   protected void b(ua $$0) {
      $$0.b("beam_target", iw.a, this.f());
      $$0.a("ShowBottom", this.g());
   }

   @Override
   protected void a(ua $$0) {
      this.a($$0.<iw>a("beam_target", iw.a).orElse(null));
      this.a($$0.b("ShowBottom", true));
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public final boolean b(bvk $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof cmx);
   }

   @Override
   public final boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof cmx) {
         return false;
      } else {
         if (!this.dQ()) {
            this.a(bwv.d.a);
            if (!$$1.a(axh.l)) {
               bvk $$3 = $$1.d() != null ? this.dW().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dA(), this.dC(), this.dG(), 6.0F, false, djz.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(aru $$0) {
      this.a($$0, this.dW().p());
      super.c($$0);
   }

   private void a(aru $$0, bvk $$1) {
      efg $$2 = $$0.F();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable iw $$0) {
      this.ar().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public iw f() {
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
   public daa dI() {
      return new daa(dae.wq);
   }
}
