import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enk extends enn {
   public static final Codec<enk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lh.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, enk::new)
   );
   private final dfc b;
   private final float d;

   public enk(dfc $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dtc $$0, ayt $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eno<?> a() {
      return eno.e;
   }
}
