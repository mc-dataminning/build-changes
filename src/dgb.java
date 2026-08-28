import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dgb extends dfo {
   public static final MapCodec<dgb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.d(dfr.ah), alc.d(dfr.ai), alc.d(dfr.aj), alc.d(dfr.ak), alc.d(dfr.al)).apply($$0, $$0.stable(dgb::new))
   );
   private final jo<dfk> c;
   private final jo<dfk> d;
   private final jo<dfk> e;
   private final jo<dfk> f;
   private final jo<dfk> g;

   public static dgb a(jp<dfk> $$0) {
      return new dgb($$0.b(dfr.ah), $$0.b(dfr.ai), $$0.b(dfr.aj), $$0.b(dfr.ak), $$0.b(dfr.al));
   }

   private dgb(jo<dfk> $$0, jo<dfk> $$1, jo<dfk> $$2, jo<dfk> $$3, jo<dfk> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jo<dfk>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dfo> a() {
      return b;
   }

   @Override
   public jo<dfk> getNoiseBiome(int $$0, int $$1, int $$2, dft.f $$3) {
      int $$4 = jz.c($$0);
      int $$5 = jz.c($$1);
      int $$6 = jz.c($$2);
      int $$7 = kh.a($$4);
      int $$8 = kh.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kh.a($$4) * 2 + 1) * 8;
         int $$10 = (kh.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new eah.e($$9, $$5, $$10));
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
