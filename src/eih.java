import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eih implements eid {
   public static final Codec<eih> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eat.c).fieldOf("height").forGetter($$0x -> $$0x.b), dwy.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eih::new)
   );
   public final int b;
   public final dwy c;

   public eih(int $$0, dwy $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
