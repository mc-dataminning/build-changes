import java.util.List;
import javax.annotation.Nullable;

public class fjf implements flr {
   private static final int a = 170;
   private final wu b;
   @Nullable
   private List<axs> c;
   @Nullable
   private ts d;
   @Nullable
   private final wu e;

   private fjf(wu $$0, @Nullable wu $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fjf a(wu $$0, @Nullable wu $$1) {
      return new fjf($$0, $$1);
   }

   public static fjf a(wu $$0) {
      return new fjf($$0, $$0);
   }

   @Override
   public void b(flq $$0) {
      if (this.e != null) {
         $$0.a(flp.c, this.e);
      }
   }

   public List<axs> a(ffw $$0) {
      ts $$1 = ts.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<axs> a(ffw $$0, wu $$1) {
      return $$0.h.c($$1, 170);
   }
}
