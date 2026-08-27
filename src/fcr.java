import java.util.List;
import javax.annotation.Nullable;

public class fcr implements ffd {
   private static final int a = 170;
   private final vu b;
   @Nullable
   private List<awi> c;
   @Nullable
   private final vu d;

   private fcr(vu $$0, @Nullable vu $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fcr a(vu $$0, @Nullable vu $$1) {
      return new fcr($$0, $$1);
   }

   public static fcr a(vu $$0) {
      return new fcr($$0, $$0);
   }

   @Override
   public void b(ffc $$0) {
      if (this.d != null) {
         $$0.a(ffb.c, this.d);
      }
   }

   public List<awi> a(ezg $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<awi> a(ezg $$0, vu $$1) {
      return $$0.h.c($$1, 170);
   }
}
