import java.util.Optional;
import javax.annotation.Nullable;

public class cyq extends czw {
   private static final xc a = xc.c("item.minecraft.lodestone_compass");

   public cyq(czw.a $$0) {
      super($$0);
   }

   @Override
   public boolean d_(daa $$0) {
      return $$0.c(kl.ah) || super.d_($$0);
   }

   @Override
   public void a(daa $$0, aru $$1, bwv $$2, @Nullable bxf $$3) {
      dcu $$4 = $$0.a(kl.ah);
      if ($$4 != null) {
         dcu $$5 = $$4.a($$1);
         if ($$5 != $$4) {
            $$0.b(kl.ah, $$5);
         }
      }
   }

   @Override
   public but a(ddv $$0) {
      iw $$1 = $$0.a();
      djz $$2 = $$0.q();
      if (!$$2.a_($$1).a(dng.pY)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, awr.oZ, aws.h, 1.0F, 1.0F);
         crz $$3 = $$0.o();
         daa $$4 = $$0.n();
         boolean $$5 = !$$3.fV() && $$4.M() == 1;
         dcu $$6 = new dcu(Optional.of(jf.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kl.ah, $$6);
         } else {
            daa $$7 = $$4.a(dae.rK, 1);
            $$4.a(1, $$3);
            $$7.b(kl.ah, $$6);
            if (!$$3.gj().g($$7)) {
               $$3.a($$7, false);
            }
         }

         return but.a;
      }
   }

   @Override
   public xc a(daa $$0) {
      return $$0.c(kl.ah) ? a : super.a($$0);
   }
}
