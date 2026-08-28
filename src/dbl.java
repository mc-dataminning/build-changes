import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbl(float c) implements dbi {
   private static final float f = 16.0F;
   public static final MapCodec<dbl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.o.optionalFieldOf("diameter", 16.0F).forGetter(dbl::b)).apply($$0, dbl::new)
   );
   public static final yt<wg, dbl> b = yt.a(yr.l, dbl::b, dbl::new);

   public dbl() {
      this(16.0F);
   }

   @Override
   public dbi.a<dbl> a() {
      return dbi.a.d;
   }

   @Override
   public boolean a(dhp $$0, cxy $$1, bwr $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dA() + ($$2.dY().j() - 0.5) * (double)this.c;
         double $$6 = azk.a($$2.dC() + ($$2.dY().j() - 0.5) * (double)this.c, (double)$$0.G_(), (double)($$0.G_() + ((arn)$$0).l() - 1));
         double $$7 = $$2.dG() + ($$2.dY().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.bP();
         }

         fcu $$8 = $$2.dt();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(edm.R, $$8, edm.a.a($$2));
            awl $$10;
            awj $$9;
            if ($$2 instanceof ciq) {
               $$9 = awk.jP;
               $$10 = awl.g;
            } else {
               $$9 = awk.fj;
               $$10 = awl.h;
            }

            $$0.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cqi $$13) {
         $$13.gO();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
