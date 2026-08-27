import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyi extends dyl {
   public static final Codec<dyi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, dyi::new)
   );
   private final csl b;
   private final float d;

   public dyi(csl $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dez $$0, aru $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected dym<?> a() {
      return dym.e;
   }
}
