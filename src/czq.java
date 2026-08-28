import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czq(float c) implements czn {
   private static final float f = 16.0F;
   public static final MapCodec<czq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayt.o.optionalFieldOf("diameter", 16.0F).forGetter(czq::b)).apply($$0, czq::new)
   );
   public static final zg<wt, czq> b = zg.a(ze.j, czq::b, czq::new);

   public czq() {
      this(16.0F);
   }

   @Override
   public czn.a<czq> a() {
      return czn.a.d;
   }

   @Override
   public boolean a(dfb $$0, cwb $$1, bva $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dC() + ($$2.ea().j() - 0.5) * (double)this.c;
         double $$6 = azk.a($$2.dE() + ($$2.ea().j() - 0.5) * (double)this.c, (double)$$0.I_(), (double)($$0.I_() + ((arn)$$0).k() - 1));
         double $$7 = $$2.dI() + ($$2.ea().j() - 0.5) * (double)this.c;
         if ($$2.ca()) {
            $$2.af();
         }

         ezn $$8 = $$2.dv();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(eag.R, $$8, eag.a.a($$2));
            awm $$10;
            awk $$9;
            if ($$2 instanceof chb) {
               $$9 = awl.jq;
               $$10 = awm.g;
            } else {
               $$9 = awl.fi;
               $$10 = awm.h;
            }

            $$0.a(null, $$2.dC(), $$2.dE(), $$2.dI(), $$9, $$10);
            $$2.n();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof com $$13) {
         $$13.gO();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
