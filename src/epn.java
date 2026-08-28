import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class epn extends eqh {
   public static final MapCodec<epn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(ma.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, epn::new)
   );
   private final Optional<ju<diq>> b;
   private final float c;

   public epn(ju<diq> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public epn(float $$0) {
      this(Optional.empty(), $$0);
   }

   private epn(Optional<ju<diq>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public eqk.c a(dfp $$0, jh $$1, jh $$2, eqk.c $$3, eqk.c $$4, eqg $$5) {
      azu $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eqj<?> a() {
      return eqj.f;
   }
}
