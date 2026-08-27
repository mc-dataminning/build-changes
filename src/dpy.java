import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpy implements dpu {
   public static final Codec<dpy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dim.c).fieldOf("height").forGetter($$0x -> $$0x.b), dfd.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dpy::new)
   );
   public final int b;
   public final dfd c;

   public dpy(int $$0, dfd $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
