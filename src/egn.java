import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egn implements egj {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dyz.c).fieldOf("height").forGetter($$0x -> $$0x.b), dvd.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, egn::new)
   );
   public final int b;
   public final dvd c;

   public egn(int $$0, dvd $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
