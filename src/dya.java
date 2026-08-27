import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dya extends dxv {
   public static final Codec<dya> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bim.b(dxv.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dya::new)
   );
   private final bim<dxv> b;

   public dya(bim<dxv> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(auw $$0, dpv $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dxw<?> a() {
      return dxw.f;
   }
}
