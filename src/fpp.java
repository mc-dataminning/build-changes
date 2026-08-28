import java.util.List;
import javax.annotation.Nullable;

public class fpp implements fsc {
   private static final int a = 170;
   private final xv b;
   @Nullable
   private List<azq> c;
   @Nullable
   private us d;
   @Nullable
   private final xv e;

   private fpp(xv $$0, @Nullable xv $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fpp a(xv $$0, @Nullable xv $$1) {
      return new fpp($$0, $$1);
   }

   public static fpp a(xv $$0) {
      return new fpp($$0, $$0);
   }

   @Override
   public void b(fsb $$0) {
      if (this.e != null) {
         $$0.a(fsa.c, this.e);
      }
   }

   public List<azq> a(fme $$0) {
      us $$1 = us.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<azq> a(fme $$0, xv $$1) {
      return $$0.h.c($$1, 170);
   }
}
