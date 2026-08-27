import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efd extends eff {
   public static final Codec<efd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlj.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, efd::new)
   );
   private final dlj b;
   private final float d;

   public efd(dlj $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dlj $$0, awp $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected efg<?> a() {
      return efg.f;
   }
}
