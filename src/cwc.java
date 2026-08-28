import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cwc extends cvf {
   protected static final Map<diq, Pair<Predicate<daf>, Consumer<daf>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dis.i,
         Pair.of(cwc::b, a(dis.cC.m())),
         dis.kE,
         Pair.of(cwc::b, a(dis.cC.m())),
         dis.j,
         Pair.of(cwc::b, a(dis.cC.m())),
         dis.k,
         Pair.of(cwc::b, a(dis.j.m())),
         dis.sH,
         Pair.of((Predicate<daf>)$$0 -> true, a(dis.j.m(), cwq.dO))
      )
   );

   public cwc(cyd $$0, float $$1, float $$2, cwi.a $$3) {
      super($$0, axc.bC, $$1, $$2, $$3);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      Pair<Predicate<daf>, Consumer<daf>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bsk.e;
      } else {
         Predicate<daf> $$4 = (Predicate<daf>)$$3.getFirst();
         Consumer<daf> $$5 = (Consumer<daf>)$$3.getSecond();
         if ($$4.test($$0)) {
            cou $$6 = $$0.o();
            $$1.a($$6, $$2, awn.mm, awo.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bvh.d($$0.p()));
               }
            }

            return bsk.a;
         } else {
            return bsk.e;
         }
      }
   }

   public static Consumer<daf> a(dvv $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ear.c, $$1.a(), ear.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<daf> a(dvv $$0, dfl $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ear.c, $$2.a(), ear.a.a($$2.o(), $$0));
         diq.a($$2.q(), $$2.a(), $$2.k(), new cwm($$1));
      };
   }

   public static boolean b(daf $$0) {
      return $$0.k() != jm.a && $$0.q().a_($$0.a().d()).l();
   }
}
