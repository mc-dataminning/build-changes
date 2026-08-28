import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dku extends dkh {
   public static final MapCodec<dku> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.d(dkk.ai), ale.d(dkk.aj), ale.d(dkk.ak), ale.d(dkk.al), ale.d(dkk.am)).apply($$0, $$0.stable(dku::new))
   );
   private final je<dkd> c;
   private final je<dkd> d;
   private final je<dkd> e;
   private final je<dkd> f;
   private final je<dkd> g;

   public static dku a(jf<dkd> $$0) {
      return new dku($$0.b(dkk.ai), $$0.b(dkk.aj), $$0.b(dkk.ak), $$0.b(dkk.al), $$0.b(dkk.am));
   }

   private dku(je<dkd> $$0, je<dkd> $$1, je<dkd> $$2, je<dkd> $$3, je<dkd> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<je<dkd>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dkh> a() {
      return b;
   }

   @Override
   public je<dkd> getNoiseBiome(int $$0, int $$1, int $$2, dkm.f $$3) {
      int $$4 = jp.c($$0);
      int $$5 = jp.c($$1);
      int $$6 = jp.c($$2);
      int $$7 = jx.a($$4);
      int $$8 = jx.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jx.a($$4) * 2 + 1) * 8;
         int $$10 = (jx.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new efz.e($$9, $$5, $$10));
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
