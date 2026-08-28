import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class erh extends esb {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, erh::new)
   );
   private final Optional<ju<dke>> b;
   private final float c;

   public erh(ju<dke> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public erh(float $$0) {
      this(Optional.empty(), $$0);
   }

   private erh(Optional<ju<dke>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public ese.d a(dhd $$0, jh $$1, jh $$2, ese.d $$3, ese.d $$4, esa $$5) {
      bam $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected esd<?> a() {
      return esd.f;
   }
}
