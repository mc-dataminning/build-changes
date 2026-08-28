import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cud extends cte {
   protected static final Map<dez, Pair<Predicate<cyc>, Consumer<cyc>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dfb.i,
         Pair.of(cud::b, a(dfb.cC.o())),
         dfb.kE,
         Pair.of(cud::b, a(dfb.cC.o())),
         dfb.j,
         Pair.of(cud::b, a(dfb.cC.o())),
         dfb.k,
         Pair.of(cud::b, a(dfb.j.o())),
         dfb.sH,
         Pair.of((Predicate<cyc>)$$0 -> true, a(dfb.j.o(), cus.dO))
      )
   );

   public cud(cwe $$0, cuk.a $$1) {
      super($$0, awp.bB, $$1);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      Pair<Predicate<cyc>, Consumer<cyc>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqu.e;
      } else {
         Predicate<cyc> $$4 = (Predicate<cyc>)$$3.getFirst();
         Consumer<cyc> $$5 = (Consumer<cyc>)$$3.getSecond();
         if ($$4.test($$0)) {
            cmx $$6 = $$0.o();
            $$1.a($$6, $$2, awa.mn, awb.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, btp.d($$0.p()));
               }
            }

            return bqu.a($$1.B);
         } else {
            return bqu.e;
         }
      }
   }

   public static Consumer<cyc> a(dsc $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dwv.c, $$1.a(), dwv.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cyc> a(dsc $$0, dbx $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dwv.c, $$2.a(), dwv.a.a($$2.o(), $$0));
         dez.a($$2.q(), $$2.a(), $$2.k(), new cup($$1));
      };
   }

   public static boolean b(cyc $$0) {
      return $$0.k() != je.a && $$0.q().a_($$0.a().c()).i();
   }
}
