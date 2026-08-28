import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daz(float c) implements daw {
   private static final float f = 16.0F;
   public static final MapCodec<daz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azn.o.optionalFieldOf("diameter", 16.0F).forGetter(daz::b)).apply($$0, daz::new)
   );
   public static final zt<xg, daz> b = zt.a(zr.l, daz::b, daz::new);

   public daz() {
      this(16.0F);
   }

   @Override
   public daw.a<daz> a() {
      return daw.a.d;
   }

   @Override
   public boolean a(dha $$0, cxk $$1, bwb $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dA() + ($$2.dY().j() - 0.5) * (double)this.c;
         double $$6 = bae.a($$2.dC() + ($$2.dY().j() - 0.5) * (double)this.c, (double)$$0.L_(), (double)($$0.L_() + ((ash)$$0).l() - 1));
         double $$7 = $$2.dG() + ($$2.dY().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.ae();
         }

         fbs $$8 = $$2.dt();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(ecj.R, $$8, ecj.a.a($$2));
            axg $$10;
            axe $$9;
            if ($$2 instanceof cic) {
               $$9 = axf.jI;
               $$10 = axg.g;
            } else {
               $$9 = axf.fi;
               $$10 = axg.h;
            }

            $$0.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cps $$13) {
         $$13.gL();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
