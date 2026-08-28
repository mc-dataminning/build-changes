import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class epg extends enj {
   public static final MapCodec<epg> d = a(epg::new);

   public epg(enk.c $$0) {
      super(epf::new, 21, 21, $$0);
   }

   @Override
   public void a(dhe $$0, dhc $$1, dyr $$2, azg $$3, enc $$4, dfm $$5, enz $$6) {
      Set<ji> $$7 = azq.a(km::i);

      for (eno $$8 : $$6.c()) {
         if ($$8 instanceof epf $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<ji> $$10 = new ObjectArrayList($$7.stream().toList());
      azg $$11 = azg.a($$0.E()).e().a($$6.b().g());
      af.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         ji $$13 = (ji)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, djm.L.m(), 2);
         }
      }
   }

   private static void a(enc $$0, dhe $$1, ji $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, djm.M.m(), 2);
         $$1.a($$2, dtz.O).ifPresent($$1x -> $$1x.a(evl.aY, $$2.a()));
      }
   }

   @Override
   public ent<?> e() {
      return ent.b;
   }
}
