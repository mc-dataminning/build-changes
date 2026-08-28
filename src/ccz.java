import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ccz {
   private static final int a = 16;

   public static bzx<byf> a(Predicate<jg<cjk>> $$0, chh<jf> $$1) {
      return cdj.a((Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jf $$6 = $$2.b($$2x);
               iw $$7 = $$6.b();
               if ($$3.aj() == $$6.a() && $$7.a($$4.dt(), 16.0)) {
                  asb $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     if (!a($$8, $$7)) {
                        $$3.A().b($$7);
                        agx.c($$3, $$7);
                     }
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(asb $$0, iw $$1, byf $$2) {
      ebq $$3 = $$0.a_($$1);
      return $$3.a(axn.T) && $$3.c(dnh.c) && !$$2.fR();
   }

   private static boolean a(asb $$0, iw $$1) {
      List<cru> $$2 = $$0.a(cru.class, new ffx($$1), byf::fR);
      return !$$2.isEmpty();
   }
}
