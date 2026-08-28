import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ekg extends eik {
   public static final MapCodec<ekg> d = a(ekg::new);

   public ekg(eil.c $$0) {
      super(ekf::new, 21, 21, $$0);
   }

   @Override
   public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, eja $$6) {
      Set<iz> $$7 = azr.a(kd::i);

      for (eip $$8 : $$6.c()) {
         if ($$8 instanceof ekf $$9) {
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
            $$0.a($$13, dfc.I.o(), 2);
         }
      }
   }

   private static void a(eid $$0, dcu $$1, iz $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dfc.J.o(), 2);
         $$1.a($$2, dpk.N).ifPresent($$1x -> $$1x.a(eqf.be, $$2.a()));
      }
   }

   @Override
   public eiu<?> e() {
      return eiu.b;
   }
}
