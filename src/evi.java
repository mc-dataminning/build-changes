import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class evi implements evl {
   public static final MapCodec<evi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tz.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, evi::new));
   private final tz b;

   public evi(tz $$0) {
      this.b = $$0;
   }

   @Override
   public tz a(azv $$0, @Nullable tz $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public evm<?> a() {
      return evm.c;
   }
}
