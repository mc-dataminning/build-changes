import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbq {
   private static final int a = 60;

   public static byu<bxk> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return ccg.a(
         (Function<ccg.b<bxk>, ? extends App<ccg.c<bxk>, ccj<bxk>>>)($$3 -> $$3.group($$3.c(cge.p), $$3.c(cge.n), $$3.a(cge.o))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dv()).a(axh.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        iu $$8 = $$6.dv();
                        iu.a $$9 = new iu.a();
                        fen $$10 = fen.a($$6);

                        for (iu $$11 : iu.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dzz $$12 = $$5x.a_($$11);
                              dzz $$13 = $$5x.a_($$9.a($$11, ja.a));
                              if (!$$12.a(dmc.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, ja.b)) {
                                 iu $$14 = $$11.j();
                                 $$5.a(new byw($$14));
                                 $$4.a(new cgh(new byw($$14), $$1, 1));
                                 break;
                              }
                           }
                        }

                        $$2.setValue($$7 + 60L);
                        return true;
                     }
                  }))
      );
   }
}
