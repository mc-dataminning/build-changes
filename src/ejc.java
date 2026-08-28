import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejc implements eiy {
   public static final Codec<ejc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ebm.c).fieldOf("height").forGetter($$0x -> $$0x.b), dxq.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, ejc::new)
   );
   public final int b;
   public final dxq c;

   public ejc(int $$0, dxq $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
