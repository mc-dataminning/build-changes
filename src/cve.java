import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cve extends cur {
   public static final Codec<cve> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahe.d(cuu.ah), ahe.d(cuu.ai), ahe.d(cuu.aj), ahe.d(cuu.ak), ahe.d(cuu.al)).apply($$0, $$0.stable(cve::new))
   );
   private final ih<cun> c;
   private final ih<cun> d;
   private final ih<cun> e;
   private final ih<cun> f;
   private final ih<cun> g;

   public static cve a(ii<cun> $$0) {
      return new cve($$0.b(cuu.ah), $$0.b(cuu.ai), $$0.b(cuu.aj), $$0.b(cuu.ak), $$0.b(cuu.al));
   }

   private cve(ih<cun> $$0, ih<cun> $$1, ih<cun> $$2, ih<cun> $$3, ih<cun> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ih<cun>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cur> a() {
      return b;
   }

   @Override
   public ih<cun> getNoiseBiome(int $$0, int $$1, int $$2, cuw.f $$3) {
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
         double $$11 = $$3.e().a(new doi.e($$9, $$5, $$10));
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
