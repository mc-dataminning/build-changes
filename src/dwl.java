import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class dwl extends duw {
   public static final Codec<dwl> d = a(dwl::new);

   public dwl(dux.c $$0) {
      super(dwk::new, 21, 21, $$0);
   }

   @Override
   public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, dvm $$6) {
      Set<gv> $$7 = asc.a(ia::i);

      for (dvb $$8 : $$6.c()) {
         if ($$8 instanceof dwk $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<gv> $$10 = new ObjectArrayList($$7.stream().toList());
      art $$11 = art.a($$0.A()).e().a($$6.b().f());
      ac.b($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         gv $$13 = (gv)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, csl.I.n(), 2);
         }
      }
   }

   private static void a(dup $$0, cqe $$1, gv $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, csl.J.n(), 2);
         $$1.a($$2, dcm.N).ifPresent($$1x -> $$1x.a(ecd.aD, $$2.a()));
      }
   }

   @Override
   public dvg<?> e() {
      return dvg.b;
   }
}
