import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;

public class drh extends dri {
   public drh(Codec<due> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ctp $$0, auu $$1, hx $$2, djg $$3) {
      if (!this.b($$0, $$1, $$2, $$3)) {
         return false;
      } else {
         ic $$4 = ic.c.a.a($$1);
         int $$5 = $$1.a(2) + 2;
         List<ic> $$6 = ac.a(Stream.of($$4, $$4.h(), $$4.i()), $$1);

         for (ic $$8 : $$6.subList(0, $$5)) {
            hx.a $$9 = $$2.j();
            int $$10 = $$1.a(2) + 1;
            $$9.c($$8);
            int $$12;
            ic $$11;
            if ($$8 == $$4) {
               $$11 = $$4;
               $$12 = $$1.a(3) + 2;
            } else {
               $$9.c(ic.b);
               ic[] $$13 = new ic[]{$$8, ic.b};
               $$11 = ac.a($$13, $$1);
               $$12 = $$1.a(3) + 3;
            }

            for (int $$16 = 0; $$16 < $$10 && this.b($$0, $$1, $$9, $$3); $$16++) {
               $$9.c($$11);
            }

            $$9.c($$11.g());
            $$9.c(ic.b);

            for (int $$17 = 0; $$17 < $$12; $$17++) {
               $$9.c($$4);
               if (!this.b($$0, $$1, $$9, $$3)) {
                  break;
               }

               if ($$1.i() < 0.25F) {
                  $$9.c(ic.b);
               }
            }
         }

         return true;
      }
   }
}
