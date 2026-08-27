import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ejk extends ekd {
   public static final Codec<ejk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jk.a(ld.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ejk::new)
   );
   private final Optional<iz<dcv>> b;
   private final float c;

   public ejk(iz<dcv> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ejk(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ejk(Optional<iz<dcv>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ekg.c a(czx $$0, im $$1, im $$2, ekg.c $$3, ekg.c $$4, ekc $$5) {
      ayd $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ekf<?> a() {
      return ekf.f;
   }
}
