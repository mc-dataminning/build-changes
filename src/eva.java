import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eva implements evd {
   public static final MapCodec<eva> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tz.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, eva::new));
   private final tz b;

   public eva(tz $$0) {
      this.b = $$0;
   }

   @Override
   public tz a(azv $$0, @Nullable tz $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public eve<?> a() {
      return eve.c;
   }
}
