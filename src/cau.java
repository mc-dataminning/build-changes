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

public class cau {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bzx<byf> a() {
      MutableObject<eym> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$2 -> $$2.group($$2.b(chh.u), $$2.a(chh.w), $$2.a(chh.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     eyo $$9 = $$2.b($$3);
                     Optional<Set<jf>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        eym $$11 = $$9.i();
                        eym $$12 = $$9.h();
                        iw $$13 = $$11.a();
                        ebq $$14 = $$6.a_($$13);
                        if ($$14.a(axn.i, $$0xxxx -> $$0xxxx.b() instanceof dpv)) {
                           dpv $$15 = (dpv)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        iw $$16 = $$12.a();
                        ebq $$17 = $$6.a_($$16);
                        if ($$17.a(axn.i, $$0xxxx -> $$0xxxx.b() instanceof dpv)) {
                           dpv $$18 = (dpv)$$17.b();
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

   public static void a(asb $$0, byf $$1, @Nullable eym $$2, @Nullable eym $$3, Set<jf> $$4, Optional<List<byf>> $$5) {
      Iterator<jf> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jf $$7 = $$6.next();
         iw $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               ebq $$9 = $$0.a_($$8);
               if (!$$9.a(axn.i, $$0x -> $$0x.b() instanceof dpv)) {
                  $$6.remove();
               } else {
                  dpv $$10 = (dpv)$$9.b();
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

   private static boolean a(byf $$0, iw $$1, Optional<List<byf>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.an() == $$0.an()).filter($$1x -> $$1.a($$1x.dt(), 2.0)).anyMatch($$1x -> a($$1x.ec(), $$1));
   }

   private static boolean a(bzf<?> $$0, iw $$1) {
      if (!$$0.a(chh.u)) {
         return false;
      } else {
         eyo $$2 = $$0.c(chh.u).get();
         if ($$2.c()) {
            return false;
         } else {
            eym $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               eym $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(asb $$0, byf $$1, jf $$2) {
      return $$2.a() != $$0.aj() || !$$2.b().a($$1.dt(), 3.0);
   }

   private static Optional<Set<jf>> a(cdk<Mu, Set<jf>> $$0, Optional<Set<jf>> $$1, asb $$2, iw $$3) {
      jf $$4 = jf.a($$2.aj(), $$3);
      return Optional.of($$1.<Set<jf>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jf> $$2x = Sets.newHashSet(new jf[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
