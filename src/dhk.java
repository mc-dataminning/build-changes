import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhk {
   public static final Codec<dhk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lt.bi.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dhk::new)
   );
   private final lr b;
   private final float c;

   public dhk(lr $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lr a() {
      return this.b;
   }

   public boolean a(azh $$0) {
      return $$0.i() <= this.c;
   }
}
