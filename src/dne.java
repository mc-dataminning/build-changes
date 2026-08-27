import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;

public class dne extends dnf {
   public dne(Codec<dqb> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(cqc $$0, ash $$1, gw $$2, dfd $$3) {
      if (!this.b($$0, $$1, $$2, $$3)) {
         return false;
      } else {
         ha $$4 = ha.c.a.a($$1);
         int $$5 = $$1.a(2) + 2;
         List<ha> $$6 = ac.a(Stream.of($$4, $$4.h(), $$4.i()), $$1);

         for (ha $$8 : $$6.subList(0, $$5)) {
            gw.a $$9 = $$2.j();
            int $$10 = $$1.a(2) + 1;
            $$9.c($$8);
            int $$12;
            ha $$11;
            if ($$8 == $$4) {
               $$11 = $$4;
               $$12 = $$1.a(3) + 2;
            } else {
               $$9.c(ha.b);
               ha[] $$13 = new ha[]{$$8, ha.b};
               $$11 = ac.a($$13, $$1);
               $$12 = $$1.a(3) + 3;
            }

            for (int $$16 = 0; $$16 < $$10 && this.b($$0, $$1, $$9, $$3); $$16++) {
               $$9.c($$11);
            }

            $$9.c($$11.g());
            $$9.c(ha.b);

            for (int $$17 = 0; $$17 < $$12; $$17++) {
               $$9.c($$4);
               if (!this.b($$0, $$1, $$9, $$3)) {
                  break;
               }

               if ($$1.i() < 0.25F) {
                  $$9.c(ha.b);
               }
            }
         }

         return true;
      }
   }
}
