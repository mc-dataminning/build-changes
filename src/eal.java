import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eal extends ebe {
   public static final Codec<eal> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iq.a(jz.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eal::new)
   );
   private final Optional<ig<cva>> b;
   private final float c;

   public eal(ig<cva> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eal(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eal(Optional<ig<cva>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ebh.c a(csd $$0, ht $$1, ht $$2, ebh.c $$3, ebh.c $$4, ebd $$5) {
      ats $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ebg<?> a() {
      return ebg.f;
   }
}
