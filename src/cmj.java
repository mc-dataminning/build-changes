import java.util.Optional;
import javax.annotation.Nullable;

public class cmj extends bwi {
   private static final akj<Optional<iv>> b = akn.a(cmj.class, akl.p);
   private static final akj<Boolean> c = akn.a(cmj.class, akl.k);
   public int a;

   public cmj(bwr<? extends cmj> $$0, djm $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public cmj(djm $$0, double $$1, double $$2, double $$3) {
      this(bwr.R, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bwi.c be() {
      return bwi.c.a;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aI();
      this.bU();
      if (this.dU() instanceof arq) {
         iv $$0 = this.du();
         if (((arq)this.dU()).F() != null && this.dU().a_($$0).l()) {
            this.dU().b($$0, dme.a(this.dU(), $$0));
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
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.o("ShowBottom"));
      }
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public final boolean b(bux $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof cmk);
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof cmk) {
         return false;
      } else {
         if (!this.dP()) {
            this.a(bwi.d.a);
            if (!$$1.a(axd.l)) {
               bux $$3 = $$1.d() != null ? this.dV().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dz(), this.dB(), this.dF(), 6.0F, false, djm.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(arq $$0) {
      this.a($$0, this.dV().p());
      super.c($$0);
   }

   private void a(arq $$0, bux $$1) {
      eet $$2 = $$0.F();
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
   public czn dH() {
      return new czn(czr.wq);
   }
}
