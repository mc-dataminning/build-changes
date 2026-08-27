import java.util.Arrays;

public class ffp extends ffd {
   private fal c;

   private static exr<?>[] a(exs $$0) {
      return new exr[]{$$0.T(), $$0.U()};
   }

   public ffp(ffl $$0, exs $$1) {
      super($$0, $$1, vq.c("options.sounds.title"));
   }

   @Override
   protected void aQ_() {
      this.c = this.c(new fal(this.f, this.g, this.h - 64, 32, 25));
      this.c.a(this.b.b(atm.a));
      this.c.a(this.o());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.c(ezo.a(vp.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private exr<?>[] o() {
      return Arrays.stream(atm.values()).filter($$0 -> $$0 != atm.a).map($$0 -> this.b.b($$0)).toArray(exr[]::new);
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
