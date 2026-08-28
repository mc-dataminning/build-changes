import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxv implements Predicate<dxn> {
   private final dke a;

   public dxv(dke $$0) {
      this.a = $$0;
   }

   public static dxv a(dke $$0) {
      return new dxv($$0);
   }

   public boolean a(@Nullable dxn $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
