import java.util.EnumSet;
import java.util.Set;

public enum bkx {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   public static final Set<bkx> f = Set.of(values());
   public static final Set<bkx> g = Set.of(e, d);
   private final int h;

   private bkx(int $$0) {
      this.h = $$0;
   }

   private int a() {
      return 1 << this.h;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bkx> a(int $$0) {
      Set<bkx> $$1 = EnumSet.noneOf(bkx.class);

      for (bkx $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bkx> $$0) {
      int $$1 = 0;

      for (bkx $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
