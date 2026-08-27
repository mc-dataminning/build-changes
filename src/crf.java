import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class crf extends cqs {
   public static final Codec<crf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aes.d(cqv.ah), aes.d(cqv.ai), aes.d(cqv.aj), aes.d(cqv.ak), aes.d(cqv.al)).apply($$0, $$0.stable(crf::new))
   );
   private final hg<cqo> c;
   private final hg<cqo> d;
   private final hg<cqo> e;
   private final hg<cqo> f;
   private final hg<cqo> g;

   public static crf a(hh<cqo> $$0) {
      return new crf($$0.b(cqv.ah), $$0.b(cqv.ai), $$0.b(cqv.aj), $$0.b(cqv.ak), $$0.b(cqv.al));
   }

   private crf(hg<cqo> $$0, hg<cqo> $$1, hg<cqo> $$2, hg<cqo> $$3, hg<cqo> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<hg<cqo>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cqs> a() {
      return b;
   }

   @Override
   public hg<cqo> getNoiseBiome(int $$0, int $$1, int $$2, cqx.f $$3) {
      int $$4 = hs.c($$0);
      int $$5 = hs.c($$1);
      int $$6 = hs.c($$2);
      int $$7 = hz.a($$4);
      int $$8 = hz.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (hz.a($$4) * 2 + 1) * 8;
         int $$10 = (hz.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dkg.e($$9, $$5, $$10));
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
