import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ell extends ejo {
   public static final MapCodec<ell> d = a(ell::new);

   public ell(ejp.c $$0) {
      super(elk::new, 21, 21, $$0);
   }

   @Override
   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, eke $$6) {
      Set<jd> $$7 = azg.a(kh::i);

      for (ejt $$8 : $$6.c()) {
         if ($$8 instanceof elk $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jd> $$10 = new ObjectArrayList($$7.stream().toList());
      ayw $$11 = ayw.a($$0.C()).e().a($$6.b().g());
      ad.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jd $$13 = (jd)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dga.I.o(), 2);
         }
      }
   }

   private static void a(ejh $$0, dds $$1, jd $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dga.J.o(), 2);
         $$1.a($$2, dqj.N).ifPresent($$1x -> $$1x.a(erl.be, $$2.a()));
      }
   }

   @Override
   public ejy<?> e() {
      return ejy.b;
   }
}
