import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egx implements egt {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dzj.c).fieldOf("height").forGetter($$0x -> $$0x.b), dvo.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, egx::new)
   );
   public final int b;
   public final dvo c;

   public egx(int $$0, dvo $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
