import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eow extends eoy {
   public static final MapCodec<eow> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(duo.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eow::new)
   );
   private final duo b;
   private final float d;

   public eow(duo $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(duo $$0, azl $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eoz<?> a() {
      return eoz.f;
   }
}
