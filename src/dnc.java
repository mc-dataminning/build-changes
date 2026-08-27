import com.mojang.serialization.Codec;
import java.util.List;

public class dnc extends dna {
   public dnc(Codec<dpw> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(cpl $$0, art $$1, gv $$2, dey $$3) {
      gv.a $$4 = $$2.j();
      int $$5 = $$1.a(3) + 1;

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         if (!this.b($$0, $$1, $$4, $$3)) {
            return true;
         }

         $$4.c(hb.b);
      }

      gv $$7 = $$4.i();
      int $$8 = $$1.a(3) + 2;
      List<hb> $$9 = hb.c.a.c($$1);

      for (hb $$11 : $$9.subList(0, $$8)) {
         $$4.g($$7);
         $$4.c($$11);
         int $$12 = $$1.a(5) + 2;
         int $$13 = 0;

         for (int $$14 = 0; $$14 < $$12 && this.b($$0, $$1, $$4, $$3); $$14++) {
            $$13++;
            $$4.c(hb.b);
            if ($$14 == 0 || $$13 >= 2 && $$1.i() < 0.25F) {
               $$4.c($$11);
               $$13 = 0;
            }
         }
      }

      return true;
   }
}
