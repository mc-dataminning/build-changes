import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epz extends epu {
   public static final MapCodec<epz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsq.b(epu.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, epz::new)
   );
   private final bsq<epu> b;

   public epz(bsq<epu> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azv $$0, ehp $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public epv<?> a() {
      return epv.f;
   }
}
