import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dzh extends dxl {
   public static final Codec<dzh> d = a(dzh::new);

   public dzh(dxm.c $$0) {
      super(dzg::new, 21, 21, $$0);
   }

   @Override
   public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, dyb $$6) {
      Set<hx> $$7 = auh.a(ja::i);

      for (dxq $$8 : $$6.c()) {
         if ($$8 instanceof dzg $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<hx> $$10 = new ObjectArrayList($$7.stream().toList());
      atw $$11 = atw.a($$0.B()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         hx $$13 = (hx)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cvh.I.o(), 2);
         }
      }
   }

   private static void a(dxe $$0, csz $$1, hx $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cvh.J.o(), 2);
         $$1.a($$2, dfk.N).ifPresent($$1x -> $$1x.a(efa.aD, $$2.a()));
      }
   }

   @Override
   public dxv<?> e() {
      return dxv.b;
   }
}
