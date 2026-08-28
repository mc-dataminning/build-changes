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

public class bxr {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bwu<bva> a() {
      MutableObject<erw> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$2 -> $$2.group($$2.b(cee.t), $$2.a(cee.v), $$2.a(cee.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ery $$9 = $$2.b($$3);
                     Optional<Set<jp>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        erw $$11 = $$9.i();
                        erw $$12 = $$9.h();
                        jh $$13 = $$11.a();
                        dvj $$14 = $$6.a_($$13);
                        if ($$14.a(axa.i, $$0xxxx -> $$0xxxx.b() instanceof dkk)) {
                           dkk $$15 = (dkk)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        jh $$16 = $$12.a();
                        dvj $$17 = $$6.a_($$16);
                        if ($$17.a(axa.i, $$0xxxx -> $$0xxxx.b() instanceof dkk)) {
                           dkk $$18 = (dkk)$$17.b();
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

   public static void a(arn $$0, bva $$1, @Nullable erw $$2, @Nullable erw $$3, Set<jp> $$4, Optional<List<bva>> $$5) {
      Iterator<jp> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jp $$7 = $$6.next();
         jh $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dvj $$9 = $$0.a_($$8);
               if (!$$9.a(axa.i, $$0x -> $$0x.b() instanceof dkk)) {
                  $$6.remove();
               } else {
                  dkk $$10 = (dkk)$$9.b();
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

   private static boolean a(bva $$0, jh $$1, Optional<List<bva>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ar() == $$0.ar()).filter($$1x -> $$1.a($$1x.dv(), 2.0)).anyMatch($$1x -> a($$1x.ed(), $$1));
   }

   private static boolean a(bwc<?> $$0, jh $$1) {
      if (!$$0.a(cee.t)) {
         return false;
      } else {
         ery $$2 = $$0.c(cee.t).get();
         if ($$2.c()) {
            return false;
         } else {
            erw $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               erw $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(arn $$0, bva $$1, jp $$2) {
      return $$2.a() != $$0.ag() || !$$2.b().a($$1.dv(), 3.0);
   }

   private static Optional<Set<jp>> a(cah<Mu, Set<jp>> $$0, Optional<Set<jp>> $$1, arn $$2, jh $$3) {
      jp $$4 = jp.a($$2.ag(), $$3);
      return Optional.of($$1.<Set<jp>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jp> $$2x = Sets.newHashSet(new jp[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
