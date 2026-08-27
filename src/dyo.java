import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyo extends dyq {
   public static final Codec<dyo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dfe.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, dyo::new)
   );
   private final dfe b;
   private final float d;

   public dyo(dfe $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dfe $$0, arx $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected dyr<?> a() {
      return dyr.f;
   }
}
