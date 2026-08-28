import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzw {
   private static final int a = 16;

   public static bwu<bva> a(Predicate<jq<cgh>> $$0, cee<jp> $$1) {
      return cag.a((Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jp $$6 = $$2.b($$2x);
               jh $$7 = $$6.b();
               if ($$3.ag() == $$6.a() && $$7.a($$4.dv(), 16.0)) {
                  arn $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     ags.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arn $$0, jh $$1, bva $$2) {
      dvj $$3 = $$0.a_($$1);
      return $$3.a(axa.S) && $$3.c(dhx.c) && !$$2.fT();
   }
}
