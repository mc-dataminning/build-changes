import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eib extends egf {
   public static final Codec<eib> d = a(eib::new);

   public eib(egg.c $$0) {
      super(eia::new, 21, 21, $$0);
   }

   @Override
   public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, egv $$6) {
      Set<im> $$7 = ayn.a(jq::i);

      for (egk $$8 : $$6.c()) {
         if ($$8 instanceof eia $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<im> $$10 = new ObjectArrayList($$7.stream().toList());
      ayd $$11 = ayd.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         im $$13 = (im)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dcx.I.n(), 2);
         }
      }
   }

   private static void a(efy $$0, dap $$1, im $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dcx.J.n(), 2);
         $$1.a($$2, dnf.N).ifPresent($$1x -> $$1x.a(eny.aU, $$2.a()));
      }
   }

   @Override
   public egp<?> e() {
      return egp.b;
   }
}
