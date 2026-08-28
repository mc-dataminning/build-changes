import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class ejt extends ekk<emw> {
   public ejt(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      azx $$1 = $$0.d();
      dkw $$2 = $$0.b();
      djc $$3 = new djc($$0.e());
      IntArrayList $$4 = ag.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ag.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      iv.a $$6 = new iv.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            iv $$9 = $$2.a(ehd.a.f, $$6);
            if ($$2.v($$9) || $$2.a_($$9).g($$2, $$9).c()) {
               $$2.a($$9, dne.cG.m(), 2);
               bux.a($$2, $$1, $$9, fad.a);
               ebe $$10 = dne.cz.m();

               for (jb $$11 : jb.c.a) {
                  iv $$12 = $$9.a($$11);
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
