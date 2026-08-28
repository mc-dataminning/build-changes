import java.util.Arrays;

public class fuf extends fud {
   private static final xi a = xi.c("options.sounds.title");

   private static fjl<?>[] a(fjm $$0) {
      return new fjl[]{$$0.Y(), $$0.Z()};
   }

   public fuf(fra $$0, fjm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awm.a));
      this.d.a(this.G());
      this.d.a(this.c.av());
      this.d.a(a(this.c));
   }

   private fjl<?>[] G() {
      return Arrays.stream(awm.values()).filter($$0 -> $$0 != awm.a).map($$0 -> this.c.b($$0)).toArray(fjl[]::new);
   }
}
