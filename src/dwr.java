import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dwr extends dvc {
   public static final Codec<dwr> d = a(dwr::new);

   public dwr(dvd.c $$0) {
      super(dwq::new, 21, 21, $$0);
   }

   @Override
   public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, dvs $$6) {
      Set<gw> $$7 = ash.a(ib::i);

      for (dvh $$8 : $$6.c()) {
         if ($$8 instanceof dwq $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<gw> $$10 = new ObjectArrayList($$7.stream().toList());
      arx $$11 = arx.a($$0.A()).e().a($$6.b().f());
      ac.b($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         gw $$13 = (gw)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, csr.I.n(), 2);
         }
      }
   }

   private static void a(duv $$0, cqk $$1, gw $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, csr.J.n(), 2);
         $$1.a($$2, dcs.N).ifPresent($$1x -> $$1x.a(ecj.aD, $$2.a()));
      }
   }

   @Override
   public dvm<?> e() {
      return dvm.b;
   }
}
