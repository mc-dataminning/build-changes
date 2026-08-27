import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpe {
   private static final int a = 36;

   public static bmb<bkj> a() {
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$0 -> $$0.group($$0.a(btk.x), $$0.a(btk.y), $$0.a(btk.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bkj>a($$2).filter($$1xx -> $$1xx.f((bjt)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dN().a($$4.W(), $$4.V());
                     }

                     return true;
                  }))
      );
   }
}
