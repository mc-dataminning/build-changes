import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czl(float c) implements czi {
   private static final float f = 16.0F;
   public static final MapCodec<czl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayo.n.optionalFieldOf("diameter", 16.0F).forGetter(czl::b)).apply($$0, czl::new)
   );
   public static final zc<wp, czl> b = zc.a(za.j, czl::b, czl::new);

   public czl() {
      this(16.0F);
   }

   @Override
   public czi.a<czl> a() {
      return czi.a.d;
   }

   @Override
   public boolean a(dej $$0, cvs $$1, bun $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dx() + ($$2.dV().j() - 0.5) * (double)this.c;
         double $$6 = azf.a($$2.dz() + ($$2.dV().j() - 0.5) * (double)this.c, (double)$$0.H_(), (double)($$0.H_() + ((arj)$$0).k() - 1));
         double $$7 = $$2.dD() + ($$2.dV().j() - 0.5) * (double)this.c;
         if ($$2.bW()) {
            $$2.af();
         }

         eyw $$8 = $$2.dq();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(dzp.R, $$8, dzp.a.a($$2));
            awh $$10;
            awf $$9;
            if ($$2 instanceof cgn) {
               $$9 = awg.jq;
               $$10 = awh.g;
            } else {
               $$9 = awg.fi;
               $$10 = awh.h;
            }

            $$0.a(null, $$2.dx(), $$2.dz(), $$2.dD(), $$9, $$10);
            $$2.n();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cnx $$13) {
         $$13.gH();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
