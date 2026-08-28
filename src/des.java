import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class des {
   public static final Codec<des> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ln.bf.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, des::new)
   );
   private final ll b;
   private final float c;

   public des(ll $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ll a() {
      return this.b;
   }

   public boolean a(azk $$0) {
      return $$0.i() <= this.c;
   }
}
