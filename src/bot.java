import java.util.EnumSet;
import java.util.Set;

public enum bot {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   public static final Set<bot> f = Set.of(values());
   public static final Set<bot> g = Set.of(e, d);
   private final int h;

   private bot(int $$0) {
      this.h = $$0;
   }

   private int a() {
      return 1 << this.h;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bot> a(int $$0) {
      Set<bot> $$1 = EnumSet.noneOf(bot.class);

      for (bot $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bot> $$0) {
      int $$1 = 0;

      for (bot $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
