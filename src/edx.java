import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class edx extends Exception {
   private final Path a;
   private final List<edz> b;

   public edx(Path $$0, List<edz> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public String getMessage() {
      return a(this.a, this.b);
   }

   public static String a(Path $$0, List<edz> $$1) {
      return "Failed to validate '"
         + $$0
         + "'. Found forbidden symlinks: "
         + $$1.stream().map($$0x -> $$0x.a() + "->" + $$0x.b()).collect(Collectors.joining(", "));
   }
}
