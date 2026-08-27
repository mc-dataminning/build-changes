import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dyq extends dwu {
   public static final Codec<dyq> d = a(dyq::new);

   public dyq(dwv.c $$0) {
      super(dyp::new, 21, 21, $$0);
   }

   @Override
   public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, dxk $$6) {
      Set<ht> $$7 = aty.a(iw::i);

      for (dwz $$8 : $$6.c()) {
         if ($$8 instanceof dyp $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ht> $$10 = new ObjectArrayList($$7.stream().toList());
      ato $$11 = ato.a($$0.A()).e().a($$6.b().f());
      ac.b($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ht $$13 = (ht)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cuv.I.o(), 2);
         }
      }
   }

   private static void a(dwn $$0, csm $$1, ht $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cuv.J.o(), 2);
         $$1.a($$2, det.N).ifPresent($$1x -> $$1x.a(eej.aD, $$2.a()));
      }
   }

   @Override
   public dxe<?> e() {
      return dxe.b;
   }
}
