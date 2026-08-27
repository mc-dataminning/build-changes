import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edg extends edi {
   public static final Codec<edg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(djp.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, edg::new)
   );
   private final djp b;
   private final float d;

   public edg(djp $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(djp $$0, auw $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected edj<?> a() {
      return edj.f;
   }
}
