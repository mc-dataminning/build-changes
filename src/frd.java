import java.util.Arrays;

public class frd extends frb {
   private static final wy a = wy.c("options.sounds.title");

   private static fgl<?>[] a(fgm $$0) {
      return new fgl[]{$$0.W(), $$0.X()};
   }

   public frd(fnx $$0, fgm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.q.a(this.c.b(avp.a));
      this.q.a(this.G());
      this.q.a(this.c.at());
      this.q.a(a(this.c));
   }

   private fgl<?>[] G() {
      return Arrays.stream(avp.values()).filter($$0 -> $$0 != avp.a).map($$0 -> this.c.b($$0)).toArray(fgl[]::new);
   }
}
