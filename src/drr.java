import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drr implements drn {
   public static final Codec<drr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dkf.c).fieldOf("height").forGetter($$0x -> $$0x.b), dgw.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, drr::new)
   );
   public final int b;
   public final dgw c;

   public drr(int $$0, dgw $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
