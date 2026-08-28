import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cbn {
   private static final int a = 60;

   public static byr<bxh> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return ccd.a(
         (Function<ccd.b<bxh>, ? extends App<ccd.c<bxh>, ccg<bxh>>>)($$3 -> $$3.group($$3.c(cgb.p), $$3.c(cgb.n), $$3.a(cgb.o))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dv()).a(axf.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        iu $$8 = $$6.dv();
                        iu.a $$9 = new iu.a();
                        feb $$10 = feb.a($$6);

                        for (iu $$11 : iu.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dzo $$12 = $$5x.a_($$11);
                              dzo $$13 = $$5x.a_($$9.a($$11, ja.a));
                              if (!$$12.a(dlw.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, ja.b)) {
                                 iu $$14 = $$11.j();
                                 $$5.a(new byt($$14));
                                 $$4.a(new cge(new byt($$14), $$1, 1));
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
