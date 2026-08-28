import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ety extends eus {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jt.a(mg.i).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ety::new)
   );
   private final Optional<ji<dma>> b;
   private final float c;

   public ety(ji<dma> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ety(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ety(Optional<ji<dma>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public euv.d a(diy $$0, iu $$1, iu $$2, euv.d $$3, euv.d $$4, eur $$5) {
      azv $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected euu<?> a() {
      return euu.f;
   }
}
