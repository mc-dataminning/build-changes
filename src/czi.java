import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czi(float c) implements czf {
   private static final float f = 16.0F;
   public static final MapCodec<czi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aym.n.optionalFieldOf("diameter", 16.0F).forGetter(czi::b)).apply($$0, czi::new)
   );
   public static final zb<wo, czi> b = zb.a(yz.i, czi::b, czi::new);

   public czi() {
      this(16.0F);
   }

   @Override
   public czf.a<czi> a() {
      return czf.a.d;
   }

   @Override
   public boolean a(deg $$0, cvp $$1, buk $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dx() + ($$2.dV().j() - 0.5) * 16.0;
         double $$6 = azd.a($$2.dz() + (double)($$2.dV().a(16) - 8), (double)$$0.G_(), (double)($$0.G_() + ((arh)$$0).k() - 1));
         double $$7 = $$2.dD() + ($$2.dV().j() - 0.5) * 16.0;
         if ($$2.bW()) {
            $$2.af();
         }

         eys $$8 = $$2.dq();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(dzl.R, $$8, dzl.a.a($$2));
            awf $$10;
            awd $$9;
            if ($$2 instanceof cgk) {
               $$9 = awe.jq;
               $$10 = awf.g;
            } else {
               $$9 = awe.fi;
               $$10 = awf.h;
            }

            $$0.a(null, $$2.dx(), $$2.dz(), $$2.dD(), $$9, $$10);
            $$2.n();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cnu $$13) {
         $$13.gG();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
