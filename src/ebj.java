import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class ebj extends eca<eer> {
   public ebj(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      ayt $$1 = $$0.d();
      dcv $$2 = $$0.b();
      dbh $$3 = new dbh($$0.e());
      IntArrayList $$4 = ad.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ad.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      ir.a $$6 = new ir.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            ir $$9 = $$2.a(dyu.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).k($$2, $$9).c()) {
               $$2.a($$9, dfe.dg.n(), 2);
               bqi.a($$2, $$1, $$9, ern.b);
               dtc $$10 = dfe.da.n();

               for (iw $$11 : iw.c.a) {
                  ir $$12 = $$9.a($$11);
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
