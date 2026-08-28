import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egw extends egr {
   public static final MapCodec<egw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpe.b(egr.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, egw::new)
   );
   private final bpe<egr> b;

   public egw(bpe<egr> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azh $$0, dyr $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public egs<?> a() {
      return egs.f;
   }
}
