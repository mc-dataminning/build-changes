import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekh extends ekj {
   public static final Codec<ekh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dqh.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ekh::new)
   );
   private final dqh b;
   private final float d;

   public ekh(dqh $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dqh $$0, ayg $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ekk<?> a() {
      return ekk.f;
   }
}
