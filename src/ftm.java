import java.util.Arrays;

public class ftm extends ftk {
   private static final xe a = xe.c("options.sounds.title");

   private static fis<?>[] a(fit $$0) {
      return new fis[]{$$0.Y(), $$0.Z()};
   }

   public ftm(fqh $$0, fit $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awh.a));
      this.d.a(this.G());
      this.d.a(this.c.av());
      this.d.a(a(this.c));
   }

   private fis<?>[] G() {
      return Arrays.stream(awh.values()).filter($$0 -> $$0 != awh.a).map($$0 -> this.c.b($$0)).toArray(fis[]::new);
   }
}
