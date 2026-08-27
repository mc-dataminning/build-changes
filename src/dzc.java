import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dzc extends dxg {
   public static final Codec<dzc> d = a(dzc::new);

   public dzc(dxh.c $$0) {
      super(dzb::new, 21, 21, $$0);
   }

   @Override
   public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5, dxw $$6) {
      Set<ht> $$7 = aud.a(iw::i);

      for (dxl $$8 : $$6.c()) {
         if ($$8 instanceof dzb $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ht> $$10 = new ObjectArrayList($$7.stream().toList());
      ats $$11 = ats.a($$0.B()).e().a($$6.b().f());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ht $$13 = (ht)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cvc.I.o(), 2);
         }
      }
   }

   private static void a(dwz $$0, csu $$1, ht $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cvc.J.o(), 2);
         $$1.a($$2, dff.N).ifPresent($$1x -> $$1x.a(eev.aD, $$2.a()));
      }
   }

   @Override
   public dxq<?> e() {
      return dxq.b;
   }
}
