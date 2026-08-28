import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class evg extends ewa {
   public static final MapCodec<evg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.a(mh.i).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, evg::new)
   );
   private final Optional<jj<dnc>> b;
   private final float c;

   public evg(jj<dnc> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public evg(float $$0) {
      this(Optional.empty(), $$0);
   }

   private evg(Optional<jj<dnc>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ewd.d a(dka $$0, iv $$1, iv $$2, ewd.d $$3, ewd.d $$4, evz $$5) {
      azx $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ewc<?> a() {
      return ewc.f;
   }
}
