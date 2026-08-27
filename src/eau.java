import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eau extends dyy {
   public static final Codec<eau> d = a(eau::new);

   public eau(dyz.c $$0) {
      super(eat::new, 21, 21, $$0);
   }

   @Override
   public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, dzo $$6) {
      Set<hx> $$7 = avb.a(jb::i);

      for (dzd $$8 : $$6.c()) {
         if ($$8 instanceof eat $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<hx> $$10 = new ObjectArrayList($$7.stream().toList());
      aup $$11 = aup.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         hx $$13 = (hx)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cwl.I.o(), 2);
         }
      }
   }

   private static void a(dyr $$0, cud $$1, hx $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cwl.J.o(), 2);
         $$1.a($$2, dgq.N).ifPresent($$1x -> $$1x.a(egn.aP, $$2.a()));
      }
   }

   @Override
   public dzi<?> e() {
      return dzi.b;
   }
}
