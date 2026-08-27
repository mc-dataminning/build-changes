import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableLong;

public class bmm {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private static final int d = 4;

   public static bkq<bjh> a(float $$0) {
      Long2LongMap $$1 = new Long2LongOpenHashMap();
      MutableLong $$2 = new MutableLong(0L);
      return bob.a(
         (Function<bob.b<bjh>, ? extends App<bob.c<bjh>, boe<bjh>>>)($$3 -> $$3.group($$3.c(brz.m), $$3.c(brz.b))
               .apply($$3, ($$3x, $$4) -> ($$4x, $$5, $$6) -> {
                     if ($$4x.V() - $$2.getValue() < 20L) {
                        return false;
                     } else {
                        btx $$7 = $$4x.w();
                        Optional<gu> $$8 = $$7.d($$0xxxx -> $$0xxxx.a(bub.n), $$5.dk(), 48, btx.b.c);
                        if (!$$8.isEmpty() && !($$8.get().j($$5.dk()) <= 4.0)) {
                           MutableInt $$9 = new MutableInt(0);
                           $$2.setValue($$4x.V() + (long)$$4x.y_().a(20));
                           Predicate<gu> $$10 = $$3xxx -> {
                              long $$4xx = $$3xxx.a();
                              if ($$1.containsKey($$4xx)) {
                                 return false;
                              } else if ($$9.incrementAndGet() >= 5) {
                                 return false;
                              } else {
                                 $$1.put($$4xx, $$2.getValue() + 40L);
                                 return true;
                              }
                           };
                           Set<Pair<he<bua>, gu>> $$11 = $$7.b($$0xxxx -> $$0xxxx.a(bub.n), $$10, $$5.dk(), 48, btx.b.c).collect(Collectors.toSet());
                           ear $$12 = bki.a($$5, $$11);
                           if ($$12 != null && $$12.j()) {
                              gu $$13 = $$12.l();
                              Optional<he<bua>> $$14 = $$7.c($$13);
                              if ($$14.isPresent()) {
                                 $$3x.a(new bsc($$13, $$0, 1));
                                 aav.c($$4x, $$13);
                              }
                           } else if ($$9.getValue() < 5) {
                              $$1.long2LongEntrySet().removeIf($$1xxxx -> $$1xxxx.getLongValue() < $$2.getValue());
                           }

                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
