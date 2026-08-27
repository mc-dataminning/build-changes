import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class dmw extends dnl<dpw> {
   public dmw(Codec<dpw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpw> $$0) {
      art $$1 = $$0.d();
      cqe $$2 = $$0.b();
      cor $$3 = new cor($$0.e());
      IntArrayList $$4 = ac.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ac.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      gv.a $$6 = new gv.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            gv $$9 = $$2.a(dkh.a.f, $$6);
            if ($$2.t($$9) || $$2.a_($$9).k($$2, $$9).c()) {
               $$2.a($$9, csl.cv.n(), 2);
               ddn.a($$2, $$1, $$9, ecd.b);
               dey $$10 = csl.cp.n();

               for (hb $$11 : hb.c.a) {
                  gv $$12 = $$9.a($$11);
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
