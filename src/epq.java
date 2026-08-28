import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epq extends ept {
   public static final MapCodec<epq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ly.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, epq::new)
   );
   private final die b;
   private final float d;

   public epq(die $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dvj $$0, azs $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected epu<?> a() {
      return epu.e;
   }
}
