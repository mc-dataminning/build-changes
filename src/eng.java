import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eng implements emr {
   public static final Codec<eng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebg.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               ebg.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bty.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eng::new)
   );
   public final ebg b;
   public final ebg c;
   private final bty d;

   public eng(ebg $$0, ebg $$1, bty $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bty a() {
      return this.d;
   }
}
