import java.util.List;
import javax.annotation.Nullable;

public class fno implements fqc {
   private static final int a = 170;
   private final xj b;
   @Nullable
   private List<ayy> c;
   @Nullable
   private ug d;
   @Nullable
   private final xj e;

   private fno(xj $$0, @Nullable xj $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fno a(xj $$0, @Nullable xj $$1) {
      return new fno($$0, $$1);
   }

   public static fno a(xj $$0) {
      return new fno($$0, $$0);
   }

   @Override
   public void b(fqb $$0) {
      if (this.e != null) {
         $$0.a(fqa.c, this.e);
      }
   }

   public List<ayy> a(fke $$0) {
      ug $$1 = ug.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayy> a(fke $$0, xj $$1) {
      return $$0.h.c($$1, 170);
   }
}
