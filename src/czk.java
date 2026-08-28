import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czk(float c) implements czh {
   private static final float f = 16.0F;
   public static final MapCodec<czk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.o.optionalFieldOf("diameter", 16.0F).forGetter(czk::b)).apply($$0, czk::new)
   );
   public static final zf<ws, czk> b = zf.a(zd.j, czk::b, czk::new);

   public czk() {
      this(16.0F);
   }

   @Override
   public czh.a<czk> a() {
      return czh.a.d;
   }

   @Override
   public boolean a(dev $$0, cvx $$1, buv $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dC() + ($$2.ea().j() - 0.5) * (double)this.c;
         double $$6 = azj.a($$2.dE() + ($$2.ea().j() - 0.5) * (double)this.c, (double)$$0.I_(), (double)($$0.I_() + ((arm)$$0).k() - 1));
         double $$7 = $$2.dI() + ($$2.ea().j() - 0.5) * (double)this.c;
         if ($$2.ca()) {
            $$2.af();
         }

         ezh $$8 = $$2.dv();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(eaa.R, $$8, eaa.a.a($$2));
            awl $$10;
            awj $$9;
            if ($$2 instanceof cgw) {
               $$9 = awk.jq;
               $$10 = awl.g;
            } else {
               $$9 = awk.fi;
               $$10 = awl.h;
            }

            $$0.a(null, $$2.dC(), $$2.dE(), $$2.dI(), $$9, $$10);
            $$2.n();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof coh $$13) {
         $$13.gO();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
