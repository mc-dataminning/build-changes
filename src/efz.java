import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class efz extends egp<eja> {
   public efz(Codec<eja> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<eja> $$0) {
      bac $$1 = $$0.d();
      dhx $$2 = $$0.b();
      dgf $$3 = new dgf($$0.e());
      IntArrayList $$4 = ae.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ae.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      jh.a $$6 = new jh.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            jh $$9 = $$2.a(edj.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).g($$2, $$9).c()) {
               $$2.a($$9, dkf.cD.m(), 2);
               btg.a($$2, $$1, $$9, ewe.a);
               dxo $$10 = dkf.cw.m();

               for (jm $$11 : jm.c.a) {
                  jh $$12 = $$9.a($$11);
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
