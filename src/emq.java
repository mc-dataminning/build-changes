import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emq extends ems {
   public static final MapCodec<emq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsl.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, emq::new)
   );
   private final dsl b;
   private final float d;

   public emq(dsl $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsl $$0, ayo $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected emt<?> a() {
      return emt.f;
   }
}
