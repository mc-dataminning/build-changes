import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eqf extends eoi {
   public static final MapCodec<eqf> d = a(eqf::new);

   public eqf(eoj.c $$0) {
      super(eqe::new, 21, 21, $$0);
   }

   @Override
   public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, eoy $$6) {
      Set<ji> $$7 = azr.a(km::i);

      for (eon $$8 : $$6.c()) {
         if ($$8 instanceof eqe $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ji> $$10 = new ObjectArrayList($$7.stream().toList());
      azh $$11 = azh.a($$0.E()).e().a($$6.b().g());
      af.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ji $$13 = (ji)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dkg.L.m(), 2);
         }
      }
   }

   private static void a(eob $$0, dhy $$1, ji $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dkg.M.m(), 2);
         $$1.a($$2, duu.O).ifPresent($$1x -> $$1x.a(ewk.aY, $$2.a()));
      }
   }

   @Override
   public eos<?> e() {
      return eos.b;
   }
}
