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

public class byb {
   public static final int a = 48;

   public static byj<bwz> a(Predicate<js<chw>> $$0, cft<jr> $$1, boolean $$2, Optional<Byte> $$3, BiPredicate<arn, jj> $$4) {
      return a($$0, $$1, $$1, $$2, $$3, $$4);
   }

   public static byj<bwz> a(Predicate<js<chw>> $$0, cft<jr> $$1, boolean $$2, Optional<Byte> $$3) {
      return a($$0, $$1, $$1, $$2, $$3, ($$0x, $$1x) -> true);
   }

   public static byj<bwz> a(Predicate<js<chw>> $$0, cft<jr> $$1, cft<jr> $$2, boolean $$3, Optional<Byte> $$4, BiPredicate<arn, jj> $$5) {
      int $$6 = 5;
      int $$7 = 20;
      MutableLong $$8 = new MutableLong(0L);
      Long2ObjectMap<byb.a> $$9 = new Long2ObjectOpenHashMap();
      bzt<bwz> $$10 = cbv.a(
         (Function<cbv.b<bwz>, ? extends App<cbv.c<bwz>, cby<bwz>>>)($$7x -> $$7x.group($$7x.c($$2))
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
                           cht $$10x = $$7xx.A();
                           $$9.long2ObjectEntrySet().removeIf($$1xxxx -> !((byb.a)$$1xxxx.getValue()).b($$9x));
                           Predicate<jj> $$11 = $$2xxxx -> {
                              byb.a $$3xxxx = (byb.a)$$9.get($$2xxxx.a());
                              if ($$3xxxx == null) {
                                 return true;
                              } else if (!$$3xxxx.c($$9x)) {
                                 return false;
                              } else {
                                 $$3xxxx.a($$9x);
                                 return true;
                              }
                           };
                           Set<Pair<js<chw>, jj>> $$12 = $$10x.c($$0, $$11, $$8x.dv(), 48, cht.b.a)
                              .limit(5L)
                              .filter($$2xxxx -> $$5.test($$7xx, (jj)$$2xxxx.getSecond()))
                              .collect(Collectors.toSet());
                           evh $$13 = a($$8x, $$12);
                           if ($$13 != null && $$13.j()) {
                              jj $$14 = $$13.l();
                              $$10x.c($$14).ifPresent($$8xx -> {
                                 $$10x.a($$0, ($$1xxxxx, $$2xxxxx) -> $$2xxxxx.equals($$14), $$14, 1);
                                 $$6xx.a(jr.a($$7xx.aj(), $$14));
                                 $$4.ifPresent($$2xxxxx -> $$7xx.a($$8x, $$2xxxxx));
                                 $$9.clear();
                                 agj.c($$7xx, $$14);
                              });
                           } else {
                              for (Pair<js<chw>, jj> $$15 : $$12) {
                                 $$9.computeIfAbsent(((jj)$$15.getSecond()).a(), $$2xxxx -> new byb.a($$7xx.A, $$9x));
                              }
                           }

                           return true;
                        }
                     }
               ))
      );
      return $$2 == $$1 ? $$10 : cbv.a((Function<cbv.b<bwz>, ? extends App<cbv.c<bwz>, cby<bwz>>>)($$2x -> $$2x.group($$2x.c($$1)).apply($$2x, $$1xx -> $$10)));
   }

   @Nullable
   public static evh a(bwt $$0, Set<Pair<js<chw>, jj>> $$1) {
      if ($$1.isEmpty()) {
         return null;
      } else {
         Set<jj> $$2 = new HashSet<>();
         int $$3 = 1;

         for (Pair<js<chw>, jj> $$4 : $$1) {
            $$3 = Math.max($$3, ((chw)((js)$$4.getFirst()).a()).c());
            $$2.add((jj)$$4.getSecond());
         }

         return $$0.O().a($$2, $$3);
      }
   }

   static class a {
      private static final int a = 40;
      private static final int b = 80;
      private static final int c = 400;
      private final azs d;
      private long e;
      private long f;
      private int g;

      a(azs $$0, long $$1) {
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
