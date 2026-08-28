import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class enc extends elf {
   public static final MapCodec<enc> d = a(enc::new);

   public enc(elg.c $$0) {
      super(enb::new, 21, 21, $$0);
   }

   @Override
   public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, elv $$6) {
      Set<jf> $$7 = azx.a(kj::i);

      for (elk $$8 : $$6.c()) {
         if ($$8 instanceof enb $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jf> $$10 = new ObjectArrayList($$7.stream().toList());
      azn $$11 = azn.a($$0.C()).e().a($$6.b().g());
      ad.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jf $$13 = (jf)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dho.I.n(), 2);
         }
      }
   }

   private static void a(eky $$0, dfg $$1, jf $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dho.J.n(), 2);
         $$1.a($$2, drx.N).ifPresent($$1x -> $$1x.a(eth.aU, $$2.a()));
      }
   }

   @Override
   public elp<?> e() {
      return elp.b;
   }
}
