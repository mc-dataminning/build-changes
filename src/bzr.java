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

public class bzr {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static byu<bxc> a() {
      MutableObject<ews> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$2 -> $$2.group($$2.b(cge.u), $$2.a(cge.w), $$2.a(cge.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ewu $$9 = $$2.b($$3);
                     Optional<Set<jd>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        ews $$11 = $$9.i();
                        ews $$12 = $$9.h();
                        iu $$13 = $$11.a();
                        dzz $$14 = $$6.a_($$13);
                        if ($$14.a(axc.i, $$0xxxx -> $$0xxxx.b() instanceof doh)) {
                           doh $$15 = (doh)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        iu $$16 = $$12.a();
                        dzz $$17 = $$6.a_($$16);
                        if ($$17.a(axc.i, $$0xxxx -> $$0xxxx.b() instanceof doh)) {
                           doh $$18 = (doh)$$17.b();
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

   public static void a(arq $$0, bxc $$1, @Nullable ews $$2, @Nullable ews $$3, Set<jd> $$4, Optional<List<bxc>> $$5) {
      Iterator<jd> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jd $$7 = $$6.next();
         iu $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dzz $$9 = $$0.a_($$8);
               if (!$$9.a(axc.i, $$0x -> $$0x.b() instanceof doh)) {
                  $$6.remove();
               } else {
                  doh $$10 = (doh)$$9.b();
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

   private static boolean a(bxc $$0, iu $$1, Optional<List<bxc>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.aq() == $$0.aq()).filter($$1x -> $$1.a($$1x.dt(), 2.0)).anyMatch($$1x -> a($$1x.eb(), $$1));
   }

   private static boolean a(byc<?> $$0, iu $$1) {
      if (!$$0.a(cge.u)) {
         return false;
      } else {
         ewu $$2 = $$0.c(cge.u).get();
         if ($$2.c()) {
            return false;
         } else {
            ews $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               ews $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(arq $$0, bxc $$1, jd $$2) {
      return $$2.a() != $$0.aj() || !$$2.b().a($$1.dt(), 3.0);
   }

   private static Optional<Set<jd>> a(cch<Mu, Set<jd>> $$0, Optional<Set<jd>> $$1, arq $$2, iu $$3) {
      jd $$4 = jd.a($$2.aj(), $$3);
      return Optional.of($$1.<Set<jd>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jd> $$2x = Sets.newHashSet(new jd[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
