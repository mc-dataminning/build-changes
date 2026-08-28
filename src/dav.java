import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dav(float c) implements das {
   private static final float f = 16.0F;
   public static final MapCodec<dav> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.o.optionalFieldOf("diameter", 16.0F).forGetter(dav::b)).apply($$0, dav::new)
   );
   public static final yn<wa, dav> b = yn.a(yl.l, dav::b, dav::new);

   public dav() {
      this(16.0F);
   }

   @Override
   public das.a<dav> a() {
      return das.a.d;
   }

   @Override
   public boolean a(dgz $$0, cxh $$1, bvy $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dz() + ($$2.dX().j() - 0.5) * (double)this.c;
         double $$6 = ayz.a($$2.dB() + ($$2.dX().j() - 0.5) * (double)this.c, (double)$$0.G_(), (double)($$0.G_() + ((ard)$$0).l() - 1));
         double $$7 = $$2.dF() + ($$2.dX().j() - 0.5) * (double)this.c;
         if ($$2.bY()) {
            $$2.bO();
         }

         fbx $$8 = $$2.ds();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(ecp.R, $$8, ecp.a.a($$2));
            awb $$10;
            avz $$9;
            if ($$2 instanceof chz) {
               $$9 = awa.jP;
               $$10 = awb.g;
            } else {
               $$9 = awa.fj;
               $$10 = awb.h;
            }

            $$0.a(null, $$2.dz(), $$2.dB(), $$2.dF(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cpr $$13) {
         $$13.gR();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
