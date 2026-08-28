import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class evs extends ewm {
   public static final MapCodec<evs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jv.a(mi.i).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, evs::new)
   );
   private final Optional<jk<dno>> b;
   private final float c;

   public evs(jk<dno> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public evs(float $$0) {
      this(Optional.empty(), $$0);
   }

   private evs(Optional<jk<dno>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ewp.d a(dkm $$0, iw $$1, iw $$2, ewp.d $$3, ewp.d $$4, ewl $$5) {
      bai $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ewo<?> a() {
      return ewo.f;
   }
}
