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

public class bxx {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bxa<bvg> a() {
      MutableObject<etk> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$2 -> $$2.group($$2.b(cek.t), $$2.a(cek.v), $$2.a(cek.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     etm $$9 = $$2.b($$3);
                     Optional<Set<jq>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        etk $$11 = $$9.i();
                        etk $$12 = $$9.h();
                        ji $$13 = $$11.a();
                        dww $$14 = $$6.a_($$13);
                        if ($$14.a(awp.i, $$0xxxx -> $$0xxxx.b() instanceof dls)) {
                           dls $$15 = (dls)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        ji $$16 = $$12.a();
                        dww $$17 = $$6.a_($$16);
                        if ($$17.a(awp.i, $$0xxxx -> $$0xxxx.b() instanceof dls)) {
                           dls $$18 = (dls)$$17.b();
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

   public static void a(ard $$0, bvg $$1, @Nullable etk $$2, @Nullable etk $$3, Set<jq> $$4, Optional<List<bvg>> $$5) {
      Iterator<jq> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jq $$7 = $$6.next();
         ji $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dww $$9 = $$0.a_($$8);
               if (!$$9.a(awp.i, $$0x -> $$0x.b() instanceof dls)) {
                  $$6.remove();
               } else {
                  dls $$10 = (dls)$$9.b();
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

   private static boolean a(bvg $$0, ji $$1, Optional<List<bvg>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.aq() == $$0.aq()).filter($$1x -> $$1.a($$1x.dt(), 2.0)).anyMatch($$1x -> a($$1x.eb(), $$1));
   }

   private static boolean a(bwi<?> $$0, ji $$1) {
      if (!$$0.a(cek.t)) {
         return false;
      } else {
         etm $$2 = $$0.c(cek.t).get();
         if ($$2.c()) {
            return false;
         } else {
            etk $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               etk $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(ard $$0, bvg $$1, jq $$2) {
      return $$2.a() != $$0.ai() || !$$2.b().a($$1.dt(), 3.0);
   }

   private static Optional<Set<jq>> a(can<Mu, Set<jq>> $$0, Optional<Set<jq>> $$1, ard $$2, ji $$3) {
      jq $$4 = jq.a($$2.ai(), $$3);
      return Optional.of($$1.<Set<jq>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jq> $$2x = Sets.newHashSet(new jq[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
