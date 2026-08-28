import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dui implements Predicate<dua> {
   private final dgv a;

   public dui(dgv $$0) {
      this.a = $$0;
   }

   public static dui a(dgv $$0) {
      return new dui($$0);
   }

   public boolean a(@Nullable dua $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
