import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class dnh extends dnw<dqh> {
   public dnh(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqh> $$0) {
      asc $$1 = $$0.d();
      cqp $$2 = $$0.b();
      cpc $$3 = new cpc($$0.e());
      IntArrayList $$4 = ac.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ac.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      gw.a $$6 = new gw.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            gw $$9 = $$2.a(dks.a.f, $$6);
            if ($$2.t($$9) || $$2.a_($$9).k($$2, $$9).c()) {
               $$2.a($$9, csw.cv.n(), 2);
               ddy.a($$2, $$1, $$9, eco.b);
               dfj $$10 = csw.cp.n();

               for (hc $$11 : hc.c.a) {
                  gw $$12 = $$9.a($$11);
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
