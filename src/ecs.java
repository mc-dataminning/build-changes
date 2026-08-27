import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ecs extends edl {
   public static final Codec<ecs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iv.a(ke.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ecs::new)
   );
   private final Optional<il<cwy>> b;
   private final float c;

   public ecs(il<cwy> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ecs(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ecs(Optional<il<cwy>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public edo.c a(cua $$0, hx $$1, hx $$2, edo.c $$3, edo.c $$4, edk $$5) {
      auw $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected edn<?> a() {
      return edn.f;
   }
}
