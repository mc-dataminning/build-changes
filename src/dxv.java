import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dxv extends dyo {
   public static final Codec<dxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ht.a(jc.e).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dxv::new)
   );
   private final Optional<hi<csl>> b;
   private final float c;

   public dxv(hi<csl> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public dxv(float $$0) {
      this(Optional.empty(), $$0);
   }

   private dxv(Optional<hi<csl>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public dyr.c a(cpo $$0, gu $$1, gu $$2, dyr.c $$3, dyr.c $$4, dyn $$5) {
      aru $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected dyq<?> a() {
      return dyq.f;
   }
}
