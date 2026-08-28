import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dzw implements Predicate<dzo> {
   private final dlu a;

   public dzw(dlu $$0) {
      this.a = $$0;
   }

   public static dzw a(dlu $$0) {
      return new dzw($$0);
   }

   public boolean a(@Nullable dzo $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
