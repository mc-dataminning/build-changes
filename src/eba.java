import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eba extends dze {
   public static final Codec<eba> d = a(eba::new);

   public eba(dzf.c $$0) {
      super(eaz::new, 21, 21, $$0);
   }

   @Override
   public void a(cuj $$0, cuh $$1, dld $$2, auu $$3, dyx $$4, csv $$5, dzu $$6) {
      Set<hx> $$7 = avg.a(jb::i);

      for (dzj $$8 : $$6.c()) {
         if ($$8 instanceof eaz $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<hx> $$10 = new ObjectArrayList($$7.stream().toList());
      auu $$11 = auu.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         hx $$13 = (hx)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cwr.I.o(), 2);
         }
      }
   }

   private static void a(dyx $$0, cuj $$1, hx $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cwr.J.o(), 2);
         $$1.a($$2, dgw.N).ifPresent($$1x -> $$1x.a(egt.aP, $$2.a()));
      }
   }

   @Override
   public dzo<?> e() {
      return dzo.b;
   }
}
