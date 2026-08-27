import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class dyo extends dzd<ebo> {
   public dyo(Codec<ebo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebo> $$0) {
      ayg $$1 = $$0.d();
      day $$2 = $$0.b();
      czk $$3 = new czk($$0.e());
      IntArrayList $$4 = ac.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ac.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      in.a $$6 = new in.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            in $$9 = $$2.a(dvz.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).k($$2, $$9).c()) {
               $$2.a($$9, ddg.cv.n(), 2);
               bpu.a($$2, $$1, $$9, eoj.b);
               dqh $$10 = ddg.cp.n();

               for (is $$11 : is.c.a) {
                  in $$12 = $$9.a($$11);
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
