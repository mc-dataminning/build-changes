import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enk extends enn {
   public static final MapCodec<enk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.e.r().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, enk::new)
   );
   private final dfy b;
   private final float d;

   public enk(dfy $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dtc $$0, ayw $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eno<?> a() {
      return eno.e;
   }
}
