import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eoe extends emh {
   public static final MapCodec<eoe> d = a(eoe::new);

   public eoe(emi.c $$0) {
      super(eod::new, 21, 21, $$0);
   }

   @Override
   public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, emx $$6) {
      Set<jh> $$7 = bae.a(kl::i);

      for (emm $$8 : $$6.c()) {
         if ($$8 instanceof eod $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jh> $$10 = new ObjectArrayList($$7.stream().toList());
      azu $$11 = azu.a($$0.D()).e().a($$6.b().g());
      ae.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jh $$13 = (jh)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dis.I.m(), 2);
         }
      }
   }

   private static void a(ema $$0, dgk $$1, jh $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dis.J.m(), 2);
         $$1.a($$2, dta.N).ifPresent($$1x -> $$1x.a(euj.aY, $$2.a()));
      }
   }

   @Override
   public emr<?> e() {
      return emr.b;
   }
}
