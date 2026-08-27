import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dwm extends dux {
   public static final Codec<dwm> d = a(dwm::new);

   public dwm(duy.c $$0) {
      super(dwl::new, 21, 21, $$0);
   }

   @Override
   public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, dvn $$6) {
      Set<gu> $$7 = ase.a(hz::i);

      for (dvc $$8 : $$6.c()) {
         if ($$8 instanceof dwl $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<gu> $$10 = new ObjectArrayList($$7.stream().toList());
      aru $$11 = aru.a($$0.A()).e().a($$6.b().f());
      ac.b($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         gu $$13 = (gu)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, csm.I.n(), 2);
         }
      }
   }

   private static void a(duq $$0, cqf $$1, gu $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, csm.J.n(), 2);
         $$1.a($$2, dcn.N).ifPresent($$1x -> $$1x.a(ece.aD, $$2.a()));
      }
   }

   @Override
   public dvh<?> e() {
      return dvh.b;
   }
}
