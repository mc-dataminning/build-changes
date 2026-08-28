import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddp(float c) implements ddm {
   private static final float f = 16.0F;
   public static final MapCodec<ddp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayw.o.optionalFieldOf("diameter", 16.0F).forGetter(ddp::b)).apply($$0, ddp::new)
   );
   public static final yy<wl, ddp> b = yy.a(yw.l, ddp::b, ddp::new);

   public ddp() {
      this(16.0F);
   }

   @Override
   public ddm.a<ddp> a() {
      return ddm.a.d;
   }

   @Override
   public boolean a(djx $$0, czy $$1, bxu $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dA() + ($$2.dY().j() - 0.5) * (double)this.c;
         double $$6 = azo.a($$2.dC() + ($$2.dY().j() - 0.5) * (double)this.c, (double)$$0.K_(), (double)($$0.K_() + ((ars)$$0).l() - 1));
         double $$7 = $$2.dG() + ($$2.dY().j() - 0.5) * (double)this.c;
         if ($$2.bY()) {
            $$2.bO();
         }

         ffq $$8 = $$2.dt();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(ege.R, $$8, ege.a.a($$2));
            awq $$10;
            awo $$9;
            if ($$2 instanceof cjz) {
               $$9 = awp.jT;
               $$10 = awq.g;
            } else {
               $$9 = awp.fl;
               $$10 = awq.h;
            }

            $$0.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$9, $$10);
            $$2.k();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof crx $$13) {
         $$13.gP();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
