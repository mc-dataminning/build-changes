import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dgy extends dgl {
   public static final MapCodec<dgy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alj.d(dgo.ah), alj.d(dgo.ai), alj.d(dgo.aj), alj.d(dgo.ak), alj.d(dgo.al)).apply($$0, $$0.stable(dgy::new))
   );
   private final jq<dgh> c;
   private final jq<dgh> d;
   private final jq<dgh> e;
   private final jq<dgh> f;
   private final jq<dgh> g;

   public static dgy a(jr<dgh> $$0) {
      return new dgy($$0.b(dgo.ah), $$0.b(dgo.ai), $$0.b(dgo.aj), $$0.b(dgo.ak), $$0.b(dgo.al));
   }

   private dgy(jq<dgh> $$0, jq<dgh> $$1, jq<dgh> $$2, jq<dgh> $$3, jq<dgh> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jq<dgh>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dgl> a() {
      return b;
   }

   @Override
   public jq<dgh> getNoiseBiome(int $$0, int $$1, int $$2, dgq.f $$3) {
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
         double $$11 = $$3.e().a(new ebc.e($$9, $$5, $$10));
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
