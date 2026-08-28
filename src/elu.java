import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class elu extends emn {
   public static final MapCodec<elu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.a(lr.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, elu::new)
   );
   private final Optional<jn<dff>> b;
   private final float c;

   public elu(jn<dff> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public elu(float $$0) {
      this(Optional.empty(), $$0);
   }

   private elu(Optional<jn<dff>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public emq.c a(dcg $$0, ja $$1, ja $$2, emq.c $$3, emq.c $$4, emm $$5) {
      aym $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected emp<?> a() {
      return emp.f;
   }
}
