import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dop extends dju implements djn {
   public static final MapCodec<dop> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aL).fieldOf("feature").forGetter($$0x -> $$0x.d), t()).apply($$0, dop::new)
   );
   protected static final float b = 3.0F;
   protected static final fbs c = djk.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final akt<efi<?, ?>> d;

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   public dop(akt<efi<?, ?>> $$0, dwu.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
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
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwv $$4 = $$1.a_($$3);
      return $$4.a(awo.bc) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(arc $$0, ji $$1, dwv $$2, azg $$3) {
      Optional<? extends jr<efi<?, ?>>> $$4 = $$0.K_().e(mc.aL).a(this.d);
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
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return true;
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
