import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class brx {
   private static final int a = 300;

   public static bpx<bog> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$3x -> $$3x.group($$3x.b(bxh.C), $$3x.b(bxh.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        hz $$11 = $$3x.<ii>b($$4).b();
                        if ($$11.a($$7.dm(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.dO().a($$6.Y(), $$6.X());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
