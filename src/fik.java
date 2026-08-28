import java.util.List;
import javax.annotation.Nullable;

public class fik implements fkw {
   private static final int a = 170;
   private final xl b;
   @Nullable
   private List<ayg> c;
   @Nullable
   private final xl d;

   private fik(xl $$0, @Nullable xl $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fik a(xl $$0, @Nullable xl $$1) {
      return new fik($$0, $$1);
   }

   public static fik a(xl $$0) {
      return new fik($$0, $$0);
   }

   @Override
   public void b(fkv $$0) {
      if (this.d != null) {
         $$0.a(fku.c, this.d);
      }
   }

   public List<ayg> a(ffa $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<ayg> a(ffa $$0, xl $$1) {
      return $$0.h.c($$1, 170);
   }
}
