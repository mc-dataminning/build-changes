import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class esp extends eqs {
   public static final MapCodec<esp> d = a(esp::new);

   public esp(eqt.c $$0) {
      super(eso::new, 21, 21, $$0);
   }

   @Override
   public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, eri $$6) {
      Set<iu> $$7 = bag.a(jz::i);

      for (eqx $$8 : $$6.c()) {
         if ($$8 instanceof eso $$9) {
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
            $$0.a($$13, dmc.L.m(), 2);
         }
      }
   }

   private static void a(eql $$0, dju $$1, iu $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dmc.M.m(), 2);
         $$1.a($$2, dwz.O).ifPresent($$1x -> $$1x.a(eyv.aY, $$2.a()));
      }
   }

   @Override
   public erc<?> e() {
      return erc.b;
   }
}
