import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cwf extends cvi {
   protected static final Map<djm, Pair<Predicate<dai>, Consumer<dai>>> a = Maps.newHashMap(
      ImmutableMap.of(
         djo.i,
         Pair.of(cwf::b, a(djo.cK.m())),
         djo.lg,
         Pair.of(cwf::b, a(djo.cK.m())),
         djo.j,
         Pair.of(cwf::b, a(djo.cK.m())),
         djo.k,
         Pair.of(cwf::b, a(djo.j.m())),
         djo.tj,
         Pair.of((Predicate<dai>)$$0 -> true, a(djo.j.m(), cwt.ea))
      )
   );

   public cwf(cyg $$0, float $$1, float $$2, cwl.a $$3) {
      super($$0, awp.bD, $$1, $$2, $$3);
   }

   @Override
   public bsj a(dai $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      Pair<Predicate<dai>, Consumer<dai>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bsj.e;
      } else {
         Predicate<dai> $$4 = (Predicate<dai>)$$3.getFirst();
         Consumer<dai> $$5 = (Consumer<dai>)$$3.getSecond();
         if ($$4.test($$0)) {
            cox $$6 = $$0.o();
            $$1.a($$6, $$2, awa.mL, awb.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bvg.d($$0.p()));
               }
            }

            return bsj.a;
         } else {
            return bsj.e;
         }
      }
   }

   public static Consumer<dai> a(dwx $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ebt.c, $$1.a(), ebt.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dai> a(dwx $$0, dgh $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ebt.c, $$2.a(), ebt.a.a($$2.o(), $$0));
         djm.a($$2.q(), $$2.a(), $$2.k(), new cwp($$1));
      };
   }

   public static boolean b(dai $$0) {
      return $$0.k() != jn.a && $$0.q().a_($$0.a().d()).l();
   }
}
