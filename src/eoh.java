import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eoh extends epb {
   public static final MapCodec<eoh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.a(lv.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eoh::new)
   );
   private final Optional<jr<dhj>> b;
   private final float c;

   public eoh(jr<dhj> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eoh(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eoh(Optional<jr<dhj>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public epe.c a(dej $$0, je $$1, je $$2, epe.c $$3, epe.c $$4, epa $$5) {
      azl $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected epd<?> a() {
      return epd.f;
   }
}
