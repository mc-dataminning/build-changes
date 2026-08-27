import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dyf extends dyy {
   public static final Codec<dyf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hs.a(jc.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dyf::new)
   );
   private final Optional<hi<csv>> b;
   private final float c;

   public dyf(hi<csv> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public dyf(float $$0) {
      this(Optional.empty(), $$0);
   }

   private dyf(Optional<hi<csv>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public dzb.c a(cpy $$0, gw $$1, gw $$2, dzb.c $$3, dzb.c $$4, dyx $$5) {
      asc $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected dza<?> a() {
      return dza.f;
   }
}
