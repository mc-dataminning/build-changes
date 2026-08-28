import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class ehb extends ehr<ekc> {
   public ehb(Codec<ekc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekc> $$0) {
      azs $$1 = $$0.d();
      dio $$2 = $$0.b();
      dgw $$3 = new dgw($$0.e());
      IntArrayList $$4 = af.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = af.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      jj.a $$6 = new jj.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            jj $$9 = $$2.a(eel.a.f, $$6);
            if ($$2.u($$9) || $$2.a_($$9).g($$2, $$9).c()) {
               $$2.a($$9, dkw.cD.m(), 2);
               btw.a($$2, $$1, $$9, exh.a);
               dym $$10 = dkw.cw.m();

               for (jo $$11 : jo.c.a) {
                  jj $$12 = $$9.a($$11);
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
