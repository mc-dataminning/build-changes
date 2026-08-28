import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dis extends dif {
   public static final MapCodec<dis> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aln.d(dii.ai), aln.d(dii.aj), aln.d(dii.ak), aln.d(dii.al), aln.d(dii.am)).apply($$0, $$0.stable(dis::new))
   );
   private final jq<dib> c;
   private final jq<dib> d;
   private final jq<dib> e;
   private final jq<dib> f;
   private final jq<dib> g;

   public static dis a(jr<dib> $$0) {
      return new dis($$0.b(dii.ai), $$0.b(dii.aj), $$0.b(dii.ak), $$0.b(dii.al), $$0.b(dii.am));
   }

   private dis(jq<dib> $$0, jq<dib> $$1, jq<dib> $$2, jq<dib> $$3, jq<dib> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jq<dib>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dif> a() {
      return b;
   }

   @Override
   public jq<dib> getNoiseBiome(int $$0, int $$1, int $$2, dik.f $$3) {
      int $$4 = kb.c($$0);
      int $$5 = kb.c($$1);
      int $$6 = kb.c($$2);
      int $$7 = kj.a($$4);
      int $$8 = kj.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kj.a($$4) * 2 + 1) * 8;
         int $$10 = (kj.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new edc.e($$9, $$5, $$10));
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
