import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class euj extends esm {
   public static final MapCodec<euj> d = a(euj::new);

   public euj(esn.c $$0) {
      super(eui::new, 21, 21, $$0);
   }

   @Override
   public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, etc $$6) {
      Set<iw> $$7 = bat.a(kb::i);

      for (esr $$8 : $$6.c()) {
         if ($$8 instanceof eui $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<iw> $$10 = new ObjectArrayList($$7.stream().toList());
      bai $$11 = bai.a($$0.E()).e().a($$6.b().g());
      ag.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         iw $$13 = (iw)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dnq.L.m(), 2);
         }
      }
   }

   private static void a(esf $$0, dli $$1, iw $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dnq.M.m(), 2);
         $$1.a($$2, dyq.O).ifPresent($$1x -> $$1x.a(fap.aY, $$2.a()));
      }
   }

   @Override
   public esw<?> e() {
      return esw.b;
   }
}
