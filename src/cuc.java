import java.util.Optional;
import javax.annotation.Nullable;

public class cuc extends cvn {
   public cuc(cvn.a $$0) {
      super($$0);
   }

   @Nullable
   public static jn a(dej $$0) {
      return $$0.C_().j() ? jn.a($$0.ag(), $$0.W()) : null;
   }

   @Override
   public boolean e_(cvs $$0) {
      return $$0.b(ks.Y) || super.e_($$0);
   }

   @Override
   public void a(cvs $$0, dej $$1, btr $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arj $$5) {
         cyq $$6 = $$0.a(ks.Y);
         if ($$6 != null) {
            cyq $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(ks.Y, $$7);
            }
         }
      }
   }

   @Override
   public brs a(czp $$0) {
      jf $$1 = $$0.a();
      dej $$2 = $$0.q();
      if (!$$2.a_($$1).a(dho.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awg.oo, awh.h, 1.0F, 1.0F);
         cnx $$3 = $$0.o();
         cvs $$4 = $$0.n();
         boolean $$5 = !$$3.fR() && $$4.K() == 1;
         cyq $$6 = new cyq(Optional.of(jn.a($$2.ag(), $$1)), true);
         if ($$5) {
            $$4.b(ks.Y, $$6);
         } else {
            cvs $$7 = $$4.a(cvw.qT, 1);
            $$4.a(1, $$3);
            $$7.b(ks.Y, $$6);
            if (!$$3.gd().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return brs.a;
      }
   }

   @Override
   public String d_(cvs $$0) {
      return $$0.b(ks.Y) ? "item.minecraft.lodestone_compass" : super.d_($$0);
   }
}
