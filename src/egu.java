import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egu extends egw {
   public static final Codec<egu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmz.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, egu::new)
   );
   private final dmz b;
   private final float d;

   public egu(dmz $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dmz $$0, axd $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected egx<?> a() {
      return egx.f;
   }
}
