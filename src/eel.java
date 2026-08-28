import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eel implements eeh {
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dwy.c).fieldOf("height").forGetter($$0x -> $$0x.b), dtc.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eel::new)
   );
   public final int b;
   public final dtc c;

   public eel(int $$0, dtc $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
