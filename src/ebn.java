import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;

public class ebn extends ebo {
   public ebn(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dcb $$0, ayt $$1, ir $$2, dtc $$3) {
      if (!this.b($$0, $$1, $$2, $$3)) {
         return false;
      } else {
         iw $$4 = iw.c.a.a($$1);
         int $$5 = $$1.a(2) + 2;
         List<iw> $$6 = ad.a(Stream.of($$4, $$4.h(), $$4.i()), $$1);

         for (iw $$8 : $$6.subList(0, $$5)) {
            ir.a $$9 = $$2.j();
            int $$10 = $$1.a(2) + 1;
            $$9.d($$8);
            int $$12;
            iw $$11;
            if ($$8 == $$4) {
               $$11 = $$4;
               $$12 = $$1.a(3) + 2;
            } else {
               $$9.d(iw.b);
               iw[] $$13 = new iw[]{$$8, iw.b};
               $$11 = ad.a($$13, $$1);
               $$12 = $$1.a(3) + 3;
            }

            for (int $$16 = 0; $$16 < $$10 && this.b($$0, $$1, $$9, $$3); $$16++) {
               $$9.d($$11);
            }

            $$9.d($$11.g());
            $$9.d(iw.b);

            for (int $$17 = 0; $$17 < $$12; $$17++) {
               $$9.d($$4);
               if (!this.b($$0, $$1, $$9, $$3)) {
                  break;
               }

               if ($$1.i() < 0.25F) {
                  $$9.d(iw.b);
               }
            }
         }

         return true;
      }
   }
}
