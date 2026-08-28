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

public class bzg {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static byj<bwr> a() {
      MutableObject<evf> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$2 -> $$2.group($$2.b(cft.u), $$2.a(cft.w), $$2.a(cft.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     evh $$9 = $$2.b($$3);
                     Optional<Set<jr>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        evf $$11 = $$9.i();
                        evf $$12 = $$9.h();
                        jj $$13 = $$11.a();
                        dym $$14 = $$6.a_($$13);
                        if ($$14.a(awz.i, $$0xxxx -> $$0xxxx.b() instanceof dnb)) {
                           dnb $$15 = (dnb)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        jj $$16 = $$12.a();
                        dym $$17 = $$6.a_($$16);
                        if ($$17.a(awz.i, $$0xxxx -> $$0xxxx.b() instanceof dnb)) {
                           dnb $$18 = (dnb)$$17.b();
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

   public static void a(arn $$0, bwr $$1, @Nullable evf $$2, @Nullable evf $$3, Set<jr> $$4, Optional<List<bwr>> $$5) {
      Iterator<jr> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jr $$7 = $$6.next();
         jj $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dym $$9 = $$0.a_($$8);
               if (!$$9.a(awz.i, $$0x -> $$0x.b() instanceof dnb)) {
                  $$6.remove();
               } else {
                  dnb $$10 = (dnb)$$9.b();
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

   private static boolean a(bwr $$0, jj $$1, Optional<List<bwr>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.aq() == $$0.aq()).filter($$1x -> $$1.a($$1x.dt(), 2.0)).anyMatch($$1x -> a($$1x.eb(), $$1));
   }

   private static boolean a(bxr<?> $$0, jj $$1) {
      if (!$$0.a(cft.u)) {
         return false;
      } else {
         evh $$2 = $$0.c(cft.u).get();
         if ($$2.c()) {
            return false;
         } else {
            evf $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               evf $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(arn $$0, bwr $$1, jr $$2) {
      return $$2.a() != $$0.aj() || !$$2.b().a($$1.dt(), 3.0);
   }

   private static Optional<Set<jr>> a(cbw<Mu, Set<jr>> $$0, Optional<Set<jr>> $$1, arn $$2, jj $$3) {
      jr $$4 = jr.a($$2.aj(), $$3);
      return Optional.of($$1.<Set<jr>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jr> $$2x = Sets.newHashSet(new jr[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
