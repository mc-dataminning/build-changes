import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebd extends ebg {
   public static final Codec<ebd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kc.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ebd::new)
   );
   private final cvf b;
   private final float d;

   public ebd(cvf $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dhn $$0, atw $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ebh<?> a() {
      return ebh.e;
   }
}
