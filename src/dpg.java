import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class dpg extends dpv<dsg> {
   public dpg(Codec<dsg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsg> $$0) {
      ats $$1 = $$0.d();
      csu $$2 = $$0.b();
      crh $$3 = new crh($$0.e());
      IntArrayList $$4 = ac.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ac.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      ht.a $$6 = new ht.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            ht $$9 = $$2.a(dmr.a.f, $$6);
            if ($$2.t($$9) || $$2.a_($$9).k($$2, $$9).c()) {
               $$2.a($$9, cvc.cv.o(), 2);
               dgh.a($$2, $$1, $$9, eev.b);
               dhi $$10 = cvc.cp.o();

               for (hx $$11 : hx.c.a) {
                  ht $$12 = $$9.a($$11);
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
