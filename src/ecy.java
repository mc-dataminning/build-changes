import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecy extends eda {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(djh.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ecy::new)
   );
   private final djh b;
   private final float d;

   public ecy(djh $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(djh $$0, auv $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected edb<?> a() {
      return edb.f;
   }
}
