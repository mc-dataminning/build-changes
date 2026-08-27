import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class csn extends cro {
   protected static final Map<dde, Pair<Predicate<cwk>, Consumer<cwk>>> a = Maps.newHashMap(
      ImmutableMap.of(
         ddg.i,
         Pair.of(csn::b, a(ddg.cC.n())),
         ddg.kE,
         Pair.of(csn::b, a(ddg.cC.n())),
         ddg.j,
         Pair.of(csn::b, a(ddg.cC.n())),
         ddg.k,
         Pair.of(csn::b, a(ddg.j.n())),
         ddg.sH,
         Pair.of((Predicate<cwk>)$$0 -> true, a(ddg.j.n(), ctc.dO))
      )
   );

   public csn(cum $$0, csu.a $$1) {
      super($$0, avr.bB, $$1);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      Pair<Predicate<cwk>, Consumer<cwk>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bpm.d;
      } else {
         Predicate<cwk> $$4 = (Predicate<cwk>)$$3.getFirst();
         Consumer<cwk> $$5 = (Consumer<cwk>)$$3.getSecond();
         if ($$4.test($$0)) {
            clh $$6 = $$0.o();
            $$1.a($$6, $$2, avc.md, avd.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bsa.d($$0.p()));
               }
            }

            return bpm.a($$1.B);
         } else {
            return bpm.d;
         }
      }
   }

   public static Consumer<cwk> a(dqh $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dva.c, $$1.a(), dva.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cwk> a(dqh $$0, dac $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dva.c, $$2.a(), dva.a.a($$2.o(), $$0));
         dde.a($$2.q(), $$2.a(), $$2.k(), new csz($$1));
      };
   }

   public static boolean b(cwk $$0) {
      return $$0.k() != is.a && $$0.q().a_($$0.a().c()).i();
   }
}
