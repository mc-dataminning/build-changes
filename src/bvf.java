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

public class bvf {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bui<bso> a() {
      MutableObject<eng> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$2 -> $$2.group($$2.b(cbs.t), $$2.a(cbs.v), $$2.a(cbs.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     eni $$9 = $$2.b($$3);
                     Optional<Set<iw>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        eng $$11 = $$9.i();
                        eng $$12 = $$9.h();
                        io $$13 = $$11.a();
                        drb $$14 = $$6.a_($$13);
                        if ($$14.a(avw.h, $$0xxxx -> $$0xxxx.b() instanceof dge)) {
                           dge $$15 = (dge)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        io $$16 = $$12.a();
                        drb $$17 = $$6.a_($$16);
                        if ($$17.a(avw.h, $$0xxxx -> $$0xxxx.b() instanceof dge)) {
                           dge $$18 = (dge)$$17.b();
                           if (!$$18.m($$17)) {
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

   public static void a(aqm $$0, bso $$1, @Nullable eng $$2, @Nullable eng $$3, Set<iw> $$4, Optional<List<bso>> $$5) {
      Iterator<iw> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         iw $$7 = $$6.next();
         io $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               drb $$9 = $$0.a_($$8);
               if (!$$9.a(avw.h, $$0x -> $$0x.b() instanceof dge)) {
                  $$6.remove();
               } else {
                  dge $$10 = (dge)$$9.b();
                  if (!$$10.m($$9)) {
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

   private static boolean a(bso $$0, io $$1, Optional<List<bso>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ak() == $$0.ak()).filter($$1x -> $$1.a($$1x.dn(), 2.0)).anyMatch($$1x -> a($$1x.dS(), $$1));
   }

   private static boolean a(btq<?> $$0, io $$1) {
      if (!$$0.a(cbs.t)) {
         return false;
      } else {
         eni $$2 = $$0.c(cbs.t).get();
         if ($$2.c()) {
            return false;
         } else {
            eng $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               eng $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aqm $$0, bso $$1, iw $$2) {
      return $$2.a() != $$0.ae() || !$$2.b().a($$1.dn(), 3.0);
   }

   private static Optional<Set<iw>> a(bxv<Mu, Set<iw>> $$0, Optional<Set<iw>> $$1, aqm $$2, io $$3) {
      iw $$4 = iw.a($$2.ae(), $$3);
      return Optional.of($$1.<Set<iw>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<iw> $$2x = Sets.newHashSet(new iw[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
