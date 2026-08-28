import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ese extends eqh {
   public static final MapCodec<ese> d = a(ese::new);

   public ese(eqi.c $$0) {
      super(esd::new, 21, 21, $$0);
   }

   @Override
   public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, eqx $$6) {
      Set<iu> $$7 = bae.a(jz::i);

      for (eqm $$8 : $$6.c()) {
         if ($$8 instanceof esd $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iu> $$10 = new ObjectArrayList($$7.stream().toList());
      azt $$11 = azt.a($$0.E()).e().a($$6.b().g());
      af.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iu $$13 = (iu)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dlw.L.m(), 2);
         }
      }
   }

   private static void a(eqa $$0, djo $$1, iu $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dlw.M.m(), 2);
         $$1.a($$2, dwp.O).ifPresent($$1x -> $$1x.a(eyj.aY, $$2.a()));
      }
   }

   @Override
   public eqr<?> e() {
      return eqr.b;
   }
}
