import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class elp extends emi {
   public static final MapCodec<elp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jx.a(lq.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, elp::new)
   );
   private final Optional<jm<dfa>> b;
   private final float c;

   public elp(jm<dfa> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public elp(float $$0) {
      this(Optional.empty(), $$0);
   }

   private elp(Optional<jm<dfa>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public eml.c a(dcc $$0, iz $$1, iz $$2, eml.c $$3, eml.c $$4, emh $$5) {
      azh $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected emk<?> a() {
      return emk.f;
   }
}
