import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxe implements Predicate<dww> {
   private final djl a;

   public dxe(djl $$0) {
      this.a = $$0;
   }

   public static dxe a(djl $$0) {
      return new dxe($$0);
   }

   public boolean a(@Nullable dww $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
