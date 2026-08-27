import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eeb extends ecf {
   public static final Codec<eeb> d = a(eeb::new);

   public eeb(ecg.c $$0) {
      super(eea::new, 21, 21, $$0);
   }

   @Override
   public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ecv $$6) {
      Set<ib> $$7 = axd.a(jf::i);

      for (eck $$8 : $$6.c()) {
         if ($$8 instanceof eea $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ib> $$10 = new ObjectArrayList($$7.stream().toList());
      awt $$11 = awt.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ib $$13 = (ib)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, czh.I.o(), 2);
         }
      }
   }

   private static void a(eby $$0, cwz $$1, ib $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, czh.J.o(), 2);
         $$1.a($$2, djn.N).ifPresent($$1x -> $$1x.a(ejw.aP, $$2.a()));
      }
   }

   @Override
   public ecp<?> e() {
      return ecp.b;
   }
}
