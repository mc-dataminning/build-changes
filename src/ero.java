import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ero extends esi {
   public static final MapCodec<ero> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ero::new)
   );
   private final Optional<ju<dkl>> b;
   private final float c;

   public ero(ju<dkl> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public ero(float $$0) {
      this(Optional.empty(), $$0);
   }

   private ero(Optional<ju<dkl>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public esl.d a(dhk $$0, jh $$1, jh $$2, esl.d $$3, esl.d $$4, esh $$5) {
      bam $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected esk<?> a() {
      return esk.f;
   }
}
