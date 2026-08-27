import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bob {
   private static final int a = 16;

   public static bla<bji> a(Predicate<hg<buk>> $$0, bsj<hf> $$1) {
      return bol.a((Function<bol.b<bji>, ? extends App<bol.c<bji>, boo<bji>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               hf $$6 = $$2.b($$2x);
               gw $$7 = $$6.b();
               if ($$3.ac() == $$6.a() && $$7.a($$4.dj(), 16.0)) {
                  aks $$8 = $$3.n().a($$6.a());
                  if ($$8 == null || !$$8.w().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.w().b($$7);
                     abd.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aks $$0, gw $$1, bji $$2) {
      dfl $$3 = $$0.a_($$1);
      return $$3.a(apu.R) && $$3.c(csq.b) && !$$2.fC();
   }
}
