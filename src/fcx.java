import java.util.Arrays;

public class fcx extends fcl {
   private exv c;

   private static evd<?>[] a(eve $$0) {
      return new evd[]{$$0.T(), $$0.U()};
   }

   public fcx(fct $$0, eve $$1) {
      super($$0, $$1, vd.c("options.sounds.title"));
   }

   @Override
   protected void aN_() {
      this.c = this.d(new exv(this.f, this.g, this.h - 64, 32, 25));
      this.c.a(this.b.b(arn.a));
      this.c.a(this.n());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.d(ewy.a(vc.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private evd<?>[] n() {
      return Arrays.stream(arn.values()).filter($$0 -> $$0 != arn.a).map($$0 -> this.b.b($$0)).toArray(evd[]::new);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
