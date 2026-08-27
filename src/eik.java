import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eik extends ego {
   public static final Codec<eik> d = a(eik::new);

   public eik(egp.c $$0) {
      super(eij::new, 21, 21, $$0);
   }

   @Override
   public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, ehe $$6) {
      Set<in> $$7 = ayq.a(jr::i);

      for (egt $$8 : $$6.c()) {
         if ($$8 instanceof eij $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<in> $$10 = new ObjectArrayList($$7.stream().toList());
      ayg $$11 = ayg.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         in $$13 = (in)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, ddg.I.n(), 2);
         }
      }
   }

   private static void a(egh $$0, day $$1, in $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, ddg.J.n(), 2);
         $$1.a($$2, dno.N).ifPresent($$1x -> $$1x.a(eoj.aU, $$2.a()));
      }
   }

   @Override
   public egy<?> e() {
      return egy.b;
   }
}
