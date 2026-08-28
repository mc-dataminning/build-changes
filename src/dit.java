import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dit extends dig {
   public static final MapCodec<dit> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alx.d(dij.ah), alx.d(dij.ai), alx.d(dij.aj), alx.d(dij.ak), alx.d(dij.al)).apply($$0, $$0.stable(dit::new))
   );
   private final jq<dic> c;
   private final jq<dic> d;
   private final jq<dic> e;
   private final jq<dic> f;
   private final jq<dic> g;

   public static dit a(jr<dic> $$0) {
      return new dit($$0.b(dij.ah), $$0.b(dij.ai), $$0.b(dij.aj), $$0.b(dij.ak), $$0.b(dij.al));
   }

   private dit(jq<dic> $$0, jq<dic> $$1, jq<dic> $$2, jq<dic> $$3, jq<dic> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jq<dic>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dig> a() {
      return b;
   }

   @Override
   public jq<dic> getNoiseBiome(int $$0, int $$1, int $$2, dil.f $$3) {
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
         double $$11 = $$3.e().a(new edb.e($$9, $$5, $$10));
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
