import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ete extends erh {
   public static final MapCodec<ete> d = a(ete::new);

   public ete(eri.c $$0) {
      super(etd::new, 21, 21, $$0);
   }

   @Override
   public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, erx $$6) {
      Set<iv> $$7 = bag.a(ka::i);

      for (erm $$8 : $$6.c()) {
         if ($$8 instanceof etd $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iv> $$10 = new ObjectArrayList($$7.stream().toList());
      azv $$11 = azv.a($$0.E()).e().a($$6.b().g());
      ag.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iv $$13 = (iv)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dmo.L.m(), 2);
         }
      }
   }

   private static void a(era $$0, dkg $$1, iv $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dmo.M.m(), 2);
         $$1.a($$2, dxo.O).ifPresent($$1x -> $$1x.a(ezk.aY, $$2.a()));
      }
   }

   @Override
   public err<?> e() {
      return err.b;
   }
}
