import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emb implements elx {
   public static final Codec<emb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eel.c).fieldOf("height").forGetter($$0x -> $$0x.b), eao.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, emb::new)
   );
   public final int b;
   public final eao c;

   public emb(int $$0, eao $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
