import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eqq extends erk {
   public static final MapCodec<eqq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.a(mc.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eqq::new)
   );
   private final Optional<jv<djl>> b;
   private final float c;

   public eqq(jv<djl> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eqq(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eqq(Optional<jv<djl>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ern.d a(dgk $$0, ji $$1, ji $$2, ern.d $$3, ern.d $$4, erj $$5) {
      azh $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected erm<?> a() {
      return erm.f;
   }
}
