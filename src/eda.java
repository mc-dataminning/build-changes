import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class eda extends edq<egb> {
   public eda(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egb> $$0) {
      azl $$1 = $$0.d();
      dfd $$2 = $$0.b();
      ddm $$3 = new ddm($$0.e());
      IntArrayList $$4 = ad.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ad.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      je.a $$6 = new je.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            je $$9 = $$2.a(eak.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).g($$2, $$9).c()) {
               $$2.a($$9, dhl.cv.o(), 2);
               brv.a($$2, $$1, $$9, etd.b);
               duo $$10 = dhl.cp.o();

               for (jj $$11 : jj.c.a) {
                  je $$12 = $$9.a($$11);
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
