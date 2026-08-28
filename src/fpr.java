import java.util.List;
import javax.annotation.Nullable;

public class fpr implements fse {
   private static final int a = 170;
   private final xv b;
   @Nullable
   private List<azq> c;
   @Nullable
   private us d;
   @Nullable
   private final xv e;

   private fpr(xv $$0, @Nullable xv $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fpr a(xv $$0, @Nullable xv $$1) {
      return new fpr($$0, $$1);
   }

   public static fpr a(xv $$0) {
      return new fpr($$0, $$0);
   }

   @Override
   public void b(fsd $$0) {
      if (this.e != null) {
         $$0.a(fsc.c, this.e);
      }
   }

   public List<azq> a(fmg $$0) {
      us $$1 = us.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<azq> a(fmg $$0, xv $$1) {
      return $$0.h.c($$1, 170);
   }
}
