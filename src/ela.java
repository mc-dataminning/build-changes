import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ela extends eld {
   public static final MapCodec<ela> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ela::new)
   );
   private final ddy b;
   private final float d;

   public ela(ddy $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(drb $$0, ayk $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ele<?> a() {
      return ele.e;
   }
}
