import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eri extends esc {
   public static final MapCodec<eri> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eri::new)
   );
   private final Optional<ju<dkd>> b;
   private final float c;

   public eri(ju<dkd> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eri(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eri(Optional<ju<dkd>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public esf.d a(dhc $$0, jh $$1, jh $$2, esf.d $$3, esf.d $$4, esb $$5) {
      bac $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ese<?> a() {
      return ese.f;
   }
}
