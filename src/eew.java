import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eew extends eey {
   public static final Codec<eew> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlf.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eew::new)
   );
   private final dlf b;
   private final float d;

   public eew(dlf $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dlf $$0, awo $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eez<?> a() {
      return eez.f;
   }
}
