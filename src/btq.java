import java.util.EnumSet;
import java.util.Set;

public enum btq {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   public static final Set<btq> f = Set.of(values());
   public static final Set<btq> g = Set.of(e, d);
   private final int h;

   private btq(final int $$0) {
      this.h = $$0;
   }

   private int a() {
      return 1 << this.h;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<btq> a(int $$0) {
      Set<btq> $$1 = EnumSet.noneOf(btq.class);

      for (btq $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<btq> $$0) {
      int $$1 = 0;

      for (btq $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
