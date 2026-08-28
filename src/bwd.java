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

public class bwd {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bvg<btl> a() {
      MutableObject<epk> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$2 -> $$2.group($$2.b(ccq.t), $$2.a(ccq.v), $$2.a(ccq.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     epm $$9 = $$2.b($$3);
                     Optional<Set<jl>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        epk $$11 = $$9.i();
                        epk $$12 = $$9.h();
                        jd $$13 = $$11.a();
                        dta $$14 = $$6.a_($$13);
                        if ($$14.a(awd.h, $$0xxxx -> $$0xxxx.b() instanceof dic)) {
                           dic $$15 = (dic)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        jd $$16 = $$12.a();
                        dta $$17 = $$6.a_($$16);
                        if ($$17.a(awd.h, $$0xxxx -> $$0xxxx.b() instanceof dic)) {
                           dic $$18 = (dic)$$17.b();
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

   public static void a(aqt $$0, btl $$1, @Nullable epk $$2, @Nullable epk $$3, Set<jl> $$4, Optional<List<btl>> $$5) {
      Iterator<jl> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jl $$7 = $$6.next();
         jd $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dta $$9 = $$0.a_($$8);
               if (!$$9.a(awd.h, $$0x -> $$0x.b() instanceof dic)) {
                  $$6.remove();
               } else {
                  dic $$10 = (dic)$$9.b();
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

   private static boolean a(btl $$0, jd $$1, Optional<List<btl>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.am() == $$0.am()).filter($$1x -> $$1.a($$1x.do(), 2.0)).anyMatch($$1x -> a($$1x.dU(), $$1));
   }

   private static boolean a(buo<?> $$0, jd $$1) {
      if (!$$0.a(ccq.t)) {
         return false;
      } else {
         epm $$2 = $$0.c(ccq.t).get();
         if ($$2.c()) {
            return false;
         } else {
            epk $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               epk $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aqt $$0, btl $$1, jl $$2) {
      return $$2.a() != $$0.af() || !$$2.b().a($$1.do(), 3.0);
   }

   private static Optional<Set<jl>> a(byt<Mu, Set<jl>> $$0, Optional<Set<jl>> $$1, aqt $$2, jd $$3) {
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
