import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class blo {
   public static bhs<bfz> a() {
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$0 -> $$0.group($$0.a(bpb.n), $$0.a(bpb.ay), $$0.a(bpb.ax), $$0.c(bpb.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<gu> $$7 = $$0.<bfz>a($$3).map(bfj::di).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bhu($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
