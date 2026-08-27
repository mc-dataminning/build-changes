import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bsz {
   private static final int a = 16;

   public static bpx<bog> a(Predicate<ij<bzk>> $$0, bxh<ii> $$1) {
      return btj.a((Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               ii $$6 = $$2.b($$2x);
               hz $$7 = $$6.b();
               if ($$3.ae() == $$6.a() && $$7.a($$4.dk(), 16.0)) {
                  aov $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     aep.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aov $$0, hz $$1, bog $$2) {
      dlf $$3 = $$0.a_($$1);
      return $$3.a(atz.R) && $$3.c(cyh.c) && !$$2.fD();
   }
}
