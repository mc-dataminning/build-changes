import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ccq {
   private static final int a = 16;

   public static bzo<bxw> a(Predicate<jg<cjb>> $$0, cgy<jf> $$1) {
      return cda.a((Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               jf $$6 = $$2.b($$2x);
               iw $$7 = $$6.b();
               if ($$3.aj() == $$6.a() && $$7.a($$4.dt(), 16.0)) {
                  aru $$8 = $$3.p().a($$6.a());
                  if ($$8 == null || !$$8.A().a($$7, $$0)) {
                     $$2x.b();
                  } else if (a($$8, $$7, $$4)) {
                     $$2x.b();
                     if (!a($$8, $$7)) {
                        $$3.A().b($$7);
                        agq.c($$3, $$7);
                     }
                  }

                  return true;
               } else {
                  return false;
               }
            })));
   }

   private static boolean a(aru $$0, iw $$1, bxw $$2) {
      ebg $$3 = $$0.a_($$1);
      return $$3.a(axg.T) && $$3.c(dmx.c) && !$$2.fR();
   }

   private static boolean a(aru $$0, iw $$1) {
      List<crl> $$2 = $$0.a(crl.class, new ffn($$1), bxw::fR);
      return !$$2.isEmpty();
   }
}
