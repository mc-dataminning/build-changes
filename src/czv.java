import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czv {
   public static final Codec<czv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kl.aY.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, czv::new)
   );
   private final kj b;
   private final float c;

   public czv(kj $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public kj a() {
      return this.b;
   }

   public boolean a(axr $$0) {
      return $$0.i() <= this.c;
   }
}
