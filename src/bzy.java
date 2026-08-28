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

public class bzy {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bzb<bxj> a() {
      MutableObject<exm> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$2 -> $$2.group($$2.b(cgl.u), $$2.a(cgl.w), $$2.a(cgl.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     exo $$9 = $$2.b($$3);
                     Optional<Set<je>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        exm $$11 = $$9.i();
                        exm $$12 = $$9.h();
                        iv $$13 = $$11.a();
                        eat $$14 = $$6.a_($$13);
                        if ($$14.a(axc.i, $$0xxxx -> $$0xxxx.b() instanceof doy)) {
                           doy $$15 = (doy)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        iv $$16 = $$12.a();
                        eat $$17 = $$6.a_($$16);
                        if ($$17.a(axc.i, $$0xxxx -> $$0xxxx.b() instanceof doy)) {
                           doy $$18 = (doy)$$17.b();
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

   public static void a(arq $$0, bxj $$1, @Nullable exm $$2, @Nullable exm $$3, Set<je> $$4, Optional<List<bxj>> $$5) {
      Iterator<je> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         je $$7 = $$6.next();
         iv $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               eat $$9 = $$0.a_($$8);
               if (!$$9.a(axc.i, $$0x -> $$0x.b() instanceof doy)) {
                  $$6.remove();
               } else {
                  doy $$10 = (doy)$$9.b();
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

   private static boolean a(bxj $$0, iv $$1, Optional<List<bxj>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.an() == $$0.an()).filter($$1x -> $$1.a($$1x.ds(), 2.0)).anyMatch($$1x -> a($$1x.eb(), $$1));
   }

   private static boolean a(byj<?> $$0, iv $$1) {
      if (!$$0.a(cgl.u)) {
         return false;
      } else {
         exo $$2 = $$0.c(cgl.u).get();
         if ($$2.c()) {
            return false;
         } else {
            exm $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               exm $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(arq $$0, bxj $$1, je $$2) {
      return $$2.a() != $$0.aj() || !$$2.b().a($$1.ds(), 3.0);
   }

   private static Optional<Set<je>> a(cco<Mu, Set<je>> $$0, Optional<Set<je>> $$1, arq $$2, iv $$3) {
      je $$4 = je.a($$2.aj(), $$3);
      return Optional.of($$1.<Set<je>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<je> $$2x = Sets.newHashSet(new je[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
