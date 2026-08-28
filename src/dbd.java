import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbd(float c) implements dba {
   private static final float f = 16.0F;
   public static final MapCodec<dbd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azn.o.optionalFieldOf("diameter", 16.0F).forGetter(dbd::b)).apply($$0, dbd::new)
   );
   public static final zt<xg, dbd> b = zt.a(zr.l, dbd::b, dbd::new);

   public dbd() {
      this(16.0F);
   }

   @Override
   public dba.a<dbd> a() {
      return dba.a.d;
   }

   @Override
   public boolean a(dhh $$0, cxo $$1, bwf $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dB() + ($$2.dZ().j() - 0.5) * (double)this.c;
         double $$6 = bae.a($$2.dD() + ($$2.dZ().j() - 0.5) * (double)this.c, (double)$$0.L_(), (double)($$0.L_() + ((ash)$$0).l() - 1));
         double $$7 = $$2.dH() + ($$2.dZ().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.ae();
         }

         fbx $$8 = $$2.du();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(ecq.R, $$8, ecq.a.a($$2));
            axg $$10;
            axe $$9;
            if ($$2 instanceof cig) {
               $$9 = axf.jJ;
               $$10 = axg.g;
            } else {
               $$9 = axf.fj;
               $$10 = axg.h;
            }

            $$0.a(null, $$2.dB(), $$2.dD(), $$2.dH(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cpw $$13) {
         $$13.gN();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
