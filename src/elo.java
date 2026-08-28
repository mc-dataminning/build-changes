import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class elo extends emh {
   public static final MapCodec<elo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jx.a(lq.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, elo::new)
   );
   private final Optional<jm<dez>> b;
   private final float c;

   public elo(jm<dez> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public elo(float $$0) {
      this(Optional.empty(), $$0);
   }

   private elo(Optional<jm<dez>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public emk.c a(dcb $$0, iz $$1, iz $$2, emk.c $$3, emk.c $$4, emg $$5) {
      azh $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected emj<?> a() {
      return emj.f;
   }
}
