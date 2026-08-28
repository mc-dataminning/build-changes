import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbl {
   private static final int a = 16;

   public static byj<bwr> a(Predicate<js<chw>> $$0, cft<jr> $$1) {
      return cbv.a((Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jr $$6 = $$2.b($$2x);
               jj $$7 = $$6.b();
               if ($$3.aj() == $$6.a() && $$7.a($$4.dt(), 16.0)) {
                  arn $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     if (!a($$8, $$7)) {
                        $$3.A().b($$7);
                        agj.c($$3, $$7);
                     }
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(arn $$0, jj $$1, bwr $$2) {
      dym $$3 = $$0.a_($$1);
      return $$3.a(awz.T) && $$3.c(dkn.c) && !$$2.fQ();
   }

   private static boolean a(arn $$0, jj $$1) {
      List<cpu> $$2 = $$0.a(cpu.class, new fcp($$1), bwr::fQ);
      return !$$2.isEmpty();
   }
}
