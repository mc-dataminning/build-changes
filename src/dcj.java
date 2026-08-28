import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcj(float c) implements dcg {
   private static final float f = 16.0F;
   public static final MapCodec<dcj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.o.optionalFieldOf("diameter", 16.0F).forGetter(dcj::b)).apply($$0, dcj::new)
   );
   public static final yu<wh, dcj> b = yu.a(ys.l, dcj::b, dcj::new);

   public dcj() {
      this(16.0F);
   }

   @Override
   public dcg.a<dcj> a() {
      return dcg.a.d;
   }

   @Override
   public boolean a(dip $$0, cys $$1, bwz $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dA() + ($$2.dY().j() - 0.5) * (double)this.c;
         double $$6 = azk.a($$2.dC() + ($$2.dY().j() - 0.5) * (double)this.c, (double)$$0.G_(), (double)($$0.G_() + ((aro)$$0).l() - 1));
         double $$7 = $$2.dG() + ($$2.dY().j() - 0.5) * (double)this.c;
         if ($$2.bZ()) {
            $$2.bP();
         }

         fdw $$8 = $$2.dt();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(eeo.R, $$8, eeo.a.a($$2));
            awm $$10;
            awk $$9;
            if ($$2 instanceof ciz) {
               $$9 = awl.jP;
               $$10 = awm.g;
            } else {
               $$9 = awl.fj;
               $$10 = awm.h;
            }

            $$0.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cqs $$13) {
         $$13.gO();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
