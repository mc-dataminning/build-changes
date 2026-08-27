import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwh implements dwd {
   public static final Codec<dwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dov.c).fieldOf("height").forGetter($$0x -> $$0x.b), dlj.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dwh::new)
   );
   public final int b;
   public final dlj c;

   public dwh(int $$0, dlj $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
