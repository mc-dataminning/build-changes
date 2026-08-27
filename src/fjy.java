import java.util.List;
import javax.annotation.Nullable;

public class fjy implements fmk {
   private static final int a = 170;
   private final xe b;
   @Nullable
   private List<axy> c;
   @Nullable
   private final xe d;

   private fjy(xe $$0, @Nullable xe $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fjy a(xe $$0, @Nullable xe $$1) {
      return new fjy($$0, $$1);
   }

   public static fjy a(xe $$0) {
      return new fjy($$0, $$0);
   }

   @Override
   public void b(fmj $$0) {
      if (this.d != null) {
         $$0.a(fmi.c, this.d);
      }
   }

   public List<axy> a(fgj $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<axy> a(fgj $$0, xe $$1) {
      return $$0.h.c($$1, 170);
   }
}
