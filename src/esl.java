import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class esl extends etf {
   public static final MapCodec<esl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kh.a(me.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, esl::new)
   );
   private final Optional<jw<dku>> b;
   private final float c;

   public esl(jw<dku> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public esl(float $$0) {
      this(Optional.empty(), $$0);
   }

   private esl(Optional<jw<dku>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public eti.d a(dhs $$0, jj $$1, jj $$2, eti.d $$3, eti.d $$4, ete $$5) {
      azs $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eth<?> a() {
      return eth.f;
   }
}
