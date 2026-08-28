import java.util.Arrays;

public class frh extends frf {
   private static final wz a = wz.c("options.sounds.title");

   private static fgp<?>[] a(fgq $$0) {
      return new fgp[]{$$0.W(), $$0.X()};
   }

   public frh(fob $$0, fgq $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.r.a(this.c.b(avq.a));
      this.r.a(this.F());
      this.r.a(this.c.at());
      this.r.a(a(this.c));
   }

   private fgp<?>[] F() {
      return Arrays.stream(avq.values()).filter($$0 -> $$0 != avq.a).map($$0 -> this.c.b($$0)).toArray(fgp[]::new);
   }
}
