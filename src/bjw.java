import java.util.EnumSet;
import java.util.Set;

public enum bjw {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   public static final Set<bjw> f = Set.of(values());
   public static final Set<bjw> g = Set.of(e, d);
   private final int h;

   private bjw(int $$0) {
      this.h = $$0;
   }

   private int a() {
      return 1 << this.h;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bjw> a(int $$0) {
      Set<bjw> $$1 = EnumSet.noneOf(bjw.class);

      for (bjw $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bjw> $$0) {
      int $$1 = 0;

      for (bjw $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
