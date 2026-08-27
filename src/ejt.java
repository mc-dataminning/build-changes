import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ejt extends ekm {
   public static final Codec<ejt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jl.a(le.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ejt::new)
   );
   private final Optional<ja<dde>> b;
   private final float c;

   public ejt(ja<dde> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ejt(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ejt(Optional<ja<dde>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ekp.c a(dag $$0, in $$1, in $$2, ekp.c $$3, ekp.c $$4, ekl $$5) {
      ayg $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eko<?> a() {
      return eko.f;
   }
}
