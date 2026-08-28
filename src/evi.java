import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class evi extends ewc {
   public static final MapCodec<evi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jv.a(mi.i).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, evi::new)
   );
   private final Optional<jk<dne>> b;
   private final float c;

   public evi(jk<dne> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public evi(float $$0) {
      this(Optional.empty(), $$0);
   }

   private evi(Optional<jk<dne>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ewf.d a(dkc $$0, iw $$1, iw $$2, ewf.d $$3, ewf.d $$4, ewb $$5) {
      azz $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ewe<?> a() {
      return ewe.f;
   }
}
