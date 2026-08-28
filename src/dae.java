import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dae(float c) implements dab {
   private static final float f = 16.0F;
   public static final MapCodec<dae> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.o.optionalFieldOf("diameter", 16.0F).forGetter(dae::b)).apply($$0, dae::new)
   );
   public static final ym<vz, dae> b = ym.a(yk.l, dae::b, dae::new);

   public dae() {
      this(16.0F);
   }

   @Override
   public dab.a<dae> a() {
      return dab.a.d;
   }

   @Override
   public boolean a(dgi $$0, cwp $$1, bvg $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dB() + ($$2.dZ().j() - 0.5) * (double)this.c;
         double $$6 = ayz.a($$2.dD() + ($$2.dZ().j() - 0.5) * (double)this.c, (double)$$0.L_(), (double)($$0.L_() + ((arc)$$0).l() - 1));
         double $$7 = $$2.dH() + ($$2.dZ().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.ae();
         }

         fba $$8 = $$2.du();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(ebt.R, $$8, ebt.a.a($$2));
            awb $$10;
            avz $$9;
            if ($$2 instanceof chh) {
               $$9 = awa.jP;
               $$10 = awb.g;
            } else {
               $$9 = awa.fj;
               $$10 = awb.h;
            }

            $$0.a(null, $$2.dB(), $$2.dD(), $$2.dH(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cox $$13) {
         $$13.gP();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
