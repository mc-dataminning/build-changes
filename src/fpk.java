import java.util.List;
import javax.annotation.Nullable;

public class fpk implements frx {
   private static final int a = 170;
   private final xk b;
   @Nullable
   private List<azg> c;
   @Nullable
   private uh d;
   @Nullable
   private final xk e;

   private fpk(xk $$0, @Nullable xk $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fpk a(xk $$0, @Nullable xk $$1) {
      return new fpk($$0, $$1);
   }

   public static fpk a(xk $$0) {
      return new fpk($$0, $$0);
   }

   @Override
   public void b(frw $$0) {
      if (this.e != null) {
         $$0.a(frv.c, this.e);
      }
   }

   public List<azg> a(flz $$0) {
      uh $$1 = uh.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<azg> a(flz $$0, xk $$1) {
      return $$0.h.c($$1, 170);
   }
}
