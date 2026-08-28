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

public class bxj {
   public static final int a = 48;

   public static bxr<bwf> a(Predicate<jq<che>> $$0, cfb<jp> $$1, boolean $$2, Optional<Byte> $$3) {
      return a($$0, $$1, $$1, $$2, $$3);
   }

   public static bxr<bwf> a(Predicate<jq<che>> $$0, cfb<jp> $$1, cfb<jp> $$2, boolean $$3, Optional<Byte> $$4) {
      int $$5 = 5;
      int $$6 = 20;
      MutableLong $$7 = new MutableLong(0L);
      Long2ObjectMap<bxj.a> $$8 = new Long2ObjectOpenHashMap();
      bzb<bwf> $$9 = cbd.a(
         (Function<cbd.b<bwf>, ? extends App<cbd.c<bwf>, cbg<bwf>>>)($$6x -> $$6x.group($$6x.c($$2)).apply($$6x, $$5xx -> ($$6xx, $$7x, $$8x) -> {
                  if ($$3 && $$7x.e_()) {
                     return false;
                  } else if ($$7.getValue() == 0L) {
                     $$7.setValue($$6xx.ad() + (long)$$6xx.A.a(20));
                     return false;
                  } else if ($$6xx.ad() < $$7.getValue()) {
                     return false;
                  } else {
                     $$7.setValue($$8x + 20L + (long)$$6xx.H_().a(20));
                     chb $$9x = $$6xx.A();
                     $$8.long2ObjectEntrySet().removeIf($$1xxxx -> !((bxj.a)$$1xxxx.getValue()).b($$8x));
                     Predicate<jh> $$10 = $$2xxxx -> {
                        bxj.a $$3xxxx = (bxj.a)$$8.get($$2xxxx.a());
                        if ($$3xxxx == null) {
                           return true;
                        } else if (!$$3xxxx.c($$8x)) {
                           return false;
                        } else {
                           $$3xxxx.a($$8x);
                           return true;
                        }
                     };
                     Set<Pair<jq<che>, jh>> $$11 = $$9x.c($$0, $$10, $$7x.dw(), 48, chb.b.a).limit(5L).collect(Collectors.toSet());
                     eue $$12 = a($$7x, $$11);
                     if ($$12 != null && $$12.j()) {
                        jh $$13 = $$12.l();
                        $$9x.c($$13).ifPresent($$8xx -> {
                           $$9x.a($$0, ($$1xxxxx, $$2xxxxx) -> $$2xxxxx.equals($$13), $$13, 1);
                           $$5xx.a(jp.a($$6xx.ai(), $$13));
                           $$4.ifPresent($$2xxxxx -> $$6xx.a($$7x, $$2xxxxx));
                           $$8.clear();
                           agy.c($$6xx, $$13);
                        });
                     } else {
                        for (Pair<jq<che>, jh> $$14 : $$11) {
                           $$8.computeIfAbsent(((jh)$$14.getSecond()).a(), $$2xxxx -> new bxj.a($$6xx.A, $$8x));
                        }
                     }

                     return true;
                  }
               }))
      );
      return $$2 == $$1 ? $$9 : cbd.a((Function<cbd.b<bwf>, ? extends App<cbd.c<bwf>, cbg<bwf>>>)($$2x -> $$2x.group($$2x.c($$1)).apply($$2x, $$1xx -> $$9)));
   }

   @Nullable
   public static eue a(bvz $$0, Set<Pair<jq<che>, jh>> $$1) {
      if ($$1.isEmpty()) {
         return null;
      } else {
         Set<jh> $$2 = new HashSet<>();
         int $$3 = 1;

         for (Pair<jq<che>, jh> $$4 : $$1) {
            $$3 = Math.max($$3, ((che)((jq)$$4.getFirst()).a()).c());
            $$2.add((jh)$$4.getSecond());
         }

         return $$0.L().a($$2, $$3);
      }
   }

   static class a {
      private static final int a = 40;
      private static final int b = 80;
      private static final int c = 400;
      private final bac d;
      private long e;
      private long f;
      private int g;

      a(bac $$0, long $$1) {
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
