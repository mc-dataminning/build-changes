import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dja extends din {
   public static final MapCodec<dja> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alx.d(diq.ah), alx.d(diq.ai), alx.d(diq.aj), alx.d(diq.ak), alx.d(diq.al)).apply($$0, $$0.stable(dja::new))
   );
   private final jq<dij> c;
   private final jq<dij> d;
   private final jq<dij> e;
   private final jq<dij> f;
   private final jq<dij> g;

   public static dja a(jr<dij> $$0) {
      return new dja($$0.b(diq.ah), $$0.b(diq.ai), $$0.b(diq.aj), $$0.b(diq.ak), $$0.b(diq.al));
   }

   private dja(jq<dij> $$0, jq<dij> $$1, jq<dij> $$2, jq<dij> $$3, jq<dij> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jq<dij>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends din> a() {
      return b;
   }

   @Override
   public jq<dij> getNoiseBiome(int $$0, int $$1, int $$2, dis.f $$3) {
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
         double $$11 = $$3.e().a(new edi.e($$9, $$5, $$10));
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
