import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzt {
   public static bwu<bva> a(die $$0) {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$1 -> $$1.group($$1.c(cee.o), $$1.b(cee.m), $$1.b(cee.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bk() && $$3x.aK()) {
                        jh $$5 = $$3x.dx().e();

                        for (jm $$6 : jm.c.a) {
                           jh $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jm.b).c() && $$2x.b_($$7).b(erl.c)) {
                              jh $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dvj $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(eag.i, $$8, eag.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awl.jQ, awm.e, 1.0F, 1.0F);
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
