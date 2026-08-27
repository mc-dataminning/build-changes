import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egw extends egy {
   public static final Codec<egw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnb.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, egw::new)
   );
   private final dnb b;
   private final float d;

   public egw(dnb $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dnb $$0, axd $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected egz<?> a() {
      return egz.f;
   }
}
