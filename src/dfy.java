import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dfy extends dfl {
   public static final MapCodec<dfy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ala.d(dfo.ah), ala.d(dfo.ai), ala.d(dfo.aj), ala.d(dfo.ak), ala.d(dfo.al)).apply($$0, $$0.stable(dfy::new))
   );
   private final jn<dfh> c;
   private final jn<dfh> d;
   private final jn<dfh> e;
   private final jn<dfh> f;
   private final jn<dfh> g;

   public static dfy a(jo<dfh> $$0) {
      return new dfy($$0.b(dfo.ah), $$0.b(dfo.ai), $$0.b(dfo.aj), $$0.b(dfo.ak), $$0.b(dfo.al));
   }

   private dfy(jn<dfh> $$0, jn<dfh> $$1, jn<dfh> $$2, jn<dfh> $$3, jn<dfh> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jn<dfh>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dfl> a() {
      return b;
   }

   @Override
   public jn<dfh> getNoiseBiome(int $$0, int $$1, int $$2, dfq.f $$3) {
      int $$4 = jy.c($$0);
      int $$5 = jy.c($$1);
      int $$6 = jy.c($$2);
      int $$7 = kg.a($$4);
      int $$8 = kg.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kg.a($$4) * 2 + 1) * 8;
         int $$10 = (kg.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new ead.e($$9, $$5, $$10));
         if ($$11 > 0.25) {
            return this.d;
         } else if ($$11 >= -0.0625) {
            return this.e;
         } else {
            return $$11 < -0.21875 ? this.f : this.g;
         }
      }
   }
}
