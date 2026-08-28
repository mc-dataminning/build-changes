import java.util.Optional;

public class cxo extends cyu {
   private static final wy a = wy.c("item.minecraft.lodestone_compass");

   public cxo(cyu.a $$0) {
      super($$0);
   }

   @Override
   public boolean d_(cyy $$0) {
      return $$0.c(kj.ah) || super.d_($$0);
   }

   @Override
   public void a(cyy $$0, div $$1, bwd $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arq $$5) {
         dbs $$6 = $$0.a(kj.ah);
         if ($$6 != null) {
            dbs $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(kj.ah, $$7);
            }
         }
      }
   }

   @Override
   public bub a(dct $$0) {
      iu $$1 = $$0.a();
      div $$2 = $$0.q();
      if (!$$2.a_($$1).a(dmc.pV)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awn.oW, awo.h, 1.0F, 1.0F);
         cqy $$3 = $$0.o();
         cyy $$4 = $$0.n();
         boolean $$5 = !$$3.fU() && $$4.M() == 1;
         dbs $$6 = new dbs(Optional.of(jd.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kj.ah, $$6);
         } else {
            cyy $$7 = $$4.a(czc.rF, 1);
            $$4.a(1, $$3);
            $$7.b(kj.ah, $$6);
            if (!$$3.gi().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bub.a;
      }
   }

   @Override
   public wy a(cyy $$0) {
      return $$0.c(kj.ah) ? a : super.a($$0);
   }
}
