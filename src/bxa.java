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

public class bxa {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bwd<buk> a() {
      MutableObject<erb> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$2 -> $$2.group($$2.b(cdn.t), $$2.a(cdn.v), $$2.a(cdn.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     erd $$9 = $$2.b($$3);
                     Optional<Set<jm>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        erb $$11 = $$9.i();
                        erb $$12 = $$9.h();
                        je $$13 = $$11.a();
                        duo $$14 = $$6.a_($$13);
                        if ($$14.a(awt.i, $$0xxxx -> $$0xxxx.b() instanceof djp)) {
                           djp $$15 = (djp)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        je $$16 = $$12.a();
                        duo $$17 = $$6.a_($$16);
                        if ($$17.a(awt.i, $$0xxxx -> $$0xxxx.b() instanceof djp)) {
                           djp $$18 = (djp)$$17.b();
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

   public static void a(arh $$0, buk $$1, @Nullable erb $$2, @Nullable erb $$3, Set<jm> $$4, Optional<List<buk>> $$5) {
      Iterator<jm> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jm $$7 = $$6.next();
         je $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               duo $$9 = $$0.a_($$8);
               if (!$$9.a(awt.i, $$0x -> $$0x.b() instanceof djp)) {
                  $$6.remove();
               } else {
                  djp $$10 = (djp)$$9.b();
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

   private static boolean a(buk $$0, je $$1, Optional<List<buk>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ao() == $$0.ao()).filter($$1x -> $$1.a($$1x.dq(), 2.0)).anyMatch($$1x -> a($$1x.dX(), $$1));
   }

   private static boolean a(bvl<?> $$0, je $$1) {
      if (!$$0.a(cdn.t)) {
         return false;
      } else {
         erd $$2 = $$0.c(cdn.t).get();
         if ($$2.c()) {
            return false;
         } else {
            erb $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               erb $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(arh $$0, buk $$1, jm $$2) {
      return $$2.a() != $$0.ag() || !$$2.b().a($$1.dq(), 3.0);
   }

   private static Optional<Set<jm>> a(bzq<Mu, Set<jm>> $$0, Optional<Set<jm>> $$1, arh $$2, je $$3) {
      jm $$4 = jm.a($$2.ag(), $$3);
      return Optional.of($$1.<Set<jm>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jm> $$2x = Sets.newHashSet(new jm[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
