import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecq extends ect {
   public static final Codec<ecq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ecq::new)
   );
   private final cwj b;
   private final float d;

   public ecq(cwj $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dja $$0, aup $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ecu<?> a() {
      return ecu.e;
   }
}
