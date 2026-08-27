import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class dvd extends dvs<dyd> {
   public dvd(Codec<dyd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyd> $$0) {
      axd $$1 = $$0.d();
      cxw $$2 = $$0.b();
      cwi $$3 = new cwi($$0.e());
      IntArrayList $$4 = ac.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ac.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      ib.a $$6 = new ib.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            ib $$9 = $$2.a(dso.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).k($$2, $$9).c()) {
               $$2.a($$9, dae.cv.o(), 2);
               bnl.a($$2, $$1, $$9, eku.b);
               dnb $$10 = dae.cp.o();

               for (ih $$11 : ih.c.a) {
                  ib $$12 = $$9.a($$11);
                  if ($$10.a($$2, $$12)) {
                     $$2.a($$12, $$10, 2);
                  }
               }

               return true;
            }
         }
      }

      return false;
   }
}
