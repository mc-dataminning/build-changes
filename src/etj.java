import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class etj extends erm {
   public static final MapCodec<etj> d = a(etj::new);

   public etj(ern.c $$0) {
      super(eti::new, 21, 21, $$0);
   }

   @Override
   public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, esc $$6) {
      Set<iv> $$7 = bag.a(ka::i);

      for (err $$8 : $$6.c()) {
         if ($$8 instanceof eti $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iv> $$10 = new ObjectArrayList($$7.stream().toList());
      azv $$11 = azv.a($$0.E()).e().a($$6.b().g());
      ag.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iv $$13 = (iv)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dmt.L.m(), 2);
         }
      }
   }

   private static void a(erf $$0, dkl $$1, iv $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dmt.M.m(), 2);
         $$1.a($$2, dxt.O).ifPresent($$1x -> $$1x.a(ezp.aY, $$2.a()));
      }
   }

   @Override
   public erw<?> e() {
      return erw.b;
   }
}
