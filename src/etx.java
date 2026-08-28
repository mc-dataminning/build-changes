import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class etx extends esa {
   public static final MapCodec<etx> d = a(etx::new);

   public etx(esb.c $$0) {
      super(etw::new, 21, 21, $$0);
   }

   @Override
   public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, esq $$6) {
      Set<iv> $$7 = bai.a(ka::i);

      for (esf $$8 : $$6.c()) {
         if ($$8 instanceof etw $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iv> $$10 = new ObjectArrayList($$7.stream().toList());
      azx $$11 = azx.a($$0.E()).e().a($$6.b().g());
      ag.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iv $$13 = (iv)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dne.L.m(), 2);
         }
      }
   }

   private static void a(ert $$0, dkw $$1, iv $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dne.M.m(), 2);
         $$1.a($$2, dye.O).ifPresent($$1x -> $$1x.a(fad.aY, $$2.a()));
      }
   }

   @Override
   public esk<?> e() {
      return esk.b;
   }
}
