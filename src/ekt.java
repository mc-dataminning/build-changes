import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ekt extends eiw {
   public static final MapCodec<ekt> d = a(ekt::new);

   public ekt(eix.c $$0) {
      super(eks::new, 21, 21, $$0);
   }

   @Override
   public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ejm $$6) {
      Set<ja> $$7 = ayy.a(ke::i);

      for (ejb $$8 : $$6.c()) {
         if ($$8 instanceof eks $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ja> $$10 = new ObjectArrayList($$7.stream().toList());
      ayo $$11 = ayo.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ja $$13 = (ja)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dfk.I.o(), 2);
         }
      }
   }

   private static void a(eip $$0, ddc $$1, ja $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dfk.J.o(), 2);
         $$1.a($$2, dps.N).ifPresent($$1x -> $$1x.a(eqs.be, $$2.a()));
      }
   }

   @Override
   public ejg<?> e() {
      return ejg.b;
   }
}
