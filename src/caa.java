import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class caa {
   public static bxb<bvh> a(diq $$0) {
      return can.a(
         (Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$1 -> $$1.group($$1.c(cel.o), $$1.b(cel.m), $$1.b(cel.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bj() && $$3x.aJ()) {
                        jh $$5 = $$3x.dv().e();

                        for (jm $$6 : jm.c.a) {
                           jh $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jm.b).c() && $$2x.b_($$7).b(erw.c)) {
                              jh $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dvv $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(ear.i, $$8, ear.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awn.jQ, awo.e, 1.0F, 1.0F);
                                 $$3.b();
                                 return true;
                              }
                           }
                        }

                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
