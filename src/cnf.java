import java.util.Optional;
import javax.annotation.Nullable;

public class cnf extends bxe {
   private static final aku<Optional<iw>> b = aky.a(cnf.class, akw.p);
   private static final aku<Boolean> c = aky.a(cnf.class, akw.k);
   private static final boolean d = true;
   public int a;

   public cnf(bxn<? extends cnf> $$0, dkj $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public cnf(dkj $$0, double $$1, double $$2, double $$3) {
      this(bxn.S, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.a;
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void g() {
      this.a++;
      this.aI();
      this.bV();
      if (this.dV() instanceof asb) {
         iw $$0 = this.dv();
         if (((asb)this.dV()).F() != null && this.dV().a_($$0).l()) {
            this.dV().b($$0, dnb.a(this.dV(), $$0));
         }
      }
   }

   @Override
   protected void b(ua $$0) {
      $$0.b("beam_target", iw.a, this.e());
      $$0.a("ShowBottom", this.f());
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
   public final boolean b(bvt $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof cng);
   }

   @Override
   public final boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof cng) {
         return false;
      } else {
         if (!this.dQ()) {
            this.a(bxe.d.a);
            if (!$$1.a(axo.l)) {
               bvt $$3 = $$1.d() != null ? this.dW().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dA(), this.dC(), this.dG(), 6.0F, false, dkj.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(asb $$0) {
      this.a($$0, this.dW().p());
      super.c($$0);
   }

   private void a(asb $$0, bvt $$1) {
      efq $$2 = $$0.F();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable iw $$0) {
      this.ar().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public iw e() {
      return this.ar().a(b).orElse(null);
   }

   public void a(boolean $$0) {
      this.ar().a(c, $$0);
   }

   public boolean f() {
      return this.ar().a(c);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.e() != null;
   }

   @Override
   public dak dI() {
      return new dak(dao.wq);
   }
}
