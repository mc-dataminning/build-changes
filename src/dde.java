import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dde(float c) implements ddb {
   private static final float f = 16.0F;
   public static final MapCodec<dde> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.o.optionalFieldOf("diameter", 16.0F).forGetter(dde::b)).apply($$0, dde::new)
   );
   public static final yw<wj, dde> b = yw.a(yu.l, dde::b, dde::new);

   public dde() {
      this(16.0F);
   }

   @Override
   public ddb.a<dde> a() {
      return ddb.a.d;
   }

   @Override
   public boolean a(djm $$0, czn $$1, bxj $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dz() + ($$2.dX().j() - 0.5) * (double)this.c;
         double $$6 = azm.a($$2.dB() + ($$2.dX().j() - 0.5) * (double)this.c, (double)$$0.G_(), (double)($$0.G_() + ((arq)$$0).l() - 1));
         double $$7 = $$2.dF() + ($$2.dX().j() - 0.5) * (double)this.c;
         if ($$2.bX()) {
            $$2.bN();
         }

         ffc $$8 = $$2.ds();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(eft.R, $$8, eft.a.a($$2));
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

      if ($$3 && $$2 instanceof crm $$13) {
         $$13.gO();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
