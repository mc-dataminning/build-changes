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

public class bpa {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bod<bml> a() {
      MutableObject<efe> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$2 -> $$2.group($$2.b(bvn.t), $$2.a(bvn.v), $$2.a(bvn.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     efg $$9 = $$2.b($$3);
                     Optional<Set<ig>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        efe $$11 = $$9.i();
                        efe $$12 = $$9.h();
                        hx $$13 = $$11.a();
                        djh $$14 = $$6.a_($$13);
                        if ($$14.a(ash.h, $$0xxxx -> $$0xxxx.b() instanceof cyw)) {
                           cyw $$15 = (cyw)$$14.b();
                           if (!$$15.h($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        hx $$16 = $$12.a();
                        djh $$17 = $$6.a_($$16);
                        if ($$17.a(ash.h, $$0xxxx -> $$0xxxx.b() instanceof cyw)) {
                           cyw $$18 = (cyw)$$17.b();
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

   public static void a(and $$0, bml $$1, @Nullable efe $$2, @Nullable efe $$3, Set<ig> $$4, Optional<List<bml>> $$5) {
      Iterator<ig> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         ig $$7 = $$6.next();
         hx $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               djh $$9 = $$0.a_($$8);
               if (!$$9.a(ash.h, $$0x -> $$0x.b() instanceof cyw)) {
                  $$6.remove();
               } else {
                  cyw $$10 = (cyw)$$9.b();
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

   private static boolean a(bml $$0, hx $$1, Optional<List<bml>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ai() == $$0.ai()).filter($$1x -> $$1.a($$1x.dk(), 2.0)).anyMatch($$1x -> a($$1x.dO(), $$1));
   }

   private static boolean a(bnl<?> $$0, hx $$1) {
      if (!$$0.a(bvn.t)) {
         return false;
      } else {
         efg $$2 = $$0.c(bvn.t).get();
         if ($$2.c()) {
            return false;
         } else {
            efe $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               efe $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(and $$0, bml $$1, ig $$2) {
      return $$2.a() != $$0.ae() || !$$2.b().a($$1.dk(), 3.0);
   }

   private static Optional<Set<ig>> a(brq<Mu, Set<ig>> $$0, Optional<Set<ig>> $$1, and $$2, hx $$3) {
      ig $$4 = ig.a($$2.ae(), $$3);
      return Optional.of($$1.<Set<ig>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<ig> $$2x = Sets.newHashSet(new ig[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
