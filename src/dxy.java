import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxy implements Predicate<dxq> {
   private final dke a;

   public dxy(dke $$0) {
      this.a = $$0;
   }

   public static dxy a(dke $$0) {
      return new dxy($$0);
   }

   public boolean a(@Nullable dxq $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
