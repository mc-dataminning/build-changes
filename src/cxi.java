import java.util.Optional;

public class cxi extends cyo {
   private static final ww a = ww.c("item.minecraft.lodestone_compass");

   public cxi(cyo.a $$0) {
      super($$0);
   }

   @Override
   public boolean c_(cys $$0) {
      return $$0.c(kj.ah) || super.c_($$0);
   }

   @Override
   public void a(cys $$0, dip $$1, bwa $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aro $$5) {
         dbm $$6 = $$0.a(kj.ah);
         if ($$6 != null) {
            dbm $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kj.ah, $$7);
            }
         }
      }
   }

   @Override
   public bty a(dcn $$0) {
      iu $$1 = $$0.a();
      dip $$2 = $$0.q();
      if (!$$2.a_($$1).a(dlw.pU)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awl.oV, awm.h, 1.0F, 1.0F);
         cqs $$3 = $$0.o();
         cys $$4 = $$0.n();
         boolean $$5 = !$$3.fU() && $$4.M() == 1;
         dbm $$6 = new dbm(Optional.of(jd.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kj.ah, $$6);
         } else {
            cys $$7 = $$4.a(cyw.rD, 1);
            $$4.a(1, $$3);
            $$7.b(kj.ah, $$6);
            if (!$$3.gi().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bty.a;
      }
   }

   @Override
   public ww a(cys $$0) {
      return $$0.c(kj.ah) ? a : super.a($$0);
   }
}
