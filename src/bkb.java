import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bkb {
   private static final float a = 0.3F;

   public static bjb<bfz> a() {
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$0 -> $$0.group($$0.a(bpb.m), $$0.a(bpb.n), $$0.b(bpb.e), $$0.b(bpb.h), $$0.c(bpb.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     hd $$9 = $$0.b($$3);
                     bpd $$10 = $$0.b($$4);
                     if ($$6.y_().a(100) == 0 && $$6.ac() == $$9.a() && $$9.b().a($$7.dg(), 4.0) && $$10.d($$0xxx -> bfn.bf.equals($$0xxx.ae()))) {
                        $$10.a($$1xx -> bfn.bf.equals($$1xx.ae()) && $$1xx.f((bfj)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bic($$3xx, true));
                           $$1.a(new bpe(new bic($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
