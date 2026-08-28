import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfv {
   public static final Codec<dfv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lq.bf.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dfv::new)
   );
   private final lo b;
   private final float c;

   public dfv(lo $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lo a() {
      return this.b;
   }

   public boolean a(azr $$0) {
      return $$0.i() <= this.c;
   }
}
