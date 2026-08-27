import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dym extends dyp {
   public static final Codec<dym> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.f.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, dym::new)
   );
   private final ctc b;
   private final float d;

   public dym(ctc $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dfd $$0, ash $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected dyq<?> a() {
      return dyq.e;
   }
}
