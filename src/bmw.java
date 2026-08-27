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

public class bmw {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private static final int d = 4;

   public static bla<bjr> a(float $$0) {
      Long2LongMap $$1 = new Long2LongOpenHashMap();
      MutableLong $$2 = new MutableLong(0L);
      return bol.a(
         (Function<bol.b<bjr>, ? extends App<bol.c<bjr>, boo<bjr>>>)($$3 -> $$3.group($$3.c(bsj.m), $$3.c(bsj.b))
               .apply($$3, ($$3x, $$4) -> ($$4x, $$5, $$6) -> {
                     if ($$4x.V() - $$2.getValue() < 20L) {
                        return false;
                     } else {
                        buh $$7 = $$4x.w();
                        Optional<gw> $$8 = $$7.d($$0xxxx -> $$0xxxx.a(bul.n), $$5.dl(), 48, buh.b.c);
                        if (!$$8.isEmpty() && !($$8.get().j($$5.dl()) <= 4.0)) {
                           MutableInt $$9 = new MutableInt(0);
                           $$2.setValue($$4x.V() + (long)$$4x.D_().a(20));
                           Predicate<gw> $$10 = $$3xxx -> {
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
                           Set<Pair<hg<buk>, gw>> $$11 = $$7.b($$0xxxx -> $$0xxxx.a(bul.n), $$10, $$5.dl(), 48, buh.b.c).collect(Collectors.toSet());
                           ebd $$12 = bks.a($$5, $$11);
                           if ($$12 != null && $$12.j()) {
                              gw $$13 = $$12.l();
                              Optional<hg<buk>> $$14 = $$7.c($$13);
                              if ($$14.isPresent()) {
                                 $$3x.a(new bsm($$13, $$0, 1));
                                 abd.c($$4x, $$13);
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
