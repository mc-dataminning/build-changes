import java.util.List;
import javax.annotation.Nullable;

public class fjr implements fmd {
   private static final int a = 170;
   private final wy b;
   @Nullable
   private List<axz> c;
   @Nullable
   private tv d;
   @Nullable
   private final wy e;

   private fjr(wy $$0, @Nullable wy $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fjr a(wy $$0, @Nullable wy $$1) {
      return new fjr($$0, $$1);
   }

   public static fjr a(wy $$0) {
      return new fjr($$0, $$0);
   }

   @Override
   public void b(fmc $$0) {
      if (this.e != null) {
         $$0.a(fmb.c, this.e);
      }
   }

   public List<axz> a(fgi $$0) {
      tv $$1 = tv.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<axz> a(fgi $$0, wy $$1) {
      return $$0.h.c($$1, 170);
   }
}
