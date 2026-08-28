import java.util.Arrays;

public class fqn extends fql {
   private static final wu a = wu.c("options.sounds.title");

   private static ffw<?>[] a(ffx $$0) {
      return new ffw[]{$$0.W(), $$0.X()};
   }

   public fqn(fnj $$0, ffx $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.q.a(this.c.b(avi.a));
      this.q.a(this.J());
      this.q.a(this.c.at());
      this.q.a(a(this.c));
   }

   private ffw<?>[] J() {
      return Arrays.stream(avi.values()).filter($$0 -> $$0 != avi.a).map($$0 -> this.c.b($$0)).toArray(ffw[]::new);
   }
}
