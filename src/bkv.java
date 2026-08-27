import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bkv {
   private static final int a = 36;

   public static bhs<bfz> a() {
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$0 -> $$0.group($$0.a(bpb.x), $$0.a(bpb.y), $$0.a(bpb.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bfz>a($$2).filter($$1xx -> $$1xx.f((bfj)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dK().a($$4.W(), $$4.V());
                     }

                     return true;
                  }))
      );
   }
}
