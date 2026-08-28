import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhh {
   public static final Codec<dhh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lt.bi.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dhh::new)
   );
   private final lr b;
   private final float c;

   public dhh(lr $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lr a() {
      return this.b;
   }

   public boolean a(azg $$0) {
      return $$0.i() <= this.c;
   }
}
