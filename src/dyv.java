import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyv extends dyx {
   public static final Codec<dyv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dfl.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, dyv::new)
   );
   private final dfl b;
   private final float d;

   public dyv(dfl $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dfl $$0, ase $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected dyy<?> a() {
      return dyy.f;
   }
}
