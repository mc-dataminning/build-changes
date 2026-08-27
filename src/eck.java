import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eck extends edd {
   public static final Codec<eck> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iv.a(ke.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eck::new)
   );
   private final Optional<il<cwq>> b;
   private final float c;

   public eck(il<cwq> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eck(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eck(Optional<il<cwq>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public edg.c a(cts $$0, hx $$1, hx $$2, edg.c $$3, edg.c $$4, edc $$5) {
      auv $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected edf<?> a() {
      return edf.f;
   }
}
