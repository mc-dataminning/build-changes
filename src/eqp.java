import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eqp extends erj {
   public static final MapCodec<eqp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eqp::new)
   );
   private final Optional<jv<djk>> b;
   private final float c;

   public eqp(jv<djk> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eqp(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eqp(Optional<jv<djk>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public erm.d a(dgj $$0, ji $$1, ji $$2, erm.d $$3, erm.d $$4, eri $$5) {
      azg $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected erl<?> a() {
      return erl.f;
   }
}
