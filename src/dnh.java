import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnh implements Predicate<dmz> {
   private final daa a;

   public dnh(daa $$0) {
      this.a = $$0;
   }

   public static dnh a(daa $$0) {
      return new dnh($$0);
   }

   public boolean a(@Nullable dmz $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
