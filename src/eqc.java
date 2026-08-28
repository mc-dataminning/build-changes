import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqc extends eqe {
   public static final MapCodec<eqc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvv.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eqc::new)
   );
   private final dvv b;
   private final float d;

   public eqc(dvv $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dvv $$0, azu $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eqf<?> a() {
      return eqf.f;
   }
}
