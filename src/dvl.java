import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvl implements Predicate<dvd> {
   private final dhy a;

   public dvl(dhy $$0) {
      this.a = $$0;
   }

   public static dvl a(dhy $$0) {
      return new dvl($$0);
   }

   public boolean a(@Nullable dvd $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
