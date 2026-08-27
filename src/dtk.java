import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class dtk extends dtz<dwk> {
   public dtk(Codec<dwk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwk> $$0) {
      awp $$1 = $$0.d();
      cwm $$2 = $$0.b();
      cuy $$3 = new cuy($$0.e());
      IntArrayList $$4 = ac.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ac.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      hz.a $$6 = new hz.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            hz $$9 = $$2.a(dqv.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).k($$2, $$9).c()) {
               $$2.a($$9, cyu.cv.o(), 2);
               bme.a($$2, $$1, $$9, eja.b);
               dlj $$10 = cyu.cp.o();

               for (ie $$11 : ie.c.a) {
                  hz $$12 = $$9.a($$11);
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
