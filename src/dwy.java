import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dwy extends dvj {
   public static final Codec<dwy> d = a(dwy::new);

   public dwy(dvk.c $$0) {
      super(dwx::new, 21, 21, $$0);
   }

   @Override
   public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, dvz $$6) {
      Set<gw> $$7 = aso.a(ib::i);

      for (dvo $$8 : $$6.c()) {
         if ($$8 instanceof dwx $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<gw> $$10 = new ObjectArrayList($$7.stream().toList());
      ase $$11 = ase.a($$0.A()).e().a($$6.b().f());
      ac.b($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         gw $$13 = (gw)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, csy.I.n(), 2);
         }
      }
   }

   private static void a(dvc $$0, cqr $$1, gw $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, csy.J.n(), 2);
         $$1.a($$2, dcz.N).ifPresent($$1x -> $$1x.a(ecq.aD, $$2.a()));
      }
   }

   @Override
   public dvt<?> e() {
      return dvt.b;
   }
}
