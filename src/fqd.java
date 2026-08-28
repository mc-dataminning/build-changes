import java.util.List;
import javax.annotation.Nullable;

public class fqd implements fsq {
   private static final int a = 170;
   private final wo b;
   @Nullable
   private List<ayl> c;
   @Nullable
   private tl d;
   @Nullable
   private final wo e;

   private fqd(wo $$0, @Nullable wo $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fqd a(wo $$0, @Nullable wo $$1) {
      return new fqd($$0, $$1);
   }

   public static fqd a(wo $$0) {
      return new fqd($$0, $$0);
   }

   @Override
   public void b(fsp $$0) {
      if (this.e != null) {
         $$0.a(fso.c, this.e);
      }
   }

   public List<ayl> a(flj $$0) {
      tl $$1 = tl.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayl> a(flj $$0, wo $$1) {
      return $$0.h.c($$1, 170);
   }
}
