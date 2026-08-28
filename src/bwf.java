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

public class bwf {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bvi<btn> a() {
      MutableObject<epq> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return byu.a(
         (Function<byu.b<btn>, ? extends App<byu.c<btn>, byx<btn>>>)($$2 -> $$2.group($$2.b(ccs.t), $$2.a(ccs.v), $$2.a(ccs.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     eps $$9 = $$2.b($$3);
                     Optional<Set<jl>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        epq $$11 = $$9.i();
                        epq $$12 = $$9.h();
                        jd $$13 = $$11.a();
                        dtc $$14 = $$6.a_($$13);
                        if ($$14.a(awe.i, $$0xxxx -> $$0xxxx.b() instanceof die)) {
                           die $$15 = (die)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        jd $$16 = $$12.a();
                        dtc $$17 = $$6.a_($$16);
                        if ($$17.a(awe.i, $$0xxxx -> $$0xxxx.b() instanceof die)) {
                           die $$18 = (die)$$17.b();
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

   public static void a(aqu $$0, btn $$1, @Nullable epq $$2, @Nullable epq $$3, Set<jl> $$4, Optional<List<btn>> $$5) {
      Iterator<jl> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jl $$7 = $$6.next();
         jd $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dtc $$9 = $$0.a_($$8);
               if (!$$9.a(awe.i, $$0x -> $$0x.b() instanceof die)) {
                  $$6.remove();
               } else {
                  die $$10 = (die)$$9.b();
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

   private static boolean a(btn $$0, jd $$1, Optional<List<btn>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.am() == $$0.am()).filter($$1x -> $$1.a($$1x.dm(), 2.0)).anyMatch($$1x -> a($$1x.dT(), $$1));
   }

   private static boolean a(buq<?> $$0, jd $$1) {
      if (!$$0.a(ccs.t)) {
         return false;
      } else {
         eps $$2 = $$0.c(ccs.t).get();
         if ($$2.c()) {
            return false;
         } else {
            epq $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               epq $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aqu $$0, btn $$1, jl $$2) {
      return $$2.a() != $$0.af() || !$$2.b().a($$1.dm(), 3.0);
   }

   private static Optional<Set<jl>> a(byv<Mu, Set<jl>> $$0, Optional<Set<jl>> $$1, aqu $$2, jd $$3) {
      jl $$4 = jl.a($$2.af(), $$3);
      return Optional.of($$1.<Set<jl>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jl> $$2x = Sets.newHashSet(new jl[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
