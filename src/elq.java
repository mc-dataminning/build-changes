import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class elq extends emj {
   public static final MapCodec<elq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jx.a(lq.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, elq::new)
   );
   private final Optional<jm<dfb>> b;
   private final float c;

   public elq(jm<dfb> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public elq(float $$0) {
      this(Optional.empty(), $$0);
   }

   private elq(Optional<jm<dfb>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public emm.c a(dcd $$0, iz $$1, iz $$2, emm.c $$3, emm.c $$4, emi $$5) {
      azh $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eml<?> a() {
      return eml.f;
   }
}
