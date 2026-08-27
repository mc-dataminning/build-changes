import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dwq extends dvb {
   public static final Codec<dwq> d = a(dwq::new);

   public dwq(dvc.c $$0) {
      super(dwp::new, 21, 21, $$0);
   }

   @Override
   public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, dvr $$6) {
      Set<gw> $$7 = asr.a(hy::i);

      for (dvg $$8 : $$6.c()) {
         if ($$8 instanceof dwp $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<gw> $$10 = new ObjectArrayList($$7.stream().toList());
      ash $$11 = ash.a($$0.A()).e().a($$6.b().f());
      ac.b($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         gw $$13 = (gw)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cte.I.o(), 2);
         }
      }
   }

   private static void a(duu $$0, cqv $$1, gw $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cte.J.o(), 2);
         $$1.a($$2, ddb.N).ifPresent($$1x -> $$1x.a(eci.aD, $$2.a()));
      }
   }

   @Override
   public dvl<?> e() {
      return dvl.b;
   }
}
