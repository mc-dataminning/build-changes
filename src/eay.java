import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eay extends ebb {
   public static final Codec<eay> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eay::new)
   );
   private final cva b;
   private final float d;

   public eay(cva $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dhi $$0, ats $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ebc<?> a() {
      return ebc.e;
   }
}
