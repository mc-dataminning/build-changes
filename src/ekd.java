import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ekd extends eih {
   public static final MapCodec<ekd> d = a(ekd::new);

   public ekd(eii.c $$0) {
      super(ekc::new, 21, 21, $$0);
   }

   @Override
   public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, eix $$6) {
      Set<iz> $$7 = azp.a(kd::i);

      for (eim $$8 : $$6.c()) {
         if ($$8 instanceof ekc $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iz> $$10 = new ObjectArrayList($$7.stream().toList());
      azf $$11 = azf.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iz $$13 = (iz)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dez.I.o(), 2);
         }
      }
   }

   private static void a(eia $$0, dcr $$1, iz $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dez.J.o(), 2);
         $$1.a($$2, dph.N).ifPresent($$1x -> $$1x.a(eqc.be, $$2.a()));
      }
   }

   @Override
   public eir<?> e() {
      return eir.b;
   }
}
