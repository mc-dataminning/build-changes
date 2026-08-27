import java.util.EnumSet;
import java.util.Set;

public enum bmz {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   public static final Set<bmz> f = Set.of(values());
   public static final Set<bmz> g = Set.of(e, d);
   private final int h;

   private bmz(int $$0) {
      this.h = $$0;
   }

   private int a() {
      return 1 << this.h;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bmz> a(int $$0) {
      Set<bmz> $$1 = EnumSet.noneOf(bmz.class);

      for (bmz $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bmz> $$0) {
      int $$1 = 0;

      for (bmz $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
