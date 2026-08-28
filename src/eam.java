import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;

public class eam extends ean {
   public eam(Codec<edj> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dbz $$0, azh $$1, iz $$2, dsc $$3) {
      if (!this.b($$0, $$1, $$2, $$3)) {
         return false;
      } else {
         je $$4 = je.c.a.a($$1);
         int $$5 = $$1.a(2) + 2;
         List<je> $$6 = ac.a(Stream.of($$4, $$4.h(), $$4.i()), $$1);

         for (je $$8 : $$6.subList(0, $$5)) {
            iz.a $$9 = $$2.j();
            int $$10 = $$1.a(2) + 1;
            $$9.c($$8);
            int $$12;
            je $$11;
            if ($$8 == $$4) {
               $$11 = $$4;
               $$12 = $$1.a(3) + 2;
            } else {
               $$9.c(je.b);
               je[] $$13 = new je[]{$$8, je.b};
               $$11 = ac.a($$13, $$1);
               $$12 = $$1.a(3) + 3;
            }

            for (int $$16 = 0; $$16 < $$10 && this.b($$0, $$1, $$9, $$3); $$16++) {
               $$9.c($$11);
            }

            $$9.c($$11.g());
            $$9.c(je.b);

            for (int $$17 = 0; $$17 < $$12; $$17++) {
               $$9.c($$4);
               if (!this.b($$0, $$1, $$9, $$3)) {
                  break;
               }

               if ($$1.i() < 0.25F) {
                  $$9.c(je.b);
               }
            }
         }

         return true;
      }
   }
}
