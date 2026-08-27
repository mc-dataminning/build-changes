import java.util.Arrays;

public class fdf extends fct {
   private eyd c;

   private static evl<?>[] a(evm $$0) {
      return new evl[]{$$0.T(), $$0.U()};
   }

   public fdf(fdb $$0, evm $$1) {
      super($$0, $$1, vf.c("options.sounds.title"));
   }

   @Override
   protected void aN_() {
      this.c = this.d(new eyd(this.f, this.g, this.h - 64, 32, 25));
      this.c.a(this.b.b(art.a));
      this.c.a(this.n());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.d(exg.a(ve.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private evl<?>[] n() {
      return Arrays.stream(art.values()).filter($$0 -> $$0 != art.a).map($$0 -> this.b.b($$0)).toArray(evl[]::new);
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
