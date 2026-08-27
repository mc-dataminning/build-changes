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

public class bou {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bnx<bmf> a() {
      MutableObject<eex> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$2 -> $$2.group($$2.b(bvh.t), $$2.a(bvh.v), $$2.a(bvh.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     eez $$9 = $$2.b($$3);
                     Optional<Set<ig>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        eex $$11 = $$9.i();
                        eex $$12 = $$9.h();
                        hx $$13 = $$11.a();
                        dja $$14 = $$6.a_($$13);
                        if ($$14.a(asb.h, $$0xxxx -> $$0xxxx.b() instanceof cyp)) {
                           cyp $$15 = (cyp)$$14.b();
                           if (!$$15.h($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        hx $$16 = $$12.a();
                        dja $$17 = $$6.a_($$16);
                        if ($$17.a(asb.h, $$0xxxx -> $$0xxxx.b() instanceof cyp)) {
                           cyp $$18 = (cyp)$$17.b();
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

   public static void a(amz $$0, bmf $$1, @Nullable eex $$2, @Nullable eex $$3, Set<ig> $$4, Optional<List<bmf>> $$5) {
      Iterator<ig> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         ig $$7 = $$6.next();
         hx $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dja $$9 = $$0.a_($$8);
               if (!$$9.a(asb.h, $$0x -> $$0x.b() instanceof cyp)) {
                  $$6.remove();
               } else {
                  cyp $$10 = (cyp)$$9.b();
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

   private static boolean a(bmf $$0, hx $$1, Optional<List<bmf>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ai() == $$0.ai()).filter($$1x -> $$1.a($$1x.dk(), 2.0)).anyMatch($$1x -> a($$1x.dO(), $$1));
   }

   private static boolean a(bnf<?> $$0, hx $$1) {
      if (!$$0.a(bvh.t)) {
         return false;
      } else {
         eez $$2 = $$0.c(bvh.t).get();
         if ($$2.c()) {
            return false;
         } else {
            eex $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               eex $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(amz $$0, bmf $$1, ig $$2) {
      return $$2.a() != $$0.ae() || !$$2.b().a($$1.dk(), 3.0);
   }

   private static Optional<Set<ig>> a(brk<Mu, Set<ig>> $$0, Optional<Set<ig>> $$1, amz $$2, hx $$3) {
      ig $$4 = ig.a($$2.ae(), $$3);
      return Optional.of($$1.<Set<ig>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<ig> $$2x = Sets.newHashSet(new ig[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
