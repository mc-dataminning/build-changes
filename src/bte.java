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

public class bte {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bsh<bqo> a() {
      MutableObject<ele> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$2 -> $$2.group($$2.b(bzr.t), $$2.a(bzr.v), $$2.a(bzr.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     elg $$9 = $$2.b($$3);
                     Optional<Set<ik>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        ele $$11 = $$9.i();
                        ele $$12 = $$9.h();
                        ib $$13 = $$11.a();
                        doz $$14 = $$6.a_($$13);
                        if ($$14.a(avc.h, $$0xxxx -> $$0xxxx.b() instanceof dee)) {
                           dee $$15 = (dee)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        ib $$16 = $$12.a();
                        doz $$17 = $$6.a_($$16);
                        if ($$17.a(avc.h, $$0xxxx -> $$0xxxx.b() instanceof dee)) {
                           dee $$18 = (dee)$$17.b();
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

   public static void a(aps $$0, bqo $$1, @Nullable ele $$2, @Nullable ele $$3, Set<ik> $$4, Optional<List<bqo>> $$5) {
      Iterator<ik> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         ik $$7 = $$6.next();
         ib $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               doz $$9 = $$0.a_($$8);
               if (!$$9.a(avc.h, $$0x -> $$0x.b() instanceof dee)) {
                  $$6.remove();
               } else {
                  dee $$10 = (dee)$$9.b();
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

   private static boolean a(bqo $$0, ib $$1, Optional<List<bqo>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ai() == $$0.ai()).filter($$1x -> $$1.a($$1x.dk(), 2.0)).anyMatch($$1x -> a($$1x.dP(), $$1));
   }

   private static boolean a(brp<?> $$0, ib $$1) {
      if (!$$0.a(bzr.t)) {
         return false;
      } else {
         elg $$2 = $$0.c(bzr.t).get();
         if ($$2.c()) {
            return false;
         } else {
            ele $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               ele $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aps $$0, bqo $$1, ik $$2) {
      return $$2.a() != $$0.ae() || !$$2.b().a($$1.dk(), 3.0);
   }

   private static Optional<Set<ik>> a(bvu<Mu, Set<ik>> $$0, Optional<Set<ik>> $$1, aps $$2, ib $$3) {
      ik $$4 = ik.a($$2.ae(), $$3);
      return Optional.of($$1.<Set<ik>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<ik> $$2x = Sets.newHashSet(new ik[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
