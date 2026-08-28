import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejz implements ejv {
   public static final Codec<ejz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ecj.c).fieldOf("height").forGetter($$0x -> $$0x.b), dym.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, ejz::new)
   );
   public final int b;
   public final dym c;

   public ejz(int $$0, dym $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
