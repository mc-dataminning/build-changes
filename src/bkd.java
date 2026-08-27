import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bkd {
   public static bhs<bfz> a(int $$0, BiPredicate<bfz, bfz> $$1) {
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$2 -> $$2.group($$2.b(bpb.o), $$2.a(bpb.aa), $$2.c(bpb.ah), $$2.a(bpb.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bfz $$10 = $$2.b($$3);
                     if (!$$10.es()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.di(), (long)$$0);
                        if ($$10.ae() != bfn.bt || $$7.X().b(cmi.J)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
