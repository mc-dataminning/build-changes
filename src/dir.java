import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dir {
   public static final Codec<dir> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lv.bj.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dir::new)
   );
   private final lt b;
   private final float c;

   public dir(lt $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lt a() {
      return this.b;
   }

   public boolean a(azs $$0) {
      return $$0.i() <= this.c;
   }
}
