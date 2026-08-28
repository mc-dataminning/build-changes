import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ewi implements ewl {
   public static final MapCodec<ewi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tz.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ewi::new));
   private final tz b;

   public ewi(tz $$0) {
      this.b = $$0;
   }

   @Override
   public tz a(azx $$0, @Nullable tz $$1) {
      return $$1 == null ? this.b.l() : $$1.a(this.b);
   }

   @Override
   public ewm<?> a() {
      return ewm.c;
   }
}
