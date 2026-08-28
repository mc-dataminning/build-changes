import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cuz extends cua {
   protected static final Map<dgv, Pair<Predicate<cyy>, Consumer<cyy>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dgx.i,
         Pair.of(cuz::b, a(dgx.cC.o())),
         dgx.kE,
         Pair.of(cuz::b, a(dgx.cC.o())),
         dgx.j,
         Pair.of(cuz::b, a(dgx.cC.o())),
         dgx.k,
         Pair.of(cuz::b, a(dgx.j.o())),
         dgx.sH,
         Pair.of((Predicate<cyy>)$$0 -> true, a(dgx.j.o(), cvo.dO))
      )
   );

   public cuz(cxe $$0, float $$1, float $$2, cvg.a $$3) {
      super($$0, aws.bC, $$1, $$2, $$3);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      Pair<Predicate<cyy>, Consumer<cyy>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return brk.e;
      } else {
         Predicate<cyy> $$4 = (Predicate<cyy>)$$3.getFirst();
         Consumer<cyy> $$5 = (Consumer<cyy>)$$3.getSecond();
         if ($$4.test($$0)) {
            cnp $$6 = $$0.o();
            $$1.a($$6, $$2, awd.mo, awe.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, buf.d($$0.p()));
               }
            }

            return brk.a;
         } else {
            return brk.e;
         }
      }
   }

   public static Consumer<cyy> a(dua $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dyx.c, $$1.a(), dyx.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cyy> a(dua $$0, ddr $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dyx.c, $$2.a(), dyx.a.a($$2.o(), $$0));
         dgv.a($$2.q(), $$2.a(), $$2.k(), new cvl($$1));
      };
   }

   public static boolean b(cyy $$0) {
      return $$0.k() != jj.a && $$0.q().a_($$0.a().d()).l();
   }
}
