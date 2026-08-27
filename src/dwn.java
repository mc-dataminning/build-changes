import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dwn extends duy {
   public static final Codec<dwn> d = a(dwn::new);

   public dwn(duz.c $$0) {
      super(dwm::new, 21, 21, $$0);
   }

   @Override
   public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, dvo $$6) {
      Set<gu> $$7 = ase.a(hz::i);

      for (dvd $$8 : $$6.c()) {
         if ($$8 instanceof dwm $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<gu> $$10 = new ObjectArrayList($$7.stream().toList());
      aru $$11 = aru.a($$0.A()).e().a($$6.b().f());
      ac.b($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         gu $$13 = (gu)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, csn.I.n(), 2);
         }
      }
   }

   private static void a(dur $$0, cqg $$1, gu $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, csn.J.n(), 2);
         $$1.a($$2, dco.N).ifPresent($$1x -> $$1x.a(ecf.aD, $$2.a()));
      }
   }

   @Override
   public dvi<?> e() {
      return dvi.b;
   }
}
