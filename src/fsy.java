import java.util.Arrays;

public class fsy extends fsw {
   private static final xd a = xd.c("options.sounds.title");

   private static fie<?>[] a(fif $$0) {
      return new fie[]{$$0.Y(), $$0.Z()};
   }

   public fsy(fpt $$0, fif $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awe.a));
      this.d.a(this.G());
      this.d.a(this.c.av());
      this.d.a(a(this.c));
   }

   private fie<?>[] G() {
      return Arrays.stream(awe.values()).filter($$0 -> $$0 != awe.a).map($$0 -> this.c.b($$0)).toArray(fie[]::new);
   }
}
