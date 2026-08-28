import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class euc extends eue {
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzo.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, euc::new)
   );
   private final dzo b;
   private final float d;

   public euc(dzo $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dzo $$0, azt $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected euf<?> a() {
      return euf.f;
   }
}
