import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddr(float c) implements ddo {
   private static final float f = 16.0F;
   public static final MapCodec<ddr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayy.o.optionalFieldOf("diameter", 16.0F).forGetter(ddr::b)).apply($$0, ddr::new)
   );
   public static final za<wn, ddr> b = za.a(yy.l, ddr::b, ddr::new);

   public ddr() {
      this(16.0F);
   }

   @Override
   public ddo.a<ddr> a() {
      return ddo.a.d;
   }

   @Override
   public boolean a(djz $$0, daa $$1, bxw $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dA() + ($$2.dY().j() - 0.5) * (double)this.c;
         double $$6 = azq.a($$2.dC() + ($$2.dY().j() - 0.5) * (double)this.c, (double)$$0.K_(), (double)($$0.K_() + ((aru)$$0).l() - 1));
         double $$7 = $$2.dG() + ($$2.dY().j() - 0.5) * (double)this.c;
         if ($$2.bY()) {
            $$2.bO();
         }

         ffs $$8 = $$2.dt();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(egg.R, $$8, egg.a.a($$2));
            aws $$10;
            awq $$9;
            if ($$2 instanceof ckb) {
               $$9 = awr.jT;
               $$10 = aws.g;
            } else {
               $$9 = awr.fl;
               $$10 = aws.h;
            }

            $$0.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof crz $$13) {
         $$13.gP();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
