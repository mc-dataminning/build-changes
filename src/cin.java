import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cin extends chk {
   protected static final Map<csq, Pair<Predicate<clk>, Consumer<clk>>> a = Maps.newHashMap(
      ImmutableMap.of(
         csr.i,
         Pair.of(cin::b, b(csr.cC.n())),
         csr.kE,
         Pair.of(cin::b, b(csr.cC.n())),
         csr.j,
         Pair.of(cin::b, b(csr.cC.n())),
         csr.k,
         Pair.of(cin::b, b(csr.j.n())),
         csr.rG,
         Pair.of((Predicate<clk>)$$0 -> true, a(csr.j.n(), cjd.ds))
      )
   );

   protected cin(ckn $$0, int $$1, float $$2, civ.a $$3) {
      super((float)$$1, $$2, $$0, apo.bA, $$3);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      Pair<Predicate<clk>, Consumer<clk>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bgt.d;
      } else {
         Predicate<clk> $$4 = (Predicate<clk>)$$3.getFirst();
         Consumer<clk> $$5 = (Consumer<clk>)$$3.getSecond();
         if ($$4.test($$0)) {
            cbp $$6 = $$0.o();
            $$1.a($$6, $$2, aoz.kL, apa.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bgt.a($$1.B);
         } else {
            return bgt.d;
         }
      }
   }

   public static Consumer<clk> b(dfe $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(djo.c, $$1.a(), djo.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<clk> a(dfe $$0, cpp $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(djo.c, $$2.a(), djo.a.a($$2.o(), $$0));
         csq.a($$2.q(), $$2.a(), $$2.k(), new cja($$1));
      };
   }

   public static boolean b(clk $$0) {
      return $$0.k() != hc.a && $$0.q().a_($$0.a().c()).i();
   }
}
