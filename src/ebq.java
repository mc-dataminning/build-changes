import com.mojang.serialization.Codec;
import java.util.List;

public class ebq extends ebo {
   public ebq(Codec<eer> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dcb $$0, ayt $$1, ir $$2, dtc $$3) {
      ir.a $$4 = $$2.j();
      int $$5 = $$1.a(3) + 1;

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         if (!this.b($$0, $$1, $$4, $$3)) {
            return true;
         }

         $$4.d(iw.b);
      }

      ir $$7 = $$4.i();
      int $$8 = $$1.a(3) + 2;
      List<iw> $$9 = iw.c.a.c($$1);

      for (iw $$11 : $$9.subList(0, $$8)) {
         $$4.g($$7);
         $$4.d($$11);
         int $$12 = $$1.a(5) + 2;
         int $$13 = 0;

         for (int $$14 = 0; $$14 < $$12 && this.b($$0, $$1, $$4, $$3); $$14++) {
            $$13++;
            $$4.d(iw.b);
            if ($$14 == 0 || $$13 >= 2 && $$1.i() < 0.25F) {
               $$4.d($$11);
               $$13 = 0;
            }
         }
      }

      return true;
   }
}
