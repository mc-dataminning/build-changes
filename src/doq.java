import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class doq extends djv implements djo {
   public static final MapCodec<doq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.aL).fieldOf("feature").forGetter($$0x -> $$0x.d), t()).apply($$0, doq::new)
   );
   protected static final float b = 3.0F;
   protected static final fbt c = djl.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final aku<efj<?, ?>> d;

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   public doq(aku<efj<?, ?>> $$0, dwv.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
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
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.e();
      dww $$4 = $$1.a_($$3);
      return $$4.a(awp.bc) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(ard $$0, ji $$1, dww $$2, azh $$3) {
      Optional<? extends jr<efj<?, ?>>> $$4 = $$0.K_().e(mc.aL).a(this.d);
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
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return true;
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
