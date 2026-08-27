import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egv extends egy {
   public static final Codec<egv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ki.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, egv::new)
   );
   private final dac b;
   private final float d;

   public egv(dac $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dnb $$0, axd $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected egz<?> a() {
      return egz.e;
   }
}
