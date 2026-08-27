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

public class bkl {
   public static final int a = 48;

   public static bkt<bjk> a(Predicate<hg<bud>> $$0, bsc<hf> $$1, boolean $$2, Optional<Byte> $$3) {
      return a($$0, $$1, $$1, $$2, $$3);
   }

   public static bkt<bjk> a(Predicate<hg<bud>> $$0, bsc<hf> $$1, bsc<hf> $$2, boolean $$3, Optional<Byte> $$4) {
      int $$5 = 5;
      int $$6 = 20;
      MutableLong $$7 = new MutableLong(0L);
      Long2ObjectMap<bkl.a> $$8 = new Long2ObjectOpenHashMap();
      bmc<bjk> $$9 = boe.a(
         (Function<boe.b<bjk>, ? extends App<boe.c<bjk>, boh<bjk>>>)($$6x -> $$6x.group($$6x.c($$2)).apply($$6x, $$5xx -> ($$6xx, $$7x, $$8x) -> {
                  if ($$3 && $$7x.i_()) {
                     return false;
                  } else if ($$7.getValue() == 0L) {
                     $$7.setValue($$6xx.V() + (long)$$6xx.z.a(20));
                     return false;
                  } else if ($$6xx.V() < $$7.getValue()) {
                     return false;
                  } else {
                     $$7.setValue($$8x + 20L + (long)$$6xx.y_().a(20));
                     bua $$9x = $$6xx.w();
                     $$8.long2ObjectEntrySet().removeIf($$1xxxx -> !((bkl.a)$$1xxxx.getValue()).b($$8x));
                     Predicate<gw> $$10 = $$2xxxx -> {
                        bkl.a $$3xxxx = (bkl.a)$$8.get($$2xxxx.a());
                        if ($$3xxxx == null) {
                           return true;
                        } else if (!$$3xxxx.c($$8x)) {
                           return false;
                        } else {
                           $$3xxxx.a($$8x);
                           return true;
                        }
                     };
                     Set<Pair<hg<bud>, gw>> $$11 = $$9x.c($$0, $$10, $$7x.dk(), 48, bua.b.a).limit(5L).collect(Collectors.toSet());
                     eaw $$12 = a($$7x, $$11);
                     if ($$12 != null && $$12.j()) {
                        gw $$13 = $$12.l();
                        $$9x.c($$13).ifPresent($$8xx -> {
                           $$9x.a($$0, ($$1xxxxx, $$2xxxxx) -> $$2xxxxx.equals($$13), $$13, 1);
                           $$5xx.a(hf.a($$6xx.ac(), $$13));
                           $$4.ifPresent($$2xxxxx -> $$6xx.a($$7x, $$2xxxxx));
                           $$8.clear();
                           aay.c($$6xx, $$13);
                        });
                     } else {
                        for (Pair<hg<bud>, gw> $$14 : $$11) {
                           $$8.computeIfAbsent(((gw)$$14.getSecond()).a(), $$2xxxx -> new bkl.a($$6xx.z, $$8x));
                        }
                     }

                     return true;
                  }
               }))
      );
      return $$2 == $$1 ? $$9 : boe.a((Function<boe.b<bjk>, ? extends App<boe.c<bjk>, boh<bjk>>>)($$2x -> $$2x.group($$2x.c($$1)).apply($$2x, $$1xx -> $$9)));
   }

   @Nullable
   public static eaw a(bjd $$0, Set<Pair<hg<bud>, gw>> $$1) {
      if ($$1.isEmpty()) {
         return null;
      } else {
         Set<gw> $$2 = new HashSet<>();
         int $$3 = 1;

         for (Pair<hg<bud>, gw> $$4 : $$1) {
            $$3 = Math.max($$3, ((bud)((hg)$$4.getFirst()).a()).c());
            $$2.add((gw)$$4.getSecond());
         }

         return $$0.H().a($$2, $$3);
      }
   }

   static class a {
      private static final int a = 40;
      private static final int b = 80;
      private static final int c = 400;
      private final arx d;
      private long e;
      private long f;
      private int g;

      a(arx $$0, long $$1) {
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
