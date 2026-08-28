import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eqg extends eoj {
   public static final MapCodec<eqg> d = a(eqg::new);

   public eqg(eok.c $$0) {
      super(eqf::new, 21, 21, $$0);
   }

   @Override
   public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, eoz $$6) {
      Set<jh> $$7 = baw.a(kl::i);

      for (eoo $$8 : $$6.c()) {
         if ($$8 instanceof eqf $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jh> $$10 = new ObjectArrayList($$7.stream().toList());
      bam $$11 = bam.a($$0.D()).e().a($$6.b().g());
      ae.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jh $$13 = (jh)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dko.L.m(), 2);
         }
      }
   }

   private static void a(eoc $$0, dig $$1, jh $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dko.M.m(), 2);
         $$1.a($$2, duz.O).ifPresent($$1x -> $$1x.a(ewl.aY, $$2.a()));
      }
   }

   @Override
   public eot<?> e() {
      return eot.b;
   }
}
