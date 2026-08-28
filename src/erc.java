import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class erc extends epf {
   public static final MapCodec<erc> d = a(erc::new);

   public erc(epg.c $$0) {
      super(erb::new, 21, 21, $$0);
   }

   @Override
   public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, epv $$6) {
      Set<jj> $$7 = bac.a(kn::i);

      for (epk $$8 : $$6.c()) {
         if ($$8 instanceof erb $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jj> $$10 = new ObjectArrayList($$7.stream().toList());
      azs $$11 = azs.a($$0.E()).e().a($$6.b().g());
      af.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jj $$13 = (jj)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dkw.L.m(), 2);
         }
      }
   }

   private static void a(eoy $$0, dio $$1, jj $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dkw.M.m(), 2);
         $$1.a($$2, dvn.O).ifPresent($$1x -> $$1x.a(exh.aY, $$2.a()));
      }
   }

   @Override
   public epp<?> e() {
      return epp.b;
   }
}
