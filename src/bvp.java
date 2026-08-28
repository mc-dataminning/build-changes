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

public class bvp {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bus<bsy> a() {
      MutableObject<eon> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$2 -> $$2.group($$2.b(ccc.t), $$2.a(ccc.v), $$2.a(ccc.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     eop $$9 = $$2.b($$3);
                     Optional<Set<ji>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        eon $$11 = $$9.i();
                        eon $$12 = $$9.h();
                        ja $$13 = $$11.a();
                        dsh $$14 = $$6.a_($$13);
                        if ($$14.a(avu.h, $$0xxxx -> $$0xxxx.b() instanceof dhl)) {
                           dhl $$15 = (dhl)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        ja $$16 = $$12.a();
                        dsh $$17 = $$6.a_($$16);
                        if ($$17.a(avu.h, $$0xxxx -> $$0xxxx.b() instanceof dhl)) {
                           dhl $$18 = (dhl)$$17.b();
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

   public static void a(aqk $$0, bsy $$1, @Nullable eon $$2, @Nullable eon $$3, Set<ji> $$4, Optional<List<bsy>> $$5) {
      Iterator<ji> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         ji $$7 = $$6.next();
         ja $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dsh $$9 = $$0.a_($$8);
               if (!$$9.a(avu.h, $$0x -> $$0x.b() instanceof dhl)) {
                  $$6.remove();
               } else {
                  dhl $$10 = (dhl)$$9.b();
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

   private static boolean a(bsy $$0, ja $$1, Optional<List<bsy>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ak() == $$0.ak()).filter($$1x -> $$1.a($$1x.dn(), 2.0)).anyMatch($$1x -> a($$1x.dT(), $$1));
   }

   private static boolean a(bua<?> $$0, ja $$1) {
      if (!$$0.a(ccc.t)) {
         return false;
      } else {
         eop $$2 = $$0.c(ccc.t).get();
         if ($$2.c()) {
            return false;
         } else {
            eon $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               eon $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aqk $$0, bsy $$1, ji $$2) {
      return $$2.a() != $$0.af() || !$$2.b().a($$1.dn(), 3.0);
   }

   private static Optional<Set<ji>> a(byf<Mu, Set<ji>> $$0, Optional<Set<ji>> $$1, aqk $$2, ja $$3) {
      ji $$4 = ji.a($$2.af(), $$3);
      return Optional.of($$1.<Set<ji>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<ji> $$2x = Sets.newHashSet(new ji[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
