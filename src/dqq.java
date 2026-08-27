import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;

public class dqq extends dqr {
   public dqq(Codec<dtn> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(csz $$0, auf $$1, hv $$2, dip $$3) {
      if (!this.b($$0, $$1, $$2, $$3)) {
         return false;
      } else {
         ia $$4 = ia.c.a.a($$1);
         int $$5 = $$1.a(2) + 2;
         List<ia> $$6 = ac.a(Stream.of($$4, $$4.h(), $$4.i()), $$1);

         for (ia $$8 : $$6.subList(0, $$5)) {
            hv.a $$9 = $$2.j();
            int $$10 = $$1.a(2) + 1;
            $$9.c($$8);
            int $$12;
            ia $$11;
            if ($$8 == $$4) {
               $$11 = $$4;
               $$12 = $$1.a(3) + 2;
            } else {
               $$9.c(ia.b);
               ia[] $$13 = new ia[]{$$8, ia.b};
               $$11 = ac.a($$13, $$1);
               $$12 = $$1.a(3) + 3;
            }

            for (int $$16 = 0; $$16 < $$10 && this.b($$0, $$1, $$9, $$3); $$16++) {
               $$9.c($$11);
            }

            $$9.c($$11.g());
            $$9.c(ia.b);

            for (int $$17 = 0; $$17 < $$12; $$17++) {
               $$9.c($$4);
               if (!this.b($$0, $$1, $$9, $$3)) {
                  break;
               }

               if ($$1.i() < 0.25F) {
                  $$9.c(ia.b);
               }
            }
         }

         return true;
      }
   }
}
