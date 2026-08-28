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

public class bwv {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bvy<buf> a() {
      MutableObject<eqn> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$2 -> $$2.group($$2.b(cdi.t), $$2.a(cdi.v), $$2.a(cdi.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     eqp $$9 = $$2.b($$3);
                     Optional<Set<jm>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        eqn $$11 = $$9.i();
                        eqn $$12 = $$9.h();
                        je $$13 = $$11.a();
                        dua $$14 = $$6.a_($$13);
                        if ($$14.a(aws.i, $$0xxxx -> $$0xxxx.b() instanceof djb)) {
                           djb $$15 = (djb)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        je $$16 = $$12.a();
                        dua $$17 = $$6.a_($$16);
                        if ($$17.a(aws.i, $$0xxxx -> $$0xxxx.b() instanceof djb)) {
                           djb $$18 = (djb)$$17.b();
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

   public static void a(arg $$0, buf $$1, @Nullable eqn $$2, @Nullable eqn $$3, Set<jm> $$4, Optional<List<buf>> $$5) {
      Iterator<jm> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jm $$7 = $$6.next();
         je $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dua $$9 = $$0.a_($$8);
               if (!$$9.a(aws.i, $$0x -> $$0x.b() instanceof djb)) {
                  $$6.remove();
               } else {
                  djb $$10 = (djb)$$9.b();
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

   private static boolean a(buf $$0, je $$1, Optional<List<buf>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ao() == $$0.ao()).filter($$1x -> $$1.a($$1x.dq(), 2.0)).anyMatch($$1x -> a($$1x.dX(), $$1));
   }

   private static boolean a(bvg<?> $$0, je $$1) {
      if (!$$0.a(cdi.t)) {
         return false;
      } else {
         eqp $$2 = $$0.c(cdi.t).get();
         if ($$2.c()) {
            return false;
         } else {
            eqn $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               eqn $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(arg $$0, buf $$1, jm $$2) {
      return $$2.a() != $$0.ag() || !$$2.b().a($$1.dq(), 3.0);
   }

   private static Optional<Set<jm>> a(bzl<Mu, Set<jm>> $$0, Optional<Set<jm>> $$1, arg $$2, je $$3) {
      jm $$4 = jm.a($$2.ag(), $$3);
      return Optional.of($$1.<Set<jm>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jm> $$2x = Sets.newHashSet(new jm[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
