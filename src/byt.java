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

public class byt {
   public static final int a = 48;

   public static bzb<bxr> a(Predicate<jf<cio>> $$0, cgl<je> $$1, boolean $$2, Optional<Byte> $$3, BiPredicate<arq, iv> $$4) {
      return a($$0, $$1, $$1, $$2, $$3, $$4);
   }

   public static bzb<bxr> a(Predicate<jf<cio>> $$0, cgl<je> $$1, boolean $$2, Optional<Byte> $$3) {
      return a($$0, $$1, $$1, $$2, $$3, ($$0x, $$1x) -> true);
   }

   public static bzb<bxr> a(Predicate<jf<cio>> $$0, cgl<je> $$1, cgl<je> $$2, boolean $$3, Optional<Byte> $$4, BiPredicate<arq, iv> $$5) {
      int $$6 = 5;
      int $$7 = 20;
      MutableLong $$8 = new MutableLong(0L);
      Long2ObjectMap<byt.a> $$9 = new Long2ObjectOpenHashMap();
      cal<bxr> $$10 = ccn.a(
         (Function<ccn.b<bxr>, ? extends App<ccn.c<bxr>, ccq<bxr>>>)($$7x -> $$7x.group($$7x.c($$2))
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
                           cil $$10x = $$7xx.A();
                           $$9.long2ObjectEntrySet().removeIf($$1xxxx -> !((byt.a)$$1xxxx.getValue()).b($$9x));
                           Predicate<iv> $$11 = $$2xxxx -> {
                              byt.a $$3xxxx = (byt.a)$$9.get($$2xxxx.a());
                              if ($$3xxxx == null) {
                                 return true;
                              } else if (!$$3xxxx.c($$9x)) {
                                 return false;
                              } else {
                                 $$3xxxx.a($$9x);
                                 return true;
                              }
                           };
                           Set<Pair<jf<cio>, iv>> $$12 = $$10x.c($$0, $$11, $$8x.du(), 48, cil.b.a)
                              .limit(5L)
                              .filter($$2xxxx -> $$5.test($$7xx, (iv)$$2xxxx.getSecond()))
                              .collect(Collectors.toSet());
                           exo $$13 = a($$8x, $$12);
                           if ($$13 != null && $$13.j()) {
                              iv $$14 = $$13.l();
                              $$10x.c($$14).ifPresent($$8xx -> {
                                 $$10x.a($$0, ($$1xxxxx, $$2xxxxx) -> $$2xxxxx.equals($$14), $$14, 1);
                                 $$6xx.a(je.a($$7xx.aj(), $$14));
                                 $$4.ifPresent($$2xxxxx -> $$7xx.a($$8x, $$2xxxxx));
                                 $$9.clear();
                                 agm.c($$7xx, $$14);
                              });
                           } else {
                              for (Pair<jf<cio>, iv> $$15 : $$12) {
                                 $$9.computeIfAbsent(((iv)$$15.getSecond()).a(), $$2xxxx -> new byt.a($$7xx.A, $$9x));
                              }
                           }

                           return true;
                        }
                     }
               ))
      );
      return $$2 == $$1 ? $$10 : ccn.a((Function<ccn.b<bxr>, ? extends App<ccn.c<bxr>, ccq<bxr>>>)($$2x -> $$2x.group($$2x.c($$1)).apply($$2x, $$1xx -> $$10)));
   }

   @Nullable
   public static exo a(bxl $$0, Set<Pair<jf<cio>, iv>> $$1) {
      if ($$1.isEmpty()) {
         return null;
      } else {
         Set<iv> $$2 = new HashSet<>();
         int $$3 = 1;

         for (Pair<jf<cio>, iv> $$4 : $$1) {
            $$3 = Math.max($$3, ((cio)((jf)$$4.getFirst()).a()).c());
            $$2.add((iv)$$4.getSecond());
         }

         return $$0.O().a($$2, $$3);
      }
   }

   static class a {
      private static final int a = 40;
      private static final int b = 80;
      private static final int c = 400;
      private final azv d;
      private long e;
      private long f;
      private int g;

      a(azv $$0, long $$1) {
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
