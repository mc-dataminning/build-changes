import java.util.Arrays;

public class fnc extends fmq {
   private static final xl a = xl.c("options.sounds.title");
   private fhw r;

   private static ffd<?>[] a(ffe $$0) {
      return new ffd[]{$$0.W(), $$0.X()};
   }

   public fnc(fmy $$0, ffe $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.r = this.c(new fhw(this.m, this.n, this.o, this));
      this.r.a(this.c.b(avx.a));
      this.r.a(this.C());
      this.r.a(this.c.at());
      this.r.a(a(this.c));
      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.r.a(this.n, this.d);
   }

   private ffd<?>[] C() {
      return Arrays.stream(avx.values()).filter($$0 -> $$0 != avx.a).map($$0 -> this.c.b($$0)).toArray(ffd[]::new);
   }
}
