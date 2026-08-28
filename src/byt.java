import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class byt {
   public static bwu<bva> a(float $$0, bro $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bwu<bva> a(bul<?> $$0, float $$1, bro $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ar()));
   }

   private static bwu<bva> a(float $$0, bro $$1, Predicate<bva> $$2) {
      float $$3 = $$0 * $$0;
      byt.a $$4 = new byt.a($$1);
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$3x -> $$3x.group($$3x.c(cee.n), $$3x.b(cee.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bva> $$9 = $$3x.<ceg>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bue)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bxe($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bro a;
      private int b;

      public a(bro $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azs $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
