import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxf implements Predicate<dwx> {
   private final djm a;

   public dxf(djm $$0) {
      this.a = $$0;
   }

   public static dxf a(djm $$0) {
      return new dxf($$0);
   }

   public boolean a(@Nullable dwx $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
