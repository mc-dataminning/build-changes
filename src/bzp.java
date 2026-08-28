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

public class bzp {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private static final int d = 4;

   public static bxs<bwg> a(float $$0) {
      Long2LongMap $$1 = new Long2LongOpenHashMap();
      MutableLong $$2 = new MutableLong(0L);
      return cbe.a(
         (Function<cbe.b<bwg>, ? extends App<cbe.c<bwg>, cbh<bwg>>>)($$3 -> $$3.group($$3.c(cfc.m), $$3.c(cfc.b))
               .apply($$3, ($$3x, $$4) -> ($$4x, $$5, $$6) -> {
                     if ($$4x.ae() - $$2.getValue() < 20L) {
                        return false;
                     } else {
                        chc $$7 = $$4x.A();
                        Optional<ji> $$8 = $$7.d($$0xxxx -> $$0xxxx.a(chg.n), $$5.du(), 48, chc.b.c);
                        if (!$$8.isEmpty() && !($$8.get().j($$5.du()) <= 4.0)) {
                           MutableInt $$9 = new MutableInt(0);
                           $$2.setValue($$4x.ae() + (long)$$4x.C_().a(20));
                           Predicate<ji> $$10 = $$3xxx -> {
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
                           Set<Pair<jr<chf>, ji>> $$11 = $$7.b($$0xxxx -> $$0xxxx.a(chg.n), $$10, $$5.du(), 48, chc.b.c).collect(Collectors.toSet());
                           euk $$12 = bxk.a($$5, $$11);
                           if ($$12 != null && $$12.j()) {
                              ji $$13 = $$12.l();
                              Optional<jr<chf>> $$14 = $$7.c($$13);
                              if ($$14.isPresent()) {
                                 $$3x.a(new cff($$13, $$0, 1));
                                 agc.c($$4x, $$13);
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
