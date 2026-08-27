import java.util.List;
import javax.annotation.Nullable;

public class etr implements evu {
   private static final int a = 170;
   private final te b;
   @Nullable
   private List<ara> c;
   @Nullable
   private final te d;

   private etr(te $$0, @Nullable te $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static etr a(te $$0, @Nullable te $$1) {
      return new etr($$0, $$1);
   }

   public static etr a(te $$0) {
      return new etr($$0, $$0);
   }

   @Override
   public void b(evt $$0) {
      if (this.d != null) {
         $$0.a(evs.c, this.d);
      }
   }

   public List<ara> a(eqn $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<ara> a(eqn $$0, te $$1) {
      return $$0.h.c($$1, 170);
   }
}
