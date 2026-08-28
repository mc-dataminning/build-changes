import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class emk extends ekn {
   public static final MapCodec<emk> d = a(emk::new);

   public emk(eko.c $$0) {
      super(emj::new, 21, 21, $$0);
   }

   @Override
   public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, eld $$6) {
      Set<je> $$7 = azu.a(ki::i);

      for (eks $$8 : $$6.c()) {
         if ($$8 instanceof emj $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<je> $$10 = new ObjectArrayList($$7.stream().toList());
      azk $$11 = azk.a($$0.C()).e().a($$6.b().g());
      ad.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         je $$13 = (je)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dgx.I.o(), 2);
         }
      }
   }

   private static void a(ekg $$0, dep $$1, je $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dgx.J.o(), 2);
         $$1.a($$2, drg.N).ifPresent($$1x -> $$1x.a(esp.aT, $$2.a()));
      }
   }

   @Override
   public ekx<?> e() {
      return ekx.b;
   }
}
