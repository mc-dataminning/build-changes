import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class edp extends eef<egq> {
   public edp(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      azr $$1 = $$0.d();
      dfs $$2 = $$0.b();
      deb $$3 = new deb($$0.e());
      IntArrayList $$4 = ad.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ad.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      jg.a $$6 = new jg.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            jg $$9 = $$2.a(eaz.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).g($$2, $$9).c()) {
               $$2.a($$9, dia.cv.m(), 2);
               bse.a($$2, $$1, $$9, ets.a);
               dvd $$10 = dia.cp.m();

               for (jl $$11 : jl.c.a) {
                  jg $$12 = $$9.a($$11);
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
