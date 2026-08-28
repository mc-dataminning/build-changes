import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqb extends eqe {
   public static final MapCodec<eqb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eqb::new)
   );
   private final diq b;
   private final float d;

   public eqb(diq $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dvv $$0, azu $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eqf<?> a() {
      return eqf.e;
   }
}
