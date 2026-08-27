import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ekp extends eli {
   public static final MapCodec<ekp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jm.a(lf.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ekp::new)
   );
   private final Optional<jb<dea>> b;
   private final float c;

   public ekp(jb<dea> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ekp(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ekp(Optional<jb<dea>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ell.c a(dbc $$0, io $$1, io $$2, ell.c $$3, ell.c $$4, elh $$5) {
      aym $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected elk<?> a() {
      return elk.f;
   }
}
