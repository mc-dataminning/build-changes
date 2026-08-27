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

public class bqy {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static bqb<boi> a() {
      MutableObject<ehj> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return btn.a(
         (Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$2 -> $$2.group($$2.b(bxl.t), $$2.a(bxl.v), $$2.a(bxl.g))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ehl $$9 = $$2.b($$3);
                     Optional<Set<ii>> $$10 = $$2.a($$4);
                     if (!$$9.b() && !$$9.c()) {
                        if (Objects.equals($$0.getValue(), $$9.h())) {
                           $$1.setValue(20);
                        } else if ($$1.decrementAndGet() > 0) {
                           return false;
                        }

                        $$0.setValue($$9.h());
                        ehj $$11 = $$9.i();
                        ehj $$12 = $$9.h();
                        hz $$13 = $$11.a();
                        dlj $$14 = $$6.a_($$13);
                        if ($$14.a(aua.h, $$0xxxx -> $$0xxxx.b() instanceof day)) {
                           day $$15 = (day)$$14.b();
                           if (!$$15.m($$14)) {
                              $$15.a($$7, $$6, $$14, $$13, true);
                           }

                           $$10 = a($$4, $$10, $$6, $$13);
                        }

                        hz $$16 = $$12.a();
                        dlj $$17 = $$6.a_($$16);
                        if ($$17.a(aua.h, $$0xxxx -> $$0xxxx.b() instanceof day)) {
                           day $$18 = (day)$$17.b();
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

   public static void a(aow $$0, boi $$1, @Nullable ehj $$2, @Nullable ehj $$3, Set<ii> $$4, Optional<List<boi>> $$5) {
      Iterator<ii> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         ii $$7 = $$6.next();
         hz $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               dlj $$9 = $$0.a_($$8);
               if (!$$9.a(aua.h, $$0x -> $$0x.b() instanceof day)) {
                  $$6.remove();
               } else {
                  day $$10 = (day)$$9.b();
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

   private static boolean a(boi $$0, hz $$1, Optional<List<boi>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ai() == $$0.ai()).filter($$1x -> $$1.a($$1x.dk(), 2.0)).anyMatch($$1x -> a($$1x.dO(), $$1));
   }

   private static boolean a(bpj<?> $$0, hz $$1) {
      if (!$$0.a(bxl.t)) {
         return false;
      } else {
         ehl $$2 = $$0.c(bxl.t).get();
         if ($$2.c()) {
            return false;
         } else {
            ehj $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               ehj $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aow $$0, boi $$1, ii $$2) {
      return $$2.a() != $$0.ad() || !$$2.b().a($$1.dk(), 3.0);
   }

   private static Optional<Set<ii>> a(bto<Mu, Set<ii>> $$0, Optional<Set<ii>> $$1, aow $$2, hz $$3) {
      ii $$4 = ii.a($$2.ad(), $$3);
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
