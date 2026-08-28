import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ema extends emt {
   public static final MapCodec<ema> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.a(lr.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ema::new)
   );
   private final Optional<jn<dfh>> b;
   private final float c;

   public ema(jn<dfh> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ema(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ema(Optional<jn<dfh>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public emw.c a(dci $$0, ja $$1, ja $$2, emw.c $$3, emw.c $$4, ems $$5) {
      ayo $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected emv<?> a() {
      return emv.f;
   }
}
