import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emn extends emq {
   public static final MapCodec<emn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, emn::new)
   );
   private final dfh b;
   private final float d;

   public emn(dfh $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsk $$0, ayo $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected emr<?> a() {
      return emr.e;
   }
}
