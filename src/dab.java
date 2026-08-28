import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dab(float c) implements czy {
   private static final float f = 16.0F;
   public static final MapCodec<dab> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayv.o.optionalFieldOf("diameter", 16.0F).forGetter(dab::b)).apply($$0, dab::new)
   );
   public static final zh<wu, dab> b = zh.a(zf.k, dab::b, dab::new);

   public dab() {
      this(16.0F);
   }

   @Override
   public czy.a<dab> a() {
      return czy.a.d;
   }

   @Override
   public boolean a(dfm $$0, cwm $$1, bvh $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dA() + ($$2.dY().j() - 0.5) * (double)this.c;
         double $$6 = azm.a($$2.dC() + ($$2.dY().j() - 0.5) * (double)this.c, (double)$$0.K_(), (double)($$0.K_() + ((arp)$$0).l() - 1));
         double $$7 = $$2.dG() + ($$2.dY().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.ae();
         }

         ezy $$8 = $$2.dt();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(ear.R, $$8, ear.a.a($$2));
            awo $$10;
            awm $$9;
            if ($$2 instanceof chi) {
               $$9 = awn.jq;
               $$10 = awo.g;
            } else {
               $$9 = awn.fi;
               $$10 = awo.h;
            }

            $$0.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cou $$13) {
         $$13.gL();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
