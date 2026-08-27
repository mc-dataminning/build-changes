import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ejg extends ehk {
   public static final MapCodec<ejg> d = a(ejg::new);

   public ejg(ehl.c $$0) {
      super(ejf::new, 21, 21, $$0);
   }

   @Override
   public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, eia $$6) {
      Set<io> $$7 = ayw.a(js::i);

      for (ehp $$8 : $$6.c()) {
         if ($$8 instanceof ejf $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<io> $$10 = new ObjectArrayList($$7.stream().toList());
      aym $$11 = aym.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         io $$13 = (io)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dec.I.n(), 2);
         }
      }
   }

   private static void a(ehd $$0, dbu $$1, io $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dec.J.n(), 2);
         $$1.a($$2, dok.N).ifPresent($$1x -> $$1x.a(epf.bc, $$2.a()));
      }
   }

   @Override
   public ehu<?> e() {
      return ehu.b;
   }
}
