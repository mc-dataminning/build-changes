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

public class boa {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bnd<bll> a() {
      MutableObject<edk> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$2 -> $$2.group($$2.b(bum.t), $$2.a(bum.v), $$2.a(bum.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     edm $$9 = $$2.b($$3);
                     Optional<Set<ie>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        edk $$11 = $$9.i();
                        edk $$12 = $$9.h();
                        hx $$13 = $$11.a();
                        dhn $$14 = $$6.a_($$13);
                        if ($$14.a(ark.h, $$0xxxx -> $$0xxxx.b() instanceof cxl)) {
                           cxl $$15 = (cxl)$$14.b();
                           if (!$$15.h($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        hx $$16 = $$12.a();
                        dhn $$17 = $$6.a_($$16);
                        if ($$17.a(ark.h, $$0xxxx -> $$0xxxx.b() instanceof cxl)) {
                           cxl $$18 = (cxl)$$17.b();
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

   public static void a(ami $$0, bll $$1, @Nullable edk $$2, @Nullable edk $$3, Set<ie> $$4, Optional<List<bll>> $$5) {
      Iterator<ie> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         ie $$7 = $$6.next();
         hx $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dhn $$9 = $$0.a_($$8);
               if (!$$9.a(ark.h, $$0x -> $$0x.b() instanceof cxl)) {
                  $$6.remove();
               } else {
                  cxl $$10 = (cxl)$$9.b();
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

   private static boolean a(bll $$0, hx $$1, Optional<List<bll>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ai() == $$0.ai()).filter($$1x -> $$1.a($$1x.dl(), 2.0)).anyMatch($$1x -> a($$1x.dP(), $$1));
   }

   private static boolean a(bml<?> $$0, hx $$1) {
      if (!$$0.a(bum.t)) {
         return false;
      } else {
         edm $$2 = $$0.c(bum.t).get();
         if ($$2.c()) {
            return false;
         } else {
            edk $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               edk $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(ami $$0, bll $$1, ie $$2) {
      return $$2.a() != $$0.ad() || !$$2.b().a($$1.dl(), 3.0);
   }

   private static Optional<Set<ie>> a(bqp<Mu, Set<ie>> $$0, Optional<Set<ie>> $$1, ami $$2, hx $$3) {
      ie $$4 = ie.a($$2.ad(), $$3);
      return Optional.of($$1.<Set<ie>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<ie> $$2x = Sets.newHashSet(new ie[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
