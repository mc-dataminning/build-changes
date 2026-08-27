import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class elo extends ejs {
   public static final Codec<elo> d = a(elo::new);

   public elo(ejt.d $$0) {
      super(eln::new, 21, 21, $$0);
   }

   @Override
   public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, eki $$6) {
      Set<ir> $$7 = azd.a(jv::i);

      for (ejx $$8 : $$6.c()) {
         if ($$8 instanceof eln $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ir> $$10 = new ObjectArrayList($$7.stream().toList());
      ayt $$11 = ayt.a($$0.C()).e().a($$6.b().g());
      ad.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ir $$13 = (ir)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dfe.an.n(), 2);
         }
      }
   }

   private static void a(ejl $$0, dcv $$1, ir $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dfe.ap.n(), 2);
         $$1.a($$2, dqe.O).ifPresent($$1x -> $$1x.a(ern.bn, $$2.a()));
      }
   }

   @Override
   public ekc<?> f() {
      return ekc.b;
   }
}
