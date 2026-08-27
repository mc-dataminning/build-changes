import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ebj extends dzn {
   public static final Codec<ebj> d = a(ebj::new);

   public ebj(dzo.c $$0) {
      super(ebi::new, 21, 21, $$0);
   }

   @Override
   public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, ead $$6) {
      Set<hx> $$7 = avi.a(jb::i);

      for (dzs $$8 : $$6.c()) {
         if ($$8 instanceof ebi $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<hx> $$10 = new ObjectArrayList($$7.stream().toList());
      auw $$11 = auw.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         hx $$13 = (hx)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cxa.I.o(), 2);
         }
      }
   }

   private static void a(dzg $$0, cus $$1, hx $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cxa.J.o(), 2);
         $$1.a($$2, dhf.N).ifPresent($$1x -> $$1x.a(ehd.aP, $$2.a()));
      }
   }

   @Override
   public dzx<?> e() {
      return dzx.b;
   }
}
