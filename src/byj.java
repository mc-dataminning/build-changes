import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableLong;

public class byj {
   public static final int a = 48;

   public static byr<bxh> a(Predicate<je<cie>> $$0, cgb<jd> $$1, boolean $$2, Optional<Byte> $$3, BiPredicate<aro, iu> $$4) {
      return a($$0, $$1, $$1, $$2, $$3, $$4);
   }

   public static byr<bxh> a(Predicate<je<cie>> $$0, cgb<jd> $$1, boolean $$2, Optional<Byte> $$3) {
      return a($$0, $$1, $$1, $$2, $$3, ($$0x, $$1x) -> true);
   }

   public static byr<bxh> a(Predicate<je<cie>> $$0, cgb<jd> $$1, cgb<jd> $$2, boolean $$3, Optional<Byte> $$4, BiPredicate<aro, iu> $$5) {
      int $$6 = 5;
      int $$7 = 20;
      MutableLong $$8 = new MutableLong(0L);
      Long2ObjectMap<byj.a> $$9 = new Long2ObjectOpenHashMap();
      cab<bxh> $$10 = ccd.a(
         (Function<ccd.b<bxh>, ? extends App<ccd.c<bxh>, ccg<bxh>>>)($$7x -> $$7x.group($$7x.c($$2))
               .apply(
                  $$7x,
                  $$6xx -> ($$7xx, $$8x, $$9x) -> {
                        if ($$3 && $$8x.n_()) {
                           return false;
                        } else if ($$8.getValue() == 0L) {
                           $$8.setValue($$7xx.ae() + (long)$$7xx.A.a(20));
                           return false;
                        } else if ($$7xx.ae() < $$8.getValue()) {
                           return false;
                        } else {
                           $$8.setValue($$9x + 20L + (long)$$7xx.C_().a(20));
                           cib $$10x = $$7xx.A();
                           $$9.long2ObjectEntrySet().removeIf($$1xxxx -> !((byj.a)$$1xxxx.getValue()).b($$9x));
                           Predicate<iu> $$11 = $$2xxxx -> {
                              byj.a $$3xxxx = (byj.a)$$9.get($$2xxxx.a());
                              if ($$3xxxx == null) {
                                 return true;
                              } else if (!$$3xxxx.c($$9x)) {
                                 return false;
                              } else {
                                 $$3xxxx.a($$9x);
                                 return true;
                              }
                           };
                           Set<Pair<je<cie>, iu>> $$12 = $$10x.c($$0, $$11, $$8x.dv(), 48, cib.b.a)
                              .limit(5L)
                              .filter($$2xxxx -> $$5.test($$7xx, (iu)$$2xxxx.getSecond()))
                              .collect(Collectors.toSet());
                           ewj $$13 = a($$8x, $$12);
                           if ($$13 != null && $$13.j()) {
                              iu $$14 = $$13.l();
                              $$10x.c($$14).ifPresent($$8xx -> {
                                 $$10x.a($$0, ($$1xxxxx, $$2xxxxx) -> $$2xxxxx.equals($$14), $$14, 1);
                                 $$6xx.a(jd.a($$7xx.aj(), $$14));
                                 $$4.ifPresent($$2xxxxx -> $$7xx.a($$8x, $$2xxxxx));
                                 $$9.clear();
                                 agk.c($$7xx, $$14);
                              });
                           } else {
                              for (Pair<je<cie>, iu> $$15 : $$12) {
                                 $$9.computeIfAbsent(((iu)$$15.getSecond()).a(), $$2xxxx -> new byj.a($$7xx.A, $$9x));
                              }
                           }

                           return true;
                        }
                     }
               ))
      );
      return $$2 == $$1 ? $$10 : ccd.a((Function<ccd.b<bxh>, ? extends App<ccd.c<bxh>, ccg<bxh>>>)($$2x -> $$2x.group($$2x.c($$1)).apply($$2x, $$1xx -> $$10)));
   }

   @Nullable
   public static ewj a(bxb $$0, Set<Pair<je<cie>, iu>> $$1) {
      if ($$1.isEmpty()) {
         return null;
      } else {
         Set<iu> $$2 = new HashSet<>();
         int $$3 = 1;

         for (Pair<je<cie>, iu> $$4 : $$1) {
            $$3 = Math.max($$3, ((cie)((je)$$4.getFirst()).a()).c());
            $$2.add((iu)$$4.getSecond());
         }

         return $$0.O().a($$2, $$3);
      }
   }

   static class a {
      private static final int a = 40;
      private static final int b = 80;
      private static final int c = 400;
      private final azt d;
      private long e;
      private long f;
      private int g;

      a(azt $$0, long $$1) {
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
