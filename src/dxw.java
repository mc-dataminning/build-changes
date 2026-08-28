import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxw implements Predicate<dxo> {
   private final dkd a;

   public dxw(dkd $$0) {
      this.a = $$0;
   }

   public static dxw a(dkd $$0) {
      return new dxw($$0);
   }

   public boolean a(@Nullable dxo $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
