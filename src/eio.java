import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class eio extends eje<elp> {
   public eio(Codec<elp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<elp> $$0) {
      azv $$1 = $$0.d();
      dju $$2 = $$0.b();
      dic $$3 = new dic($$0.e());
      IntArrayList $$4 = af.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = af.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      iu.a $$6 = new iu.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            iu $$9 = $$2.a(efy.a.f, $$6);
            if ($$2.v($$9) || $$2.a_($$9).g($$2, $$9).c()) {
               $$2.a($$9, dmc.cE.m(), 2);
               buh.a($$2, $$1, $$9, eyv.a);
               dzz $$10 = dmc.cx.m();

               for (ja $$11 : ja.c.a) {
                  iu $$12 = $$9.a($$11);
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
