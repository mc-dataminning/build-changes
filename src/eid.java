import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class eid extends eit<ele> {
   public eid(Codec<ele> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<ele> $$0) {
      azt $$1 = $$0.d();
      djo $$2 = $$0.b();
      dhw $$3 = new dhw($$0.e());
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
            iu $$9 = $$2.a(efn.a.f, $$6);
            if ($$2.v($$9) || $$2.a_($$9).g($$2, $$9).c()) {
               $$2.a($$9, dlw.cD.m(), 2);
               bue.a($$2, $$1, $$9, eyj.a);
               dzo $$10 = dlw.cw.m();

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
