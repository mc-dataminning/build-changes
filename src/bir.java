import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bir {
   public static bjb<bfz> a(int $$0, float $$1, int $$2) {
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$3 -> $$3.group(
                  $$3.c(bpb.m), $$3.a(bpb.b), $$3.a(bpb.C), $$3.a(bpb.t), $$3.a(bpb.n), $$3.a(bpb.r), $$3.a(bpb.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.w()
                           .d($$0xxxx -> $$0xxxx.a(brd.n), $$0xxxx -> true, $$12.di(), $$2 + 1, bqz.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dg(), (double)$$2))
                           .or(() -> $$11.w().a($$0xxxxx -> $$0xxxxx.a(brd.n), $$0xxxxx -> true, bqz.b.c, $$12.di(), $$0, $$12.ec()))
                           .or(() -> $$3.<hd>a($$5).map(hd::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(hd.a($$11.ac(), $$10xx));
                              if (!$$10xx.a($$12.dg(), (double)$$2)) {
                                 $$4.a(new bpe($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
