import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class drv extends dvy implements dmp {
   public static final MapCodec<drv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mh.aL).fieldOf("feature").forGetter($$0x -> $$0x.c), t()).apply($$0, drv::new)
   );
   private static final ffr b = dmm.b(6.0, 0.0, 6.0);
   private final alf<ejf<?, ?>> c;

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   public drv(alf<ejf<?, ?>> $$0, ean.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (iv $$6 : iv.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         iv $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for (int $$8 = 0; $$8 < 4; $$8++) {
            if ($$1.v($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.v($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.e();
      eao $$4 = $$1.a_($$3);
      return $$4.a(axc.bc) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(arq $$0, iv $$1, eao $$2, azv $$3) {
      Optional<? extends jf<ejf<?, ?>>> $$4 = $$0.F_().f(mh.aL).a(this.c);
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
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return true;
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
