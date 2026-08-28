import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ewg extends ewj {
   public static final MapCodec<ewg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ewg::new)
   );
   private final dno b;
   private final float d;

   public ewg(dno $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(ebq $$0, bai $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ewk<?> a() {
      return ewk.e;
   }
}
