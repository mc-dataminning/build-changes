import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cjw extends cit {
   protected static final Map<cua, Pair<Predicate<cmt>, Consumer<cmt>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cuc.i,
         Pair.of(cjw::b, b(cuc.cC.o())),
         cuc.kE,
         Pair.of(cjw::b, b(cuc.cC.o())),
         cuc.j,
         Pair.of(cjw::b, b(cuc.cC.o())),
         cuc.k,
         Pair.of(cjw::b, b(cuc.j.o())),
         cuc.rG,
         Pair.of((Predicate<cmt>)$$0 -> true, a(cuc.j.o(), ckm.ds))
      )
   );

   protected cjw(clw $$0, int $$1, float $$2, cke.a $$3) {
      super((float)$$1, $$2, $$0, aqs.bA, $$3);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      Pair<Predicate<cmt>, Consumer<cmt>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bib.d;
      } else {
         Predicate<cmt> $$4 = (Predicate<cmt>)$$3.getFirst();
         Consumer<cmt> $$5 = (Consumer<cmt>)$$3.getSecond();
         if ($$4.test($$0)) {
            ccx $$6 = $$0.o();
            $$1.a($$6, $$2, aqd.kN, aqe.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bib.a($$1.B);
         } else {
            return bib.d;
         }
      }
   }

   public static Consumer<cmt> b(dgb $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dkl.c, $$1.a(), dkl.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cmt> a(dgb $$0, cqy $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dkl.c, $$2.a(), dkl.a.a($$2.o(), $$0));
         cua.a($$2.q(), $$2.a(), $$2.k(), new ckj($$1));
      };
   }

   public static boolean b(cmt $$0) {
      return $$0.k() != hx.a && $$0.q().a_($$0.a().c()).i();
   }
}
