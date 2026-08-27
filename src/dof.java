import com.mojang.serialization.Codec;
import java.util.List;

public class dof extends dod {
   public dof(Codec<dqz> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(cra $$0, ate $$1, ht $$2, dgb $$3) {
      ht.a $$4 = $$2.j();
      int $$5 = $$1.a(3) + 1;

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         if (!this.b($$0, $$1, $$4, $$3)) {
            return true;
         }

         $$4.c(hx.b);
      }

      ht $$7 = $$4.i();
      int $$8 = $$1.a(3) + 2;
      List<hx> $$9 = hx.c.a.c($$1);

      for (hx $$11 : $$9.subList(0, $$8)) {
         $$4.g($$7);
         $$4.c($$11);
         int $$12 = $$1.a(5) + 2;
         int $$13 = 0;

         for (int $$14 = 0; $$14 < $$12 && this.b($$0, $$1, $$4, $$3); $$14++) {
            $$13++;
            $$4.c(hx.b);
            if ($$14 == 0 || $$13 >= 2 && $$1.i() < 0.25F) {
               $$4.c($$11);
               $$13 = 0;
            }
         }
      }

      return true;
   }
}
