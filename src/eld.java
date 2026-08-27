import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eld extends elf {
   public static final MapCodec<eld> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drd.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eld::new)
   );
   private final drd b;
   private final float d;

   public eld(drd $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(drd $$0, aym $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected elg<?> a() {
      return elg.f;
   }
}
