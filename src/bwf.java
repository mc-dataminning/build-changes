import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.OptionalBox.Mu;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;

public class bwf {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bvi<bto> a() {
      MutableObject<eog> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return byu.a(
         (Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$2 -> $$2.group($$2.b(ccs.t), $$2.a(ccs.v), $$2.a(ccs.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     eoi $$9 = $$2.b($$3);
                     Optional<Set<jh>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        eog $$11 = $$9.i();
                        eog $$12 = $$9.h();
                        iz $$13 = $$11.a();
                        dsb $$14 = $$6.a_($$13);
                        if ($$14.a(awo.h, $$0xxxx -> $$0xxxx.b() instanceof dhe)) {
                           dhe $$15 = (dhe)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        iz $$16 = $$12.a();
                        dsb $$17 = $$6.a_($$16);
                        if ($$17.a(awo.h, $$0xxxx -> $$0xxxx.b() instanceof dhe)) {
                           dhe $$18 = (dhe)$$17.b();
                           if (!$$18.m($$17)) {
                              $$18.a($$7, $$6, $$17, $$16, true);
                              $$10 = a($$4, $$10, $$6, $$16);
                           }
                        }

                        $$10.ifPresent($$6x -> a($$6, $$7, $$11, $$12, $$6x, $$2.a($$5)));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   public static void a(are $$0, bto $$1, @Nullable eog $$2, @Nullable eog $$3, Set<jh> $$4, Optional<List<bto>> $$5) {
      Iterator<jh> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jh $$7 = $$6.next();
         iz $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dsb $$9 = $$0.a_($$8);
               if (!$$9.a(awo.h, $$0x -> $$0x.b() instanceof dhe)) {
                  $$6.remove();
               } else {
                  dhe $$10 = (dhe)$$9.b();
                  if (!$$10.m($$9)) {
                     $$6.remove();
                  } else if (a($$1, $$8, $$5)) {
                     $$6.remove();
                  } else {
                     $$10.a($$1, $$0, $$9, $$8, false);
                     $$6.remove();
                  }
               }
            }
         }
      }
   }

   private static boolean a(bto $$0, iz $$1, Optional<List<bto>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ak() == $$0.ak()).filter($$1x -> $$1.a($$1x.dn(), 2.0)).anyMatch($$1x -> a($$1x.dS(), $$1));
   }

   private static boolean a(buq<?> $$0, iz $$1) {
      if (!$$0.a(ccs.t)) {
         return false;
      } else {
         eoi $$2 = $$0.c(ccs.t).get();
         if ($$2.c()) {
            return false;
         } else {
            eog $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               eog $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(are $$0, bto $$1, jh $$2) {
      return $$2.a() != $$0.af() || !$$2.b().a($$1.dn(), 3.0);
   }

   private static Optional<Set<jh>> a(byv<Mu, Set<jh>> $$0, Optional<Set<jh>> $$1, are $$2, iz $$3) {
      jh $$4 = jh.a($$2.af(), $$3);
      return Optional.of($$1.<Set<jh>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jh> $$2x = Sets.newHashSet(new jh[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
