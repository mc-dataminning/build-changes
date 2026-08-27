import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eaj extends dyn {
   public static final Codec<eaj> d = a(eaj::new);

   public eaj(dyo.c $$0) {
      super(eai::new, 21, 21, $$0);
   }

   @Override
   public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, dzd $$6) {
      Set<hv> $$7 = auq.a(iz::i);

      for (dys $$8 : $$6.c()) {
         if ($$8 instanceof eai $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<hv> $$10 = new ObjectArrayList($$7.stream().toList());
      auf $$11 = auf.a($$0.B()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         hv $$13 = (hv)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cwb.I.o(), 2);
         }
      }
   }

   private static void a(dyg $$0, ctt $$1, hv $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cwb.J.o(), 2);
         $$1.a($$2, dgf.N).ifPresent($$1x -> $$1x.a(egc.aP, $$2.a()));
      }
   }

   @Override
   public dyx<?> e() {
      return dyx.b;
   }
}
