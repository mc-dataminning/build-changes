import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebc implements eay {
   public static final Codec<ebc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dtq.c).fieldOf("height").forGetter($$0x -> $$0x.b), dpy.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, ebc::new)
   );
   public final int b;
   public final dpy c;

   public ebc(int $$0, dpy $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
