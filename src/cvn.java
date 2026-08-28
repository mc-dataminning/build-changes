import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cvn extends cuq {
   protected static final Map<dhy, Pair<Predicate<czo>, Consumer<czo>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dia.i,
         Pair.of(cvn::b, a(dia.cC.m())),
         dia.kE,
         Pair.of(cvn::b, a(dia.cC.m())),
         dia.j,
         Pair.of(cvn::b, a(dia.cC.m())),
         dia.k,
         Pair.of(cvn::b, a(dia.j.m())),
         dia.sH,
         Pair.of((Predicate<czo>)$$0 -> true, a(dia.j.m(), cwb.dO))
      )
   );

   public cvn(cxo $$0, float $$1, float $$2, cvt.a $$3) {
      super($$0, awz.bC, $$1, $$2, $$3);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      Pair<Predicate<czo>, Consumer<czo>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bry.e;
      } else {
         Predicate<czo> $$4 = (Predicate<czo>)$$3.getFirst();
         Consumer<czo> $$5 = (Consumer<czo>)$$3.getSecond();
         if ($$4.test($$0)) {
            coh $$6 = $$0.o();
            $$1.a($$6, $$2, awk.mm, awl.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, buv.d($$0.p()));
               }
            }

            return bry.a;
         } else {
            return bry.e;
         }
      }
   }

   public static Consumer<czo> a(dvd $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(eaa.c, $$1.a(), eaa.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<czo> a(dvd $$0, deu $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(eaa.c, $$2.a(), eaa.a.a($$2.o(), $$0));
         dhy.a($$2.q(), $$2.a(), $$2.k(), new cvx($$1));
      };
   }

   public static boolean b(czo $$0) {
      return $$0.k() != jl.a && $$0.q().a_($$0.a().d()).l();
   }
}
