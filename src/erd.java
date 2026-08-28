import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class erd extends erg {
   public static final MapCodec<erd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, erd::new)
   );
   private final djk b;
   private final float d;

   public erd(djk $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dwv $$0, azg $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected erh<?> a() {
      return erh.e;
   }
}
