import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxy implements dxu {
   public static final Codec<dxy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dqm.c).fieldOf("height").forGetter($$0x -> $$0x.b), dmz.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dxy::new)
   );
   public final int b;
   public final dmz c;

   public dxy(int $$0, dmz $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
