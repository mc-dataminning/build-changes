import java.util.List;
import javax.annotation.Nullable;

public class fix implements flj {
   private static final int a = 170;
   private final wu b;
   @Nullable
   private List<axq> c;
   @Nullable
   private ts d;
   @Nullable
   private final wu e;

   private fix(wu $$0, @Nullable wu $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fix a(wu $$0, @Nullable wu $$1) {
      return new fix($$0, $$1);
   }

   public static fix a(wu $$0) {
      return new fix($$0, $$0);
   }

   @Override
   public void b(fli $$0) {
      if (this.e != null) {
         $$0.a(flh.c, this.e);
      }
   }

   public List<axq> a(ffn $$0) {
      ts $$1 = ts.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<axq> a(ffn $$0, wu $$1) {
      return $$0.h.c($$1, 170);
   }
}
