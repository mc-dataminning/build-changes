import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejo extends ejj {
   public static final MapCodec<ejo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpz.b(ejj.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ejo::new)
   );
   private final bpz<ejj> b;

   public ejo(bpz<ejj> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azl $$0, ebh $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ejk<?> a() {
      return ejk.f;
   }
}
