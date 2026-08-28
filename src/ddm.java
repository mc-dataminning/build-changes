import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddm extends dcz {
   public static final MapCodec<ddm> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.d(ddc.ah), alc.d(ddc.ai), alc.d(ddc.aj), alc.d(ddc.ak), alc.d(ddc.al)).apply($$0, $$0.stable(ddm::new))
   );
   private final ji<dcv> c;
   private final ji<dcv> d;
   private final ji<dcv> e;
   private final ji<dcv> f;
   private final ji<dcv> g;

   public static ddm a(jj<dcv> $$0) {
      return new ddm($$0.b(ddc.ah), $$0.b(ddc.ai), $$0.b(ddc.aj), $$0.b(ddc.ak), $$0.b(ddc.al));
   }

   private ddm(ji<dcv> $$0, ji<dcv> $$1, ji<dcv> $$2, ji<dcv> $$3, ji<dcv> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ji<dcv>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dcz> a() {
      return b;
   }

   @Override
   public ji<dcv> getNoiseBiome(int $$0, int $$1, int $$2, dde.f $$3) {
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
         double $$11 = $$3.e().a(new dxl.e($$9, $$5, $$10));
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
