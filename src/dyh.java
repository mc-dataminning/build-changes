import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyh extends dyk {
   public static final Codec<dyh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jc.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, dyh::new)
   );
   private final csk b;
   private final float d;

   public dyh(csk $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dey $$0, art $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected dyl<?> a() {
      return dyl.e;
   }
}
