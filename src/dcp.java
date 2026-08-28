import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcp(float c) implements dcm {
   private static final float f = 16.0F;
   public static final MapCodec<dcp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.o.optionalFieldOf("diameter", 16.0F).forGetter(dcp::b)).apply($$0, dcp::new)
   );
   public static final yw<wj, dcp> b = yw.a(yu.l, dcp::b, dcp::new);

   public dcp() {
      this(16.0F);
   }

   @Override
   public dcm.a<dcp> a() {
      return dcm.a.d;
   }

   @Override
   public boolean a(div $$0, cyy $$1, bxc $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dA() + ($$2.dY().j() - 0.5) * (double)this.c;
         double $$6 = azm.a($$2.dC() + ($$2.dY().j() - 0.5) * (double)this.c, (double)$$0.G_(), (double)($$0.G_() + ((arq)$$0).l() - 1));
         double $$7 = $$2.dG() + ($$2.dY().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.bP();
         }

         fei $$8 = $$2.dt();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(eez.R, $$8, eez.a.a($$2));
            awo $$10;
            awm $$9;
            if ($$2 instanceof cjf) {
               $$9 = awn.jQ;
               $$10 = awo.g;
            } else {
               $$9 = awn.fj;
               $$10 = awo.h;
            }

            $$0.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cqy $$13) {
         $$13.gO();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
