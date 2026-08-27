import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class dou extends dpj<dru> {
   public dou(Codec<dru> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<dru> $$0) {
      ato $$1 = $$0.d();
      csm $$2 = $$0.b();
      cqz $$3 = new cqz($$0.e());
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
            ht $$9 = $$2.a(dmf.a.f, $$6);
            if ($$2.t($$9) || $$2.a_($$9).k($$2, $$9).c()) {
               $$2.a($$9, cuv.cv.o(), 2);
               dfv.a($$2, $$1, $$9, eej.b);
               dgw $$10 = cuv.cp.o();

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
