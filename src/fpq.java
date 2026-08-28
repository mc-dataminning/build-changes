import java.util.List;
import javax.annotation.Nullable;

public class fpq implements fsd {
   private static final int a = 170;
   private final xv b;
   @Nullable
   private List<azq> c;
   @Nullable
   private us d;
   @Nullable
   private final xv e;

   private fpq(xv $$0, @Nullable xv $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fpq a(xv $$0, @Nullable xv $$1) {
      return new fpq($$0, $$1);
   }

   public static fpq a(xv $$0) {
      return new fpq($$0, $$0);
   }

   @Override
   public void b(fsc $$0) {
      if (this.e != null) {
         $$0.a(fsb.c, this.e);
      }
   }

   public List<azq> a(fmf $$0) {
      us $$1 = us.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<azq> a(fmf $$0, xv $$1) {
      return $$0.h.c($$1, 170);
   }
}
