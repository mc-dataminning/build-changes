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

public class bok {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bnn<blv> a() {
      MutableObject<eem> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$2 -> $$2.group($$2.b(bux.t), $$2.a(bux.v), $$2.a(bux.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     eeo $$9 = $$2.b($$3);
                     Optional<Set<id>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        eem $$11 = $$9.i();
                        eem $$12 = $$9.h();
                        hv $$13 = $$11.a();
                        dip $$14 = $$6.a_($$13);
                        if ($$14.a(arr.h, $$0xxxx -> $$0xxxx.b() instanceof cyf)) {
                           cyf $$15 = (cyf)$$14.b();
                           if (!$$15.h($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        hv $$16 = $$12.a();
                        dip $$17 = $$6.a_($$16);
                        if ($$17.a(arr.h, $$0xxxx -> $$0xxxx.b() instanceof cyf)) {
                           cyf $$18 = (cyf)$$17.b();
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

   public static void a(amp $$0, blv $$1, @Nullable eem $$2, @Nullable eem $$3, Set<id> $$4, Optional<List<blv>> $$5) {
      Iterator<id> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         id $$7 = $$6.next();
         hv $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dip $$9 = $$0.a_($$8);
               if (!$$9.a(arr.h, $$0x -> $$0x.b() instanceof cyf)) {
                  $$6.remove();
               } else {
                  cyf $$10 = (cyf)$$9.b();
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

   private static boolean a(blv $$0, hv $$1, Optional<List<blv>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ai() == $$0.ai()).filter($$1x -> $$1.a($$1x.dk(), 2.0)).anyMatch($$1x -> a($$1x.dO(), $$1));
   }

   private static boolean a(bmv<?> $$0, hv $$1) {
      if (!$$0.a(bux.t)) {
         return false;
      } else {
         eeo $$2 = $$0.c(bux.t).get();
         if ($$2.c()) {
            return false;
         } else {
            eem $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               eem $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(amp $$0, blv $$1, id $$2) {
      return $$2.a() != $$0.ad() || !$$2.b().a($$1.dk(), 3.0);
   }

   private static Optional<Set<id>> a(bra<Mu, Set<id>> $$0, Optional<Set<id>> $$1, amp $$2, hv $$3) {
      id $$4 = id.a($$2.ad(), $$3);
      return Optional.of($$1.<Set<id>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<id> $$2x = Sets.newHashSet(new id[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
