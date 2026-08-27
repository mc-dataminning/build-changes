import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebo extends ebj {
   public static final Codec<ebo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(blm.b(ebj.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ebo::new)
   );
   private final blm<ebj> b;

   public ebo(blm<ebj> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(axd $$0, dtj $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ebk<?> a() {
      return ebk.f;
   }
}
