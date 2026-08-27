import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enl extends enn {
   public static final Codec<enl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dtc.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, enl::new)
   );
   private final dtc b;
   private final float d;

   public enl(dtc $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dtc $$0, ayt $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eno<?> a() {
      return eno.f;
   }
}
