import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edt implements edp {
   public static final Codec<edt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dwg.c).fieldOf("height").forGetter($$0x -> $$0x.b), dsl.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, edt::new)
   );
   public final int b;
   public final dsl c;

   public edt(int $$0, dsl $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
