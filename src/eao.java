import com.mojang.serialization.Codec;
import java.util.List;

public class eao extends eam {
   public eao(Codec<edi> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dby $$0, azg $$1, iz $$2, dsb $$3) {
      iz.a $$4 = $$2.j();
      int $$5 = $$1.a(3) + 1;

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         if (!this.b($$0, $$1, $$4, $$3)) {
            return true;
         }

         $$4.c(je.b);
      }

      iz $$7 = $$4.i();
      int $$8 = $$1.a(3) + 2;
      List<je> $$9 = je.c.a.c($$1);

      for (je $$11 : $$9.subList(0, $$8)) {
         $$4.g($$7);
         $$4.c($$11);
         int $$12 = $$1.a(5) + 2;
         int $$13 = 0;

         for (int $$14 = 0; $$14 < $$12 && this.b($$0, $$1, $$4, $$3); $$14++) {
            $$13++;
            $$4.c(je.b);
            if ($$14 == 0 || $$13 >= 2 && $$1.i() < 0.25F) {
               $$4.c($$11);
               $$13 = 0;
            }
         }
      }

      return true;
   }
}
