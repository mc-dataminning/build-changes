import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eei implements eee {
   public static final Codec<eei> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dwv.c).fieldOf("height").forGetter($$0x -> $$0x.b), dta.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eei::new)
   );
   public final int b;
   public final dta c;

   public eei(int $$0, dta $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
