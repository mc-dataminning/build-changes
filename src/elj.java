import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class elj extends emc {
   public static final MapCodec<elj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jx.a(lq.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, elj::new)
   );
   private final Optional<jm<deu>> b;
   private final float c;

   public elj(jm<deu> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public elj(float $$0) {
      this(Optional.empty(), $$0);
   }

   private elj(Optional<jm<deu>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public emf.c a(dbw $$0, iz $$1, iz $$2, emf.c $$3, emf.c $$4, emb $$5) {
      azc $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eme<?> a() {
      return eme.f;
   }
}
