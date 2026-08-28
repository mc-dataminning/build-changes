import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsf implements Predicate<drx> {
   private final deu a;

   public dsf(deu $$0) {
      this.a = $$0;
   }

   public static dsf a(deu $$0) {
      return new dsf($$0);
   }

   public boolean a(@Nullable drx $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
