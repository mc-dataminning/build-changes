import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eil extends eje {
   public static final Codec<eil> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ja.a(ks.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eil::new)
   );
   private final Optional<ip<dby>> b;
   private final float c;

   public eil(ip<dby> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eil(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eil(Optional<ip<dby>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ejh.c a(cza $$0, ib $$1, ib $$2, ejh.c $$3, ejh.c $$4, ejd $$5) {
      axr $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected ejg<?> a() {
      return ejg.f;
   }
}
