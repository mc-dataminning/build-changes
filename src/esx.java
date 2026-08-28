import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class esx extends era {
   public static final MapCodec<esx> d = a(esx::new);

   public esx(erb.c $$0) {
      super(esw::new, 21, 21, $$0);
   }

   @Override
   public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5, erq $$6) {
      Set<iu> $$7 = bag.a(jz::i);

      for (erf $$8 : $$6.c()) {
         if ($$8 instanceof esw $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iu> $$10 = new ObjectArrayList($$7.stream().toList());
      azv $$11 = azv.a($$0.E()).e().a($$6.b().g());
      af.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iu $$13 = (iu)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dmh.L.m(), 2);
         }
      }
   }

   private static void a(eqt $$0, djz $$1, iu $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dmh.M.m(), 2);
         $$1.a($$2, dxh.O).ifPresent($$1x -> $$1x.a(ezd.aY, $$2.a()));
      }
   }

   @Override
   public erk<?> e() {
      return erk.b;
   }
}
