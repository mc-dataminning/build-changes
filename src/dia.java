import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dia {
   public static final Codec<dia> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ls.bi.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dia::new)
   );
   private final lq b;
   private final float c;

   public dia(lq $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lq a() {
      return this.b;
   }

   public boolean a(bac $$0) {
      return $$0.i() <= this.c;
   }
}
