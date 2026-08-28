import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edj implements edp {
   public static final Codec<edj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpm.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bpm.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, edj::new)
   );
   private final bpm b;
   private final bpm c;

   public edj(bpm $$0, bpm $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpm a() {
      return this.b;
   }

   public bpm b() {
      return this.c;
   }
}
