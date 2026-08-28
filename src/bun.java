import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableLong;

public class bun {
   public static final int a = 48;

   public static buv<btk> a(Predicate<jj<cei>> $$0, ccf<ji> $$1, boolean $$2, Optional<Byte> $$3) {
      return a($$0, $$1, $$1, $$2, $$3);
   }

   public static buv<btk> a(Predicate<jj<cei>> $$0, ccf<ji> $$1, ccf<ji> $$2, boolean $$3, Optional<Byte> $$4) {
      int $$5 = 5;
      int $$6 = 20;
      MutableLong $$7 = new MutableLong(0L);
      Long2ObjectMap<bun.a> $$8 = new Long2ObjectOpenHashMap();
      bwf<btk> $$9 = byh.a(
         (Function<byh.b<btk>, ? extends App<byh.c<btk>, byk<btk>>>)($$6x -> $$6x.group($$6x.c($$2)).apply($$6x, $$5xx -> ($$6xx, $$7x, $$8x) -> {
                  if ($$3 && $$7x.p_()) {
                     return false;
                  } else if ($$7.getValue() == 0L) {
                     $$7.setValue($$6xx.Z() + (long)$$6xx.z.a(20));
                     return false;
                  } else if ($$6xx.Z() < $$7.getValue()) {
                     return false;
                  } else {
                     $$7.setValue($$8x + 20L + (long)$$6xx.E_().a(20));
                     cef $$9x = $$6xx.y();
                     $$8.long2ObjectEntrySet().removeIf($$1xxxx -> !((bun.a)$$1xxxx.getValue()).b($$8x));
                     Predicate<ja> $$10 = $$2xxxx -> {
                        bun.a $$3xxxx = (bun.a)$$8.get($$2xxxx.a());
                        if ($$3xxxx == null) {
                           return true;
                        } else if (!$$3xxxx.c($$8x)) {
                           return false;
                        } else {
                           $$3xxxx.a($$8x);
                           return true;
                        }
                     };
                     Set<Pair<jj<cei>, ja>> $$11 = $$9x.c($$0, $$10, $$7x.dq(), 48, cef.b.a).limit(5L).collect(Collectors.toSet());
                     eov $$12 = a($$7x, $$11);
                     if ($$12 != null && $$12.j()) {
                        ja $$13 = $$12.l();
                        $$9x.c($$13).ifPresent($$8xx -> {
                           $$9x.a($$0, ($$1xxxxx, $$2xxxxx) -> $$2xxxxx.equals($$13), $$13, 1);
                           $$5xx.a(ji.a($$6xx.af(), $$13));
                           $$4.ifPresent($$2xxxxx -> $$6xx.a($$7x, $$2xxxxx));
                           $$8.clear();
                           afy.c($$6xx, $$13);
                        });
                     } else {
                        for (Pair<jj<cei>, ja> $$14 : $$11) {
                           $$8.computeIfAbsent(((ja)$$14.getSecond()).a(), $$2xxxx -> new bun.a($$6xx.z, $$8x));
                        }
                     }

                     return true;
                  }
               }))
      );
      return $$2 == $$1 ? $$9 : byh.a((Function<byh.b<btk>, ? extends App<byh.c<btk>, byk<btk>>>)($$2x -> $$2x.group($$2x.c($$1)).apply($$2x, $$1xx -> $$9)));
   }

   @Nullable
   public static eov a(btd $$0, Set<Pair<jj<cei>, ja>> $$1) {
      if ($$1.isEmpty()) {
         return null;
      } else {
         Set<ja> $$2 = new HashSet<>();
         int $$3 = 1;

         for (Pair<jj<cei>, ja> $$4 : $$1) {
            $$3 = Math.max($$3, ((cei)((jj)$$4.getFirst()).a()).c());
            $$2.add((ja)$$4.getSecond());
         }

         return $$0.K().a($$2, $$3);
      }
   }

   static class a {
      private static final int a = 40;
      private static final int b = 80;
      private static final int c = 400;
      private final ayo d;
      private long e;
      private long f;
      private int g;

      a(ayo $$0, long $$1) {
         this.d = $$0;
         this.a($$1);
      }

      public void a(long $$0) {
         this.e = $$0;
         int $$1 = this.g + this.d.a(40) + 40;
         this.g = Math.min($$1, 400);
         this.f = $$0 + (long)this.g;
      }

      public boolean b(long $$0) {
         return $$0 - this.e < 400L;
      }

      public boolean c(long $$0) {
         return $$0 >= this.f;
      }

      @Override
      public String toString() {
         return "RetryMarker{, previousAttemptAt=" + this.e + ", nextScheduledAttemptAt=" + this.f + ", currentDelay=" + this.g + "}";
      }
   }
}
