import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekf implements ejv {
   public static final Codec<ekf> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l)).apply($$0, ekf::new)
   );
   public final float l;

   public ekf(float $$0) {
      this.l = $$0;
   }
}
