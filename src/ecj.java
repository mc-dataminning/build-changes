import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ecj extends edc {
   public static final Codec<ecj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iv.a(ke.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ecj::new)
   );
   private final Optional<il<cwp>> b;
   private final float c;

   public ecj(il<cwp> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ecj(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ecj(Optional<il<cwp>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public edf.c a(ctr $$0, hx $$1, hx $$2, edf.c $$3, edf.c $$4, edb $$5) {
      auu $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ede<?> a() {
      return ede.f;
   }
}
