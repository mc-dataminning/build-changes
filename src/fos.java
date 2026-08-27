import java.util.Arrays;

public class fos extends foe {
   private static final xe a = xe.c("options.sounds.title");
   private fjk r;

   private static fgm<?>[] a(fgn $$0) {
      return new fgm[]{$$0.W(), $$0.X()};
   }

   public fos(fon $$0, fgn $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.r = this.c(new fjk(this.m, this.n, this.o, this));
      this.r.a(this.c.b(avq.a));
      this.r.a(this.B());
      this.r.a(this.c.at());
      this.r.a(a(this.c));
      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.r.a(this.n, this.d);
   }

   private fgm<?>[] B() {
      return Arrays.stream(avq.values()).filter($$0 -> $$0 != avq.a).map($$0 -> this.c.b($$0)).toArray(fgm[]::new);
   }
}
