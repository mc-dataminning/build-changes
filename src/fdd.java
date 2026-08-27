import java.util.Arrays;

public class fdd extends fcr {
   private eyb c;

   private static evj<?>[] a(evk $$0) {
      return new evj[]{$$0.T(), $$0.U()};
   }

   public fdd(fcz $$0, evk $$1) {
      super($$0, $$1, vf.c("options.sounds.title"));
   }

   @Override
   protected void aN_() {
      this.c = this.d(new eyb(this.f, this.g, this.h - 64, 32, 25));
      this.c.a(this.b.b(ars.a));
      this.c.a(this.n());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.d(exe.a(ve.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private evj<?>[] n() {
      return Arrays.stream(ars.values()).filter($$0 -> $$0 != ars.a).map($$0 -> this.b.b($$0)).toArray(evj[]::new);
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
