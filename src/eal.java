import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class eal extends eba<edl> {
   public eal(Codec<edl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<edl> $$0) {
      azh $$1 = $$0.d();
      dcv $$2 = $$0.b();
      dbh $$3 = new dbh($$0.e());
      IntArrayList $$4 = ac.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ac.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      iz.a $$6 = new iz.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            iz $$9 = $$2.a(dxw.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).k($$2, $$9).c()) {
               $$2.a($$9, dfd.cv.o(), 2);
               bre.a($$2, $$1, $$9, eqg.b);
               dse $$10 = dfd.cp.o();

               for (je $$11 : je.c.a) {
                  iz $$12 = $$9.a($$11);
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
