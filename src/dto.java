import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dto extends drz {
   public static final Codec<dto> d = a(dto::new);

   public dto(dsa.c $$0) {
      super(dtn::new, 21, 21, $$0);
   }

   @Override
   public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, dsp $$6) {
      Set<gu> $$7 = apo.a(hz::i);

      for (dse $$8 : $$6.c()) {
         if ($$8 instanceof dtn $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<gu> $$10 = new ObjectArrayList($$7.stream().toList());
      apf $$11 = apf.a($$0.A()).e().a($$6.b().f());
      ac.b($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         gu $$13 = (gu)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cpo.I.n(), 2);
         }
      }
   }

   private static void a(drs $$0, cng $$1, gu $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cpo.J.n(), 2);
         $$1.a($$2, czp.N).ifPresent($$1x -> $$1x.a(dzg.aD, $$2.a()));
      }
   }

   @Override
   public dsj<?> e() {
      return dsj.b;
   }
}
