import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eoz extends epc {
   public static final MapCodec<eoz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lv.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eoz::new)
   );
   private final dhm b;
   private final float d;

   public eoz(dhm $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dus $$0, azn $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected epd<?> a() {
      return epd.e;
   }
}
