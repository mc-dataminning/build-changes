import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ebb extends dzf {
   public static final Codec<ebb> d = a(ebb::new);

   public ebb(dzg.c $$0) {
      super(eba::new, 21, 21, $$0);
   }

   @Override
   public void a(cuk $$0, cui $$1, dle $$2, auv $$3, dyy $$4, csw $$5, dzv $$6) {
      Set<hx> $$7 = avh.a(jb::i);

      for (dzk $$8 : $$6.c()) {
         if ($$8 instanceof eba $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<hx> $$10 = new ObjectArrayList($$7.stream().toList());
      auv $$11 = auv.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         hx $$13 = (hx)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cws.I.o(), 2);
         }
      }
   }

   private static void a(dyy $$0, cuk $$1, hx $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cws.J.o(), 2);
         $$1.a($$2, dgx.N).ifPresent($$1x -> $$1x.a(egu.aP, $$2.a()));
      }
   }

   @Override
   public dzp<?> e() {
      return dzp.b;
   }
}
