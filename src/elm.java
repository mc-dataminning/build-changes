import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elm implements eli {
   public static final Codec<elm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, edw.c).fieldOf("height").forGetter($$0x -> $$0x.b), dzz.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, elm::new)
   );
   public final int b;
   public final dzz c;

   public elm(int $$0, dzz $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
