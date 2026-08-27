import java.util.List;
import javax.annotation.Nullable;

public class etq implements evz {
   private static final int a = 170;
   private final tf b;
   @Nullable
   private List<arc> c;
   @Nullable
   private final tf d;

   private etq(tf $$0, @Nullable tf $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static etq a(tf $$0, @Nullable tf $$1) {
      return new etq($$0, $$1);
   }

   public static etq a(tf $$0) {
      return new etq($$0, $$0);
   }

   @Override
   public void b(evy $$0) {
      if (this.d != null) {
         $$0.a(evx.c, this.d);
      }
   }

   public List<arc> a(eql $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<arc> a(eql $$0, tf $$1) {
      return $$0.h.c($$1, 170);
   }
}
