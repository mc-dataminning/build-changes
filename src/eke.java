import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eke extends eii {
   public static final MapCodec<eke> d = a(eke::new);

   public eke(eij.c $$0) {
      super(ekd::new, 21, 21, $$0);
   }

   @Override
   public void a(dcs $$0, dcq $$1, dty $$2, azg $$3, eib $$4, dbe $$5, eiy $$6) {
      Set<iz> $$7 = azq.a(kd::i);

      for (ein $$8 : $$6.c()) {
         if ($$8 instanceof ekd $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iz> $$10 = new ObjectArrayList($$7.stream().toList());
      azg $$11 = azg.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iz $$13 = (iz)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dfa.I.o(), 2);
         }
      }
   }

   private static void a(eib $$0, dcs $$1, iz $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dfa.J.o(), 2);
         $$1.a($$2, dpi.N).ifPresent($$1x -> $$1x.a(eqd.be, $$2.a()));
      }
   }

   @Override
   public eis<?> e() {
      return eis.b;
   }
}
