import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class crr extends cqs {
   protected static final Map<dcv, Pair<Predicate<cvn>, Consumer<cvn>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dcx.i,
         Pair.of(crr::b, b(dcx.cC.n())),
         dcx.kE,
         Pair.of(crr::b, b(dcx.cC.n())),
         dcx.j,
         Pair.of(crr::b, b(dcx.cC.n())),
         dcx.k,
         Pair.of(crr::b, b(dcx.j.n())),
         dcx.sH,
         Pair.of((Predicate<cvn>)$$0 -> true, a(dcx.j.n(), csg.dO))
      )
   );

   public crr(ctq $$0, cry.a $$1) {
      super($$0, avo.bB, $$1);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      Pair<Predicate<cvn>, Consumer<cvn>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return boq.d;
      } else {
         Predicate<cvn> $$4 = (Predicate<cvn>)$$3.getFirst();
         Consumer<cvn> $$5 = (Consumer<cvn>)$$3.getSecond();
         if ($$4.test($$0)) {
            ckl $$6 = $$0.o();
            $$1.a($$6, $$2, auz.md, ava.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bre.d($$0.p()));
               }
            }

            return boq.a($$1.B);
         } else {
            return boq.d;
         }
      }
   }

   public static Consumer<cvn> b(dpy $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dur.c, $$1.a(), dur.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cvn> a(dpy $$0, czt $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dur.c, $$2.a(), dur.a.a($$2.o(), $$0));
         dcv.a($$2.q(), $$2.a(), $$2.k(), new csd($$1));
      };
   }

   public static boolean b(cvn $$0) {
      return $$0.k() != ir.a && $$0.q().a_($$0.a().c()).i();
   }
}
