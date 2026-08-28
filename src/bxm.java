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

public class bxm {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bwp<buv> a() {
      MutableObject<erq> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$2 -> $$2.group($$2.b(cdz.t), $$2.a(cdz.v), $$2.a(cdz.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ers $$9 = $$2.b($$3);
                     Optional<Set<jo>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        erq $$11 = $$9.i();
                        erq $$12 = $$9.h();
                        jg $$13 = $$11.a();
                        dvd $$14 = $$6.a_($$13);
                        if ($$14.a(awz.i, $$0xxxx -> $$0xxxx.b() instanceof dke)) {
                           dke $$15 = (dke)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        jg $$16 = $$12.a();
                        dvd $$17 = $$6.a_($$16);
                        if ($$17.a(awz.i, $$0xxxx -> $$0xxxx.b() instanceof dke)) {
                           dke $$18 = (dke)$$17.b();
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

   public static void a(arm $$0, buv $$1, @Nullable erq $$2, @Nullable erq $$3, Set<jo> $$4, Optional<List<buv>> $$5) {
      Iterator<jo> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jo $$7 = $$6.next();
         jg $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dvd $$9 = $$0.a_($$8);
               if (!$$9.a(awz.i, $$0x -> $$0x.b() instanceof dke)) {
                  $$6.remove();
               } else {
                  dke $$10 = (dke)$$9.b();
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

   private static boolean a(buv $$0, jg $$1, Optional<List<buv>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.aq() == $$0.aq()).filter($$1x -> $$1.a($$1x.dv(), 2.0)).anyMatch($$1x -> a($$1x.ed(), $$1));
   }

   private static boolean a(bvx<?> $$0, jg $$1) {
      if (!$$0.a(cdz.t)) {
         return false;
      } else {
         ers $$2 = $$0.c(cdz.t).get();
         if ($$2.c()) {
            return false;
         } else {
            erq $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               erq $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(arm $$0, buv $$1, jo $$2) {
      return $$2.a() != $$0.ag() || !$$2.b().a($$1.dv(), 3.0);
   }

   private static Optional<Set<jo>> a(cac<Mu, Set<jo>> $$0, Optional<Set<jo>> $$1, arm $$2, jg $$3) {
      jo $$4 = jo.a($$2.ag(), $$3);
      return Optional.of($$1.<Set<jo>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jo> $$2x = Sets.newHashSet(new jo[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
