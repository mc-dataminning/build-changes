import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emg implements emc {
   public static final Codec<emg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eeq.c).fieldOf("height").forGetter($$0x -> $$0x.b), eat.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, emg::new)
   );
   public final int b;
   public final eat c;

   public emg(int $$0, eat $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
