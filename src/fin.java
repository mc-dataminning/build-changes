import java.util.List;
import javax.annotation.Nullable;

public class fin implements fkz {
   private static final int a = 170;
   private final xo b;
   @Nullable
   private List<ayj> c;
   @Nullable
   private final xo d;

   private fin(xo $$0, @Nullable xo $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fin a(xo $$0, @Nullable xo $$1) {
      return new fin($$0, $$1);
   }

   public static fin a(xo $$0) {
      return new fin($$0, $$0);
   }

   @Override
   public void b(fky $$0) {
      if (this.d != null) {
         $$0.a(fkx.c, this.d);
      }
   }

   public List<ayj> a(ffd $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<ayj> a(ffd $$0, xo $$1) {
      return $$0.h.c($$1, 170);
   }
}
