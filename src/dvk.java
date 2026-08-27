import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvk extends dvn {
   public static final Codec<dvk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, dvk::new)
   );
   private final cpn b;
   private final float d;

   public dvk(cpn $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dcb $$0, apf $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected dvo<?> a() {
      return dvo.e;
   }
}
