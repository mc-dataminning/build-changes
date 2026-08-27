import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ebs extends ecl {
   public static final Codec<ebs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               it.a(kc.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ebs::new)
   );
   private final Optional<ij<cvz>> b;
   private final float c;

   public ebs(ij<cvz> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ebs(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ebs(Optional<ij<cvz>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public eco.c a(ctb $$0, hv $$1, hv $$2, eco.c $$3, eco.c $$4, eck $$5) {
      auf $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ecn<?> a() {
      return ecn.f;
   }
}
