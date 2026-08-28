import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eln extends emg {
   public static final MapCodec<eln> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jx.a(lq.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eln::new)
   );
   private final Optional<jm<dey>> b;
   private final float c;

   public eln(jm<dey> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eln(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eln(Optional<jm<dey>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public emj.c a(dca $$0, iz $$1, iz $$2, emj.c $$3, emj.c $$4, emf $$5) {
      azg $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected emi<?> a() {
      return emi.f;
   }
}
