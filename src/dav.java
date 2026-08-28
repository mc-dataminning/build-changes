import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dav(float c) implements das {
   private static final float f = 16.0F;
   public static final MapCodec<dav> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azd.o.optionalFieldOf("diameter", 16.0F).forGetter(dav::b)).apply($$0, dav::new)
   );
   public static final zi<wv, dav> b = zi.a(zg.l, dav::b, dav::new);

   public dav() {
      this(16.0F);
   }

   @Override
   public das.a<dav> a() {
      return das.a.d;
   }

   @Override
   public boolean a(dgz $$0, cxg $$1, bvx $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dB() + ($$2.dZ().j() - 0.5) * (double)this.c;
         double $$6 = azu.a($$2.dD() + ($$2.dZ().j() - 0.5) * (double)this.c, (double)$$0.L_(), (double)($$0.L_() + ((arx)$$0).l() - 1));
         double $$7 = $$2.dH() + ($$2.dZ().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.ae();
         }

         fbr $$8 = $$2.du();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(eck.R, $$8, eck.a.a($$2));
            aww $$10;
            awu $$9;
            if ($$2 instanceof chy) {
               $$9 = awv.jP;
               $$10 = aww.g;
            } else {
               $$9 = awv.fj;
               $$10 = aww.h;
            }

            $$0.a(null, $$2.dB(), $$2.dD(), $$2.dH(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cpo $$13) {
         $$13.gN();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
