import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czu(float c) implements czr {
   private static final float f = 16.0F;
   public static final MapCodec<czu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayw.o.optionalFieldOf("diameter", 16.0F).forGetter(czu::b)).apply($$0, czu::new)
   );
   public static final zj<ww, czu> b = zj.a(zh.j, czu::b, czu::new);

   public czu() {
      this(16.0F);
   }

   @Override
   public czr.a<czu> a() {
      return czr.a.d;
   }

   @Override
   public boolean a(dff $$0, cwf $$1, bve $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dD() + ($$2.eb().j() - 0.5) * (double)this.c;
         double $$6 = azn.a($$2.dF() + ($$2.eb().j() - 0.5) * (double)this.c, (double)$$0.I_(), (double)($$0.I_() + ((arq)$$0).k() - 1));
         double $$7 = $$2.dJ() + ($$2.eb().j() - 0.5) * (double)this.c;
         if ($$2.cb()) {
            $$2.af();
         }

         ezr $$8 = $$2.dw();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(eak.R, $$8, eak.a.a($$2));
            awp $$10;
            awn $$9;
            if ($$2 instanceof chf) {
               $$9 = awo.jq;
               $$10 = awp.g;
            } else {
               $$9 = awo.fi;
               $$10 = awp.h;
            }

            $$0.a(null, $$2.dD(), $$2.dF(), $$2.dJ(), $$9, $$10);
            $$2.n();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cor $$13) {
         $$13.gQ();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
