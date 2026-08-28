import java.util.Arrays;
import java.util.stream.Stream;

public class fts extends ftv {
   private static final xh a = xh.c("options.mouse_settings.title");

   private static fjd<?>[] a(fje $$0) {
      return new fjd[]{$$0.d(), $$0.T(), $$0.G(), $$0.U(), $$0.ab()};
   }

   public fts(fqs $$0, fje $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fco.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.H())).toArray(fjd[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
