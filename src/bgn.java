import java.util.EnumSet;
import java.util.Set;

public enum bgn {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   public static final Set<bgn> f = Set.of(values());
   public static final Set<bgn> g = Set.of(e, d);
   private final int h;

   private bgn(int $$0) {
      this.h = $$0;
   }

   private int a() {
      return 1 << this.h;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bgn> a(int $$0) {
      Set<bgn> $$1 = EnumSet.noneOf(bgn.class);

      for (bgn $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bgn> $$0) {
      int $$1 = 0;

      for (bgn $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
