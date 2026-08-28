import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ekl extends eip {
   public static final MapCodec<ekl> d = a(ekl::new);

   public ekl(eiq.c $$0) {
      super(ekk::new, 21, 21, $$0);
   }

   @Override
   public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ejf $$6) {
      Set<ja> $$7 = ayw.a(ke::i);

      for (eiu $$8 : $$6.c()) {
         if ($$8 instanceof ekk $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ja> $$10 = new ObjectArrayList($$7.stream().toList());
      aym $$11 = aym.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ja $$13 = (ja)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dfh.I.o(), 2);
         }
      }
   }

   private static void a(eii $$0, dcz $$1, ja $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dfh.J.o(), 2);
         $$1.a($$2, dpp.N).ifPresent($$1x -> $$1x.a(eqk.be, $$2.a()));
      }
   }

   @Override
   public eiz<?> e() {
      return eiz.b;
   }
}
