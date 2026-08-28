import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class emc extends emv {
   public static final MapCodec<emc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.a(lr.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, emc::new)
   );
   private final Optional<jn<dfi>> b;
   private final float c;

   public emc(jn<dfi> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public emc(float $$0) {
      this(Optional.empty(), $$0);
   }

   private emc(Optional<jn<dfi>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public emy.c a(dcj $$0, ja $$1, ja $$2, emy.c $$3, emy.c $$4, emu $$5) {
      ayo $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected emx<?> a() {
      return emx.f;
   }
}
