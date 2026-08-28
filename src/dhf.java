import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dhf extends dgs {
   public static final MapCodec<dhf> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.d(dgv.ah), alh.d(dgv.ai), alh.d(dgv.aj), alh.d(dgv.ak), alh.d(dgv.al)).apply($$0, $$0.stable(dhf::new))
   );
   private final jq<dgo> c;
   private final jq<dgo> d;
   private final jq<dgo> e;
   private final jq<dgo> f;
   private final jq<dgo> g;

   public static dhf a(jr<dgo> $$0) {
      return new dhf($$0.b(dgv.ah), $$0.b(dgv.ai), $$0.b(dgv.aj), $$0.b(dgv.ak), $$0.b(dgv.al));
   }

   private dhf(jq<dgo> $$0, jq<dgo> $$1, jq<dgo> $$2, jq<dgo> $$3, jq<dgo> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jq<dgo>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dgs> a() {
      return b;
   }

   @Override
   public jq<dgo> getNoiseBiome(int $$0, int $$1, int $$2, dgx.f $$3) {
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
         double $$11 = $$3.e().a(new ebj.e($$9, $$5, $$10));
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
