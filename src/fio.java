import java.util.List;
import javax.annotation.Nullable;

public class fio implements fla {
   private static final int a = 170;
   private final xo b;
   @Nullable
   private List<ayk> c;
   @Nullable
   private final xo d;

   private fio(xo $$0, @Nullable xo $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fio a(xo $$0, @Nullable xo $$1) {
      return new fio($$0, $$1);
   }

   public static fio a(xo $$0) {
      return new fio($$0, $$0);
   }

   @Override
   public void b(fkz $$0) {
      if (this.d != null) {
         $$0.a(fky.c, this.d);
      }
   }

   public List<ayk> a(ffe $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<ayk> a(ffe $$0, xo $$1) {
      return $$0.h.c($$1, 170);
   }
}
