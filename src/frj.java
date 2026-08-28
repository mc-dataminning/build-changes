import java.util.Arrays;

public class frj extends frh {
   private static final wz a = wz.c("options.sounds.title");

   private static fgr<?>[] a(fgs $$0) {
      return new fgr[]{$$0.W(), $$0.X()};
   }

   public frj(fod $$0, fgs $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.r.a(this.c.b(avq.a));
      this.r.a(this.F());
      this.r.a(this.c.at());
      this.r.a(a(this.c));
   }

   private fgr<?>[] F() {
      return Arrays.stream(avq.values()).filter($$0 -> $$0 != avq.a).map($$0 -> this.c.b($$0)).toArray(fgr[]::new);
   }
}
