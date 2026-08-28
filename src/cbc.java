import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbc {
   private static final int a = 16;

   public static bya<bwg> a(Predicate<jq<chn>> $$0, cfk<jp> $$1) {
      return cbm.a((Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jp $$6 = $$2.b($$2x);
               jh $$7 = $$6.b();
               if ($$3.ah() == $$6.a() && $$7.a($$4.du(), 16.0)) {
                  ash $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.z().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     $$3.z().b($$7);
                     ahj.c($$3, $$7);
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(ash $$0, jh $$1, bwg $$2) {
      dxv $$3 = $$0.a_($$1);
      return $$3.a(axu.T) && $$3.c(dkf.c) && !$$2.fR();
   }
}
