import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eex extends edb {
   public static final Codec<eex> d = a(eex::new);

   public eex(edc.c $$0) {
      super(eew::new, 21, 21, $$0);
   }

   @Override
   public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, edr $$6) {
      Set<ib> $$7 = axn.a(jg::i);

      for (edg $$8 : $$6.c()) {
         if ($$8 instanceof eew $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ib> $$10 = new ObjectArrayList($$7.stream().toList());
      axd $$11 = axd.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ib $$13 = (ib)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dac.I.o(), 2);
         }
      }
   }

   private static void a(ecu $$0, cxu $$1, ib $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dac.J.o(), 2);
         $$1.a($$2, dki.N).ifPresent($$1x -> $$1x.a(eks.aP, $$2.a()));
      }
   }

   @Override
   public edl<?> e() {
      return edl.b;
   }
}
