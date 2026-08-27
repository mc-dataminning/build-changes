import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dxo extends dvz {
   public static final Codec<dxo> d = a(dxo::new);

   public dxo(dwa.c $$0) {
      super(dxn::new, 21, 21, $$0);
   }

   @Override
   public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, dwp $$6) {
      Set<ht> $$7 = ato.a(iw::i);

      for (dwe $$8 : $$6.c()) {
         if ($$8 instanceof dxn $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ht> $$10 = new ObjectArrayList($$7.stream().toList());
      ate $$11 = ate.a($$0.A()).e().a($$6.b().f());
      ac.b($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ht $$13 = (ht)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cuc.I.o(), 2);
         }
      }
   }

   private static void a(dvs $$0, crt $$1, ht $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cuc.J.o(), 2);
         $$1.a($$2, ddz.N).ifPresent($$1x -> $$1x.a(edg.aD, $$2.a()));
      }
   }

   @Override
   public dwj<?> e() {
      return dwj.b;
   }
}
