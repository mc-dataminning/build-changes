import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class emy extends elb {
   public static final MapCodec<emy> d = a(emy::new);

   public emy(elc.c $$0) {
      super(emx::new, 21, 21, $$0);
   }

   @Override
   public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, elr $$6) {
      Set<je> $$7 = azv.a(ki::i);

      for (elg $$8 : $$6.c()) {
         if ($$8 instanceof emx $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<je> $$10 = new ObjectArrayList($$7.stream().toList());
      azl $$11 = azl.a($$0.C()).e().a($$6.b().g());
      ad.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         je $$13 = (je)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dhl.I.o(), 2);
         }
      }
   }

   private static void a(eku $$0, dfd $$1, je $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dhl.J.o(), 2);
         $$1.a($$2, dru.N).ifPresent($$1x -> $$1x.a(etd.aT, $$2.a()));
      }
   }

   @Override
   public ell<?> e() {
      return ell.b;
   }
}
