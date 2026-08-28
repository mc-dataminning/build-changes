import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edg implements edc {
   public static final Codec<edg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvu.c).fieldOf("height").forGetter($$0x -> $$0x.b), dsc.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, edg::new)
   );
   public final int b;
   public final dsc c;

   public edg(int $$0, dsc $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
