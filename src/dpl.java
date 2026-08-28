import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpl extends dko implements dkh {
   public static final MapCodec<dpl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aM).fieldOf("feature").forGetter($$0x -> $$0x.c), t()).apply($$0, dpl::new)
   );
   private static final fcr b = dke.b(6.0, 0.0, 6.0);
   private final akt<egg<?, ?>> c;

   @Override
   public MapCodec<dpl> a() {
      return a;
   }

   public dpl(akt<egg<?, ?>> $$0, dxp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (ji $$6 : ji.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         ji $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for (int $$8 = 0; $$8 < 4; $$8++) {
            if ($$1.u($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.u($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      dxq $$4 = $$1.a_($$3);
      return $$4.a(awp.bc) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(ard $$0, ji $$1, dxq $$2, azh $$3) {
      Optional<? extends jr<egg<?, ?>>> $$4 = $$0.F_().e(mc.aM).a(this.c);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.m().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return true;
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
