import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eus extends evm {
   public static final MapCodec<eus> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.a(mh.i).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eus::new)
   );
   private final Optional<jj<dmr>> b;
   private final float c;

   public eus(jj<dmr> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eus(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eus(Optional<jj<dmr>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public evp.d a(djp $$0, iv $$1, iv $$2, evp.d $$3, evp.d $$4, evl $$5) {
      azv $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected evo<?> a() {
      return evo.f;
   }
}
