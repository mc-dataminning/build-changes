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

public class bqu {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bpx<bog> a() {
      MutableObject<ehc> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$2 -> $$2.group($$2.b(bxh.t), $$2.a(bxh.v), $$2.a(bxh.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ehe $$9 = $$2.b($$3);
                     Optional<Set<ii>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        ehc $$11 = $$9.i();
                        ehc $$12 = $$9.h();
                        hz $$13 = $$11.a();
                        dlf $$14 = $$6.a_($$13);
                        if ($$14.a(atz.h, $$0xxxx -> $$0xxxx.b() instanceof dau)) {
                           dau $$15 = (dau)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        hz $$16 = $$12.a();
                        dlf $$17 = $$6.a_($$16);
                        if ($$17.a(atz.h, $$0xxxx -> $$0xxxx.b() instanceof dau)) {
                           dau $$18 = (dau)$$17.b();
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

   public static void a(aov $$0, bog $$1, @Nullable ehc $$2, @Nullable ehc $$3, Set<ii> $$4, Optional<List<bog>> $$5) {
      Iterator<ii> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         ii $$7 = $$6.next();
         hz $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dlf $$9 = $$0.a_($$8);
               if (!$$9.a(atz.h, $$0x -> $$0x.b() instanceof dau)) {
                  $$6.remove();
               } else {
                  dau $$10 = (dau)$$9.b();
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

   private static boolean a(bog $$0, hz $$1, Optional<List<bog>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ai() == $$0.ai()).filter($$1x -> $$1.a($$1x.dk(), 2.0)).anyMatch($$1x -> a($$1x.dO(), $$1));
   }

   private static boolean a(bpf<?> $$0, hz $$1) {
      if (!$$0.a(bxh.t)) {
         return false;
      } else {
         ehe $$2 = $$0.c(bxh.t).get();
         if ($$2.c()) {
            return false;
         } else {
            ehc $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               ehc $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aov $$0, bog $$1, ii $$2) {
      return $$2.a() != $$0.ae() || !$$2.b().a($$1.dk(), 3.0);
   }

   private static Optional<Set<ii>> a(btk<Mu, Set<ii>> $$0, Optional<Set<ii>> $$1, aov $$2, hz $$3) {
      ii $$4 = ii.a($$2.ae(), $$3);
      return Optional.of($$1.<Set<ii>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<ii> $$2x = Sets.newHashSet(new ii[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
