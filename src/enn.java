import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class enn extends elq {
   public static final MapCodec<enn> d = a(enn::new);

   public enn(elr.c $$0) {
      super(enm::new, 21, 21, $$0);
   }

   @Override
   public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, emg $$6) {
      Set<jg> $$7 = bab.a(kk::i);

      for (elv $$8 : $$6.c()) {
         if ($$8 instanceof enm $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jg> $$10 = new ObjectArrayList($$7.stream().toList());
      azr $$11 = azr.a($$0.C()).e().a($$6.b().g());
      ad.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jg $$13 = (jg)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dia.I.m(), 2);
         }
      }
   }

   private static void a(elj $$0, dfs $$1, jg $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dia.J.m(), 2);
         $$1.a($$2, dsi.N).ifPresent($$1x -> $$1x.a(ets.aU, $$2.a()));
      }
   }

   @Override
   public ema<?> e() {
      return ema.b;
   }
}
