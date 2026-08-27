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

public class blm {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bkp<biw> a() {
      MutableObject<eao> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$2 -> $$2.group($$2.b(bry.t), $$2.a(bry.v), $$2.a(bry.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     eaq $$9 = $$2.b($$3);
                     Optional<Set<he>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        eao $$11 = $$9.i();
                        eao $$12 = $$9.h();
                        gv $$13 = $$11.a();
                        dey $$14 = $$6.a_($$13);
                        if ($$14.a(apj.h, $$0xxxx -> $$0xxxx.b() instanceof cum)) {
                           cum $$15 = (cum)$$14.b();
                           if (!$$15.h($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        gv $$16 = $$12.a();
                        dey $$17 = $$6.a_($$16);
                        if ($$17.a(apj.h, $$0xxxx -> $$0xxxx.b() instanceof cum)) {
                           cum $$18 = (cum)$$17.b();
                           if (!$$18.h($$17)) {
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

   public static void a(aki $$0, biw $$1, @Nullable eao $$2, @Nullable eao $$3, Set<he> $$4, Optional<List<biw>> $$5) {
      Iterator<he> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         he $$7 = $$6.next();
         gv $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dey $$9 = $$0.a_($$8);
               if (!$$9.a(apj.h, $$0x -> $$0x.b() instanceof cum)) {
                  $$6.remove();
               } else {
                  cum $$10 = (cum)$$9.b();
                  if (!$$10.h($$9)) {
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

   private static boolean a(biw $$0, gv $$1, Optional<List<biw>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ag() == $$0.ag()).filter($$1x -> $$1.a($$1x.di(), 2.0)).anyMatch($$1x -> a($$1x.dM(), $$1));
   }

   private static boolean a(bjx<?> $$0, gv $$1) {
      if (!$$0.a(bry.t)) {
         return false;
      } else {
         eaq $$2 = $$0.c(bry.t).get();
         if ($$2.c()) {
            return false;
         } else {
            eao $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               eao $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aki $$0, biw $$1, he $$2) {
      return $$2.a() != $$0.ac() || !$$2.b().a($$1.di(), 3.0);
   }

   private static Optional<Set<he>> a(bob<Mu, Set<he>> $$0, Optional<Set<he>> $$1, aki $$2, gv $$3) {
      he $$4 = he.a($$2.ac(), $$3);
      return Optional.of($$1.<Set<he>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<he> $$2x = Sets.newHashSet(new he[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
