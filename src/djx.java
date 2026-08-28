import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djx {
   public static final Codec<djx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lx.bk.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, djx::new)
   );
   private final lv b;
   private final float c;

   public djx(lv $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lv a() {
      return this.b;
   }

   public boolean a(azv $$0) {
      return $$0.i() <= this.c;
   }
}
