import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eig implements eic {
   public static final Codec<eig> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eas.c).fieldOf("height").forGetter($$0x -> $$0x.b), dwx.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eig::new)
   );
   public final int b;
   public final dwx c;

   public eig(int $$0, dwx $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
