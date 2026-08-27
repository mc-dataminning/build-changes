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

public class blv {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bky<bjg> a() {
      MutableObject<eaz> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$2 -> $$2.group($$2.b(bsh.t), $$2.a(bsh.v), $$2.a(bsh.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ebb $$9 = $$2.b($$3);
                     Optional<Set<hf>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        eaz $$11 = $$9.i();
                        eaz $$12 = $$9.h();
                        gw $$13 = $$11.a();
                        dfj $$14 = $$6.a_($$13);
                        if ($$14.a(apt.h, $$0xxxx -> $$0xxxx.b() instanceof cux)) {
                           cux $$15 = (cux)$$14.b();
                           if (!$$15.h($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        gw $$16 = $$12.a();
                        dfj $$17 = $$6.a_($$16);
                        if ($$17.a(apt.h, $$0xxxx -> $$0xxxx.b() instanceof cux)) {
                           cux $$18 = (cux)$$17.b();
                           if (!$$18.h($$17)) {
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

   public static void a(akr $$0, bjg $$1, @Nullable eaz $$2, @Nullable eaz $$3, Set<hf> $$4, Optional<List<bjg>> $$5) {
      Iterator<hf> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         hf $$7 = $$6.next();
         gw $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dfj $$9 = $$0.a_($$8);
               if (!$$9.a(apt.h, $$0x -> $$0x.b() instanceof cux)) {
                  $$6.remove();
               } else {
                  cux $$10 = (cux)$$9.b();
                  if (!$$10.h($$9)) {
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

   private static boolean a(bjg $$0, gw $$1, Optional<List<bjg>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ah() == $$0.ah()).filter($$1x -> $$1.a($$1x.dj(), 2.0)).anyMatch($$1x -> a($$1x.dN(), $$1));
   }

   private static boolean a(bkg<?> $$0, gw $$1) {
      if (!$$0.a(bsh.t)) {
         return false;
      } else {
         ebb $$2 = $$0.c(bsh.t).get();
         if ($$2.c()) {
            return false;
         } else {
            eaz $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               eaz $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(akr $$0, bjg $$1, hf $$2) {
      return $$2.a() != $$0.ac() || !$$2.b().a($$1.dj(), 3.0);
   }

   private static Optional<Set<hf>> a(bok<Mu, Set<hf>> $$0, Optional<Set<hf>> $$1, akr $$2, gw $$3) {
      hf $$4 = hf.a($$2.ac(), $$3);
      return Optional.of($$1.<Set<hf>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<hf> $$2x = Sets.newHashSet(new hf[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
