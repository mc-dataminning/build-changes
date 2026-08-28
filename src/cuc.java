import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cuc extends ctd {
   protected static final Map<dey, Pair<Predicate<cyb>, Consumer<cyb>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dfa.i,
         Pair.of(cuc::b, a(dfa.cC.o())),
         dfa.kE,
         Pair.of(cuc::b, a(dfa.cC.o())),
         dfa.j,
         Pair.of(cuc::b, a(dfa.cC.o())),
         dfa.k,
         Pair.of(cuc::b, a(dfa.j.o())),
         dfa.sH,
         Pair.of((Predicate<cyb>)$$0 -> true, a(dfa.j.o(), cur.dO))
      )
   );

   public cuc(cwd $$0, cuj.a $$1) {
      super($$0, awo.bB, $$1);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      Pair<Predicate<cyb>, Consumer<cyb>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqt.e;
      } else {
         Predicate<cyb> $$4 = (Predicate<cyb>)$$3.getFirst();
         Consumer<cyb> $$5 = (Consumer<cyb>)$$3.getSecond();
         if ($$4.test($$0)) {
            cmw $$6 = $$0.o();
            $$1.a($$6, $$2, avz.mn, awa.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bto.d($$0.p()));
               }
            }

            return bqt.a($$1.B);
         } else {
            return bqt.e;
         }
      }
   }

   public static Consumer<cyb> a(dsb $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dwu.c, $$1.a(), dwu.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cyb> a(dsb $$0, dbw $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dwu.c, $$2.a(), dwu.a.a($$2.o(), $$0));
         dey.a($$2.q(), $$2.a(), $$2.k(), new cuo($$1));
      };
   }

   public static boolean b(cyb $$0) {
      return $$0.k() != je.a && $$0.q().a_($$0.a().c()).i();
   }
}
