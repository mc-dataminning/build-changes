import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class bse extends brz {
   private static final int b = 2;
   public static final int a = 2;
   private final ToIntFunction<azg> c;

   protected bse(bsa $$0, int $$1, ToIntFunction<azg> $$2) {
      super($$0, $$1, li.U);
      this.c = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, int $$1, int $$2) {
      return ayy.a(0, $$0 - $$1, $$2);
   }

   @Override
   public void a(bto $$0, int $$1, bst.c $$2) {
      if ($$2 == bst.c.a) {
         int $$3 = this.c.applyAsInt($$0.el());
         dbx $$4 = $$0.dP();
         int $$5 = $$4.ab().c(dbt.u);
         List<ckl> $$6 = new ArrayList<>();
         $$4.a(bsz.aP, $$0.cK().g(2.0), $$1x -> $$1x != $$0, $$6, $$5);
         int $$7 = a($$5, $$6.size(), $$3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            this.a($$0.dP(), $$0.du(), $$0.dw() + 0.5, $$0.dA());
         }
      }
   }

   private void a(dbx $$0, double $$1, double $$2, double $$3) {
      ckl $$4 = bsz.aP.a($$0);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.E_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }
}
