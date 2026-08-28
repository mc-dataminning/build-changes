import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emo extends emj {
   public static final MapCodec<emo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brm.b(emj.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, emo::new)
   );
   private final brm<emj> b;

   public emo(brm<emj> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(bam $$0, eef $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public emk<?> a() {
      return emk.f;
   }
}
