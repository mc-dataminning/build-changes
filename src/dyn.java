import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyn extends dyp {
   public static final Codec<dyn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dfd.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, dyn::new)
   );
   private final dfd b;
   private final float d;

   public dyn(dfd $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dfd $$0, ash $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected dyq<?> a() {
      return dyq.f;
   }
}
