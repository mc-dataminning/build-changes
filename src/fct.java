import java.util.List;
import javax.annotation.Nullable;

public class fct implements fff {
   private static final int a = 170;
   private final vu b;
   @Nullable
   private List<awi> c;
   @Nullable
   private final vu d;

   private fct(vu $$0, @Nullable vu $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fct a(vu $$0, @Nullable vu $$1) {
      return new fct($$0, $$1);
   }

   public static fct a(vu $$0) {
      return new fct($$0, $$0);
   }

   @Override
   public void b(ffe $$0) {
      if (this.d != null) {
         $$0.a(ffd.c, this.d);
      }
   }

   public List<awi> a(ezi $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<awi> a(ezi $$0, vu $$1) {
      return $$0.h.c($$1, 170);
   }
}
