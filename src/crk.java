import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class crk extends cqx {
   public static final Codec<crk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aev.d(cra.ah), aev.d(cra.ai), aev.d(cra.aj), aev.d(cra.ak), aev.d(cra.al)).apply($$0, $$0.stable(crk::new))
   );
   private final hg<cqt> c;
   private final hg<cqt> d;
   private final hg<cqt> e;
   private final hg<cqt> f;
   private final hg<cqt> g;

   public static crk a(hh<cqt> $$0) {
      return new crk($$0.b(cra.ah), $$0.b(cra.ai), $$0.b(cra.aj), $$0.b(cra.ak), $$0.b(cra.al));
   }

   private crk(hg<cqt> $$0, hg<cqt> $$1, hg<cqt> $$2, hg<cqt> $$3, hg<cqt> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<hg<cqt>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cqx> a() {
      return b;
   }

   @Override
   public hg<cqt> getNoiseBiome(int $$0, int $$1, int $$2, crc.f $$3) {
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
         double $$11 = $$3.e().a(new dkl.e($$9, $$5, $$10));
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
