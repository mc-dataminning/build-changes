import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class etz extends esc {
   public static final MapCodec<etz> d = a(etz::new);

   public etz(esd.c $$0) {
      super(ety::new, 21, 21, $$0);
   }

   @Override
   public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, ess $$6) {
      Set<iw> $$7 = bak.a(kb::i);

      for (esh $$8 : $$6.c()) {
         if ($$8 instanceof ety $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iw> $$10 = new ObjectArrayList($$7.stream().toList());
      azz $$11 = azz.a($$0.E()).e().a($$6.b().g());
      ag.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iw $$13 = (iw)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dng.L.m(), 2);
         }
      }
   }

   private static void a(erv $$0, dky $$1, iw $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dng.M.m(), 2);
         $$1.a($$2, dyg.O).ifPresent($$1x -> $$1x.a(faf.aY, $$2.a()));
      }
   }

   @Override
   public esm<?> e() {
      return esm.b;
   }
}
