import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eun extends evh {
   public static final MapCodec<eun> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.a(mh.i).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eun::new)
   );
   private final Optional<jj<dmm>> b;
   private final float c;

   public eun(jj<dmm> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eun(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eun(Optional<jj<dmm>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public evk.d a(djk $$0, iv $$1, iv $$2, evk.d $$3, evk.d $$4, evg $$5) {
      azv $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected evj<?> a() {
      return evj.f;
   }
}
