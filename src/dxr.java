import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxr extends dxm {
   public static final Codec<dxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bik.b(dxm.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dxr::new)
   );
   private final bik<dxm> b;

   public dxr(bik<dxm> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(auu $$0, dpm $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dxn<?> a() {
      return dxn.f;
   }
}
