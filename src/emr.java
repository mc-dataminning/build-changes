import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class emr extends enk {
   public static final MapCodec<emr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kb.a(lu.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, emr::new)
   );
   private final Optional<jq<dfw>> b;
   private final float c;

   public emr(jq<dfw> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public emr(float $$0) {
      this(Optional.empty(), $$0);
   }

   private emr(Optional<jq<dfw>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public enn.c a(dcx $$0, jd $$1, jd $$2, enn.c $$3, enn.c $$4, enj $$5) {
      ayv $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected enm<?> a() {
      return enm.f;
   }
}
