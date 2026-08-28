import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daf(float c) implements dac {
   private static final float f = 16.0F;
   public static final MapCodec<daf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.o.optionalFieldOf("diameter", 16.0F).forGetter(daf::b)).apply($$0, daf::new)
   );
   public static final yn<wa, daf> b = yn.a(yl.l, daf::b, daf::new);

   public daf() {
      this(16.0F);
   }

   @Override
   public dac.a<daf> a() {
      return dac.a.d;
   }

   @Override
   public boolean a(dgj $$0, cwq $$1, bvi $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dA() + ($$2.dY().j() - 0.5) * (double)this.c;
         double $$6 = ayz.a($$2.dC() + ($$2.dY().j() - 0.5) * (double)this.c, (double)$$0.L_(), (double)($$0.L_() + ((ard)$$0).l() - 1));
         double $$7 = $$2.dG() + ($$2.dY().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.ae();
         }

         fbb $$8 = $$2.dt();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(ebu.R, $$8, ebu.a.a($$2));
            awb $$10;
            avz $$9;
            if ($$2 instanceof chj) {
               $$9 = awa.jP;
               $$10 = awb.g;
            } else {
               $$9 = awa.fj;
               $$10 = awb.h;
            }

            $$0.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof coy $$13) {
         $$13.gP();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
