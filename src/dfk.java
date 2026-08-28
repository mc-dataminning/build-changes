import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dfk extends dex {
   public static final MapCodec<dfk> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akz.d(dfa.ah), akz.d(dfa.ai), akz.d(dfa.aj), akz.d(dfa.ak), akz.d(dfa.al)).apply($$0, $$0.stable(dfk::new))
   );
   private final jn<det> c;
   private final jn<det> d;
   private final jn<det> e;
   private final jn<det> f;
   private final jn<det> g;

   public static dfk a(jo<det> $$0) {
      return new dfk($$0.b(dfa.ah), $$0.b(dfa.ai), $$0.b(dfa.aj), $$0.b(dfa.ak), $$0.b(dfa.al));
   }

   private dfk(jn<det> $$0, jn<det> $$1, jn<det> $$2, jn<det> $$3, jn<det> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jn<det>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dex> a() {
      return b;
   }

   @Override
   public jn<det> getNoiseBiome(int $$0, int $$1, int $$2, dfc.f $$3) {
      int $$4 = jy.c($$0);
      int $$5 = jy.c($$1);
      int $$6 = jy.c($$2);
      int $$7 = kg.a($$4);
      int $$8 = kg.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kg.a($$4) * 2 + 1) * 8;
         int $$10 = (kg.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dzp.e($$9, $$5, $$10));
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
