import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cvf extends cus {
   public static final Codec<cvf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahe.d(cuv.ah), ahe.d(cuv.ai), ahe.d(cuv.aj), ahe.d(cuv.ak), ahe.d(cuv.al)).apply($$0, $$0.stable(cvf::new))
   );
   private final ih<cuo> c;
   private final ih<cuo> d;
   private final ih<cuo> e;
   private final ih<cuo> f;
   private final ih<cuo> g;

   public static cvf a(ii<cuo> $$0) {
      return new cvf($$0.b(cuv.ah), $$0.b(cuv.ai), $$0.b(cuv.aj), $$0.b(cuv.ak), $$0.b(cuv.al));
   }

   private cvf(ih<cuo> $$0, ih<cuo> $$1, ih<cuo> $$2, ih<cuo> $$3, ih<cuo> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ih<cuo>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cus> a() {
      return b;
   }

   @Override
   public ih<cuo> getNoiseBiome(int $$0, int $$1, int $$2, cux.f $$3) {
      int $$4 = is.c($$0);
      int $$5 = is.c($$1);
      int $$6 = is.c($$2);
      int $$7 = iz.a($$4);
      int $$8 = iz.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (iz.a($$4) * 2 + 1) * 8;
         int $$10 = (iz.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new doj.e($$9, $$5, $$10));
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
