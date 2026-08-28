import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class enx extends ema {
   public static final MapCodec<enx> d = a(enx::new);

   public enx(emb.c $$0) {
      super(enw::new, 21, 21, $$0);
   }

   @Override
   public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, emq $$6) {
      Set<jh> $$7 = baf.a(kl::i);

      for (emf $$8 : $$6.c()) {
         if ($$8 instanceof enw $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jh> $$10 = new ObjectArrayList($$7.stream().toList());
      azv $$11 = azv.a($$0.C()).e().a($$6.b().g());
      ae.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jh $$13 = (jh)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dil.I.m(), 2);
         }
      }
   }

   private static void a(elt $$0, dgd $$1, jh $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dil.J.m(), 2);
         $$1.a($$2, dst.N).ifPresent($$1x -> $$1x.a(euc.aY, $$2.a()));
      }
   }

   @Override
   public emk<?> e() {
      return emk.b;
   }
}
