import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class bzx {
   private static final int a = 60;

   public static bxb<bvp> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return can.a(
         (Function<can.b<bvp>, ? extends App<can.c<bvp>, caq<bvp>>>)($$3 -> $$3.group($$3.c(cel.o), $$3.c(cel.m), $$3.a(cel.n))
               .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
                     if (!$$5x.b_($$6.dv()).a(axi.a)) {
                        return false;
                     } else if ($$7 < $$2.getValue()) {
                        $$2.setValue($$7 + 60L);
                        return true;
                     } else {
                        jh $$8 = $$6.dv();
                        jh.a $$9 = new jh.a();
                        fad $$10 = fad.a($$6);

                        for (jh $$11 : jh.a($$8, $$0, $$0, $$0)) {
                           if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                              dvv $$12 = $$5x.a_($$11);
                              dvv $$13 = $$5x.a_($$9.a($$11, jm.a));
                              if (!$$12.a(dis.G) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jm.b)) {
                                 jh $$14 = $$11.j();
                                 $$5.a(new bxd($$14));
                                 $$4.a(new ceo(new bxd($$14), $$1, 1));
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
