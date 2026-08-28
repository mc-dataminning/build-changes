import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddb(float c) implements dcy {
   private static final float f = 16.0F;
   public static final MapCodec<ddb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.o.optionalFieldOf("diameter", 16.0F).forGetter(ddb::b)).apply($$0, ddb::new)
   );
   public static final yw<wj, ddb> b = yw.a(yu.l, ddb::b, ddb::new);

   public ddb() {
      this(16.0F);
   }

   @Override
   public dcy.a<ddb> a() {
      return dcy.a.d;
   }

   @Override
   public boolean a(djh $$0, czk $$1, bxj $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dz() + ($$2.dX().j() - 0.5) * (double)this.c;
         double $$6 = azm.a($$2.dB() + ($$2.dX().j() - 0.5) * (double)this.c, (double)$$0.G_(), (double)($$0.G_() + ((arq)$$0).l() - 1));
         double $$7 = $$2.dF() + ($$2.dX().j() - 0.5) * (double)this.c;
         if ($$2.bX()) {
            $$2.bN();
         }

         fex $$8 = $$2.ds();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(efo.R, $$8, efo.a.a($$2));
            awo $$10;
            awm $$9;
            if ($$2 instanceof cjo) {
               $$9 = awn.jT;
               $$10 = awo.g;
            } else {
               $$9 = awn.fl;
               $$10 = awo.h;
            }

            $$0.a(null, $$2.dz(), $$2.dB(), $$2.dF(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof crj $$13) {
         $$13.gO();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
