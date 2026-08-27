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

public class bnn {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bmq<bky> a() {
      MutableObject<ect> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$2 -> $$2.group($$2.b(btz.t), $$2.a(btz.v), $$2.a(btz.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ecv $$9 = $$2.b($$3);
                     Optional<Set<ia>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        ect $$11 = $$9.i();
                        ect $$12 = $$9.h();
                        ht $$13 = $$11.a();
                        dgw $$14 = $$6.a_($$13);
                        if ($$14.a(arc.h, $$0xxxx -> $$0xxxx.b() instanceof cwy)) {
                           cwy $$15 = (cwy)$$14.b();
                           if (!$$15.h($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        ht $$16 = $$12.a();
                        dgw $$17 = $$6.a_($$16);
                        if ($$17.a(arc.h, $$0xxxx -> $$0xxxx.b() instanceof cwy)) {
                           cwy $$18 = (cwy)$$17.b();
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

   public static void a(ama $$0, bky $$1, @Nullable ect $$2, @Nullable ect $$3, Set<ia> $$4, Optional<List<bky>> $$5) {
      Iterator<ia> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         ia $$7 = $$6.next();
         ht $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dgw $$9 = $$0.a_($$8);
               if (!$$9.a(arc.h, $$0x -> $$0x.b() instanceof cwy)) {
                  $$6.remove();
               } else {
                  cwy $$10 = (cwy)$$9.b();
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

   private static boolean a(bky $$0, ht $$1, Optional<List<bky>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ag() == $$0.ag()).filter($$1x -> $$1.a($$1x.dj(), 2.0)).anyMatch($$1x -> a($$1x.dN(), $$1));
   }

   private static boolean a(bly<?> $$0, ht $$1) {
      if (!$$0.a(btz.t)) {
         return false;
      } else {
         ecv $$2 = $$0.c(btz.t).get();
         if ($$2.c()) {
            return false;
         } else {
            ect $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               ect $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(ama $$0, bky $$1, ia $$2) {
      return $$2.a() != $$0.ac() || !$$2.b().a($$1.dj(), 3.0);
   }

   private static Optional<Set<ia>> a(bqc<Mu, Set<ia>> $$0, Optional<Set<ia>> $$1, ama $$2, ht $$3) {
      ia $$4 = ia.a($$2.ac(), $$3);
      return Optional.of($$1.<Set<ia>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<ia> $$2x = Sets.newHashSet(new ia[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
