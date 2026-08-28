import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eph extends enk {
   public static final MapCodec<eph> d = a(eph::new);

   public eph(enl.c $$0) {
      super(epg::new, 21, 21, $$0);
   }

   @Override
   public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, eoa $$6) {
      Set<ji> $$7 = azr.a(km::i);

      for (enp $$8 : $$6.c()) {
         if ($$8 instanceof epg $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ji> $$10 = new ObjectArrayList($$7.stream().toList());
      azh $$11 = azh.a($$0.E()).e().a($$6.b().g());
      af.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ji $$13 = (ji)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, djn.L.m(), 2);
         }
      }
   }

   private static void a(end $$0, dhf $$1, ji $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, djn.M.m(), 2);
         $$1.a($$2, dua.O).ifPresent($$1x -> $$1x.a(evm.aY, $$2.a()));
      }
   }

   @Override
   public enu<?> e() {
      return enu.b;
   }
}
