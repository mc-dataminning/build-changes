import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elc extends elf {
   public static final MapCodec<elc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, elc::new)
   );
   private final dea b;
   private final float d;

   public elc(dea $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(drd $$0, aym $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected elg<?> a() {
      return elg.e;
   }
}
