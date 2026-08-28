import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;

public class edd extends ede {
   public edd(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(deh $$0, azl $$1, je $$2, duo $$3) {
      if (!this.b($$0, $$1, $$2, $$3)) {
         return false;
      } else {
         jj $$4 = jj.c.a.a($$1);
         int $$5 = $$1.a(2) + 2;
         List<jj> $$6 = ad.a(Stream.of($$4, $$4.h(), $$4.i()), $$1);

         for (jj $$8 : $$6.subList(0, $$5)) {
            je.a $$9 = $$2.k();
            int $$10 = $$1.a(2) + 1;
            $$9.c($$8);
            int $$12;
            jj $$11;
            if ($$8 == $$4) {
               $$11 = $$4;
               $$12 = $$1.a(3) + 2;
            } else {
               $$9.c(jj.b);
               jj[] $$13 = new jj[]{$$8, jj.b};
               $$11 = ad.a($$13, $$1);
               $$12 = $$1.a(3) + 3;
            }

            for (int $$16 = 0; $$16 < $$10 && this.b($$0, $$1, $$9, $$3); $$16++) {
               $$9.c($$11);
            }

            $$9.c($$11.g());
            $$9.c(jj.b);

            for (int $$17 = 0; $$17 < $$12; $$17++) {
               $$9.c($$4);
               if (!this.b($$0, $$1, $$9, $$3)) {
                  break;
               }

               if ($$1.i() < 0.25F) {
                  $$9.c(jj.b);
               }
            }
         }

         return true;
      }
   }
}
