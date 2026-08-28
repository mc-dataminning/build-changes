import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dgt extends dgg {
   public static final MapCodec<dgt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.d(dgj.ah), alg.d(dgj.ai), alg.d(dgj.aj), alg.d(dgj.ak), alg.d(dgj.al)).apply($$0, $$0.stable(dgt::new))
   );
   private final jq<dgc> c;
   private final jq<dgc> d;
   private final jq<dgc> e;
   private final jq<dgc> f;
   private final jq<dgc> g;

   public static dgt a(jr<dgc> $$0) {
      return new dgt($$0.b(dgj.ah), $$0.b(dgj.ai), $$0.b(dgj.aj), $$0.b(dgj.ak), $$0.b(dgj.al));
   }

   private dgt(jq<dgc> $$0, jq<dgc> $$1, jq<dgc> $$2, jq<dgc> $$3, jq<dgc> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jq<dgc>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dgg> a() {
      return b;
   }

   @Override
   public jq<dgc> getNoiseBiome(int $$0, int $$1, int $$2, dgl.f $$3) {
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
         double $$11 = $$3.e().a(new eay.e($$9, $$5, $$10));
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
