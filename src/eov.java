import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eov extends eoy {
   public static final MapCodec<eov> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eov::new)
   );
   private final dhj b;
   private final float d;

   public eov(dhj $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(duo $$0, azl $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eoz<?> a() {
      return eoz.e;
   }
}
