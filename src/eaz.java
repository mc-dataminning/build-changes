import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaz extends ebb {
   public static final Codec<eaz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhi.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eaz::new)
   );
   private final dhi b;
   private final float d;

   public eaz(dhi $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dhi $$0, ats $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ebc<?> a() {
      return ebc.f;
   }
}
