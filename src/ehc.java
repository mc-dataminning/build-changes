import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ehc extends efg {
   public static final Codec<ehc> d = a(ehc::new);

   public ehc(efh.c $$0) {
      super(ehb::new, 21, 21, $$0);
   }

   @Override
   public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, efw $$6) {
      Set<ib> $$7 = ayb.a(jg::i);

      for (efl $$8 : $$6.c()) {
         if ($$8 instanceof ehb $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ib> $$10 = new ObjectArrayList($$7.stream().toList());
      axr $$11 = axr.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ib $$13 = (ib)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dca.I.n(), 2);
         }
      }
   }

   private static void a(eez $$0, czs $$1, ib $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dca.J.n(), 2);
         $$1.a($$2, dmh.N).ifPresent($$1x -> $$1x.a(emz.aR, $$2.a()));
      }
   }

   @Override
   public efq<?> e() {
      return efq.b;
   }
}
