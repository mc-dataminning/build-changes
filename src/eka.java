import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eka extends eie {
   public static final MapCodec<eka> d = a(eka::new);

   public eka(eif.c $$0) {
      super(ejz::new, 21, 21, $$0);
   }

   @Override
   public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, eiu $$6) {
      Set<iz> $$7 = azm.a(kd::i);

      for (eij $$8 : $$6.c()) {
         if ($$8 instanceof ejz $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iz> $$10 = new ObjectArrayList($$7.stream().toList());
      azc $$11 = azc.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iz $$13 = (iz)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dew.I.n(), 2);
         }
      }
   }

   private static void a(ehx $$0, dco $$1, iz $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dew.J.n(), 2);
         $$1.a($$2, dpe.N).ifPresent($$1x -> $$1x.a(epz.be, $$2.a()));
      }
   }

   @Override
   public eio<?> e() {
      return eio.b;
   }
}
