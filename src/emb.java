import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emb extends eme {
   public static final MapCodec<emb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, emb::new)
   );
   private final dez b;
   private final float d;

   public emb(dez $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsc $$0, azh $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected emf<?> a() {
      return emf.e;
   }
}
