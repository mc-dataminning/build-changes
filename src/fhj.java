import java.util.Arrays;

public class fhj extends fgx {
   private fcd c;

   private static ezj<?>[] a(ezk $$0) {
      return new ezj[]{$$0.U(), $$0.V()};
   }

   public fhj(fhf $$0, ezk $$1) {
      super($$0, $$1, vu.c("options.sounds.title"));
   }

   @Override
   protected void aO_() {
      this.c = this.c(new fcd(this.f, this.g, this.h - 64, 32, 25));
      this.c.a(this.b.b(atz.a));
      this.c.a(this.o());
      this.c.a(this.b.ar());
      this.c.a(a(this.b));
      this.c(fbg.a(vt.d, $$0 -> {
         this.f.m.at();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private ezj<?>[] o() {
      return Arrays.stream(atz.values()).filter($$0 -> $$0 != atz.a).map($$0 -> this.b.b($$0)).toArray(ezj[]::new);
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
