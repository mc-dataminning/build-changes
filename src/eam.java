import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eam implements eai {
   public static final Codec<eam> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dta.c).fieldOf("height").forGetter($$0x -> $$0x.b), dpi.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eam::new)
   );
   public final int b;
   public final dpi c;

   public eam(int $$0, dpi $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
