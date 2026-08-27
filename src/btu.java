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

public class btu {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bsx<bre> a() {
      MutableObject<emd> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$2 -> $$2.group($$2.b(cah.t), $$2.a(cah.v), $$2.a(cah.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     emf $$9 = $$2.b($$3);
                     Optional<Set<iu>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        emd $$11 = $$9.i();
                        emd $$12 = $$9.h();
                        im $$13 = $$11.a();
                        dpy $$14 = $$6.a_($$13);
                        if ($$14.a(avo.h, $$0xxxx -> $$0xxxx.b() instanceof dfb)) {
                           dfb $$15 = (dfb)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        im $$16 = $$12.a();
                        dpy $$17 = $$6.a_($$16);
                        if ($$17.a(avo.h, $$0xxxx -> $$0xxxx.b() instanceof dfb)) {
                           dfb $$18 = (dfb)$$17.b();
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

   public static void a(aqe $$0, bre $$1, @Nullable emd $$2, @Nullable emd $$3, Set<iu> $$4, Optional<List<bre>> $$5) {
      Iterator<iu> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         iu $$7 = $$6.next();
         im $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dpy $$9 = $$0.a_($$8);
               if (!$$9.a(avo.h, $$0x -> $$0x.b() instanceof dfb)) {
                  $$6.remove();
               } else {
                  dfb $$10 = (dfb)$$9.b();
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

   private static boolean a(bre $$0, im $$1, Optional<List<bre>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ai() == $$0.ai()).filter($$1x -> $$1.a($$1x.dl(), 2.0)).anyMatch($$1x -> a($$1x.dQ(), $$1));
   }

   private static boolean a(bsf<?> $$0, im $$1) {
      if (!$$0.a(cah.t)) {
         return false;
      } else {
         emf $$2 = $$0.c(cah.t).get();
         if ($$2.c()) {
            return false;
         } else {
            emd $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               emd $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aqe $$0, bre $$1, iu $$2) {
      return $$2.a() != $$0.ae() || !$$2.b().a($$1.dl(), 3.0);
   }

   private static Optional<Set<iu>> a(bwk<Mu, Set<iu>> $$0, Optional<Set<iu>> $$1, aqe $$2, im $$3) {
      iu $$4 = iu.a($$2.ae(), $$3);
      return Optional.of($$1.<Set<iu>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<iu> $$2x = Sets.newHashSet(new iu[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
