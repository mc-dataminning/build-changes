import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ecz extends ebd {
   public static final Codec<ecz> d = a(ecz::new);

   public ecz(ebe.c $$0) {
      super(ecy::new, 21, 21, $$0);
   }

   @Override
   public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, ebt $$6) {
      Set<hz> $$7 = awz.a(jd::i);

      for (ebi $$8 : $$6.c()) {
         if ($$8 instanceof ecy $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<hz> $$10 = new ObjectArrayList($$7.stream().toList());
      awo $$11 = awo.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         hz $$13 = (hz)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cyq.I.o(), 2);
         }
      }
   }

   private static void a(eaw $$0, cwi $$1, hz $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cyq.J.o(), 2);
         $$1.a($$2, div.N).ifPresent($$1x -> $$1x.a(eit.aP, $$2.a()));
      }
   }

   @Override
   public ebn<?> e() {
      return ebn.b;
   }
}
