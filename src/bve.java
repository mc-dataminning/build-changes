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

public class bve {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static buh<bso> a() {
      MutableObject<epq> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$2 -> $$2.group($$2.b(cbr.t), $$2.a(cbr.v), $$2.a(cbr.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     eps $$9 = $$2.b($$3);
                     Optional<Set<iz>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        epq $$11 = $$9.i();
                        epq $$12 = $$9.h();
                        ir $$13 = $$11.a();
                        dtc $$14 = $$6.a_($$13);
                        if ($$14.a(awe.h, $$0xxxx -> $$0xxxx.b() instanceof dhj)) {
                           dhj $$15 = (dhj)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        ir $$16 = $$12.a();
                        dtc $$17 = $$6.a_($$16);
                        if ($$17.a(awe.h, $$0xxxx -> $$0xxxx.b() instanceof dhj)) {
                           dhj $$18 = (dhj)$$17.b();
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

   public static void a(aqt $$0, bso $$1, @Nullable epq $$2, @Nullable epq $$3, Set<iz> $$4, Optional<List<bso>> $$5) {
      Iterator<iz> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         iz $$7 = $$6.next();
         ir $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dtc $$9 = $$0.a_($$8);
               if (!$$9.a(awe.h, $$0x -> $$0x.b() instanceof dhj)) {
                  $$6.remove();
               } else {
                  dhj $$10 = (dhj)$$9.b();
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

   private static boolean a(bso $$0, ir $$1, Optional<List<bso>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ak() == $$0.ak()).filter($$1x -> $$1.a($$1x.ds(), 2.0)).anyMatch($$1x -> a($$1x.dZ(), $$1));
   }

   private static boolean a(btp<?> $$0, ir $$1) {
      if (!$$0.a(cbr.t)) {
         return false;
      } else {
         eps $$2 = $$0.c(cbr.t).get();
         if ($$2.c()) {
            return false;
         } else {
            epq $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               epq $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aqt $$0, bso $$1, iz $$2) {
      return $$2.a() != $$0.af() || !$$2.b().a($$1.ds(), 3.0);
   }

   private static Optional<Set<iz>> a(bxu<Mu, Set<iz>> $$0, Optional<Set<iz>> $$1, aqt $$2, ir $$3) {
      iz $$4 = iz.a($$2.af(), $$3);
      return Optional.of($$1.<Set<iz>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<iz> $$2x = Sets.newHashSet(new iz[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
