import java.util.List;
import javax.annotation.Nullable;

public class fms implements fpg {
   private static final int a = 170;
   private final xi b;
   @Nullable
   private List<ayw> c;
   @Nullable
   private uf d;
   @Nullable
   private final xi e;

   private fms(xi $$0, @Nullable xi $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fms a(xi $$0, @Nullable xi $$1) {
      return new fms($$0, $$1);
   }

   public static fms a(xi $$0) {
      return new fms($$0, $$0);
   }

   @Override
   public void b(fpf $$0) {
      if (this.e != null) {
         $$0.a(fpe.c, this.e);
      }
   }

   public List<ayw> a(fji $$0) {
      uf $$1 = uf.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayw> a(fji $$0, xi $$1) {
      return $$0.h.c($$1, 170);
   }
}
