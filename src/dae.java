import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dae {
   public static final Codec<dae> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kn.aY.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dae::new)
   );
   private final kl b;
   private final float c;

   public dae(kl $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public kl a() {
      return this.b;
   }

   public boolean a(axt $$0) {
      return $$0.i() <= this.c;
   }
}
