import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class emu extends eno {
   public static final MapCodec<emu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kb.a(lu.f).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, emu::new)
   );
   private final Optional<jq<dfy>> b;
   private final float c;

   public emu(jq<dfy> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public emu(float $$0) {
      this(Optional.empty(), $$0);
   }

   private emu(Optional<jq<dfy>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public enr.c a(dcz $$0, jd $$1, jd $$2, enr.c $$3, enr.c $$4, enn $$5) {
      ayw $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected enq<?> a() {
      return enq.f;
   }
}
