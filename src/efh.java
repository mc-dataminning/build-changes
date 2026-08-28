import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class efh extends efx<eii> {
   public efh(Codec<eii> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eii> $$0) {
      azh $$1 = $$0.d();
      dhf $$2 = $$0.b();
      dfn $$3 = new dfn($$0.e());
      IntArrayList $$4 = af.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = af.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      ji.a $$6 = new ji.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            ji $$9 = $$2.a(ecr.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).g($$2, $$9).c()) {
               $$2.a($$9, djn.cD.m(), 2);
               bsp.a($$2, $$1, $$9, evm.a);
               dww $$10 = djn.cw.m();

               for (jn $$11 : jn.c.a) {
                  ji $$12 = $$9.a($$11);
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
