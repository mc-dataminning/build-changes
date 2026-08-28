import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eif implements eib {
   public static final Codec<eif> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ear.c).fieldOf("height").forGetter($$0x -> $$0x.b), dww.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eif::new)
   );
   public final int b;
   public final dww c;

   public eif(int $$0, dww $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
