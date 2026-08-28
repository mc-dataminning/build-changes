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

public class bxb {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private static final int d = 4;

   public static bve<btt> a(float $$0) {
      Long2LongMap $$1 = new Long2LongOpenHashMap();
      MutableLong $$2 = new MutableLong(0L);
      return byq.a(
         (Function<byq.b<btt>, ? extends App<byq.c<btt>, byt<btt>>>)($$3 -> $$3.group($$3.c(cco.m), $$3.c(cco.b))
               .apply($$3, ($$3x, $$4) -> ($$4x, $$5, $$6) -> {
                     if ($$4x.Z() - $$2.getValue() < 20L) {
                        return false;
                     } else {
                        ceo $$7 = $$4x.y();
                        Optional<iz> $$8 = $$7.d($$0xxxx -> $$0xxxx.a(ces.n), $$5.dp(), 48, ceo.b.c);
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
                           Set<Pair<ji<cer>, iz>> $$11 = $$7.b($$0xxxx -> $$0xxxx.a(ces.n), $$10, $$5.dp(), 48, ceo.b.c).collect(Collectors.toSet());
                           eoe $$12 = buw.a($$5, $$11);
                           if ($$12 != null && $$12.j()) {
                              iz $$13 = $$12.l();
                              Optional<ji<cer>> $$14 = $$7.c($$13);
                              if ($$14.isPresent()) {
                                 $$3x.a(new ccr($$13, $$0, 1));
                                 agp.c($$4x, $$13);
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
