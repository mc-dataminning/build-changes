import java.util.EnumSet;
import java.util.Set;

public enum bqb {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   public static final Set<bqb> f = Set.of(values());
   public static final Set<bqb> g = Set.of(e, d);
   private final int h;

   private bqb(int $$0) {
      this.h = $$0;
   }

   private int a() {
      return 1 << this.h;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bqb> a(int $$0) {
      Set<bqb> $$1 = EnumSet.noneOf(bqb.class);

      for (bqb $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bqb> $$0) {
      int $$1 = 0;

      for (bqb $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
