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

public class bnv {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bmy<blg> a() {
      MutableObject<edf> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$2 -> $$2.group($$2.b(buh.t), $$2.a(buh.v), $$2.a(buh.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     edh $$9 = $$2.b($$3);
                     Optional<Set<ia>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        edf $$11 = $$9.i();
                        edf $$12 = $$9.h();
                        ht $$13 = $$11.a();
                        dhi $$14 = $$6.a_($$13);
                        if ($$14.a(arg.h, $$0xxxx -> $$0xxxx.b() instanceof cxg)) {
                           cxg $$15 = (cxg)$$14.b();
                           if (!$$15.h($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        ht $$16 = $$12.a();
                        dhi $$17 = $$6.a_($$16);
                        if ($$17.a(arg.h, $$0xxxx -> $$0xxxx.b() instanceof cxg)) {
                           cxg $$18 = (cxg)$$17.b();
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

   public static void a(ame $$0, blg $$1, @Nullable edf $$2, @Nullable edf $$3, Set<ia> $$4, Optional<List<blg>> $$5) {
      Iterator<ia> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         ia $$7 = $$6.next();
         ht $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dhi $$9 = $$0.a_($$8);
               if (!$$9.a(arg.h, $$0x -> $$0x.b() instanceof cxg)) {
                  $$6.remove();
               } else {
                  cxg $$10 = (cxg)$$9.b();
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

   private static boolean a(blg $$0, ht $$1, Optional<List<blg>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ai() == $$0.ai()).filter($$1x -> $$1.a($$1x.dl(), 2.0)).anyMatch($$1x -> a($$1x.dP(), $$1));
   }

   private static boolean a(bmg<?> $$0, ht $$1) {
      if (!$$0.a(buh.t)) {
         return false;
      } else {
         edh $$2 = $$0.c(buh.t).get();
         if ($$2.c()) {
            return false;
         } else {
            edf $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               edf $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(ame $$0, blg $$1, ia $$2) {
      return $$2.a() != $$0.ad() || !$$2.b().a($$1.dl(), 3.0);
   }

   private static Optional<Set<ia>> a(bqk<Mu, Set<ia>> $$0, Optional<Set<ia>> $$1, ame $$2, ht $$3) {
      ia $$4 = ia.a($$2.ad(), $$3);
      return Optional.of($$1.<Set<ia>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<ia> $$2x = Sets.newHashSet(new ia[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
