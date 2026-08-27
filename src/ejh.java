import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejh extends ejk {
   public static final Codec<ejh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kt.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ejh::new)
   );
   private final dch b;
   private final float d;

   public ejh(dch $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dpi $$0, axt $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ejl<?> a() {
      return ejl.e;
   }
}
