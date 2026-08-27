import java.util.List;
import javax.annotation.Nullable;

public class ffa implements fhm {
   private static final int a = 170;
   private final wg b;
   @Nullable
   private List<aww> c;
   @Nullable
   private final wg d;

   private ffa(wg $$0, @Nullable wg $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static ffa a(wg $$0, @Nullable wg $$1) {
      return new ffa($$0, $$1);
   }

   public static ffa a(wg $$0) {
      return new ffa($$0, $$0);
   }

   @Override
   public void b(fhl $$0) {
      if (this.d != null) {
         $$0.a(fhk.c, this.d);
      }
   }

   public List<aww> a(fbp $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<aww> a(fbp $$0, wg $$1) {
      return $$0.h.c($$1, 170);
   }
}
