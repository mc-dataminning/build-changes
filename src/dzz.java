import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dzz extends eas {
   public static final Codec<dzz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iq.a(jz.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dzz::new)
   );
   private final Optional<ig<cut>> b;
   private final float c;

   public dzz(ig<cut> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public dzz(float $$0) {
      this(Optional.empty(), $$0);
   }

   private dzz(Optional<ig<cut>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public eav.c a(crv $$0, ht $$1, ht $$2, eav.c $$3, eav.c $$4, ear $$5) {
      ato $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eau<?> a() {
      return eau.f;
   }
}
