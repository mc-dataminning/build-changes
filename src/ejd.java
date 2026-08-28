import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejd implements eiz {
   public static final Codec<ejd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ebp.c).fieldOf("height").forGetter($$0x -> $$0x.b), dxu.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, ejd::new)
   );
   public final int b;
   public final dxu c;

   public ejd(int $$0, dxu $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
