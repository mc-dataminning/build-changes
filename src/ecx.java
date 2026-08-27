import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecx extends eda {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ecx::new)
   );
   private final cwq b;
   private final float d;

   public ecx(cwq $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(djh $$0, auv $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected edb<?> a() {
      return edb.e;
   }
}
