import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class euv extends evm {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egs.a.g.fieldOf("heightmap").orElse(egs.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, euv::new)
   );
   private final egs.a b;
   private final int c;

   public euv(egs.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public evp.d a(djp $$0, iv $$1, iv $$2, evp.d $$3, evp.d $$4, evl $$5) {
      egs.a $$6;
      if ($$0 instanceof arq) {
         if (this.b == egs.a.a) {
            $$6 = egs.a.b;
         } else if (this.b == egs.a.c) {
            $$6 = egs.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iv $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new evp.d(new iv($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected evo<?> a() {
      return evo.g;
   }
}
