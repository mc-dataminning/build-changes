import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxc implements dwy {
   public static final Codec<dxc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dpq.c).fieldOf("height").forGetter($$0x -> $$0x.b), dme.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dxc::new)
   );
   public final int b;
   public final dme c;

   public dxc(int $$0, dme $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
