import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcu(float c) implements dcr {
   private static final float f = 16.0F;
   public static final MapCodec<dcu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.o.optionalFieldOf("diameter", 16.0F).forGetter(dcu::b)).apply($$0, dcu::new)
   );
   public static final yw<wj, dcu> b = yw.a(yu.l, dcu::b, dcu::new);

   public dcu() {
      this(16.0F);
   }

   @Override
   public dcr.a<dcu> a() {
      return dcr.a.d;
   }

   @Override
   public boolean a(dja $$0, czd $$1, bxe $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dA() + ($$2.dY().j() - 0.5) * (double)this.c;
         double $$6 = azm.a($$2.dC() + ($$2.dY().j() - 0.5) * (double)this.c, (double)$$0.G_(), (double)($$0.G_() + ((arq)$$0).l() - 1));
         double $$7 = $$2.dG() + ($$2.dY().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.bP();
         }

         feq $$8 = $$2.dt();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(efh.R, $$8, efh.a.a($$2));
            awo $$10;
            awm $$9;
            if ($$2 instanceof cjj) {
               $$9 = awn.jT;
               $$10 = awo.g;
            } else {
               $$9 = awn.fl;
               $$10 = awo.h;
            }

            $$0.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof crc $$13) {
         $$13.gP();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
