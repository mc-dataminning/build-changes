import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class emw extends enq {
   public static final MapCodec<emw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kb.a(lu.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, emw::new)
   );
   private final Optional<jq<dfy>> b;
   private final float c;

   public emw(jq<dfy> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public emw(float $$0) {
      this(Optional.empty(), $$0);
   }

   private emw(Optional<jq<dfy>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ent.c a(dcz $$0, jd $$1, jd $$2, ent.c $$3, ent.c $$4, enp $$5) {
      ayw $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ens<?> a() {
      return ens.f;
   }
}
