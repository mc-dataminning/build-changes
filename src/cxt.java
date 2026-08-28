import java.util.Optional;
import javax.annotation.Nullable;

public class cxt extends cyz {
   private static final wy a = wy.c("item.minecraft.lodestone_compass");

   public cxt(cyz.a $$0) {
      super($$0);
   }

   @Override
   public boolean d_(czd $$0) {
      return $$0.c(kj.ah) || super.d_($$0);
   }

   @Override
   public void a(czd $$0, arq $$1, bwf $$2, @Nullable bwp $$3) {
      dbx $$4 = $$0.a(kj.ah);
      if ($$4 != null) {
         dbx $$5 = $$4.a($$1);
         if ($$5 != $$4) {
            $$0.b(kj.ah, $$5);
         }
      }
   }

   @Override
   public bud a(dcy $$0) {
      iu $$1 = $$0.a();
      dja $$2 = $$0.q();
      if (!$$2.a_($$1).a(dmh.pY)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awn.oZ, awo.h, 1.0F, 1.0F);
         crc $$3 = $$0.o();
         czd $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.M() == 1;
         dbx $$6 = new dbx(Optional.of(jd.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kj.ah, $$6);
         } else {
            czd $$7 = $$4.a(czh.rK, 1);
            $$4.a(1, $$3);
            $$7.b(kj.ah, $$6);
            if (!$$3.gj().g($$7)) {
               $$3.a($$7, false);
            }
         }

         return bud.a;
      }
   }

   @Override
   public wy a(czd $$0) {
      return $$0.c(kj.ah) ? a : super.a($$0);
   }
}
