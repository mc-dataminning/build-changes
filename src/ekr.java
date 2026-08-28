import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ekr extends eiv {
   public static final MapCodec<ekr> d = a(ekr::new);

   public ekr(eiw.c $$0) {
      super(ekq::new, 21, 21, $$0);
   }

   @Override
   public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ejl $$6) {
      Set<ja> $$7 = ayy.a(ke::i);

      for (eja $$8 : $$6.c()) {
         if ($$8 instanceof ekq $$9) {
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
            $$0.a($$13, dfj.I.o(), 2);
         }
      }
   }

   private static void a(eio $$0, ddb $$1, ja $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dfj.J.o(), 2);
         $$1.a($$2, dpr.N).ifPresent($$1x -> $$1x.a(eqq.be, $$2.a()));
      }
   }

   @Override
   public ejf<?> e() {
      return ejf.b;
   }
}
