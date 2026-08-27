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

public class buq {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static btt<bsa> a() {
      MutableObject<emm> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$2 -> $$2.group($$2.b(cbd.t), $$2.a(cbd.v), $$2.a(cbd.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     emo $$9 = $$2.b($$3);
                     Optional<Set<iv>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        emm $$11 = $$9.i();
                        emm $$12 = $$9.h();
                        in $$13 = $$11.a();
                        dqh $$14 = $$6.a_($$13);
                        if ($$14.a(avr.h, $$0xxxx -> $$0xxxx.b() instanceof dfk)) {
                           dfk $$15 = (dfk)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        in $$16 = $$12.a();
                        dqh $$17 = $$6.a_($$16);
                        if ($$17.a(avr.h, $$0xxxx -> $$0xxxx.b() instanceof dfk)) {
                           dfk $$18 = (dfk)$$17.b();
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

   public static void a(aqh $$0, bsa $$1, @Nullable emm $$2, @Nullable emm $$3, Set<iv> $$4, Optional<List<bsa>> $$5) {
      Iterator<iv> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         iv $$7 = $$6.next();
         in $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dqh $$9 = $$0.a_($$8);
               if (!$$9.a(avr.h, $$0x -> $$0x.b() instanceof dfk)) {
                  $$6.remove();
               } else {
                  dfk $$10 = (dfk)$$9.b();
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

   private static boolean a(bsa $$0, in $$1, Optional<List<bsa>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ai() == $$0.ai()).filter($$1x -> $$1.a($$1x.dl(), 2.0)).anyMatch($$1x -> a($$1x.dQ(), $$1));
   }

   private static boolean a(btb<?> $$0, in $$1) {
      if (!$$0.a(cbd.t)) {
         return false;
      } else {
         emo $$2 = $$0.c(cbd.t).get();
         if ($$2.c()) {
            return false;
         } else {
            emm $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               emm $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aqh $$0, bsa $$1, iv $$2) {
      return $$2.a() != $$0.ae() || !$$2.b().a($$1.dl(), 3.0);
   }

   private static Optional<Set<iv>> a(bxg<Mu, Set<iv>> $$0, Optional<Set<iv>> $$1, aqh $$2, in $$3) {
      iv $$4 = iv.a($$2.ae(), $$3);
      return Optional.of($$1.<Set<iv>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<iv> $$2x = Sets.newHashSet(new iv[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
