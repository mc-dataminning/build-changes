import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efc extends eff {
   public static final Codec<efc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, efc::new)
   );
   private final cys b;
   private final float d;

   public efc(cys $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dlj $$0, awp $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected efg<?> a() {
      return efg.e;
   }
}
