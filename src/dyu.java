import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyu extends dyx {
   public static final Codec<dyu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, dyu::new)
   );
   private final csx b;
   private final float d;

   public dyu(csx $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dfl $$0, ase $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected dyy<?> a() {
      return dyy.e;
   }
}
