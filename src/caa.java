import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class caa {
   private static final int a = 16;

   public static bwy<bve> a(Predicate<jq<cgl>> $$0, cei<jp> $$1) {
      return cak.a((Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jp $$6 = $$2.b($$2x);
               jh $$7 = $$6.b();
               if ($$3.ag() == $$6.a() && $$7.a($$4.dw(), 16.0)) {
                  arq $$8 = $$3.o().a($$6.a());
                  if ($$8 == null || !$$8.y().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.y().b($$7);
                     agv.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arq $$0, jh $$1, bve $$2) {
      dvo $$3 = $$0.a_($$1);
      return $$3.a(axd.S) && $$3.c(dic.c) && !$$2.fU();
   }
}
