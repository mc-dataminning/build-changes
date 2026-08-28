import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eub extends eue {
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eub::new)
   );
   private final dlu b;
   private final float d;

   public eub(dlu $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dzo $$0, azt $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected euf<?> a() {
      return euf.e;
   }
}
