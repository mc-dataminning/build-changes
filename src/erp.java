import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class erp extends esj {
   public static final MapCodec<erp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, erp::new)
   );
   private final Optional<ju<dkm>> b;
   private final float c;

   public erp(ju<dkm> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public erp(float $$0) {
      this(Optional.empty(), $$0);
   }

   private erp(Optional<ju<dkm>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public esm.d a(dhl $$0, jh $$1, jh $$2, esm.d $$3, esm.d $$4, esi $$5) {
      bam $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected esl<?> a() {
      return esl.f;
   }
}
