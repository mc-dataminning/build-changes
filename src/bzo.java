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

public class bzo {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static byr<bwz> a() {
      MutableObject<ewh> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return ccd.a(
         (Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$2 -> $$2.group($$2.b(cgb.u), $$2.a(cgb.w), $$2.a(cgb.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ewj $$9 = $$2.b($$3);
                     Optional<Set<jd>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        ewh $$11 = $$9.i();
                        ewh $$12 = $$9.h();
                        iu $$13 = $$11.a();
                        dzo $$14 = $$6.a_($$13);
                        if ($$14.a(axa.i, $$0xxxx -> $$0xxxx.b() instanceof dob)) {
                           dob $$15 = (dob)$$14.b();
                           if (!$$15.n($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        iu $$16 = $$12.a();
                        dzo $$17 = $$6.a_($$16);
                        if ($$17.a(axa.i, $$0xxxx -> $$0xxxx.b() instanceof dob)) {
                           dob $$18 = (dob)$$17.b();
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

   public static void a(aro $$0, bwz $$1, @Nullable ewh $$2, @Nullable ewh $$3, Set<jd> $$4, Optional<List<bwz>> $$5) {
      Iterator<jd> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jd $$7 = $$6.next();
         iu $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dzo $$9 = $$0.a_($$8);
               if (!$$9.a(axa.i, $$0x -> $$0x.b() instanceof dob)) {
                  $$6.remove();
               } else {
                  dob $$10 = (dob)$$9.b();
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

   private static boolean a(bwz $$0, iu $$1, Optional<List<bwz>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.aq() == $$0.aq()).filter($$1x -> $$1.a($$1x.dt(), 2.0)).anyMatch($$1x -> a($$1x.eb(), $$1));
   }

   private static boolean a(bxz<?> $$0, iu $$1) {
      if (!$$0.a(cgb.u)) {
         return false;
      } else {
         ewj $$2 = $$0.c(cgb.u).get();
         if ($$2.c()) {
            return false;
         } else {
            ewh $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               ewh $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aro $$0, bwz $$1, jd $$2) {
      return $$2.a() != $$0.aj() || !$$2.b().a($$1.dt(), 3.0);
   }

   private static Optional<Set<jd>> a(cce<Mu, Set<jd>> $$0, Optional<Set<jd>> $$1, aro $$2, iu $$3) {
      jd $$4 = jd.a($$2.aj(), $$3);
      return Optional.of($$1.<Set<jd>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jd> $$2x = Sets.newHashSet(new jd[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
