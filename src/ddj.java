import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddj extends dcw {
   public static final MapCodec<ddj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akz.d(dcz.ah), akz.d(dcz.ai), akz.d(dcz.aj), akz.d(dcz.ak), akz.d(dcz.al)).apply($$0, $$0.stable(ddj::new))
   );
   private final ji<dcs> c;
   private final ji<dcs> d;
   private final ji<dcs> e;
   private final ji<dcs> f;
   private final ji<dcs> g;

   public static ddj a(jj<dcs> $$0) {
      return new ddj($$0.b(dcz.ah), $$0.b(dcz.ai), $$0.b(dcz.aj), $$0.b(dcz.ak), $$0.b(dcz.al));
   }

   private ddj(ji<dcs> $$0, ji<dcs> $$1, ji<dcs> $$2, ji<dcs> $$3, ji<dcs> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ji<dcs>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dcw> a() {
      return b;
   }

   @Override
   public ji<dcs> getNoiseBiome(int $$0, int $$1, int $$2, ddb.f $$3) {
      int $$4 = jt.c($$0);
      int $$5 = jt.c($$1);
      int $$6 = jt.c($$2);
      int $$7 = kb.a($$4);
      int $$8 = kb.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kb.a($$4) * 2 + 1) * 8;
         int $$10 = (kb.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dxi.e($$9, $$5, $$10));
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
