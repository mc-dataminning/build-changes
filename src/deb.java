import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deb(float c) implements ddy {
   private static final float f = 16.0F;
   public static final MapCodec<deb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azg.o.optionalFieldOf("diameter", 16.0F).forGetter(deb::b)).apply($$0, deb::new)
   );
   public static final ze<wp, deb> b = ze.a(zc.l, deb::b, deb::new);

   public deb() {
      this(16.0F);
   }

   @Override
   public ddy.a<deb> a() {
      return ddy.a.d;
   }

   @Override
   public boolean a(dkj $$0, dak $$1, byf $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dA() + ($$2.dY().j() - 0.5) * (double)this.c;
         double $$6 = azz.a($$2.dC() + ($$2.dY().j() - 0.5) * (double)this.c, (double)$$0.K_(), (double)($$0.K_() + ((asb)$$0).l() - 1));
         double $$7 = $$2.dG() + ($$2.dY().j() - 0.5) * (double)this.c;
         if ($$2.bY()) {
            $$2.bO();
         }

         fgc $$8 = $$2.dt();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(egq.R, $$8, egq.a.a($$2));
            awz $$10;
            awx $$9;
            if ($$2 instanceof ckk) {
               $$9 = awy.jT;
               $$10 = awz.g;
            } else {
               $$9 = awy.fl;
               $$10 = awz.h;
            }

            $$0.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$9, $$10);
            $$2.j();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof csi $$13) {
         $$13.gQ();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
