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

public class bnx {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private static final int d = 4;

   public static bmb<bks> a(float $$0) {
      Long2LongMap $$1 = new Long2LongOpenHashMap();
      MutableLong $$2 = new MutableLong(0L);
      return bpm.a(
         (Function<bpm.b<bks>, ? extends App<bpm.c<bks>, bpp<bks>>>)($$3 -> $$3.group($$3.c(btk.m), $$3.c(btk.b))
               .apply($$3, ($$3x, $$4) -> ($$4x, $$5, $$6) -> {
                     if ($$4x.V() - $$2.getValue() < 20L) {
                        return false;
                     } else {
                        bvi $$7 = $$4x.w();
                        Optional<ht> $$8 = $$7.d($$0xxxx -> $$0xxxx.a(bvm.n), $$5.dl(), 48, bvi.b.c);
                        if (!$$8.isEmpty() && !($$8.get().j($$5.dl()) <= 4.0)) {
                           MutableInt $$9 = new MutableInt(0);
                           $$2.setValue($$4x.V() + (long)$$4x.E_().a(20));
                           Predicate<ht> $$10 = $$3xxx -> {
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
                           Set<Pair<ib<bvl>, ht>> $$11 = $$7.b($$0xxxx -> $$0xxxx.a(bvm.n), $$10, $$5.dl(), 48, bvi.b.c).collect(Collectors.toSet());
                           ebt $$12 = blt.a($$5, $$11);
                           if ($$12 != null && $$12.j()) {
                              ht $$13 = $$12.l();
                              Optional<ib<bvl>> $$14 = $$7.c($$13);
                              if ($$14.isPresent()) {
                                 $$3x.a(new btn($$13, $$0, 1));
                                 abz.c($$4x, $$13);
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
