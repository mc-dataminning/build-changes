import java.util.List;
import javax.annotation.Nullable;

public class fbv implements feg {
   private static final int a = 170;
   private final vs b;
   @Nullable
   private List<avy> c;
   @Nullable
   private final vs d;

   private fbv(vs $$0, @Nullable vs $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static fbv a(vs $$0, @Nullable vs $$1) {
      return new fbv($$0, $$1);
   }

   public static fbv a(vs $$0) {
      return new fbv($$0, $$0);
   }

   @Override
   public void b(fef $$0) {
      if (this.d != null) {
         $$0.a(fee.c, this.d);
      }
   }

   public List<avy> a(eyk $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<avy> a(eyk $$0, vs $$1) {
      return $$0.h.c($$1, 170);
   }
}
