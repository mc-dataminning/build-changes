import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class edg extends ebk {
   public static final Codec<edg> d = a(edg::new);

   public edg(ebl.c $$0) {
      super(edf::new, 21, 21, $$0);
   }

   @Override
   public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, eca $$6) {
      Set<hz> $$7 = awz.a(jd::i);

      for (ebp $$8 : $$6.c()) {
         if ($$8 instanceof edf $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<hz> $$10 = new ObjectArrayList($$7.stream().toList());
      awp $$11 = awp.a($$0.C()).e().a($$6.b().g());
      ac.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         hz $$13 = (hz)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, cyu.I.o(), 2);
         }
      }
   }

   private static void a(ebd $$0, cwm $$1, hz $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, cyu.J.o(), 2);
         $$1.a($$2, diz.N).ifPresent($$1x -> $$1x.a(eja.aP, $$2.a()));
      }
   }

   @Override
   public ebu<?> e() {
      return ebu.b;
   }
}
