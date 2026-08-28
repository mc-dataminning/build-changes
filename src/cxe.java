import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cxe extends cwh {
   protected static final Map<dkl, Pair<Predicate<dbh>, Consumer<dbh>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dkn.i,
         Pair.of(cxe::b, a(dkn.cK.m())),
         dkn.kZ,
         Pair.of(cxe::b, a(dkn.cK.m())),
         dkn.j,
         Pair.of(cxe::b, a(dkn.cK.m())),
         dkn.k,
         Pair.of(cxe::b, a(dkn.j.m())),
         dkn.tc,
         Pair.of((Predicate<dbh>)$$0 -> true, a(dkn.j.m(), cxs.dY))
      )
   );

   public cxe(czf $$0, float $$1, float $$2, cxk.a $$3) {
      super($$0, axu.bD, $$1, $$2, $$3);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      Pair<Predicate<dbh>, Consumer<dbh>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bti.e;
      } else {
         Predicate<dbh> $$4 = (Predicate<dbh>)$$3.getFirst();
         Consumer<dbh> $$5 = (Consumer<dbh>)$$3.getSecond();
         if ($$4.test($$0)) {
            cpw $$6 = $$0.o();
            $$1.a($$6, $$2, axf.mF, axg.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bwf.d($$0.p()));
               }
            }

            return bti.a;
         } else {
            return bti.e;
         }
      }
   }

   public static Consumer<dbh> a(dxu $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ecq.c, $$1.a(), ecq.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dbh> a(dxu $$0, dhg $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ecq.c, $$2.a(), ecq.a.a($$2.o(), $$0));
         dkl.a($$2.q(), $$2.a(), $$2.k(), new cxo($$1));
      };
   }

   public static boolean b(dbh $$0) {
      return $$0.k() != jm.a && $$0.q().a_($$0.a().d()).l();
   }
}
