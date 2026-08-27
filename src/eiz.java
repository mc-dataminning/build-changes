import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiz extends ejb {
   public static final Codec<eiz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(doz.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eiz::new)
   );
   private final doz b;
   private final float d;

   public eiz(doz $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(doz $$0, axr $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ejc<?> a() {
      return ejc.f;
   }
}
