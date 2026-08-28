import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eol extends epf {
   public static final MapCodec<eol> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kd.a(lw.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eol::new)
   );
   private final Optional<js<dhm>> b;
   private final float c;

   public eol(js<dhm> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eol(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eol(Optional<js<dhm>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public epi.c a(dem $$0, jf $$1, jf $$2, epi.c $$3, epi.c $$4, epe $$5) {
      azn $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eph<?> a() {
      return eph.f;
   }
}
