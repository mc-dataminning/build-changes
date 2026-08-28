import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dlb extends dko {
   public static final MapCodec<dlb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.d(dkr.ai), ale.d(dkr.aj), ale.d(dkr.ak), ale.d(dkr.al), ale.d(dkr.am)).apply($$0, $$0.stable(dlb::new))
   );
   private final jf<dkk> c;
   private final jf<dkk> d;
   private final jf<dkk> e;
   private final jf<dkk> f;
   private final jf<dkk> g;

   public static dlb a(jg<dkk> $$0) {
      return new dlb($$0.b(dkr.ai), $$0.b(dkr.aj), $$0.b(dkr.ak), $$0.b(dkr.al), $$0.b(dkr.am));
   }

   private dlb(jf<dkk> $$0, jf<dkk> $$1, jf<dkk> $$2, jf<dkk> $$3, jf<dkk> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jf<dkk>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dko> a() {
      return b;
   }

   @Override
   public jf<dkk> getNoiseBiome(int $$0, int $$1, int $$2, dkt.f $$3) {
      int $$4 = jq.c($$0);
      int $$5 = jq.c($$1);
      int $$6 = jq.c($$2);
      int $$7 = jy.a($$4);
      int $$8 = jy.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jy.a($$4) * 2 + 1) * 8;
         int $$10 = (jy.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new egg.e($$9, $$5, $$10));
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
