import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxl extends dxg {
   public static final Codec<dxl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bif.b(dxg.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dxl::new)
   );
   private final bif<dxg> b;

   public dxl(bif<dxg> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(aup $$0, dpg $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dxh<?> a() {
      return dxh.f;
   }
}
