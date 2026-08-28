import java.util.Arrays;

public class ftx extends ftv {
   private static final xh a = xh.c("options.sounds.title");

   private static fjd<?>[] a(fje $$0) {
      return new fjd[]{$$0.Y(), $$0.Z()};
   }

   public ftx(fqs $$0, fje $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awl.a));
      this.d.a(this.G());
      this.d.a(this.c.av());
      this.d.a(a(this.c));
   }

   private fjd<?>[] G() {
      return Arrays.stream(awl.values()).filter($$0 -> $$0 != awl.a).map($$0 -> this.c.b($$0)).toArray(fjd[]::new);
   }
}
