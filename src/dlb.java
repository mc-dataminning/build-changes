import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlb {
   public static final Codec<dlb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lz.bk.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dlb::new)
   );
   private final lx b;
   private final float c;

   public dlb(lx $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lx a() {
      return this.b;
   }

   public boolean a(azz $$0) {
      return $$0.i() <= this.c;
   }
}
