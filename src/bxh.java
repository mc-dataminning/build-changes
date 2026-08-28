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

public class bxh {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private static final int d = 4;

   public static bvk<btz> a(float $$0) {
      Long2LongMap $$1 = new Long2LongOpenHashMap();
      MutableLong $$2 = new MutableLong(0L);
      return byw.a(
         (Function<byw.b<btz>, ? extends App<byw.c<btz>, byz<btz>>>)($$3 -> $$3.group($$3.c(ccu.m), $$3.c(ccu.b))
               .apply($$3, ($$3x, $$4) -> ($$4x, $$5, $$6) -> {
                     if ($$4x.Z() - $$2.getValue() < 20L) {
                        return false;
                     } else {
                        ceu $$7 = $$4x.y();
                        Optional<iz> $$8 = $$7.d($$0xxxx -> $$0xxxx.a(cey.n), $$5.dp(), 48, ceu.b.c);
                        if (!$$8.isEmpty() && !($$8.get().j($$5.dp()) <= 4.0)) {
                           MutableInt $$9 = new MutableInt(0);
                           $$2.setValue($$4x.Z() + (long)$$4x.E_().a(20));
                           Predicate<iz> $$10 = $$3xxx -> {
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
                           Set<Pair<ji<cex>, iz>> $$11 = $$7.b($$0xxxx -> $$0xxxx.a(cey.n), $$10, $$5.dp(), 48, ceu.b.c).collect(Collectors.toSet());
                           eok $$12 = bvc.a($$5, $$11);
                           if ($$12 != null && $$12.j()) {
                              iz $$13 = $$12.l();
                              Optional<ji<cex>> $$14 = $$7.c($$13);
                              if ($$14.isPresent()) {
                                 $$3x.a(new ccx($$13, $$0, 1));
                                 agt.c($$4x, $$13);
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
