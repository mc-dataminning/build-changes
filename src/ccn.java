import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class ccn {
   public static bzo<bxw> a(dne $$0) {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$1 -> $$1.group($$1.c(cgy.p), $$1.b(cgy.n), $$1.b(cgy.Z))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bi() && $$3x.aH()) {
                        iw $$5 = $$3x.dv().e();

                        for (jc $$6 : jc.c.a) {
                           iw $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jc.b).c() && $$2x.b_($$7).b(exr.c)) {
                              iw $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 ebg $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(egg.i, $$8, egg.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awr.kt, aws.e, 1.0F, 1.0F);
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
