import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzk extends dzn {
   public static final Codec<dzk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, dzk::new)
   );
   private final cua b;
   private final float d;

   public dzk(cua $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dgb $$0, ate $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected dzo<?> a() {
      return dzo.e;
   }
}
