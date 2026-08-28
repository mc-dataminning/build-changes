import java.util.Arrays;

public class fqp extends fqn {
   private static final wu a = wu.c("options.sounds.title");

   private static ffz<?>[] a(fga $$0) {
      return new ffz[]{$$0.W(), $$0.X()};
   }

   public fqp(fnl $$0, fga $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.q.a(this.c.b(avi.a));
      this.q.a(this.G());
      this.q.a(this.c.at());
      this.q.a(a(this.c));
   }

   private ffz<?>[] G() {
      return Arrays.stream(avi.values()).filter($$0 -> $$0 != avi.a).map($$0 -> this.c.b($$0)).toArray(ffz[]::new);
   }
}
