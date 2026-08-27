import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ehl extends efp {
   public static final Codec<ehl> d = a(ehl::new);

   public ehl(efq.c $$0) {
      super(ehk::new, 21, 21, $$0);
   }

   @Override
   public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, egf $$6) {
      Set<id> $$7 = ayd.a(ji::i);

      for (efu $$8 : $$6.c()) {
         if ($$8 instanceof ehk $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<id> $$10 = new ObjectArrayList($$7.stream().toList());
      axt $$11 = axt.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         id $$13 = (id)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dcj.I.n(), 2);
         }
      }
   }

   private static void a(efi $$0, dab $$1, id $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dcj.J.n(), 2);
         $$1.a($$2, dmq.N).ifPresent($$1x -> $$1x.a(eni.aR, $$2.a()));
      }
   }

   @Override
   public efz<?> e() {
      return efz.b;
   }
}
