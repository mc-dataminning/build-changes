import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duc implements dty {
   public static final Codec<duc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dmq.c).fieldOf("height").forGetter($$0x -> $$0x.b), djh.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, duc::new)
   );
   public final int b;
   public final djh c;

   public duc(int $$0, djh $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
