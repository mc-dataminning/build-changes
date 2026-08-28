import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehj extends ehe {
   public static final MapCodec<ehj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bor.b(ehe.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ehj::new)
   );
   private final bor<ehe> b;

   public ehj(bor<ehe> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ayo $$0, dzd $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ehf<?> a() {
      return ehf.f;
   }
}
