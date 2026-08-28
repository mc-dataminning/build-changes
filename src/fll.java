import java.util.List;
import javax.annotation.Nullable;

public class fll implements fny {
   private static final int a = 170;
   private final xd b;
   @Nullable
   private List<ayo> c;
   @Nullable
   private ua d;
   @Nullable
   private final xd e;

   private fll(xd $$0, @Nullable xd $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fll a(xd $$0, @Nullable xd $$1) {
      return new fll($$0, $$1);
   }

   public static fll a(xd $$0) {
      return new fll($$0, $$0);
   }

   @Override
   public void b(fnx $$0) {
      if (this.e != null) {
         $$0.a(fnw.c, this.e);
      }
   }

   public List<ayo> a(fib $$0) {
      ua $$1 = ua.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayo> a(fib $$0, xd $$1) {
      return $$0.h.c($$1, 170);
   }
}
