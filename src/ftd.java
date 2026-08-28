import java.util.Arrays;
import java.util.stream.Stream;

public class ftd extends ftg {
   private static final xd a = xd.c("options.mouse_settings.title");

   private static fio<?>[] a(fip $$0) {
      return new fio[]{$$0.d(), $$0.T(), $$0.G(), $$0.U(), $$0.ab()};
   }

   public ftd(fqd $$0, fip $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      if (fbz.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.H())).toArray(fio[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
