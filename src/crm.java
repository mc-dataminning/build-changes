import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class crm extends cqz {
   public static final Codec<crm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aew.d(crc.ah), aew.d(crc.ai), aew.d(crc.aj), aew.d(crc.ak), aew.d(crc.al)).apply($$0, $$0.stable(crm::new))
   );
   private final hg<cqv> c;
   private final hg<cqv> d;
   private final hg<cqv> e;
   private final hg<cqv> f;
   private final hg<cqv> g;

   public static crm a(hh<cqv> $$0) {
      return new crm($$0.b(crc.ah), $$0.b(crc.ai), $$0.b(crc.aj), $$0.b(crc.ak), $$0.b(crc.al));
   }

   private crm(hg<cqv> $$0, hg<cqv> $$1, hg<cqv> $$2, hg<cqv> $$3, hg<cqv> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<hg<cqv>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cqz> a() {
      return b;
   }

   @Override
   public hg<cqv> getNoiseBiome(int $$0, int $$1, int $$2, cre.f $$3) {
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
         double $$11 = $$3.e().a(new dkn.e($$9, $$5, $$10));
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
