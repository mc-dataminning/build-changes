import java.util.List;
import javax.annotation.Nullable;

public class fmk implements foy {
   private static final int a = 170;
   private final xh b;
   @Nullable
   private List<ayv> c;
   @Nullable
   private ue d;
   @Nullable
   private final xh e;

   private fmk(xh $$0, @Nullable xh $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fmk a(xh $$0, @Nullable xh $$1) {
      return new fmk($$0, $$1);
   }

   public static fmk a(xh $$0) {
      return new fmk($$0, $$0);
   }

   @Override
   public void b(fox $$0) {
      if (this.e != null) {
         $$0.a(fow.c, this.e);
      }
   }

   public List<ayv> a(fja $$0) {
      ue $$1 = ue.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayv> a(fja $$0, xh $$1) {
      return $$0.h.c($$1, 170);
   }
}
