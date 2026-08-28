import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ent extends elw {
   public static final MapCodec<ent> d = a(ent::new);

   public ent(elx.c $$0) {
      super(ens::new, 21, 21, $$0);
   }

   @Override
   public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, emm $$6) {
      Set<jh> $$7 = bac.a(kl::i);

      for (emb $$8 : $$6.c()) {
         if ($$8 instanceof ens $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jh> $$10 = new ObjectArrayList($$7.stream().toList());
      azs $$11 = azs.a($$0.C()).e().a($$6.b().g());
      ae.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jh $$13 = (jh)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dig.I.m(), 2);
         }
      }
   }

   private static void a(elp $$0, dfy $$1, jh $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dig.J.m(), 2);
         $$1.a($$2, dso.N).ifPresent($$1x -> $$1x.a(ety.aY, $$2.a()));
      }
   }

   @Override
   public emg<?> e() {
      return emg.b;
   }
}
