import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ekh extends eil {
   public static final MapCodec<ekh> d = a(ekh::new);

   public ekh(eim.c $$0) {
      super(ekg::new, 21, 21, $$0);
   }

   @Override
   public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, ejb $$6) {
      Set<iz> $$7 = azr.a(kd::i);

      for (eiq $$8 : $$6.c()) {
         if ($$8 instanceof ekg $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iz> $$10 = new ObjectArrayList($$7.stream().toList());
      azh $$11 = azh.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iz $$13 = (iz)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dfd.I.o(), 2);
         }
      }
   }

   private static void a(eie $$0, dcv $$1, iz $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dfd.J.o(), 2);
         $$1.a($$2, dpl.N).ifPresent($$1x -> $$1x.a(eqg.be, $$2.a()));
      }
   }

   @Override
   public eiv<?> e() {
      return eiv.b;
   }
}
