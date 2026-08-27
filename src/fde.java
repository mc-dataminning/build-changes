import java.util.Arrays;

public class fde extends fcs {
   private eyc c;

   private static evk<?>[] a(evl $$0) {
      return new evk[]{$$0.T(), $$0.U()};
   }

   public fde(fda $$0, evl $$1) {
      super($$0, $$1, vf.c("options.sounds.title"));
   }

   @Override
   protected void aN_() {
      this.c = this.d(new eyc(this.f, this.g, this.h - 64, 32, 25));
      this.c.a(this.b.b(ars.a));
      this.c.a(this.n());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.d(exf.a(ve.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private evk<?>[] n() {
      return Arrays.stream(ars.values()).filter($$0 -> $$0 != ars.a).map($$0 -> this.b.b($$0)).toArray(evk[]::new);
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
