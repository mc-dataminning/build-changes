import java.util.EnumSet;
import java.util.Set;

public enum bqc {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   public static final Set<bqc> f = Set.of(values());
   public static final Set<bqc> g = Set.of(e, d);
   private final int h;

   private bqc(int $$0) {
      this.h = $$0;
   }

   private int a() {
      return 1 << this.h;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bqc> a(int $$0) {
      Set<bqc> $$1 = EnumSet.noneOf(bqc.class);

      for (bqc $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bqc> $$0) {
      int $$1 = 0;

      for (bqc $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
