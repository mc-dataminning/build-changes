import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class djb extends dio {
   public static final MapCodec<djb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alx.d(dir.ah), alx.d(dir.ai), alx.d(dir.aj), alx.d(dir.ak), alx.d(dir.al)).apply($$0, $$0.stable(djb::new))
   );
   private final jq<dik> c;
   private final jq<dik> d;
   private final jq<dik> e;
   private final jq<dik> f;
   private final jq<dik> g;

   public static djb a(jr<dik> $$0) {
      return new djb($$0.b(dir.ah), $$0.b(dir.ai), $$0.b(dir.aj), $$0.b(dir.ak), $$0.b(dir.al));
   }

   private djb(jq<dik> $$0, jq<dik> $$1, jq<dik> $$2, jq<dik> $$3, jq<dik> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jq<dik>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dio> a() {
      return b;
   }

   @Override
   public jq<dik> getNoiseBiome(int $$0, int $$1, int $$2, dit.f $$3) {
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
         double $$11 = $$3.e().a(new edj.e($$9, $$5, $$10));
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
