import java.util.EnumSet;
import java.util.Set;

public enum bte {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   public static final Set<bte> f = Set.of(values());
   public static final Set<bte> g = Set.of(e, d);
   private final int h;

   private bte(int $$0) {
      this.h = $$0;
   }

   private int a() {
      return 1 << this.h;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bte> a(int $$0) {
      Set<bte> $$1 = EnumSet.noneOf(bte.class);

      for (bte $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bte> $$0) {
      int $$1 = 0;

      for (bte $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
