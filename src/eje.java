import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eje extends ehi {
   public static final MapCodec<eje> d = a(eje::new);

   public eje(ehj.c $$0) {
      super(ejd::new, 21, 21, $$0);
   }

   @Override
   public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, ehy $$6) {
      Set<io> $$7 = ayu.a(js::i);

      for (ehn $$8 : $$6.c()) {
         if ($$8 instanceof ejd $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<io> $$10 = new ObjectArrayList($$7.stream().toList());
      ayk $$11 = ayk.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         io $$13 = (io)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dea.I.n(), 2);
         }
      }
   }

   private static void a(ehb $$0, dbs $$1, io $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dea.J.n(), 2);
         $$1.a($$2, doi.N).ifPresent($$1x -> $$1x.a(epd.bc, $$2.a()));
      }
   }

   @Override
   public ehs<?> e() {
      return ehs.b;
   }
}
