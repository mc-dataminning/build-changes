import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dac(float c) implements czz {
   private static final float f = 16.0F;
   public static final MapCodec<dac> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayh.o.optionalFieldOf("diameter", 16.0F).forGetter(dac::b)).apply($$0, dac::new)
   );
   public static final ym<vz, dac> b = ym.a(yk.l, dac::b, dac::new);

   public dac() {
      this(16.0F);
   }

   @Override
   public czz.a<dac> a() {
      return czz.a.d;
   }

   @Override
   public boolean a(dgg $$0, cwn $$1, bvf $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dB() + ($$2.dZ().j() - 0.5) * (double)this.c;
         double $$6 = ayy.a($$2.dD() + ($$2.dZ().j() - 0.5) * (double)this.c, (double)$$0.L_(), (double)($$0.L_() + ((arc)$$0).l() - 1));
         double $$7 = $$2.dH() + ($$2.dZ().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.ae();
         }

         fay $$8 = $$2.du();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(ebr.R, $$8, ebr.a.a($$2));
            awa $$10;
            avy $$9;
            if ($$2 instanceof chg) {
               $$9 = avz.jP;
               $$10 = awa.g;
            } else {
               $$9 = avz.fj;
               $$10 = awa.h;
            }

            $$0.a(null, $$2.dB(), $$2.dD(), $$2.dH(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cov $$13) {
         $$13.gP();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
