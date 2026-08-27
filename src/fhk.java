import java.util.List;
import javax.annotation.Nullable;

public class fhk implements fjw {
   private static final int a = 170;
   private final wx b;
   @Nullable
   private List<axq> c;
   @Nullable
   private final wx d;

   private fhk(wx $$0, @Nullable wx $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fhk a(wx $$0, @Nullable wx $$1) {
      return new fhk($$0, $$1);
   }

   public static fhk a(wx $$0) {
      return new fhk($$0, $$0);
   }

   @Override
   public void b(fjv $$0) {
      if (this.d != null) {
         $$0.a(fju.c, this.d);
      }
   }

   public List<axq> a(fdz $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<axq> a(fdz $$0, wx $$1) {
      return $$0.h.c($$1, 170);
   }
}
