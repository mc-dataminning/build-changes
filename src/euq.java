import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class euq extends evh {
   public static final MapCodec<euq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egn.a.g.fieldOf("heightmap").orElse(egn.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, euq::new)
   );
   private final egn.a b;
   private final int c;

   public euq(egn.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public evk.d a(djk $$0, iv $$1, iv $$2, evk.d $$3, evk.d $$4, evg $$5) {
      egn.a $$6;
      if ($$0 instanceof arq) {
         if (this.b == egn.a.a) {
            $$6 = egn.a.b;
         } else if (this.b == egn.a.c) {
            $$6 = egn.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iv $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new evk.d(new iv($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected evj<?> a() {
      return evj.g;
   }
}
