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

public class bxy {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bxb<bvh> a() {
      MutableObject<esh> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return can.a(
         (Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$2 -> $$2.group($$2.b(cel.t), $$2.a(cel.v), $$2.a(cel.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     esj $$9 = $$2.b($$3);
                     Optional<Set<jp>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        esh $$11 = $$9.i();
                        esh $$12 = $$9.h();
                        jh $$13 = $$11.a();
                        dvv $$14 = $$6.a_($$13);
                        if ($$14.a(axc.i, $$0xxxx -> $$0xxxx.b() instanceof dkw)) {
                           dkw $$15 = (dkw)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        jh $$16 = $$12.a();
                        dvv $$17 = $$6.a_($$16);
                        if ($$17.a(axc.i, $$0xxxx -> $$0xxxx.b() instanceof dkw)) {
                           dkw $$18 = (dkw)$$17.b();
                           if (!$$18.n($$17)) {
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

   public static void a(arp $$0, bvh $$1, @Nullable esh $$2, @Nullable esh $$3, Set<jp> $$4, Optional<List<bvh>> $$5) {
      Iterator<jp> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jp $$7 = $$6.next();
         jh $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dvv $$9 = $$0.a_($$8);
               if (!$$9.a(axc.i, $$0x -> $$0x.b() instanceof dkw)) {
                  $$6.remove();
               } else {
                  dkw $$10 = (dkw)$$9.b();
                  if (!$$10.n($$9)) {
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

   private static boolean a(bvh $$0, jh $$1, Optional<List<bvh>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.aq() == $$0.aq()).filter($$1x -> $$1.a($$1x.dt(), 2.0)).anyMatch($$1x -> a($$1x.eb(), $$1));
   }

   private static boolean a(bwj<?> $$0, jh $$1) {
      if (!$$0.a(cel.t)) {
         return false;
      } else {
         esj $$2 = $$0.c(cel.t).get();
         if ($$2.c()) {
            return false;
         } else {
            esh $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               esh $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(arp $$0, bvh $$1, jp $$2) {
      return $$2.a() != $$0.ag() || !$$2.b().a($$1.dt(), 3.0);
   }

   private static Optional<Set<jp>> a(cao<Mu, Set<jp>> $$0, Optional<Set<jp>> $$1, arp $$2, jh $$3) {
      jp $$4 = jp.a($$2.ag(), $$3);
      return Optional.of($$1.<Set<jp>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jp> $$2x = Sets.newHashSet(new jp[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
