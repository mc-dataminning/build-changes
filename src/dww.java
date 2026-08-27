import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dww extends dvh {
   public static final Codec<dww> d = a(dww::new);

   public dww(dvi.c $$0) {
      super(dwv::new, 21, 21, $$0);
   }

   @Override
   public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5, dvx $$6) {
      Set<gw> $$7 = asm.a(hy::i);

      for (dvm $$8 : $$6.c()) {
         if ($$8 instanceof dwv $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<gw> $$10 = new ObjectArrayList($$7.stream().toList());
      asc $$11 = asc.a($$0.A()).e().a($$6.b().f());
      ac.b($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         gw $$13 = (gw)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, csw.I.n(), 2);
         }
      }
   }

   private static void a(dva $$0, cqp $$1, gw $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, csw.J.n(), 2);
         $$1.a($$2, dcx.N).ifPresent($$1x -> $$1x.a(eco.aD, $$2.a()));
      }
   }

   @Override
   public dvr<?> e() {
      return dvr.b;
   }
}
