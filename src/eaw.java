import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class eaw extends ebl<edw> {
   public eaw(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<edw> $$0) {
      ayo $$1 = $$0.d();
      ddc $$2 = $$0.b();
      dbn $$3 = new dbn($$0.e());
      IntArrayList $$4 = ac.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ac.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      ja.a $$6 = new ja.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            ja $$9 = $$2.a(dyg.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).k($$2, $$9).c()) {
               $$2.a($$9, dfk.cv.o(), 2);
               bqp.a($$2, $$1, $$9, eqs.b);
               dsl $$10 = dfk.cp.o();

               for (jf $$11 : jf.c.a) {
                  ja $$12 = $$9.a($$11);
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
