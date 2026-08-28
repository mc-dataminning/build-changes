import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eja extends eiv {
   public static final MapCodec<eja> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpu.b(eiv.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eja::new)
   );
   private final bpu<eiv> b;

   public eja(bpu<eiv> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azk $$0, eat $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public eiw<?> a() {
      return eiw.f;
   }
}
