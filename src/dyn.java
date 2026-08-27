import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyn extends dyq {
   public static final Codec<dyn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, dyn::new)
   );
   private final csq b;
   private final float d;

   public dyn(csq $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dfe $$0, arx $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected dyr<?> a() {
      return dyr.e;
   }
}
