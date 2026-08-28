import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eds implements edd {
   public static final Codec<eds> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsd.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dsd.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bqa.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eds::new)
   );
   public final dsd b;
   public final dsd c;
   private final bqa d;

   public eds(dsd $$0, dsd $$1, bqa $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bqa a() {
      return this.d;
   }
}
