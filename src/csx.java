import java.util.Optional;
import javax.annotation.Nullable;

public class csx extends cuj {
   public csx(cuj.a $$0) {
      super($$0);
   }

   @Nullable
   public static jh a(dbx $$0) {
      return $$0.D_().j() ? jh.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cuo $$0) {
      return $$0.b(km.S) || super.d_($$0);
   }

   @Override
   public void a(cuo $$0, dbx $$1, bst $$2, int $$3, boolean $$4) {
      if ($$1 instanceof are $$5) {
         cxm $$6 = $$0.a(km.S);
         if ($$6 != null) {
            cxm $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(km.S, $$7);
            }
         }
      }
   }

   @Override
   public bqt a(cyb $$0) {
      iz $$1 = $$0.a();
      dbx $$2 = $$0.q();
      if (!$$2.a_($$1).a(dfa.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avz.on, awa.h, 1.0F, 1.0F);
         cmw $$3 = $$0.o();
         cuo $$4 = $$0.n();
         boolean $$5 = !$$3.fP() && $$4.I() == 1;
         cxm $$6 = new cxm(Optional.of(jh.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(km.S, $$6);
         } else {
            cuo $$7 = $$4.a(cur.qS, 1);
            $$4.a(1, $$3);
            $$7.b(km.S, $$6);
            if (!$$3.gc().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqt.a($$2.B);
      }
   }

   @Override
   public String i(cuo $$0) {
      return $$0.b(km.S) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
