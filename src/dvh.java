import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvh extends dvc {
   public static final Codec<dvh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bha.b(dvc.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dvh::new)
   );
   private final bha<dvc> b;

   public dvh(bha<dvc> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ato $$0, dnc $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dvd<?> a() {
      return dvd.f;
   }
}
