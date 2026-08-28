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

public class bxd {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bwg<bun> a() {
      MutableObject<erf> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$2 -> $$2.group($$2.b(cdq.t), $$2.a(cdq.v), $$2.a(cdq.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     erh $$9 = $$2.b($$3);
                     Optional<Set<jn>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        erf $$11 = $$9.i();
                        erf $$12 = $$9.h();
                        jf $$13 = $$11.a();
                        dus $$14 = $$6.a_($$13);
                        if ($$14.a(awv.i, $$0xxxx -> $$0xxxx.b() instanceof djs)) {
                           djs $$15 = (djs)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        jf $$16 = $$12.a();
                        dus $$17 = $$6.a_($$16);
                        if ($$17.a(awv.i, $$0xxxx -> $$0xxxx.b() instanceof djs)) {
                           djs $$18 = (djs)$$17.b();
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

   public static void a(arj $$0, bun $$1, @Nullable erf $$2, @Nullable erf $$3, Set<jn> $$4, Optional<List<bun>> $$5) {
      Iterator<jn> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jn $$7 = $$6.next();
         jf $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dus $$9 = $$0.a_($$8);
               if (!$$9.a(awv.i, $$0x -> $$0x.b() instanceof djs)) {
                  $$6.remove();
               } else {
                  djs $$10 = (djs)$$9.b();
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

   private static boolean a(bun $$0, jf $$1, Optional<List<bun>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ao() == $$0.ao()).filter($$1x -> $$1.a($$1x.dq(), 2.0)).anyMatch($$1x -> a($$1x.dY(), $$1));
   }

   private static boolean a(bvo<?> $$0, jf $$1) {
      if (!$$0.a(cdq.t)) {
         return false;
      } else {
         erh $$2 = $$0.c(cdq.t).get();
         if ($$2.c()) {
            return false;
         } else {
            erf $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               erf $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(arj $$0, bun $$1, jn $$2) {
      return $$2.a() != $$0.ag() || !$$2.b().a($$1.dq(), 3.0);
   }

   private static Optional<Set<jn>> a(bzt<Mu, Set<jn>> $$0, Optional<Set<jn>> $$1, arj $$2, jf $$3) {
      jn $$4 = jn.a($$2.ag(), $$3);
      return Optional.of($$1.<Set<jn>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jn> $$2x = Sets.newHashSet(new jn[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
