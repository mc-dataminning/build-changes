import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class eli extends ejl {
   public static final MapCodec<eli> d = a(eli::new);

   public eli(ejm.c $$0) {
      super(elh::new, 21, 21, $$0);
   }

   @Override
   public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, ekb $$6) {
      Set<jd> $$7 = azf.a(kh::i);

      for (ejq $$8 : $$6.c()) {
         if ($$8 instanceof elh $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jd> $$10 = new ObjectArrayList($$7.stream().toList());
      ayv $$11 = ayv.a($$0.C()).e().a($$6.b().g());
      ad.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jd $$13 = (jd)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dfy.I.o(), 2);
         }
      }
   }

   private static void a(eje $$0, ddq $$1, jd $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dfy.J.o(), 2);
         $$1.a($$2, dqh.N).ifPresent($$1x -> $$1x.a(erh.be, $$2.a()));
      }
   }

   @Override
   public ejv<?> e() {
      return ejv.b;
   }
}
